package com.xworkz.map.tester;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AdhaarAndMobileNumberTester {

	public static void main(String[] args) {

		Map<Long, Long> map = new TreeMap<Long, Long>();
		map.put(937327824552l, 6379433195l);
		map.put(937327824553l, 7374665607l);
		map.put(937327824554l, 8066456163l);
		map.put(937327824555l, 7546907961l);
		map.put(937327824556l, 6829835498l);
		map.put(937327824557l, 7390862895l);
		map.put(937327824558l, 7884566334l);

		System.out.println("-----Size-----");
		System.out.println(map.size());

		System.out.println("-----Contains Key-----");
		System.out.println(map.containsKey(937327824557l));

		System.out.println("-----Contains Value-----");
		System.out.println(map.containsValue(7884566334l));

		Set<Long> adhaarNo = map.keySet();
		Collection<Long> mobileNo = map.values();

		System.out.println("-----KeySet-----");
		Iterator<Long> itrValue = mobileNo.iterator();
		while (itrValue.hasNext()) {
			Long values = itrValue.next();
			System.out.println(values);
		}
		System.out.println("-----Values-----");
		Iterator<Long> itrKey = adhaarNo.iterator();
		while (itrKey.hasNext()) {
			Long keys = itrKey.next();
			System.out.println(keys);
		}
		System.out.println("-----Both Key and Values-----");
		Iterator<Long> itr = adhaarNo.iterator();
		while (itr.hasNext()) {
			Long keys = itr.next();
			Long values = map.get(keys);
			System.out.println(keys + " " + values);
		}
		System.out.println("-----Size after Removing-----");
		map.remove(937327824552l);
		System.out.println(map.size());
		
		map.clear();
		System.out.println("size after clear : "+ map.size());
		
		System.out.println(map.isEmpty());
	}
}