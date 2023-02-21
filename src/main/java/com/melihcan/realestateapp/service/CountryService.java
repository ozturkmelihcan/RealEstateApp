package com.melihcan.realestateapp.service;

import com.melihcan.realestateapp.repository.ICountryRepository;
import com.melihcan.realestateapp.repository.entity.Country;
import com.melihcan.realestateapp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends ServiceManager<Country,Long> {

    private final ICountryRepository countryRepository;

    CountryService(ICountryRepository countryRepository){
        super(countryRepository);
        this.countryRepository=countryRepository;
    }
}
