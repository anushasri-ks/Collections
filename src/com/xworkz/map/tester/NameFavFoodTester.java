package com.xworkz.map.tester;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NameFavFoodTester {

	public static void main(String[] args) {
		
		Map<String, String> map = new TreeMap<String, String>();
		map.put("Anusha", "idly");
		map.put("Harsha", "dosa");
		map.put("Sahana", "chapati");
		map.put("Teju", "poori");
		map.put("Rakshi", "pongal");
		map.put("Shanthanu", "paddu");
		map.put("Dhanya", "upma");
		
		System.out.println("-----Size-----");
		System.out.println(map.size());
		
		System.out.println("-----Contains Key-----");
		System.out.println(map.containsKey("Anusha"));
		
		System.out.println("-----Contains Value-----");
		System.out.println(map.containsValue("poori"));
		
		Set<String> name = map.keySet();
		Collection<String> food = map.values();
		
		System.out.println("-----KeySet-----");
		Iterator<String> itrValue = food.iterator();
		while (itrValue.hasNext()) {
			System.out.println(itrValue.next());
		}
		System.out.println("-----Values-----");
		Iterator<String> itrKey = name.iterator();
		while (itrKey.hasNext()) {
			System.out.println(itrKey.next());
		}
		System.out.println("-----Both Key and Values-----");
		Iterator<String> itr = name.iterator();
		while (itr.hasNext()) {
			String keys = itr.next();
			String values = map.get(keys);
			System.out.println(keys+" "+values);
		}
		System.out.println("-----Size after Removing-----");
		map.remove("Anusha");
		System.out.println(map.size());
		
		map.clear();
		System.out.println("size after clear : "+ map.size());
		
		System.out.println(map.isEmpty());
	}
}