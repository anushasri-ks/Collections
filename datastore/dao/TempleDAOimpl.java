package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOimpl implements TempleDAO {
	private List<TempleDTO> list = new ArrayList<TempleDTO>();

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("dto= " + dto);
		System.out.println("dto is added");
		return list.add(dto);
	}

	@Override
	public int totalItems() {
		return list.size();
	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("removed= " + dto);
			return this.list.remove(dto);
		}
		System.out.println("temple does not found");
		return false;
	}

	@Override
	public TempleDTO findFirstItem() {
		System.out.println("findFirstItem");
		return this.list.get(0);
	}

	@Override
	public TempleDTO findLastItem() {
		System.out.println("findLastItem");
		return this.list.get(this.list.size()-1);
	}

	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocation(String loc) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getLocation().equals(loc)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocationAndName(String name, String location) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name) && templeDTO.getLocation().equals(location)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}
	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				return templeDTO.getLocation();
			}
		}
		return null;
	}

	@Override
	public Collection<TempleDTO> findAll() {
		System.out.println("Found All");
		return this.list;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByLocationStartWith(char character) {
		char c = character;
		String s = Character.toString(c);
		Collection <TempleDTO> collection = new ArrayList<>();
		Iterator <TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getLocation().startsWith(s)) {
				collection.add(templeDTO);
			}
		}
		return collection;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		Collection<TempleDTO> collection = new ArrayList <TempleDTO>();
		Iterator<TempleDTO> entryFeeGreaterThan = this.list.iterator();
		while( entryFeeGreaterThan.hasNext()) {
			TempleDTO templeDTO = entryFeeGreaterThan.next();
			if(templeDTO.getEntryFee() > cost) {
				collection.add(templeDTO);
			}
		}
		
		return collection;
	}

	@Override
	public Collection<TempleDTO> findAllTempleByNoOfPoojarisGreaterThan(int no) {
		Collection <TempleDTO> collection = new ArrayList<> ();
		Iterator<TempleDTO> poojarisGreaterThan = this.list.iterator();
		while(poojarisGreaterThan.hasNext()) {
			TempleDTO templeDTO = poojarisGreaterThan.next();
			if(templeDTO.getNoOfPoojaris()> no) {
				collection.add(templeDTO);
			}
		}
		return collection;
	}

	@Override
	public Collection<String> findAllLocation() {
		Iterator <TempleDTO> itr = this.list.iterator();
		Collection <String> collection = new ArrayList<>();
		while(itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			System.out.println("FindAllLocation: "+templeDTO.getLocation());
			collection.add(templeDTO.getLocation());
		}
		return collection;
	}
	
}