package com.rahohealthy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productdetails {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int product_id;
	@Column
	private int product_categoryid;
	@Column
	private int product_subcategoryid;
	@Column
	private String product_name;
	@Column
	private int product_price;
	@Column
	private String prodcut_qty;
	@Column
	private String product_desc;
	@Column
	private int merchant_id;
	@Column
	private String brand_name;
	
	public Productdetails(){}
	
	public Productdetails(int product_id, int product_categoryid , int product_subcategoryid,
			String product_name, int product_price, String prodcut_qty,String product_desc,
			int merchant_id, String brand_name ){
		
		super();	
		this.product_id = product_id;
		this.product_categoryid = product_categoryid;
		this.product_subcategoryid = product_subcategoryid;
		this.product_name = product_name;
		this.product_price = product_price;
		this.prodcut_qty = prodcut_qty;
		this.product_desc = product_desc;
		this.merchant_id = merchant_id;
		this.brand_name = brand_name;		
		
	}

	public int getproduct_id() {
		return product_id;
	}
	public void setproduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getproduct_categoryid() {
		return product_categoryid;
	}
	public void setproduct_categoryid(int product_categoryid) {
		this.product_categoryid = product_categoryid;
	}
	public int getproduct_subcategoryid() {
		return product_subcategoryid;
	}
	public void setproduct_subcategoryid(int product_subcategoryid) {
		this.product_subcategoryid = product_subcategoryid;
	}
	public String getproduct_name() {
		return product_name;
	}
	public void setproduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getproduct_price() {
		return product_price;
	}
	public void setproduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getprodcut_qty() {
		return prodcut_qty;
	}
	public void setprodcut_qty(String prodcut_qty) {
		this.prodcut_qty = prodcut_qty;
	}
	
	public String getproduct_desc() {
		return product_desc;
	}
	public void setproduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public int getmerchant_id() {
		return merchant_id;
	}
	public void setmerchant_id(int merchant_id) {
		this.merchant_id = merchant_id;
	}
	public String getbrand_name() {
		return brand_name;
	}
	public void setbrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	
	
}
