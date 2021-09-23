package com.xworkz.restaurant.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.restaurant.entity.RestaurantEntity;

@Component
public class RestaurantDAOimpl implements RestaurantDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public RestaurantDAOimpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
		System.out.println(this.getClass().getSimpleName() + " bean created");
	}

	@Override
	public void save(RestaurantEntity entity) {
		try (Session session = sessionFactory.openSession()) {
			Transaction trans = session.beginTransaction();
			session.save(entity);
			trans.commit();
			session.close();
		}
	}
}