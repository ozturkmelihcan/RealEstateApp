package com.melihcan.realestateapp.service;

import com.melihcan.realestateapp.repository.ICityRepository;
import com.melihcan.realestateapp.repository.entity.City;
import com.melihcan.realestateapp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CityService extends ServiceManager<City, Long> {

    private final ICityRepository cityRepository;
    public CityService(ICityRepository cityRepository) {
        super(cityRepository);
        this.cityRepository=cityRepository;
    }
}
