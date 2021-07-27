package com.xworkz.functional.lambda.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.lambda.dto.HabbaDTO;
import com.xworkz.functional.lambda.search.HabbaSearch;

public class HabbaDAOimpl implements HabbaDAO {

	private List<HabbaDTO> list = new ArrayList<>();
	@Override
	public boolean ulisu(HabbaDTO dto) {
		System.out.println("Added: "+dto);
		return list.add(dto);
	}

	@Override
	public HabbaDTO ondunaHuduku(HabbaSearch search) {
		Iterator<HabbaDTO> itr = this.list.iterator();
		HabbaDTO dto = null;
		while (itr.hasNext()) {
			HabbaDTO habbaDTO = itr.next();
			if (search.huduku(habbaDTO))
				dto = habbaDTO;
		}
		return dto;
	}
/*		
	list.forEach((dto)-> {
			if(search.huduku(dto))
				System.out.println(dto);
		});
		return null;
	}
*/

	@Override
	public Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search) {
		Collection<HabbaDTO> collection = new ArrayList<>();
		list.forEach((dto) -> {
			if(search.huduku(dto))
				collection.add(dto);
		});
		System.out.println("\nyellavanu huduku :");
		return collection;
	}

}
