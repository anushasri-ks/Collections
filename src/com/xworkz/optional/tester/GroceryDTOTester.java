package com.xworkz.optional.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.xworkz.optional.constants.GroceryType;
import com.xworkz.optional.dao.GroceryDAO;
import com.xworkz.optional.dao.GroceryDAOimpl;
import com.xworkz.optional.dto.GroceryDTO;

public class GroceryDTOTester {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		GroceryDTO dto1 = new GroceryDTO("basmati", 200, GroceryType.rice, 2, "medium grain", "Royal", "05/01/2020",
				"05/04/2021", true, true, 1);
		GroceryDTO dto2 = new GroceryDTO("curd", 20, GroceryType.dairyProduct, 0.5, "thick", "amul", "05/03/2020",
				"05/01/2021", true, true, 2);
		GroceryDTO dto3 = new GroceryDTO("salt", 60, GroceryType.spices, 0.1, "rock", "tata", "05/04/2020",
				"05/11/2021", true, true, 3);
		GroceryDTO dto4 = new GroceryDTO("sunflower oil", 200, GroceryType.oil, 1, "refined", "gold winner",
				"05/06/2020", "05/12/2021", true, true, 4);
		GroceryDTO dto5 = new GroceryDTO("coffee powder", 350, GroceryType.beverage, 0.5, "instant", "bru",
				"05/08/2020", "05/06/2021", true, true, 5);

		GroceryDAO dao = new GroceryDAOimpl();
		dao.create(dto5);
		dao.create(dto4);
		dao.create(dto3);
		dao.create(dto2);
		dao.create(dto1);

		Optional<GroceryDTO> opt = dao.findOne((dto) -> dto.getName().equals("curd"));
		if (opt.isPresent()) {
			GroceryDTO dto = opt.get();
			System.out.println("Find one by name: " + dto);
		}

		Collection<GroceryDTO> collection = dao.findAll(price -> price.getPrice() >= 200);
		for (GroceryDTO dto : collection) {
			System.out.println(dto);
		}

		System.out.println(dao.findByMaxQuantity());

		collection = dao.findAllByExpiredDate();
		for (GroceryDTO dto : collection) {
			System.out.println(dto);
		}

		opt = dao.findByManufacturedDate(dateFormat.parse("05/01/2020"));
		if (opt.isPresent()) {
			GroceryDTO dto = opt.get();
			System.out.println(dto);
		}
	}
}