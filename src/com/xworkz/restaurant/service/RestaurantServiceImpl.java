package com.xworkz.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.restaurant.dao.RestaurantDAO;
import com.xworkz.restaurant.entity.RestaurantEntity;

@Component
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantDAO restaurantDAO;

	@Override
	public boolean validateAndSave(RestaurantEntity entity) {
		int count = 0;
		boolean flag = false;

		if (entity != null) {
			String name = entity.getName();
			if (name != null && !name.isEmpty()) {
				count++;
			}
			String location = entity.getLocation();
			if (location != null && !location.isEmpty()) {
				count++;
			}
			String type = entity.getType();
			if (type != null && !type.isEmpty()) {
				count++;
			}
			if (count == 3) {
				flag = true;
				this.restaurantDAO.save(entity);
			}
		}
		return flag;
	}
}