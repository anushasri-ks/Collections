package com.xworkz.datastore.dto;

import java.io.Serializable;

public class KitchenItemDTO implements Serializable ,Comparable<KitchenItemDTO> {
	private String name;
	private double price;
	private String usedFor;
	private String madeOf;
	
	public KitchenItemDTO() {
		super();
	}

	public KitchenItemDTO(String name, double price, String usedFor, String madeOf) {
		super();
		this.name = name;
		this.price = price;
		this.usedFor = usedFor;
		this.madeOf = madeOf;
	}

	@Override
	public String toString() {
		return "KitchenItemDTO [name=" + name + ", price=" + price + ", usedFor=" + usedFor + ", madeOf=" + madeOf
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		KitchenItemDTO other = (KitchenItemDTO) obj;
		if (madeOf == null) {
			if (other.madeOf != null)
				return false;
		} else if (!madeOf.equals(other.madeOf))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (usedFor == null) {
			if (other.usedFor != null)
				return false;
		} else if (!usedFor.equals(other.usedFor))
			return false;
		return true;
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

	public String getUsedFor() {
		return usedFor;
	}

	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}

	public String getMadeOf() {
		return madeOf;
	}

	public void setMadeOf(String madeOf) {
		this.madeOf = madeOf;
	}

	@Override
	public int compareTo(KitchenItemDTO that)  {
		return (this.getName().compareTo(that.getName()));
	}
		
	
}
