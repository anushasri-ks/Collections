package com.xworkz.map.tester;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountryPopulationMapTester {

	public static void main(String[] args) {
		
		Map<String, Long> map = new TreeMap<String, Long>();
		map.put("India", 	1354051854l);
		map.put("Pakisthan", 200813818l);
		map.put("Japan", 127185332l);
		map.put("Korea, South", 51164435l);
		map.put("Germany", 82293457l);
		map.put("China", 1415045928l);
		
		System.out.println("-----Size-----");
		System.out.println(map.size());
		
		System.out.println("-----Contains Key-----");
		System.out.println(map.containsKey("India"));
		
		System.out.println("-----Contains Value-----");
		System.out.println(map.containsValue(1354051854l));
		
		Set<String> country = map.keySet();
		Collection<Long> population = map.values();
		
		System.out.println("-----KeySet-----");
		Iterator<String> itrKey = country.iterator();
		while (itrKey.hasNext()) {
			System.out.println(itrKey.next());
		}
		System.out.println("-----Values-----");
		Iterator<Long> itrValue = population.iterator();
		while (itrValue.hasNext()) {
			System.out.println(itrValue.next());
		}
		System.out.println("-----Both Key and Values-----");
		Iterator<String> itr = country.iterator();
		while (itr.hasNext()) {
			String keys = itr.next();
			Long values = map.get(keys);
			System.out.println(keys+" "+values);
		}
		System.out.println("-----Size after Removing-----");
		map.remove("China");
		System.out.println(map.size());
		
		map.clear();
		System.out.println("size after clear : "+ map.size());
		
		System.out.println(map.isEmpty());
	}
}