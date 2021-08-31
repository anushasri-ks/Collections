package com.xworkz.camera.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.camera.entity.CameraEntity;
import com.xworkz.camera.util.SFUtil;

public class CameraDAOimpl implements CameraDAO {

	private SessionFactory sf = SFUtil.getFactory();

	@Override
	public int save(CameraEntity entity) {
		try (Session session = sf.openSession()) {
			Transaction trans = session.beginTransaction();
			int pk = (int) session.save(entity);
			trans.commit();
			System.out.println("Saved entity : " + entity);
			return pk;
		}
	}

	@Override
	public CameraEntity readById(int id) {
		try (Session session = sf.openSession()) {
			CameraEntity entity = session.get(CameraEntity.class, id);
			System.out.println("Read entity : ");
			return entity;
		}
	}

	@Override
	public CameraEntity updateNameById(int id, String name) {
		try (Session session = sf.openSession()) {
			Transaction trans = session.beginTransaction();
			CameraEntity entity = session.get(CameraEntity.class, id);
			entity.setName(name);
			System.out.println("updated name by id : ");
			trans.commit();
			return entity;
		}
	}

	@Override
	public CameraEntity deleteById(int id) {
		try (Session session = sf.openSession()) {
			Transaction trans = session.beginTransaction();
			CameraEntity entity = session.get(CameraEntity.class, id);
			session.delete(entity);
			System.out.println("deleted by id : ");
			trans.commit();
			return entity;
		}
	}

}