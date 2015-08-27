package com.rahohealthy.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class MerchantRole {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String roleName;
	@ManyToMany(mappedBy = "roles")
	private List<Merchantdetails> Merchantdetails;
	
	public MerchantRole(){}

	public MerchantRole(int id, String roleName, List<Merchantdetails> Merchantdetails) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.Merchantdetails = Merchantdetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Merchantdetails> getMerchantdetails() {
		return Merchantdetails;
	}

	public void setUsers(List<Merchantdetails> users) {
		this.Merchantdetails = Merchantdetails;
	}
	
}

