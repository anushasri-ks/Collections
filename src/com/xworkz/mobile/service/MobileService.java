package com.xworkz.mobile.service;

import com.xworkz.mobile.entity.MobileEntity;

public interface MobileService {

	int validateAndSave(MobileEntity entity);
	void validateAndGetAllRecords();
	double validateAndGetPriceByBrand(String brand);
	void validateAndUpdatePriceByBrand(String brand);
	void validateAndDeleteRowById(int id);
	double validateAndGetTotalPrice();
	double validateAndGetMaximumPrice();
	double validateAndGetMinimumPrice();
}