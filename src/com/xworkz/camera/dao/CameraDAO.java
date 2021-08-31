package com.xworkz.camera.dao;

import com.xworkz.camera.entity.CameraEntity;

public interface CameraDAO {

	int save(CameraEntity entity);
	CameraEntity readById(int id);
	CameraEntity updateNameById(int id, String name);
	CameraEntity deleteById(int id);
	
}