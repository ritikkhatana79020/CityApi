package com.ritik.CityProject.service;

import java.util.List;
import java.util.Optional;

import com.ritik.CityProject.model.City;

public interface CityService {
	
	List<City> findAllCity();
	
	City addCity(City city);
	
	Optional<City> findCityById(Long id);
	
	void deleteCity(Long id);
	
	City updatecity(City citydetails);

}
