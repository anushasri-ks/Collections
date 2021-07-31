package com.xworkz.optional.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import com.xworkz.optional.dto.GroceryDTO;
import com.xworkz.optional.search.GrocerySearch;

public class GroceryDAOimpl implements GroceryDAO {

	private List<GroceryDTO> list = new ArrayList<>();

	@Override
	public void create(GroceryDTO dto) {
		list.add(dto);
		System.out.println("---created---");
	}

	@Override
	public Optional<GroceryDTO> findOne(GrocerySearch search) {
		Optional<GroceryDTO> opt = Optional.empty();
		Iterator<GroceryDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			GroceryDTO dto = itr.next();
			if (search.test(dto))
				opt = Optional.of(dto);
		}
		return opt;
	}

	@Override
	public Collection<GroceryDTO> findAll(GrocerySearch search) {
		Collection<GroceryDTO> collection = new ArrayList<>();
		list.forEach((dto) -> {
			if (search.test(dto))
				collection.add(dto);
		});
		System.out.println("\nFind all search :");
		return collection;
	}

	@Override
	public Optional<GroceryDTO> findByMaxQuantity() {
		System.out.println("\nFind by max quantity :");
		return Optional.of(Collections.max(list));
	}

	@Override
	public Optional<GroceryDTO> findByManufacturedDate(Date date) {
		Optional<GroceryDTO> opt = Optional.empty();
		Iterator<GroceryDTO> itr = this.list.iterator();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("\nFind by manufactured date");
		while (itr.hasNext()) {
			GroceryDTO dto = itr.next();
			Date ManufactureDate = null;
			try {
				ManufactureDate = dateFormat.parse(dto.getManufacturedDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if (ManufactureDate.equals(date))
				opt = Optional.of(dto);
		}
		return opt;
	}

	@Override
	public Collection<GroceryDTO> findAllByExpiredDate() {
		Collection<GroceryDTO> collection = new ArrayList<>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		list.forEach((dto) -> {
			Date Currentdate = null;
			Date ExpiryDate = null;
			try {
				Currentdate = dateFormat.parse(dateFormat.format(new Date()));
				ExpiryDate = dateFormat.parse(dto.getExpiryDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			if (Currentdate.before(ExpiryDate))
				collection.add(dto);
		});
		System.out.println("\nFind all by Expired date :");
		return collection;
	}

}
