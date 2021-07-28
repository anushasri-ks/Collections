package com.xworkz.optional.tester;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.optional.dao.RogiDAO;
import com.xworkz.optional.dao.RogiDAOimpl;
import com.xworkz.optional.dto.RogiDTO;

public class RogiTester {

	public static void main(String[] args) {
		
		RogiDTO dto1 = new RogiDTO(1, "anu", 20, "fever", true);
		RogiDTO dto2 = new RogiDTO(2, "sha", 23, "cold", true);
		RogiDTO dto3 = new RogiDTO(3, "sri", 22, "cancer", false);
		RogiDTO dto4 = new RogiDTO(4, "anusha", 21, "corona", true);
		RogiDTO dto5 = new RogiDTO(5, "Anushasri", 24, "small pox", true);
		
		RogiDAO dao = new RogiDAOimpl();
		dao.save(dto5);
		dao.save(dto4);
		dao.save(dto3);
		dao.save(dto2);
		dao.save(dto1);
		
		Optional<RogiDTO> dto = dao.findOne((id)-> id.getId() == 5);
		System.out.println(dto);
		
		dto = dao.findOne((name)-> name.getName().equals("anusha"));
		System.out.println(dto);
		
		System.out.println(dao.totalSize());
		
		System.out.println(dao.findByMaxAge());
		
		System.out.println(dao.findByMinAge());
		
		Collection<RogiDTO> collection = dao.findAll();
		for(RogiDTO rogiDTO: collection) {
			System.out.println(rogiDTO);
		}
		
		collection = dao.findAll((baduku)->baduku.isBadukuGuarantee() == true);
		for(RogiDTO rogiDTO: collection) {
			System.out.println(rogiDTO);
		}
		
	}

}
