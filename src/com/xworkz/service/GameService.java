package com.xworkz.service;

import com.xworkz.dto.GameDTO;

public interface GameService {
	
	String validateAndSave(GameDTO dto);
}