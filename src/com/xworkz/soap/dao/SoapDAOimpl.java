package com.xworkz.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.soap.dto.SoapDTO;

public class SoapDAOimpl implements SoapDAO {

	@Override
	public int save(SoapDTO entity) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(SoapDTO.class);
		SessionFactory sf = configure.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(entity);
		trans.commit();
		System.out.println(pk);
		session.close();
		sf.close();
		return pk;
	}
}