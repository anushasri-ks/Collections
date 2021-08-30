package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOimpl;

public class BirdReadByIdTester {

	public static void main(String[] args) {
		
		BirdDAO dao = new BirdDAOimpl();
		System.out.println(dao.readById(1));
	}
}