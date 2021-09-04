package com.xworkz.customer.dao;

import java.util.List;

import com.xworkz.customer.entity.CustomerEntity;

public interface CustomerDAO {

	void saveList(List<CustomerEntity> entity);
}