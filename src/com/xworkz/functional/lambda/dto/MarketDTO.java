package com.xworkz.functional.lambda.dto;

import java.io.Serializable;

import com.xworkz.functional.lambda.constants.MarketType;

public class MarketDTO implements Serializable {

	private String name;
	private String location;
	private int noOfShops;
	private MarketType type;

	public MarketDTO() {
		super();
	}

	public MarketDTO(String name, String location, int noOfShops, MarketType type) {
		super();
		this.name = name;
		this.location = location;
		this.noOfShops = noOfShops;
		this.type = type;
	}

	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", location=" + location + ", noOfShops=" + noOfShops + ", type=" + type
				+ "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof MarketDTO) {
			MarketDTO casted = (MarketDTO) obj;
			if (this.name.equals(casted.name) && this.location.equals(casted.location)
					&& this.noOfShops == casted.noOfShops) {
				return true;
			}
		}
		return false;
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

	public int getNoOfShops() {
		return noOfShops;
	}

	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}

	public MarketType getType() {
		return type;
	}

	public void setType(MarketType type) {
		this.type = type;
	}
}