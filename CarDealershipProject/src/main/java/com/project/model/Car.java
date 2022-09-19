package com.project.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//import org.hibernate.annotations.Entity;
@Entity(name="usedcar")
public class Car {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long carId;
	private String brand;
	private String model;
	private String color;
	private double price;
	private Date yom;
	private double kmDriven;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customerid")
	@OnDelete(action=OnDeleteAction.CASCADE)
	Customer customer;
	
	
	
	public Car(String brand, String model, String color, double price, Date yom, double kmDriven) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.yom = yom;
		this.kmDriven = kmDriven;		
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getYom() {
		return yom;
	}

	public void setYom(Date yom) {
		this.yom = yom;
	}

	public double getKmDriven() {
		return kmDriven;
	}

	public void setKmDriven(double kmDriven) {
		this.kmDriven = kmDriven;
	}
	
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, carId, color, kmDriven, model, price, yom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(carId, other.carId)
				&& Objects.equals(color, other.color)
				&& Double.doubleToLongBits(kmDriven) == Double.doubleToLongBits(other.kmDriven)
				&& Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(yom, other.yom);
	}

//	@Override
//	public String toString() {
//		return "Car [carId=" + carId + ", brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price
//				+ ", yom=" + yom + ", kmDriven=" + kmDriven + ", customer=" + customer + "]";
//	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price
				+ ", yom=" + yom + ", kmDriven=" + kmDriven + "]";
	}
	
	
	
	
	
}