package com.xworkz.fruits;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FruitsTester {

	public static void main(String[] args) {

		String beanConfigFile = "applicationContext.xml";
		ApplicationContext container = new ClassPathXmlApplicationContext(beanConfigFile);
		Fruits fruit = container.getBean(Fruits.class);

		System.out.println(fruit.name);
		System.out.println(fruit.color);
		System.out.println(fruit.price);
		System.out.println(fruit.taste);
		System.out.println(fruit.vitamin);

		fruit.eat();
		System.out.println(fruit.vitamin.type);
		System.out.println(fruit.vitamin.isFatSouluble);
		System.out.println(fruit.vitamin.isWaterSoluble);
	}
}