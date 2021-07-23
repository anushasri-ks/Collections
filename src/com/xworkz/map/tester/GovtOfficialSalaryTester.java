package com.xworkz.map.tester;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GovtOfficialSalaryTester {

	public static void main(String[] args) {

		Map<String, Double> map = new TreeMap<String, Double>();
		map.put("President", 500000d);
		map.put("Vice President", 400000d);
		map.put("Prime Minister", 280000d);
		map.put("Governors", 350000d);
		map.put("Judges of High Courts", 225000d);
		map.put("Chief Minister", 205000d);

		System.out.println("-----Size-----");
		System.out.println(map.size());

		System.out.println("-----Contains Key-----");
		System.out.println(map.containsKey("President"));

		System.out.println("-----Contains Value-----");
		System.out.println(map.containsValue(350000d));

		Set<String> govtOfficial = map.keySet();
		Collection<Double> salary = map.values();

		System.out.println("-----KeySet-----");
		Iterator<String> itrKey = govtOfficial.iterator();
		while (itrKey.hasNext()) {
			System.out.println(itrKey.next());
		}
		System.out.println("-----Values-----");
		Iterator<Double> itrValue = salary.iterator();
		while (itrValue.hasNext()) {
			System.out.println(itrValue.next());
		}
		System.out.println("-----Both Key and Values-----");
		Iterator<String> itr = govtOfficial.iterator();
		while (itr.hasNext()) {
			String keys = itr.next();
			Double values = map.get(keys);
			System.out.println(keys + " " + values);
		}
		System.out.println("-----Size after Removing-----");
		map.remove("Prime Minister");
		System.out.println(map.size());
		
		map.clear();
		System.out.println("size after clear : "+ map.size());
		
		System.out.println(map.isEmpty());
	}
}