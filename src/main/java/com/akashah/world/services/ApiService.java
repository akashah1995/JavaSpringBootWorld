package com.akashah.world.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.akashah.world.models.Country;
import com.akashah.world.repositories.*;

@Service
public class ApiService {
	CityRepository cityRepository;
	LanguageRepository languageRepository;
	CountryRepository countryRepository;
	
	ApiService(CityRepository cityRepository, LanguageRepository languageRepository, CountryRepository countryRepository){
		this.cityRepository = cityRepository;
		this.languageRepository = languageRepository;
		this.countryRepository = countryRepository;
	}
	
	public List<Country> getAll(){
		return (List<Country>) this.countryRepository.findAll();
	}
	
	public List <Country> getCountryWhoSlovene(){
		return this.countryRepository.findCountriesSlovene();
	}
	
	public List<Object[]> getCityCount(){
		return countryRepository.getCityCount();
	}
	
	

}
