package com.xworkz.bird.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bird_table")
public class BirdEntity implements Serializable {

	@Column(name = "b_id")
	@Id
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_type")
	private String type;
	@Column(name = "b_feather")
	private boolean feather;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_region")
	private String region;
	@Column(name = "b_life_span")
	private int lifeSpan;
	@Column(name = "gender")
	private String gender;
	@Column(name = "b_fly")
	private boolean fly;
	@Column(name = "b_friendly_pet")
	private boolean friendlyPet;

	public BirdEntity() {
	}

	public BirdEntity(int id, String name, String type, boolean feather, String color, String region, int lifeSpan,
			String gender, boolean fly, boolean friendlyPet) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.feather = feather;
		this.color = color;
		this.region = region;
		this.lifeSpan = lifeSpan;
		this.gender = gender;
		this.fly = fly;
		this.friendlyPet = friendlyPet;
	}

	@Override
	public String toString() {
		return "BirdDTO [id=" + id + ", name=" + name + ", type=" + type + ", feather=" + feather + ", color=" + color
				+ ", region=" + region + ", lifeSpan=" + lifeSpan + ", gender=" + gender + ", fly=" + fly
				+ ", friendlyPet=" + friendlyPet + "]";
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof BirdEntity) {
			BirdEntity casted = (BirdEntity) obj;
			if (this.name.equals(casted.name) && this.type.equals(casted.type)) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isFeather() {
		return feather;
	}

	public void setFeather(boolean feather) {
		this.feather = feather;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public boolean isFriendlyPet() {
		return friendlyPet;
	}

	public void setFriendlyPet(boolean friendlyPet) {
		this.friendlyPet = friendlyPet;
	}
}