package com.xworkz.datastore.dao;

import java.util.Collection;

import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.HighwayType;

public interface HighwayDAO {
	boolean save (HighwayDTO dto);
	Collection<HighwayDTO> findAll();
	Collection <Integer> findAllNumber();
	int totalItems();
	Collection <HighwayDTO>findByHighwayType(HighwayType type);
	Collection<HighwayDTO> findByStateName(String sname);
	Collection<Integer> findNumberByStateName(String sname);
	boolean exist(HighwayDTO dto);
	boolean isCondition(int number);
	double findLengthByNumber(int no);
	HighwayDTO findByMaxLength();
	HighwayDTO findByMinLength();
}
