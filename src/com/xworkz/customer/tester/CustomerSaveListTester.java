package com.xworkz.customer.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.customer.dao.CustomerDAO;
import com.xworkz.customer.dao.CustomerDAOimpl;
import com.xworkz.customer.entity.CustomerEntity;

public class CustomerSaveListTester {

	public static void main(String[] args) {

		CustomerDAO dao = new CustomerDAOimpl();

		List<CustomerEntity> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			CustomerEntity entity1 = new CustomerEntity("Anushasri", "KS", "female", 24, "6379433195",
					"anushasri.xworkz@gmail.com", false, "RT nagar, Bangalore", "Gorimedu, Salem");
			list.add(entity1);
		}
		dao.saveList(list);
	}
}