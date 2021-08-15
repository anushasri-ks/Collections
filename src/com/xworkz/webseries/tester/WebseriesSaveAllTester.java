package com.xworkz.webseries.tester;

import java.util.Arrays;
import java.util.Collection;

import com.xworkz.webseries.constant.OTTPlatform;
import com.xworkz.webseries.constant.genreType;
import com.xworkz.webseries.dao.WebseriesDAO;
import com.xworkz.webseries.dao.WebseriesDAOimpl;
import com.xworkz.webseries.dto.WebseriesDTO;

public class WebseriesSaveAllTester {

	public static void main(String[] args) {

		WebseriesDAO dao = new WebseriesDAOimpl();
		WebseriesDTO dto1 = new WebseriesDTO("Vampire Diaries", 22, 10, OTTPlatform.AmazonPrime, genreType.scifi, 16);
		WebseriesDTO dto2 = new WebseriesDTO("The walking dead", 24, 11, OTTPlatform.Netflix, genreType.horror, 18);
		WebseriesDTO dto3 = new WebseriesDTO("Friends", 20, 10, OTTPlatform.Netflix, genreType.comedy, 16);
		WebseriesDTO dto4 = new WebseriesDTO("Sunflower", 22, 10, OTTPlatform.Zee5, genreType.mystery, 18);
		WebseriesDTO dto5 = new WebseriesDTO("2 Broke Girls", 22, 10, OTTPlatform.AmazonPrime, genreType.comedy, 16);
		WebseriesDTO dto6 = new WebseriesDTO("Boss Baby:Back in Business", 10, 3, OTTPlatform.Netflix, genreType.comedy,
				7);
		
		Collection<WebseriesDTO> collection = Arrays.asList(dto1, dto2, dto3, dto4, dto5, dto6);
		dao.saveAll(collection);
		collection.forEach(r->System.out.println(r));

	}

}
