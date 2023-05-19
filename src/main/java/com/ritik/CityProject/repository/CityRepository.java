package com.ritik.CityProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ritik.CityProject.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

}
