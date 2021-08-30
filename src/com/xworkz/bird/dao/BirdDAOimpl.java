package com.xworkz.bird.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.bird.entity.BirdEntity;
import com.xworkz.bird.util.SFUtil;
import com.xworkz.dryfruit.dto.DryfruitEntity;

public class BirdDAOimpl implements BirdDAO {

	BirdEntity entity = null;

	@Override
	public int save(BirdEntity entity) {
		SessionFactory sf = SFUtil.getFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(entity);
		trans.commit();
		System.out.println("Saved : " + entity);
		session.close();
		return pk;
	}

	@Override
	public BirdEntity readById(int pk) {
		SessionFactory sf = SFUtil.getFactory();
		Session session = sf.openSession();
		BirdEntity entity = session.get(BirdEntity.class, pk);
		System.out.println("Read entity : ");
		session.close();
		return entity;
	}

	@Override
	public void updateNameById(int id, String name) {
		SessionFactory sf = SFUtil.getFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		entity = session.get(BirdEntity.class, id);
		entity.setName(name);
		session.update(entity);
		System.out.println("updated Name : " + entity);
		trans.commit();
		session.close();
	}

	@Override
	public void deleteById(int id) {
		SessionFactory sf = SFUtil.getFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		entity = session.get(BirdEntity.class, id);
		session.delete(entity);
		System.out.println("deleted successfully : " + entity);
		trans.commit();
		session.close();
	}
}