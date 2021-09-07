package com.xworkz.mobile.tester;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.mobile.entity.MobileEntity;

public class MobileInsertTester {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(new MobileEntity("One plus", "One plus 9R", 39999, true, "black"));
		session.save(new MobileEntity("One plus", "One plus Nord 2", 30000, true, "blue"));
		session.save(new MobileEntity("Samsung", "Samsung Galaxy Fold", 175000, true, "cosmos black"));
		trans.commit();
		factory.close();
	}
}