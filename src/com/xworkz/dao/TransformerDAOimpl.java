package com.xworkz.dao;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.dto.TransformerDTO;

public class TransformerDAOimpl implements TransformerDAO {

	private Collection<TransformerDTO> collection = new HashSet<TransformerDTO>();

	@Override
	public boolean save(TransformerDTO dto) {
		System.out.println("Invoked save method");
		return this.collection.add(dto);
	}
}