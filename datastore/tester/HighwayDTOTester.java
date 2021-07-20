package com.xworkz.datastore.tester;

import java.util.Collection;

import com.xworkz.datastore.dao.HighwayDAO;
import com.xworkz.datastore.dao.HighwayDAOimpl;
import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.HighwayType;

public class HighwayDTOTester {

	public static void main(String[] args) {
		HighwayDTO dto1 = new HighwayDTO(1,20,HighwayType.SH,"Karnataka",569,true,"L&T");
		HighwayDTO dto2 = new HighwayDTO(2,30,HighwayType.NH,"telangana",900,false,"hi");
		HighwayDTO dto3 = new HighwayDTO(3,40,HighwayType.SH,"tamilnadu",560,true,"bye");
		HighwayDTO dto4 = new HighwayDTO(4,50,HighwayType.NH,"Karnataka",780,true,"y");
		
		HighwayDAO dao = new HighwayDAOimpl();
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		
		System.out.println("Items In DAO: " + dao.totalItems());
		
		System.out.println(dao.findAllNumber());
		
		System.out.println(dao.findLengthByNumber(30));
		
		System.out.println(dao.exist(dto3));
		
		System.out.println(dao.isCondition(40));
		
		Collection <HighwayDTO> collection1= dao.findAll();
		for(HighwayDTO highway : collection1) {
			System.out.println(highway);
		}
		
		Collection <HighwayDTO> collection2= dao.findByHighwayType(HighwayType.SH);
		for(HighwayDTO highway : collection2) {
			System.out.println(highway);
		}
		
		Collection <HighwayDTO> collection3= dao.findByStateName("tamilnadu");
		for(HighwayDTO highway : collection3) {
			System.out.println(highway);
		}
		System.out.println(dao.findNumberByStateName("Karnataka"));
		
		System.out.println(dao.findByMaxLength());
		
		System.out.println(dao.findByMinLength());
		
		
		
	}

}
