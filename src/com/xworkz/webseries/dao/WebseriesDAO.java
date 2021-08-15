package com.xworkz.webseries.dao;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.webseries.dto.WebseriesDTO;

public interface WebseriesDAO {

	void save(WebseriesDTO dto);

	void saveAll(Collection<WebseriesDTO> collection);

	Collection<WebseriesDTO> findAll();

	Collection<WebseriesDTO> findAll(Predicate<WebseriesDTO> predicate);

	int total();

	int findMaxSeason();

	int findMinSeason();

	Collection<WebseriesDTO> findAllSortByNameDesc();

	Optional<WebseriesDTO> findOne(Predicate<WebseriesDTO> predicate);
}