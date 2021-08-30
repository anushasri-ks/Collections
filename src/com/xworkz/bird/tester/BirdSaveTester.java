package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOimpl;
import com.xworkz.bird.entity.BirdEntity;

public class BirdSaveTester {

	public static void main(String[] args) {

		BirdDAO dao = new BirdDAOimpl();
		
		BirdEntity entity1 = new BirdEntity(1,"Cocktail","small parrot",true,"white","australia",16,"female",true,true);
		dao.save(entity1);
		BirdEntity entity2 = new BirdEntity(2,"Parrot","green parrot",true,"green","south america",15,"male",true,true);
		dao.save(entity2);
		BirdEntity entity3 = new BirdEntity(3,"Eagle","bald eagle",true,"brown","Eurasia",20,"female",true,false);
		dao.save(entity3);
		BirdEntity entity4 = new BirdEntity(4,"Ostrich","african ostrich",true,"grayish-brown","Australia",40,"male",false,false);
		dao.save(entity4);
	}
}