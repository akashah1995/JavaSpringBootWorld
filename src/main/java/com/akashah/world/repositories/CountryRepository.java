package com.akashah.world.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.akashah.world.models.Country;

public interface CountryRepository extends CrudRepository <Country, Long>{
	
	@Query("SELECT d FROM Country d Join d.languages l WHERE l.language = 'Slovene'")
	List<Country> findCountriesSlovene();
	
	@Query(value = "SELECT countries.name, COUNT(cities.id) as num_cities FROM countries JOIN cities ON countries.id = cities.country_id Group by countries.id ORDER BY num_cities DESC;", nativeQuery = true)
	List<Object[]> getCityCount();
}
