package com.xworkz.datastore.comparator;

import java.util.Comparator;

import com.xworkz.datastore.dto.KitchenItemDTO;

public class KitchenItemNameComparator implements Comparator<KitchenItemDTO> {

	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
