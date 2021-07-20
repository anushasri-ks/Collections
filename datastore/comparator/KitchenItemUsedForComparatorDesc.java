package com.xworkz.datastore.comparator;

import java.util.Comparator;

import com.xworkz.datastore.dto.KitchenItemDTO;

public class KitchenItemUsedForComparatorDesc implements Comparator<KitchenItemDTO> {

	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		
		return o2.getUsedFor().compareTo(o1.getUsedFor()); 
	}

}
