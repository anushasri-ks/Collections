package com.xworkz.camera.tester;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOimpl;

public class CameraUpdateNameByIdTester {

	public static void main(String[] args) {
		
		CameraDAO dao = new CameraDAOimpl();
		System.out.println(dao.updateNameById(3, "Sony cybershot"));

	}
}