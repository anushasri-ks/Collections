package com.xworkz.webseries.tester;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.webseries.dao.WebseriesDAO;
import com.xworkz.webseries.dao.WebseriesDAOimpl;
import com.xworkz.webseries.dto.WebseriesDTO;

public class WebseriesFindTester {

	public static void main(String[] args) {

		WebseriesDAO dao = new WebseriesDAOimpl();

		Collection<WebseriesDTO> collection = dao.findAll();
		collection.forEach(r -> System.out.println(r));

		dao.total();

		dao.findMaxSeason();

		dao.findMinSeason();

		collection = dao.findAllSortByNameDesc();
		collection.forEach(r -> System.out.println(r));
		
		collection = dao.findAll((a)->a.getTotalSeason() == 10);
		collection.forEach(r -> System.out.println(r));
		
		Optional<WebseriesDTO> opt = dao.findOne((a)->a.getName().equals("Friends"));
		if(opt.isPresent()) {
			WebseriesDTO dto = opt.get();
			System.out.println(dto);
		}
	}
}