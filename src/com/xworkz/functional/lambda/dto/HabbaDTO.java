package com.xworkz.functional.lambda.dto;

import java.io.Serializable;

import com.xworkz.functional.lambda.constants.Religion;

public class HabbaDTO implements Serializable {

	private String name;
	private String region;
	private int noOfDays;
	private Religion religion;
	private String specialFood;
	private boolean shouldBath;
	private boolean wakeUpEarly;
	
	public HabbaDTO() {
	}

	public HabbaDTO(String name, String region, int noOfDays, Religion religion,
			String specialFood, boolean shouldBath, boolean wakeUpEarly) {
		this.name = name;
		this.region = region;
		this.noOfDays = noOfDays;
		this.religion = religion;
		this.specialFood = specialFood;
		this.shouldBath = shouldBath;
		this.wakeUpEarly = wakeUpEarly;
	}

	@Override
	public String toString() {
		return "HabbaDTO [name=" + name + ", region=" + region + ", noOfDays=" + noOfDays + ", religion=" + religion
				+ ", specialFood=" + specialFood + ", shouldBath=" + shouldBath + ", wakeUpEarly=" + wakeUpEarly + "]";
	}

	
	@Override
	public int hashCode() {
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof MarketDTO) {
			HabbaDTO casted = (HabbaDTO) obj;
			if (this.name.equals(casted.name) && this.religion.equals(casted.religion)
					&& this.noOfDays == casted.noOfDays) {
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public String getSpecialFood() {
		return specialFood;
	}

	public void setSpecialFood(String specialFood) {
		this.specialFood = specialFood;
	}

	public boolean isShouldBath() {
		return shouldBath;
	}

	public void setShouldBath(boolean shouldBath) {
		this.shouldBath = shouldBath;
	}

	public boolean isWakeUpEarly() {
		return wakeUpEarly;
	}

	public void setWakeUpEarly(boolean wakeUpEarly) {
		this.wakeUpEarly = wakeUpEarly;
	}
}