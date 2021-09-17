package com.xworkz.fruits;

public class Fruits {

	public String name;
	public String color;
	public float price;
	public String taste;
	public Vitamin vitamin;

	public Fruits(String name, String color, float price, String taste, Vitamin vitamin) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.taste = taste;
		this.vitamin = vitamin;
		System.out.println(this.getClass().getSimpleName() + " bean created");
	}

	void eat() {
		System.out.println("Invoked eat method");
		vitamin.strength();
	}

	@Override
	public String toString() {
		return "Fruits [name=" + name + ", color=" + color + ", price=" + price + ", taste=" + taste + ", vitamin="
				+ vitamin + "]";
	}
}