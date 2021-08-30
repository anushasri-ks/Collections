package com.xworkz.soap.tester;

import com.xworkz.soap.constant.SoapType;
import com.xworkz.soap.dao.SoapDAO;
import com.xworkz.soap.dao.SoapDAOimpl;
import com.xworkz.soap.dto.SoapDTO;

public class SoapTester {

	public static void main(String[] args) {
		
		SoapDTO entity1 = new SoapDTO(2, "anu", "lily", true, false, SoapType.BabySoap);
		SoapDAO dao = new SoapDAOimpl();
		dao.save(entity1);
	}
}