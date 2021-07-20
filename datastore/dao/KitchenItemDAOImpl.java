package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.xworkz.datastore.comparator.KitchenItemNameComparator;
import com.xworkz.datastore.comparator.KitchenItemPriceDescComparator;
import com.xworkz.datastore.comparator.KitchenItemUsedForComparator;
import com.xworkz.datastore.comparator.KitchenItemUsedForComparatorDesc;
import com.xworkz.datastore.dto.KitchenItemDTO;

public class KitchenItemDAOImpl implements KitchenItemDAO {
	private List <KitchenItemDTO> list = new ArrayList<>();
	@Override
	public boolean saveUnique(KitchenItemDTO dto) {
		System.out.println("Added dto: " +dto);
		return list.add(dto);
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedFor() {
		System.out.println("findAllSortByUsedFor");
		Collections.sort(list, new KitchenItemUsedForComparator());
		return this.list;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByUsedForDesc() {
		System.out.println("findAllSortByUsedForDesc");
		Collections.sort(list, new KitchenItemUsedForComparatorDesc());
		return this.list;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByName() {
		System.out.println("findAllSortByName");
		Collections.sort(list, new KitchenItemNameComparator());
		return this.list;
	}

	@Override
	public Collection<KitchenItemDTO> findAllSortByPriceDesc() {
		System.out.println("findAllSortByPriceDesc");
		Collections.sort(list, new KitchenItemPriceDescComparator());
		return this.list;
	}

}
