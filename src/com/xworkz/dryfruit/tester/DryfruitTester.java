package com.xworkz.dryfruit.tester;

import com.xworkz.dryfruit.dao.DryfruitDAO;
import com.xworkz.dryfruit.dao.DryfruitDAOimpl;
import com.xworkz.dryfruit.dto.DryfruitEntity;

public class DryfruitTester {

	public static void main(String[] args) {
		DryfruitEntity entity1 = new DryfruitEntity(1, "Almond", "Tulsi", "Brazil", 400, "TulsiDryFruits");
		DryfruitDAO dao = new DryfruitDAOimpl();
		dao.save(entity1);
		dao.read(entity1);
		dao.update(1);
		dao.delete(1);
	}
}