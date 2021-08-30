package com.xworkz.bird.tester;

import com.xworkz.bird.dao.BirdDAO;
import com.xworkz.bird.dao.BirdDAOimpl;
import com.xworkz.bird.dto.BirdEntity;

public class BirdSaveTester {

	public static void main(String[] args) {

		BirdEntity entity1 = new BirdEntity(1,"Cocktail","small parrot",true,"white","australia",16,"female",true,true);
		BirdEntity entity2 = new BirdEntity(2,"Parrot","green parrot",true,"green","south america",15,"male",true,true);
		BirdEntity entity3 = new BirdEntity(3,"Eagle","bald eagle",true,"brown","Eurasia",20,"female",true,false);
		BirdEntity entity4 = new BirdEntity(4,"Ostrich","african ostrich",true,"grayish-brown","Australia",40,"male",false,false);
		
		BirdDAO dao = new BirdDAOimpl();
		dao.save(entity1);
		dao.save(entity2);
		dao.save(entity3);
		dao.save(entity4);
	}
}