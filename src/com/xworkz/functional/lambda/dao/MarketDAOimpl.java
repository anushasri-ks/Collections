package com.xworkz.functional.lambda.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.lambda.dto.MarketDTO;
import com.xworkz.functional.lambda.search.MarketSearch;

public class MarketDAOimpl implements MarketDAO {

private List<MarketDTO> list = new ArrayList<MarketDTO>();
	
	@Override
	public boolean save(MarketDTO dto) {
		System.out.println("Added : "+ dto);	
		return list.add(dto);
	}
	
	@Override
	public MarketDTO find(MarketSearch search) {	
		Iterator<MarketDTO> itr = this.list.iterator();
		MarketDTO dto = null;
		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if(search.test(marketDTO))
				dto = marketDTO;
		}
		return dto;
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch search) {
		Collection<MarketDTO> dto = new ArrayList<MarketDTO>();
		Iterator<MarketDTO> it = this.list.iterator();
		while (it.hasNext()) {
			MarketDTO marketDTO = it.next();
			if(search.test(marketDTO))
				dto.add(marketDTO);	
		}
		return dto;
	}
}