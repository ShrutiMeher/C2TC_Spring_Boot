package com.example.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")

public class Customer {

	private Integer customerId;
	private String customerName;
	private Integer orderId;
	private String customerPhone;
	private String customerEmail;
	
	public Customer() {
	
	}
	
	public Customer(Integer customerId, String customerName, Integer orderId, 
			String customerPhone, String customerEmail) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.orderId = orderId;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getcustomerId() 
	{
		return customerId;
	}
	
	public void setcustomerId(Integer customerId) 
	{
		this.customerId = customerId;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public Integer getOrderId() 
	{
		return orderId;
	}

	public void setOrderId(Integer orderId) 
	{
		this.orderId = orderId;
	}

	public String getCustomerPhone() 
	{
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) 
	{
		this.customerPhone = customerPhone;
	}

	public String getCustomerEmail() 
	{
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) 
	{
		this.customerEmail = customerEmail;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", orderId=" + orderId
				+ ", customerPhone=" + customerPhone + ", customerEmail=" + customerEmail + "]";
	}
	
	
}