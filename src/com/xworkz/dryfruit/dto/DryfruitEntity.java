package com.xworkz.dryfruit.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dryfruit_table")

public class DryfruitEntity implements Serializable {
//  Every Entity must have an Id
	@Column(name = "d_id")
	@Id
	private int id;
	@Column(name = "d_name")
	private String name;
	@Column(name = "d_brand")
	private String brand;
	@Column(name = "d_country")
	private String country;
	@Column(name = "d_cost")
	private double cost;
	@Column(name = "d_distributedby")
	private String distrubutedBy;

	public DryfruitEntity() {

	}

	public DryfruitEntity(int id, String name, String brand, String country, double cost, String distrubutedBy) {
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.country = country;
		this.cost = cost;
		this.distrubutedBy = distrubutedBy;
	}

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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDistrubutedBy() {
		return distrubutedBy;
	}

	public void setDistrubutedBy(String distrubutedBy) {
		this.distrubutedBy = distrubutedBy;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof DryfruitEntity) {
			DryfruitEntity casted = (DryfruitEntity) obj;
			if (this.name.equals(casted.name) && this.brand.equals(casted.brand)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "DryFruitDTO [id=" + id + ", name=" + name + ", brand=" + brand + ", country=" + country + ", cost="
				+ cost + ", distrubutedBy=" + distrubutedBy + "]";
	}

}