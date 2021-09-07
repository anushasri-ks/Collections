package com.xworkz.mobile.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_table")
public class MobileEntity implements Serializable {

	@Column(name = "m_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "m_brand")
	private String brand;
	@Column(name = "m_model")
	private String model;
	@Column(name = "m_price")
	private double price;
	@Column(name = "m_smart")
	private boolean smart;
	@Column(name = "m_color")
	private String color;

	public MobileEntity() {

	}

	public MobileEntity(String brand, String model, double price, boolean smart, String color) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.smart = smart;
		this.color = color;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof MobileEntity) {
			MobileEntity casted = (MobileEntity) obj;
			if (this.brand.equals(casted.brand) && this.model.equals(casted.model)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "MobileEntity [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", smart="
				+ smart + ", color=" + color + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}