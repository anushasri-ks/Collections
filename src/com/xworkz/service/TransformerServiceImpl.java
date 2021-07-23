package com.xworkz.service;

import com.xworkz.dao.TransformerDAO;
import com.xworkz.dao.TransformerDAOimpl;
import com.xworkz.dto.TransformerDTO;

public class TransformerServiceImpl implements TransformerService {

	private TransformerDAO dao = new TransformerDAOimpl();
	@Override
	public String validateAndSave(TransformerDTO dto) {
		int valid = 0;
		if(dto != null) {
			System.out.println("validating...");
			String name = dto.getName();
			if(name != null && !name.isEmpty() && name.length() >= 5 && name.length() <= 50) {
				System.out.println("name is valid");
				valid++;
			}
			else {
				System.out.println("name is invalid");
			}
			String place = dto.getPlace();
			if(place != null && !place.isEmpty() && place.length() >= 4 && place.length() <= 20) {
				System.out.println("place is valid");
				valid++;
			}
			else {
				System.out.println("place is invalid");
			}
			String angry = dto.getAngry();
			if(angry == null || angry.isEmpty() || angry.length() >= 4 && angry.length() <= 12) {
				System.out.println("angry is valid");
				valid++;
			}
			else {
				System.out.println("angry is invalid");
			}
			String happy = dto.getHappy();
			if(happy != null && happy.length() >= 4 && happy.length() <= 12) {
				System.out.println("happy is valid");
				valid++;
			}
			else {
				System.out.println("happy is invalid");
			}
			String sad = dto.getSad();
			if(sad != null && sad.length() >= 4 && sad.length() <= 12) {
				System.out.println("sad is valid");
				valid++;
			}
			else {
				System.out.println("sad is invalid");
			}
			String likeToDo = dto.getLikeToDo();
			if(likeToDo != null && likeToDo.length() >= 15 && likeToDo.length() <= 300) {
				System.out.println("likeToDo is valid");
				valid++;
			}
			else {
				System.out.println("likeToDo is invalid");
			}
			if(valid == 6) {
				System.out.println("*Validation success*");
				dao.save(dto);
				return "VALID";
			}
		}
		return "INVALID";
	}

}
