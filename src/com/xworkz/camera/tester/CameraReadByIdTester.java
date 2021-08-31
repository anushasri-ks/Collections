package com.xworkz.camera.tester;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOimpl;

public class CameraReadByIdTester {

	public static void main(String[] args) {
		
		CameraDAO dao = new CameraDAOimpl();
		System.out.println(dao.readById(1));
		
	}
}