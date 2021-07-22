package com.xworkz.tester;

import com.xworkz.dto.GameDTO;
import com.xworkz.service.GameService;
import com.xworkz.service.GameServiceImpl;

public class GameTester {

	public static void main(String[] args) {
		
		GameDTO dto = new GameDTO("BGMI", "v1.5.0", "Krafton", 4, 10000, true);
		
		GameService gameService = new GameServiceImpl();
		gameService.validateAndSave(dto);
	}
}