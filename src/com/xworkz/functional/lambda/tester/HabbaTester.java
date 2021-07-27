package com.xworkz.functional.lambda.tester;

import java.util.Collection;

import com.xworkz.functional.lambda.constants.Religion;
import com.xworkz.functional.lambda.dao.HabbaDAO;
import com.xworkz.functional.lambda.dao.HabbaDAOimpl;
import com.xworkz.functional.lambda.dto.HabbaDTO;

public class HabbaTester {

	public static void main(String[] args) {
		
		HabbaDTO dto1 = new HabbaDTO("Pongal","India",4,Religion.hindu,"sweet pongal",true,true);
		HabbaDTO dto2 = new HabbaDTO("Raksha Bhandan","North India",1,Religion.hindu,"sweets",true,true);
		HabbaDTO dto3 = new HabbaDTO("Christmas","World wide",1,Religion.christian,"candy",true,true);
		HabbaDTO dto4 = new HabbaDTO("ramzan","World wide",30,Religion.muslim,"briyani",true,true);
		HabbaDTO dto5 = new HabbaDTO("Onam","kerala",1,Religion.hindu,"Sadhya",true,true);
		
		HabbaDAO dao = new HabbaDAOimpl();
		dao.ulisu(dto1);
		dao.ulisu(dto2);
		dao.ulisu(dto3);
		dao.ulisu(dto4);
		dao.ulisu(dto5);
		
		HabbaDTO dto = dao.ondunaHuduku((name)->name.getName().equals("Pongal"));
		System.out.println("\nFind by name :\n"+dto);
		
		dto = dao.ondunaHuduku((religion)->religion.getReligion().equals(Religion.christian));
		System.out.println("\nFind by religion :\n"+dto);
		
		dto = dao.ondunaHuduku((noOfDays)->noOfDays.getNoOfDays() == 30);
		System.out.println("\nFind by noOfDays :\n"+dto);

		Collection<HabbaDTO> collection = dao.yellavanuHuduku((region)->region.getRegion().equals("World wide"));
		for (HabbaDTO habbaDTO : collection) {
			System.out.println("By religion: "+habbaDTO);
		}
	}
}