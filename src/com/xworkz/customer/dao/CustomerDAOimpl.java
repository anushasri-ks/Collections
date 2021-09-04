package com.xworkz.customer.dao;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.customer.util.SFUtil;
import com.xworkz.customer.entity.CustomerEntity;

public class CustomerDAOimpl implements CustomerDAO {

	private SessionFactory sf = SFUtil.getFactory();

	@Override
	public void saveList(List<CustomerEntity> entities) {
		try (Session session = sf.openSession()) {
			Transaction trans = session.beginTransaction();
			AtomicInteger atomicInteger = new AtomicInteger();
			entities.forEach(entity -> {
				CustomerEntity customer = session.load(CustomerEntity.class, entity.getId());
				if (customer != null) {
					session.save(entity);
					System.out.println(entity);
				}
				if (atomicInteger.incrementAndGet() % 10 == 0) {
					session.flush();
				}
			});
			trans.commit();
		}
	}
}