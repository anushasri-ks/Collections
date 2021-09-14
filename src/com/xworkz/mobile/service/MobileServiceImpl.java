package com.xworkz.mobile.service;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dao.MobileDAOimpl;
import com.xworkz.mobile.entity.MobileEntity;

public class MobileServiceImpl implements MobileService {

	private MobileDAO dao = new MobileDAOimpl();
	@Override
	public int validateAndSave(MobileEntity entity) {
		int valid = 0;
		if (entity != null) {
			String brand = entity.getBrand();
			if (brand != null && !brand.isEmpty() && brand.length() > 3 && brand.length() < 8) {
				valid++;
			}
			double price = entity.getPrice();
			if (price > 5000 && price < 20000) {
				valid++;
			}
			String model = entity.getModel();
			if (model != null) {
				valid++;
			}
			if (valid == 3) {
				valid = 1;
				dao.save(entity);
			}
		}
		return valid;
	}

	@Override
	public void validateAndGetAllRecords() {
		dao.getAllRecords();
	}
	
	@Override
	public double validateAndGetPriceByBrand(String brand) {
		return dao.getPriceByBrand(brand);
	}

	@Override
	public void validateAndUpdatePriceByBrand(String brand) {
		dao.updatePriceByBrand(brand);	
	}
	
	@Override
	public void validateAndDeleteRowById(int id) {
		dao.deleteRowById(id);
	}

	@Override
	public double validateAndGetTotalPrice() {
		return dao.getTotalPrice();
	}

	@Override
	public double validateAndGetMaximumPrice() {
		return dao.getMaximumPrice();
	}

	@Override
	public double validateAndGetMinimumPrice() {
		return dao.getMinimumPrice();
	}
}