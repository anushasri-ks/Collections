package com.xworkz.datastore.tester;

import java.util.Collection;

import com.xworkz.datastore.dao.TempleDAO;
import com.xworkz.datastore.dao.TempleDAOimpl;
import com.xworkz.datastore.dto.TempleDTO;

public class TempleDTOTester {

	public static void main(String[] args) {
		
		TempleDTO dto1 = new TempleDTO(1, "Sai Baba Temple", "Shiridi", 100, "laddu", 10, true, "Krishna", true);
		TempleDTO dto2 = new TempleDTO(2, "Iskon Temple", "Srisailam", 200, "pulihora", 8, true, "Shiva", true);
		TempleDTO dto3 = new TempleDTO(3, "Ganesha Temple", "Kanipakam", 500, "pongal", 11, true, "Ganesh", false);
		TempleDTO dto4 = new TempleDTO(4, "Hanuman Temple", "Ananthapur", 700, "payasam", 8, true, "Hanuman", false);
		
		TempleDAO dao = new TempleDAOimpl();
		dao.save(dto1);
		dao.save(dto2);	
		dao.save(dto3);
		dao.save(dto4);
		
		System.out.println("Total items: "+dao.totalItems());
		
		TempleDTO dtoDelete = new TempleDTO(4, "Hanuman Temple", "Ananthapur", 700, "payasam", 8, true, "Hanuman", false);
		dao.delete(dtoDelete);
		
		System.out.println("First Item:"+dao.findFirstItem());
		
		System.out.println("Last Item:"+dao.findLastItem());
		
		System.out.println(dao.findByName("Iskon Temple"));
		
		System.out.println(dao.findByLocation("Kanipakam"));
		
		System.out.println(dao.findByLocationAndName("Sai Baba Temple", "Shiridi"));
		
		System.out.println(dao.findLocationByName("Ganesha Temple"));
		
		System.out.println(dao.findAllLocation());
		
		Collection <TempleDTO> collection1= dao.findAllTempleByLocationStartWith('S');
		for(TempleDTO temple : collection1) {
			System.out.println("Temple By Location Starts with s: "+temple);
		}

		Collection <TempleDTO> collection2 =dao.findAllTempleByEntryFeeGreaterThan(200);
		for(TempleDTO temple : collection2) {
			System.out.println("Entry Fee Greater than : "+ temple);
		}
		
		Collection <TempleDTO> collection3 =dao.findAll();
		for(TempleDTO temple : collection3) {
			System.out.println("Found All "+temple);
		}
		
		Collection <TempleDTO> collection4 =dao.findAllTempleByNoOfPoojarisGreaterThan(8);
		for(TempleDTO temple : collection4) {
			System.out.println("Finding All Temples by no of poojaris greater than: "+temple);
		}
		
		
		
	}
}