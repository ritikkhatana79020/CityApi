package com.ritik.CityProject.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ritik.CityProject.model.City;
import com.ritik.CityProject.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService{
	
	@Autowired
	private CityRepository repository;
	
	public CityServiceImpl(CityRepository repository) {
		this.repository = repository; 
	}

	@Override
	public List<City> findAllCity() {
		return repository.findAll();
	}

	@Override
	public City addCity(City city) {
		return repository.save(city);
		
	}

	@Override
	public Optional<City> findCityById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteCity(Long id) {
		repository.deleteById(id);
		 
	}

	@Override
	public City updatecity(City citydetails) {
		return repository.save(citydetails);
	}
	

}
