package com.example.shopowner;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShopOwner {
	
	private int id;
	private String name;
	private LocalDate dob;
	private String address;
	private String shop_id;
	
	public ShopOwner() {
		
	}
	
	public ShopOwner(int id, String name, LocalDate dob, String address, String shop_id) {
		super();
		this.id=id;
		this.name=name;
		this.dob=dob;
		this.address=address;
		this.shop_id=shop_id;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShop_id() {
		return shop_id;
	}

	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}
	
	public String toString() {
		return "ShopOwner [ID="+ id +", Name="+ name+", Dob="+ dob +", Addrees="+ address +", shop_id="+ shop_id +"]";
	}
	

}
