package com.xworkz.camera.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOimpl;

public class CameraDeleteListTester {

	public static void main(String[] args) {

		CameraDAO dao = new CameraDAOimpl();
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		ids.add(2);
		dao.deleteList(ids);

	}
}