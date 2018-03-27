package com.akashah.world.repositories;

import org.springframework.data.repository.CrudRepository;

import com.akashah.world.models.City;

public interface CityRepository extends CrudRepository <City, Long> {
	
	

}
