package com.xworkz.camera.tester;

import com.xworkz.camera.dao.CameraDAO;
import com.xworkz.camera.dao.CameraDAOimpl;
import com.xworkz.camera.entity.CameraEntity;

public class CameraSaveTester {

	public static void main(String[] args) {
		
		CameraDAO dao = new CameraDAOimpl();
		
		CameraEntity entity1 = new CameraEntity("Nikon D3500","Nikon","DSLR",42999,365,"Li-Ion",2,true,24);
		CameraEntity entity2 = new CameraEntity("Nikon JAA830DA","Nikon","DSLR",162990,450,"Li-Ion",2,true,48);
		CameraEntity entity3 = new CameraEntity("Sony Cybershot DSC","Sony","Digital",28990,200,"Li-Ion",2,true,12);
		dao.save(entity1);
		dao.save(entity2);
		dao.save(entity3);
	}
}