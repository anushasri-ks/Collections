package com.xworkz.datastore.dao;

import java.util.Collection;

import com.xworkz.datastore.dto.TempleDTO;

public interface TempleDAO {

	boolean save(TempleDTO dto);
	int totalItems();
	boolean delete(TempleDTO dto);
	TempleDTO findFirstItem();
	TempleDTO findLastItem();
	TempleDTO findByName(String name);
	TempleDTO findByLocation(String loc);
	TempleDTO findByLocationAndName(String name,String location);
	String findLocationByName(String name);
	
	Collection<TempleDTO> findAll();
	Collection<TempleDTO> findAllTempleByLocationStartWith(char character);
	Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost);
	Collection<TempleDTO>findAllTempleByNoOfPoojarisGreaterThan(int no);
	Collection<String> findAllLocation();
}