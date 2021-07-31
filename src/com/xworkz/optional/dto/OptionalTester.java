package com.xworkz.optional.dto;

import java.util.Optional;

public class OptionalTester {

	public static void main(String[] args) {
		// syntax --> main method --> standard
		
		// Optional --> NullPointerExceptions will be avoided
		// will increase coding a bit
		Optional<String> box = Optional.of("Anu"); // amazon

		String value = convertToLowerCase(box); // home
		System.out.println(value);
	}

	// NullPointerException ??? Developer
	private static String convertToLowerCase(Optional<String> opt) {// may or may not be there
		String temp = null;
		if (opt.isPresent()) {
			String value = opt.get();
			temp = value.toLowerCase();
		}
		return temp;
	}
}