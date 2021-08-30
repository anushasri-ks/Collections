package com.xworkz.palace.dto;

import java.io.Serializable;

public class PalaceDTO implements Serializable {

	private int id;
	private String palace;
	private String owned;
	private int year;
	private String state;
	private String city;
	private String country;

	public PalaceDTO() {
	}

	public PalaceDTO(int id, String palace, String owned, int year, String state, String city, String country) {
		this.id = id;
		this.palace = palace;
		this.owned = owned;
		this.year = year;
		this.state = state;
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "PalaceDTO [id=" + id + ", palace=" + palace + ", owned=" + owned + ", year=" + year + ", state=" + state
				+ ", city=" + city + ", country=" + country + "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof PalaceDTO) {
			PalaceDTO casted = (PalaceDTO) obj;
			if (this.palace.equals(casted.palace) && this.state.equals(casted.state)) {
				return true;
			}
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPalace() {
		return palace;
	}

	public void setPalace(String palace) {
		this.palace = palace;
	}

	public String getOwned() {
		return owned;
	}

	public void setOwned(String owned) {
		this.owned = owned;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}