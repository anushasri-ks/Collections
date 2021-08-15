package com.xworkz.restaurant.tester;

import java.util.Collection;

import com.xworkz.restaurant.constant.RestaurantType;
import com.xworkz.restaurant.dao.RestaurantDAO;
import com.xworkz.restaurant.dao.RestaurantDAOimpl;
import com.xworkz.restaurant.dto.RestaurantDTO;

public class RestaurantFindTester {

	public static void main(String[] args) {
		
		RestaurantDAO dao = new RestaurantDAOimpl();
		
		System.out.println(dao.findByName("A2B"));

		Collection<RestaurantDTO> collection = dao.findByType(RestaurantType.Family);
		collection.forEach(ref->System.out.println(ref));
		
		System.out.println(dao.updateTypeByName(RestaurantType.MultiCuisine, "Andhr"));
		
		System.out.println(dao.deleteByTypeAndName(RestaurantType.BAR, "JetLag"));
	}
}