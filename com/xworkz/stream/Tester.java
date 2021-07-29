package com.xworkz.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

public class Tester {

	public static void main(String[] args) {

		Collection<String> brand = Arrays.asList("Titan", "Rolex", "Sonata", "FastTrack", "Fossil", "Timex", "Fossil");
		
		Collection<String> usn = Arrays.asList("1PCE14CV007", "1PCE14CS008", "1PCE14CS009", "1PCE14ME006", "1PCE14EC007");
		
		Collection<String> pan = Arrays.asList("BPIPA0984D", "ATTPH3249N", "ATPTN1202A", "ATTPH3150H", "ATTPH3234A", "KNIPA1284E", "KNIPA0933D");
		
		//watch Brand
		Collection<String> string = brand.stream().filter((str) -> str.startsWith("F")).collect(Collectors.toList());
		string.forEach((str) -> System.out.println("Starting with F : "+str));

		Set<String> set = brand.stream().filter((str) -> str.startsWith("F")).collect(Collectors.toSet());
		System.out.println(set);
		
		// USN
		string = usn.stream().filter((str) -> str.contains("CS")).collect(Collectors.toList());
		string.forEach((str) -> System.out.println("CS branch : "+str));
		
		// PAN
		string = pan.stream().filter((str) -> str.startsWith("A")).collect(Collectors.toList());
		string.forEach((str) -> System.out.println("Starting with A : "+str));
	}
}