package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.dto.BirdEntity;

public class BirdDAOimpl implements BirdDAO {

	@Override
	public int save(BirdEntity entity) {
		Configuration config = new Configuration();
		config.configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(entity);
		trans.commit();
		System.out.println("Saved : " + pk);
		session.close();
		sf.close();
		return pk;
	}

	@Override
	public BirdEntity readById(int pk) {
		Configuration config = new Configuration();
		config.configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		BirdEntity entity = session.get(BirdEntity.class, pk);
		System.out.println("Read entity : ");
		session.close();
		sf.close();
		return entity;
	}
}