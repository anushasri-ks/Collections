package com.xworkz.tester;

import com.xworkz.dto.TransformerDTO;
import com.xworkz.service.TransformerService;
import com.xworkz.service.TransformerServiceImpl;

public class TransformerTester {

	public static void main(String[] args) {
		
	TransformerDTO dto = new TransformerDTO("Anusha", "RT nagar", "", "", "with family", "when hungry","coding and sleeping");
	
	TransformerService transformerService = new TransformerServiceImpl();
	transformerService.validateAndSave(dto);	
	}
}