package com.xworkz.restaurant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.xworkz.restaurant.entity.RestaurantEntity;
import com.xworkz.restaurant.service.RestaurantService;

@Component
public class RestaurantTester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		RestaurantService service = context.getBean(RestaurantService.class);
		RestaurantEntity entity = new RestaurantEntity();
		entity.setName("A2B");
		entity.setLocation("Banglore");
		entity.setSpecial("Coffee");
		entity.setBest(true);
		entity.setType("pure veg");
		System.out.println(service.validateAndSave(entity));
	}
}