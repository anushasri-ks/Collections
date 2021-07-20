package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.HighwayType;

public class HighwayDAOimpl implements HighwayDAO{
	private List<HighwayDTO> list = new ArrayList<HighwayDTO>();
	
	@Override
	public boolean save(HighwayDTO dto) {
		System.out.println("dto=" +dto);
		System.out.println("dto is added");
		return list.add(dto);
	}

	@Override
	public Collection<HighwayDTO> findAll() {
		System.out.println("Found All");
		return this.list;
	}

	@Override
	public Collection<Integer> findAllNumber() {
		Collection<Integer> collection = new ArrayList<>(); 
		Iterator<HighwayDTO> itr = this.list.iterator();
		while(itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			collection.add(highwayDTO.getNumber());
		}
		System.out.println("Found all number");
		return collection;
	}

	@Override
	public int totalItems() {
		return list.size();
	}

	@Override
	public Collection<HighwayDTO> findByHighwayType(HighwayType type) {
		Collection<HighwayDTO> collection = new ArrayList<>(); 
		Iterator<HighwayDTO> highwayType = this.list.iterator();
		while(highwayType.hasNext()) {
			HighwayDTO highwayDTO = highwayType.next();
			if(highwayDTO.getHighwayType().equals(type)) {
				collection.add(highwayDTO);	
				}
		}
		System.out.println("findByHighwayType");
		return collection;
	}

	@Override
	public Collection<HighwayDTO> findByStateName(String sname) {
		Collection<HighwayDTO> collection = new ArrayList<>();
		Iterator<HighwayDTO> stateName = this.list.iterator();
		while(stateName.hasNext()) {
			HighwayDTO highwayDTO = stateName.next();
			if(highwayDTO.getStateName().equals(sname)) {
				collection.add(highwayDTO);
			}
		}
		System.out.println("findByStateName");
		return collection;
	}

	@Override
	public Collection<Integer> findNumberByStateName(String sname) {
		Collection<Integer> collection = new ArrayList<>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while(itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if(highwayDTO.getStateName().equals(sname)) {
				collection.add(highwayDTO.getNumber());
			}
		}
		System.out.println("findNumberByStateName");
		return collection;
	}

	@Override
	public boolean exist(HighwayDTO dto) {
		System.out.println("exist");
		return this.list.contains(dto);
	}

	@Override
	public boolean isCondition(int number) {
		Iterator<HighwayDTO> itr = this.list.iterator();
		while(itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if(highwayDTO.getNumber() == number) {
				System.out.println("isCondition");
				return highwayDTO.getCondition();
			}
		}
		System.out.println("does not exist");
		return false;
	}

	@Override
	public double findLengthByNumber(int no) {
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if(highwayDTO.getNumber() == no) {
				System.out.println("Found Length By Number");
				return highwayDTO.getLength();
			}
		}
		System.out.println("No such Number");
		return 0;
	}

	@Override
	public HighwayDTO findByMaxLength() {
		HighwayDTO max = null;
		 max=Collections.max(list);
		System.out.println("max length : " + max);

		return max;
	}

	@Override
	public HighwayDTO findByMinLength() {
		HighwayDTO min = null;
		 min=Collections.min(list);
		System.out.println("min length : " + min);
		return min;
	}

}
