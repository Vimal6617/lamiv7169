package com.rahohealthy.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rahohealthy.dao.MerchantdetailsDao;
import com.rahohealthy.model.Merchantdetails;


@Repository
public class MerchantdetailsDaoImpl implements MerchantdetailsDao{
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public Merchantdetails findUser(int merchant_id) {
		return (Merchantdetails) session.getCurrentSession().get(Merchantdetails.class, merchant_id);
	}
	
	@Override
	public Merchantdetails findUserByEmail(String merchant_email) {
		Criteria criteria = session.getCurrentSession().createCriteria(Merchantdetails.class);
		criteria.add(Restrictions.eq("merchant_email", merchant_email));		
		return (Merchantdetails) criteria.uniqueResult();
	}
	
	@Override
	public List<Merchantdetails> getAllMerchantdetails() {
		return session.getCurrentSession().createQuery("from merchantdetails").list();
	}

	

}
