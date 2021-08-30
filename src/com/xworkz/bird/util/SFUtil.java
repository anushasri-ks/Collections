package com.xworkz.bird.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 
 * @author Anushasri KS
 *
 */

public class SFUtil {

	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		if (factory != null && factory.isClosed()) {
			throw new IllegalStateException("Someone closed SF, please correct the code");
		}
		return factory;
	}

	static {
		try {
			System.out.println("SF init started");
			Configuration config = new Configuration().configure();
			factory = config.buildSessionFactory();
			System.out.println("SF init complete");
		} catch (HibernateException e) {
			System.out.println("SF error in static block");
			e.printStackTrace();
		}
	}
}