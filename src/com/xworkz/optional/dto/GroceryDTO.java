package com.xworkz.optional.dto;

import java.io.Serializable;
import java.util.Date;

import com.xworkz.optional.constants.GroceryType;

public class GroceryDTO implements Serializable, Comparable<GroceryDTO> {

	private String name;
	private double price;
	private GroceryType type;
	private double quantity;
	private String quality;
	private String brand;
	private String manufacturedDate;
	private String expiryDate;
	private boolean organic;
	private boolean veg;
	private int barCodeNo;

	public GroceryDTO() {
	}

	public GroceryDTO(String name, double price, GroceryType type, double quantity, String quality, String brand,
		 String manufacturedDate, String expiryDate, boolean organic, boolean veg, int barCodeNo) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
		this.quality = quality;
		this.brand = brand;
		this.expiryDate = expiryDate;
		this.manufacturedDate = manufacturedDate;
		this.organic = organic;
		this.veg = veg;
		this.barCodeNo = barCodeNo;
	}

	@Override
	public int hashCode() {
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof GroceryDTO) {
			GroceryDTO casted = (GroceryDTO) obj;
			if (this.name.equals(casted.name) && this.brand.equals(casted.brand) && this.barCodeNo == casted.barCodeNo
					&& this.quantity == casted.quantity) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(GroceryDTO quantity) {
		double max = quantity.getQuantity();
		if (this.quantity == max)
			return 0;
		if (this.quantity > max)
			return 1;
		if (this.quantity < max)
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		return "GroceryDTO [name=" + name + ", price=" + price + ", type=" + type + ", quantity=" + quantity
				+ ", quality=" + quality + ", brand=" + brand + ", expiryDate=" + expiryDate + ", manufacturedDate="
				+ manufacturedDate + ", organic=" + organic + ", veg=" + veg + ", barCodeNo=" + barCodeNo + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public GroceryType getType() {
		return type;
	}

	public void setType(GroceryType type) {
		this.type = type;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(String manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public boolean isOrganic() {
		return organic;
	}

	public void setOrganic(boolean organic) {
		this.organic = organic;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public int getBarCodeNo() {
		return barCodeNo;
	}

	public void setBarCodeNo(int barCodeNo) {
		this.barCodeNo = barCodeNo;
	}
}