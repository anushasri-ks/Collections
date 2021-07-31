package com.xworkz.optional.dao;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.xworkz.optional.dto.GroceryDTO;
import com.xworkz.optional.search.GrocerySearch;

public interface GroceryDAO {
	
	void create(GroceryDTO dto);
	Optional <GroceryDTO> findOne(GrocerySearch search);
	Collection<GroceryDTO> findAll(GrocerySearch search);
	Optional<GroceryDTO> findByMaxQuantity();
	Optional<GroceryDTO> findByManufacturedDate(Date date);
	Collection<GroceryDTO> findAllByExpiredDate();

}