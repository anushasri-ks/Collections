package com.xworkz.restaurant.dto;

import java.io.Serializable;

import com.xworkz.restuarant.jdbc.constant.RestaurantType;

public class RestaurantDTO implements Serializable {

	private int id;
	private String name;
	private String location;
	private String specialFood;
	private boolean isBest;
	private RestaurantType type;

	public RestaurantDTO() {
	}

	public RestaurantDTO(String name, String location, String specialFood, boolean isBest, RestaurantType type) {
		this.name = name;
		this.location = location;
		this.specialFood = specialFood;
		this.isBest = isBest;
		this.type = type;
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

	public String getSpecialFood() {
		return specialFood;
	}

	public void setSpecialFood(String specialFood) {
		this.specialFood = specialFood;
	}

	public boolean isBest() {
		return isBest;
	}

	public void setBest(boolean isBest) {
		this.isBest = isBest;
	}

	public RestaurantType getType() {
		return type;
	}

	public void setType(RestaurantType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "RestaurantDTO [id=" + id + ", name=" + name + ", location=" + location + ", specialFood=" + specialFood
				+ ", isBest=" + isBest + ", type=" + type + "]";
	}

}