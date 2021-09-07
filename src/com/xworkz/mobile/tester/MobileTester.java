package com.xworkz.mobile.tester;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dao.MobileDAOimpl;

public class MobileTester {

	public static void main(String[] args) {
		
		MobileDAO dao = new MobileDAOimpl();
		dao.readAllRecords();
		dao.ReadMobilePriceByBrand("Samsung");
		dao.UpdateMobilePriceByBrand();
		System.out.println("Total price : "+dao.readTotalPriceOfMobile());
		System.out.println("Minimum price : "+dao.readMinPriceOfMobile());
		System.out.println("Maximum price : "+dao.readMaxPriceOfMobile());
	}

}
