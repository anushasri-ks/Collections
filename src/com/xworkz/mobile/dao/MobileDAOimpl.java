package com.xworkz.mobile.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.util.SFUtil;

public class MobileDAOimpl implements MobileDAO {

	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public int save(MobileEntity entity) {
		int key = 0;
		try (Session session = factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			key = (int) session.save(entity);
			session.flush();
			transaction.commit();
			return key;
		}
	}

	@Override
	public void getAllRecords() {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("getAllRecords");
			List<MobileEntity> entities = query.list();
			System.out.println("Fetching all the records");
			for (MobileEntity entity : entities) {
				System.out.println(entity);
			}
		}
	}

	@Override
	public double getPriceByBrand(String brand) {
		double price = 0;
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("getPriceByBrand");
			query.setParameter("Brand", brand);
			Object object = query.uniqueResult();
			if (object != null) {
				price = (double) object;
				System.out.println("Fetching price by brand" + price);
			}
		}
		return price;
	}

	@Override
	public void updatePriceByBrand(String brand) {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("updatePriceByBrand");
			query.setParameter("Brand", brand);
			session.beginTransaction();
			System.out.println("Updated price by brand: " + query.executeUpdate());
			session.getTransaction().commit();
		}
	}

	@Override
	public void deleteRowById(int id) {
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("deleteRowById");
			query.setParameter("Id", id);
			session.beginTransaction();
			System.out.println("Deleted row by id: " + query.executeUpdate());
			session.getTransaction().commit();
		}
	}

	@Override
	public double getTotalPrice() {
		double price = 0;
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("getTotalPrice");
			Object obj = query.uniqueResult();
			if (obj != null) {
				price = (double) obj;
				System.out.println("Total price :" + price);
			}
		}
		return price;
	}

	@Override
	public double getMaximumPrice() {
		double price = 0;
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("getMaximumPrice");
			Object object = query.uniqueResult();
			if (object != null) {
				price = (double) object;
				System.out.println("Maximum price :" + price);
			}
		}
		return price;
	}

	@Override
	public double getMinimumPrice() {
		double price = 0;
		try (Session session = factory.openSession()) {
			Query query = session.getNamedQuery("getMinimumPrice");
			Object obj = query.uniqueResult();
			if (obj != null) {
				price = (double) obj;
				System.out.println("Minimum price :" + price);
			}
		}
		return price;
	}
}