package com.xworkz.dto;

import java.io.Serializable;

public class TransformerDTO implements Serializable {

	private String name;
	private String place;
	private String characterType;
	private String angry;
	private String happy;
	private String sad;
	private String likeToDo;

	public TransformerDTO() {
		super();
	}

	public TransformerDTO(String name, String place, String characterType, String angry, String happy, String sad,
			String likeToDo) {
		super();
		this.name = name;
		this.place = place;
		this.characterType = characterType;
		this.angry = angry;
		this.happy = happy;
		this.sad = sad;
		this.likeToDo = likeToDo;
	}

	@Override
	public String toString() {
		return "TransformerDTO [name=" + name + ", place=" + place + ", characterType=" + characterType + ", angry="
				+ angry + ", happy=" + happy + ", sad=" + sad + ", likeToDo=" + likeToDo + "]";
	}

	@Override
	public int hashCode() {
		return 3000;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof TransformerDTO) {
			TransformerDTO casted = (TransformerDTO) obj;
			if (this.name.equals(casted.name) && this.place.equals(casted.place)) {
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getCharacterType() {
		return characterType;
	}

	public void setCharacterType(String characterType) {
		this.characterType = characterType;
	}

	public String getAngry() {
		return angry;
	}

	public void setAngry(String angry) {
		this.angry = angry;
	}

	public String getHappy() {
		return happy;
	}

	public void setHappy(String happy) {
		this.happy = happy;
	}

	public String getSad() {
		return sad;
	}

	public void setSad(String sad) {
		this.sad = sad;
	}

	public String getLikeToDo() {
		return likeToDo;
	}

	public void setLikeToDO(String likeToDo) {
		this.likeToDo = likeToDo;
	}
}