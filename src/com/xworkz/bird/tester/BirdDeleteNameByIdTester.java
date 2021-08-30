package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOimpl;

public class BirdDeleteNameByIdTester {

	public static void main(String[] args) {
		BirdDAO dao = new BirdDAOimpl();
		dao.deleteById(1);
	}
}