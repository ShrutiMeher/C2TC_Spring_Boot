package com.example.mall;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mall")
public class Mall {
	
	@Id
	private Integer mallId;
	private String mallAdmin;
	private String mallName;
	private String location;
	
	private String categories;
	
	public Mall()
	{	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getMallId() {
		return mallId;
	}

	public void setMallId(Integer mallId) {
		this.mallId = mallId;
	}

	public String getMallAdmin() {
		return mallAdmin;
	}

	public void setMallAdmin(String mallAdmin) {
		this.mallAdmin = mallAdmin;
	}

	public String getMallName() {
		return mallName;
	}

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "Mall [mallId=" + mallId + ", mallAdmin=" + mallAdmin + ", mallName=" + mallName + ", location="
				+ location + ", categories=" + categories + "]";
	}

	
	
}
