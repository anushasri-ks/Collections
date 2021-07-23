package com.xworkz.service;

import com.xworkz.dao.GameDAO;
import com.xworkz.dao.GameDAOimpl;
import com.xworkz.dto.GameDTO;

public class GameServiceImpl implements GameService {

	private GameDAO dao = new GameDAOimpl();
	@Override
	public String validateAndSave(GameDTO dto) {
		int valid = 0;
		if(dto != null) {
			System.out.println("Validating...");
			String name = dto.getName();
			if(name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 10) {
				System.out.println("name is valid");
				valid ++;
			}
			else {
				System.out.println("name is invalid");
			}
			String version = dto.getVersion();
			if (version != null && version.length() >= 1 && version.length() <= 50) {
				System.out.println("version is valid");
				valid ++;
			}
			else {
				System.out.println("version is invalid");
			}
			String developedBy = dto.getDevolopedBy();
			if (developedBy.length() >= 3 && developedBy.length() <= 15) {
				System.out.println("developedBy is valid");
				valid ++;
			}
			else {
				System.out.println("developedBy is invalid");
			}
			int maxPlayers = dto.getMaxPlayers();
			if (maxPlayers >= 3 && maxPlayers <= 8) {
				System.out.println("maxPlayers is valid");
				valid ++;
			}
			else {
				System.out.println("maxPlayers is invalid");
			}
			double memoryRequired = dto.getMemoryRequired();
			if (memoryRequired > 500 && memoryRequired < 500000) {
				System.out.println("memoryRequired is valid");
				valid ++;
			}
			else {
				System.out.println("memoryRequired is invalid");
			}
			if(valid == 5) {
				System.out.println("*Validation success*");
				dao.save(dto);
				return "SUCCESS";
			}
			return "FAILED";
		}
		System.out.println("Invalid input");
		return "INVALID";
	}
}
