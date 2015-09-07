package com.rahohealthy.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rahohealthy.dao.ProductdetailsDao;
import com.rahohealthy.model.Productdetails;


@Repository
public class ProductdetailsDaoImpl implements ProductdetailsDao {
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public Productdetails getProductdetails(int product_id) {
		return (Productdetails)session.getCurrentSession().get(Productdetails.class, product_id);
	}

	@Override
	public List getAllProductdetails() {
		
		return session.getCurrentSession().createQuery("from Productdetails").list();
	}

}
