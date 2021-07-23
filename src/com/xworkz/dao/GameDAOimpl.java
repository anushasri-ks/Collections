package com.xworkz.dao;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.dto.GameDTO;

public class GameDAOimpl implements GameDAO {

	private Collection<GameDTO> collection = new HashSet<GameDTO>();

	@Override
	public boolean save(GameDTO dto) {
		System.out.println("Invoked save method");
		return this.collection.add(dto);
	}
}