package com.xworkz.mobile.dao;

import com.xworkz.mobile.entity.MobileEntity;

public interface MobileDAO {

	int save(MobileEntity entity);
	void getAllRecords();
	void updatePriceByBrand(String brand);
    void deleteRowById(int id);
	double getPriceByBrand(String brand);
    double getTotalPrice(); 
    double getMaximumPrice();
    double getMinimumPrice();
    
}