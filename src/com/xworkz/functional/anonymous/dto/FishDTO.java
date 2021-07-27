package com.xworkz.functional.anonymous.dto;

public class FishDTO {
	private String name;
	private String color;
	private String type;
	private int lifeSpan;
	private double cost;
	private String gender;

	public FishDTO() {
		super();
	}

	public FishDTO(String name, String color, String type, int lifeSpan, double cost, String gender) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.lifeSpan = lifeSpan;
		this.cost = cost;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return 143;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof FishDTO) {
			FishDTO casted = (FishDTO) obj;
			if (this.name.equals(casted.name) && this.type.equals(casted.type)
					&& this.lifeSpan == casted.lifeSpan) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "FishDTO [name=" + name + ", color=" + color + ", type=" + type + ", lifeSpan=" + lifeSpan
				+ ", cost=" + cost + ", gender=" + gender + "]";
	}
}