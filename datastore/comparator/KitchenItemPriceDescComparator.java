package com.xworkz.datastore.comparator;

import java.util.Comparator;

import com.xworkz.datastore.dto.KitchenItemDTO;

public class KitchenItemPriceDescComparator implements Comparator<KitchenItemDTO> {

	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
			if (o1.getPrice() == o2.getPrice()) {
				return 0;
			}
			if (o1.getPrice() > o2.getPrice()) {
				return -1;
			}
			if (o1.getPrice() < o2.getPrice()) {
				return 1;
			}
		return 0;
	}

}
