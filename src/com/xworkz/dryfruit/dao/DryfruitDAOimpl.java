package com.xworkz.dryfruit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.dryfruit.dto.DryfruitEntity;

public class DryfruitDAOimpl implements DryfruitDAO {

	DryfruitEntity df = null;

	@Override
	public int save(DryfruitEntity entity) {
//		load connection properties to memory
		Configuration configuration = new Configuration();
		configuration.configure().addAnnotatedClass(DryfruitEntity.class);
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(entity);
		trans.commit();
		System.out.println("Saved: " + pk);
		session.close();
		sf.close();
		return pk;
	}

	@Override
	public int read(DryfruitEntity entity) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryfruitEntity.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		DryfruitEntity df = session.get(DryfruitEntity.class, 1);
		System.out.println("Read entity : " + df);
		session.close();
		sf.close();
		return 1;
	}

	@Override
	public DryfruitEntity update(int pk) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryfruitEntity.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		df = session.get(DryfruitEntity.class, pk);
		df.setName("Pista");
		session.update(df);
		System.out.println("updated Name : " + df);
		trans.commit();
		session.close();
		sf.close();
		return df;
	}

	@Override
	public DryfruitEntity delete(int pk) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(DryfruitEntity.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Object obj = session.load(DryfruitEntity.class, new Integer(1));
		DryfruitEntity df = (DryfruitEntity) obj;
		Transaction trans = session.beginTransaction();
		session.delete(df);
		System.out.println("data at first row has been deleted");
		trans.commit();
		session.close();
		sf.close();
		return df;
	}
}