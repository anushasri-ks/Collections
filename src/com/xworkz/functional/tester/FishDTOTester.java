package com.xworkz.functional.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.dto.FishDTO;

public class FishDTOTester {

	public static void main(String[] args) {

		FishDTO dto1 = new FishDTO("Siamese fighting fish", "blue", "aquarium fish", 2, 150, "Male");
		FishDTO dto2 = new FishDTO("Gold fish", "gold", "aquarium fish", 30, 200, "Female");

		List<FishDTO> list = new ArrayList<FishDTO>();
		list.add(dto1);
		list.add(dto2);

//		sorting name in ascending order
		Comparator<FishDTO> fishName = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("---name sorting asc---");
				return o1.getName().compareTo(o2.getName());
			}
		};

		Collections.sort(list, fishName);

		Iterator<FishDTO> itrName1 = list.iterator();
		while (itrName1.hasNext()) {
			FishDTO fishDTO = (FishDTO) itrName1.next();
			System.out.println(fishDTO.getName());
		}
		
//		sorting name in descending order
		Comparator<FishDTO> fishNameDesc = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("\n---name sorting desc---");
				return o2.getName().compareTo(o1.getName());
			}

		};

		Collections.sort(list, fishNameDesc);

		Iterator<FishDTO> itrName2 = list.iterator();
		while (itrName2.hasNext()) {
			FishDTO fishDTO = (FishDTO) itrName2.next();
			System.out.println(fishDTO.getName());
		}

//		sorting color in ascending order
		Comparator<FishDTO> fishColor = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("\n---color sorting asc---");
				return o1.getColor().compareTo(o2.getColor());
			}
		};

		Collections.sort(list, fishColor);

		Iterator<FishDTO> itrColor = list.iterator();
		while (itrColor.hasNext()) {
			FishDTO fishDTO = (FishDTO) itrColor.next();
			System.out.println(fishDTO.getColor());
		}

//		sorting lifeSpan in ascending order
		Comparator<FishDTO> lifeSpanAsc = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("\n---lifespan sorting asc---");
				if (o1.getLifeSpan() == o2.getLifeSpan())
					return 0;
				if (o1.getLifeSpan() > o2.getLifeSpan())
					return 1;
				if (o1.getLifeSpan() < o2.getLifeSpan())
					return -1;
	
				return 0;
			}
		};
		
		Collections.sort(list, lifeSpanAsc);

		Iterator<FishDTO> itrLife1 = list.iterator();
		while (itrLife1.hasNext()) {
			FishDTO fishDTO = (FishDTO) itrLife1.next();
			System.out.println(fishDTO.getLifeSpan());
		}

//		sorting lifeSpan in descending order
		Comparator<FishDTO> lifeSpanDesc = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("\n---lifeSpan sorting desc---");
				if (o1.getLifeSpan() == o2.getLifeSpan())
					return 0;
				if (o1.getLifeSpan() > o2.getLifeSpan())
					return -1;
				if (o1.getLifeSpan() < o2.getLifeSpan())
					return 1;
				
				return 0;
			}
		};

		Collections.sort(list, lifeSpanDesc);

		Iterator<FishDTO> itrLife2 = list.iterator();
		while (itrLife2.hasNext()) {
			FishDTO fishDTO = (FishDTO) itrLife2.next();
			System.out.println(fishDTO.getLifeSpan());
		}

//		sorting cost in descending order
		Comparator<FishDTO> cost = new Comparator<FishDTO>() {
			@Override
			public int compare(FishDTO o1, FishDTO o2) {
				System.out.println("\n---cost sorting desc---");
				if (o1.getCost() == o2.getCost())
					return 0;
				if (o1.getCost() > o2.getCost())
					return -1;
				if (o1.getCost() < o2.getCost())
					return 1;
				
				return 0;
			}
		};

		Collections.sort(list, cost);
	
		Iterator<FishDTO> itrCost = list.iterator();
		while(itrCost.hasNext()) {
			FishDTO fishDTO = (FishDTO) itrCost.next();
			System.out.println(fishDTO.getCost());
		}
	}
}