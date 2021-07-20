package com.xworkz.datastore.dto;

import java.io.Serializable;

public class HighwayDTO implements Serializable{
	private int id;
	private int number;
	private HighwayType type;
	private String stateName;
	private double length;
	private boolean condition;
	private String contractCompany;
	
	public HighwayDTO() {
		super();
	}

	public HighwayDTO(int id, int number, HighwayType type, String stateName, double length, boolean condition,
			String contractCompany) {
		super();
		this.id = id;
		this.number = number;
		this.type = type;
		this.stateName = stateName;
		this.length = length;
		this.condition = condition;
		this.contractCompany = contractCompany;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public HighwayType getHighwayType() {
		return type;
	}

	public void setHighwayType(HighwayType type) {
		this.type = type;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean getCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public String isContractCompany() {
		return contractCompany;
	}

	public void setContractCompany(String contractCompany) {
		this.contractCompany = contractCompany;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HighwayDTO other = (HighwayDTO) obj;
		if (condition != other.condition)
			return false;
		if (contractCompany == null) {
			if (other.contractCompany != null)
				return false;
		} else if (!contractCompany.equals(other.contractCompany))
			return false;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (number != other.number)
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HighwayDTO [id=" + id + ", number=" + number + ", highwayType=" + type + ", stateName="
				+ stateName + ", length=" + length + ", condition=" + condition + ", contractCompany=" + contractCompany
				+ "]";
	}
	
	
	
}
