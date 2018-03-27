package com.akashah.world.repositories;

import org.springframework.data.repository.CrudRepository;

import com.akashah.world.models.Language;

public interface LanguageRepository extends CrudRepository <Language, Long> {
	
	

}
