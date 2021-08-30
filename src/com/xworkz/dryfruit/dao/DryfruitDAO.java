package com.xworkz.dryfruit.dao;

import com.xworkz.dryfruit.dto.DryfruitEntity;

public interface DryfruitDAO {

	int save(DryfruitEntity entity);
	int read(DryfruitEntity entity);
	DryfruitEntity update(int pk);
	DryfruitEntity delete(int pk);
	
}