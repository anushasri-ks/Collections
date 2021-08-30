package com.xworkz.bird.dao;

import com.xworkz.bird.dto.BirdEntity;

public interface BirdDAO {

	int save(BirdEntity entity);
	BirdEntity readById(int pk);
	
}