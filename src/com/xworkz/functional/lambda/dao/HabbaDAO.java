package com.xworkz.functional.lambda.dao;

import java.util.Collection;

import com.xworkz.functional.lambda.dto.HabbaDTO;
import com.xworkz.functional.lambda.search.HabbaSearch;

public interface HabbaDAO {

	boolean ulisu(HabbaDTO dto);
	HabbaDTO ondunaHuduku(HabbaSearch search);
	Collection<HabbaDTO> yellavanuHuduku(HabbaSearch search);
	
}