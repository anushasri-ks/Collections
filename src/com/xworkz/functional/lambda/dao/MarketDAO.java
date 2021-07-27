package com.xworkz.functional.lambda.dao;

import java.util.Collection;

import com.xworkz.functional.lambda.dto.MarketDTO;
import com.xworkz.functional.lambda.search.MarketSearch;

public interface MarketDAO {

	boolean save(MarketDTO dto);
	
	MarketDTO find(MarketSearch search);
	
	Collection<MarketDTO> findAll(MarketSearch search);

}