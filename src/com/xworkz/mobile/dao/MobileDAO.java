package com.xworkz.mobile.dao;

public interface MobileDAO {

	void readAllRecords();
	double ReadMobilePriceByBrand(String brand);
	double UpdateMobilePriceByBrand();
	double readTotalPriceOfMobile();
	double readMinPriceOfMobile();
	double readMaxPriceOfMobile();
	double readSumPriceOfMobile();
}