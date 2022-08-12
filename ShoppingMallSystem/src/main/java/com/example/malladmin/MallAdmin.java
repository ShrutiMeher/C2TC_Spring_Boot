package com.example.malladmin;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MallAdmin {
	
	private Integer id;
	private String name;
	private String password;
	private String phone;
	private String mall;
	
	public MallAdmin() {
		
	}
	public MallAdmin(Integer id, String name,String password, String phone, String mall) {
		super();
		this.id=id;
		this.name=name;
		this.password=password;
		this.phone=phone;
		this.mall=mall;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getMall() {
		return mall;
	}
	public void setMall(String mall) {
		this.mall = mall;
	}
	public String toString() {
		return "MallAdmin [id="+ id +", name="+ name+", password="+ password +", phone="+ phone +",mall="+ mall +"]";
	}
	
	

}

