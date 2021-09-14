package com.xworkz.mobile.tester;

import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

public class MobileTester {

	public static void main(String[] args) {

		MobileService service = new MobileServiceImpl();
		service.validateAndGetAllRecords();
		service.validateAndGetPriceByBrand("Samsung");
		service.validateAndUpdatePriceByBrand("Samsung");
		service.validateAndDeleteRowById(1);
		service.validateAndGetTotalPrice();
		service.validateAndGetMinimumPrice();
		service.validateAndGetMaximumPrice();
	}

}
