package com.xworkz.fruits;

public class Vitamin {

	public String type;
	public boolean isWaterSoluble;
	public boolean isFatSouluble;

	public Vitamin(String type, boolean isWaterSoluble, boolean isFatSouluble) {
		this.type = type;
		this.isWaterSoluble = isWaterSoluble;
		this.isFatSouluble = isFatSouluble;
	}

	public void strength() {
		System.out.println("Invoked strength method");
	}
	
	@Override
	public String toString() {
		return "Vitamin [type=" + type + ", isWaterSoluble=" + isWaterSoluble + ", isFatSouluble=" + isFatSouluble
				+ "]";
	}
}