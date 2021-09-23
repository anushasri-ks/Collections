package com.xworkz.restaurant.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant_table")
public class RestaurantEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "R_ID")
	private int id;
	@Column(name = "R_NAME")
	private String name;
	@Column(name = "R_LOCATION")
	private String location;
	@Column(name = "R_SPECIAL")
	private String special;
	@Column(name = "R_BEST")
	private boolean best;
	@Column(name = "R_TYPE")
	private String type;

	public RestaurantEntity() {
	}

	public RestaurantEntity(int id, String name, String location, String special, boolean best, String type) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.special = special;
		this.best = best;
		this.type = type;
	}

	@Override
	public String toString() {
		return "RestaurantEntity [id=" + id + ", name=" + name + ", location=" + location + ", special=" + special
				+ ", best=" + best + ", type=" + type + "]";
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public boolean isBest() {
		return best;
	}

	public void setBest(boolean best) {
		this.best = best;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}