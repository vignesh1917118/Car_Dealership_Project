package com.project.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long customerId;
	private String customerName;
	private Long contactno;
	private String address;
	
	@OneToMany(cascade=CascadeType.ALL)
	Set <Car> car;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, Long contactno, String address, Set<Car> car) {
		super();
		this.customerName = customerName;
		this.contactno = contactno;
		this.address = address;
		this.car = car;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getContactno() {
		return contactno;
	}

	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public Set<Car> getCar() {
//		return car;
//	}
//
//	public void setCar(Set<Car> car) {
//		this.car = car;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(address, car, contactno, customerId, customerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(car, other.car)
				&& Objects.equals(contactno, other.contactno) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName);
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactno=" + contactno
				+ ", address=" + address + ", car=" + car + "]";
	} 
	
//	@Override
//	public String toString() {
//		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactno=" + contactno
//				+ ", address=" + address   + "]";
//	} 
	
	
     
	

}