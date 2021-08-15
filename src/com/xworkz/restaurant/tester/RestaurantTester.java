package com.xworkz.restaurant.tester;

import com.xworkz.restaurant.dao.RestaurantDAO;
import com.xworkz.restaurant.dao.RestaurantDAOimpl;
import com.xworkz.restaurant.dto.RestaurantDTO;
import com.xworkz.restuarant.jdbc.constant.RestaurantType;

public class RestaurantTester {

	public static void main(String[] args) {

		RestaurantDAO dao = new RestaurantDAOimpl();
		RestaurantDTO dto1 = new RestaurantDTO("A2B", "RT nagar", "sweets", true, RestaurantType.Family);
		RestaurantDTO dto2 = new RestaurantDTO("Saravana Bhavan", "RT nagar", "mini sambar idly", true, RestaurantType.Family);
		RestaurantDTO dto3 = new RestaurantDTO("Andhra Gunpowder", "RT nagar", "Andhra veg meals", true, RestaurantType.Family);
		RestaurantDTO dto4 = new RestaurantDTO("JetLag", "Soap Factory", "Potato fries", false, RestaurantType.BAR);
		RestaurantDTO dto5 = new RestaurantDTO("CCD", "Koramangala", "Capaccino", false, RestaurantType.Cafe);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
	}
}