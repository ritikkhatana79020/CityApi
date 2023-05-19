package com.ritik.CityProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ritik.CityProject.model.City;
import com.ritik.CityProject.service.*;

@RestController
public class MyController {
	

	private CityService cityservice;
	
	public MyController(CityService cityservice) {
		this.cityservice = cityservice;
	}
	
//	To get list of all the cities
	@GetMapping("/showCities")
	public List<City> findAllCity() {
		return cityservice.findAllCity();
	}
	
//	To get City detail of a particular ID
	@GetMapping("/showCity/{id}")
	public Optional<City> findCityById(@PathVariable Long id) {
		return cityservice.findCityById(id);
	}
	
//	To add city
	@PostMapping("/addCity")
	public City addCity(@RequestBody City city) {
		return cityservice.addCity(city);
	}
	
//	Delete city of a particular id
	@DeleteMapping("/deleteCity/{id}")
	public String deleteCityById(@PathVariable Long id){
		cityservice.deleteCity(id);
		return "deleted successfully";
	}
	
//	Update city details of a particular id
	@PutMapping("/updateCity/{id}")
	public City updateCity(@RequestBody City citydetails) {
		return cityservice.updatecity(citydetails);
	}
}
