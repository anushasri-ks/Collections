package com.xworkz.airport;

public class Airport {

	private String name;
	private String location;

	public Airport(String name, String location) {
		this.name = name;
		this.location = location;
	}
	
	public void runWay() {
		System.out.println(this.getClass().getSimpleName() + " Invoked runWay");
	}
	public void maintenance() {
		System.out.println(this.getClass().getSimpleName() + " Invoked maintenance");
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

	@Override
	public String toString() {
		return "Airport [name=" + name + ", location=" + location + "]";
	}
}