package com.melihcan.realestateapp.service;

import com.melihcan.realestateapp.repository.IHouseRepository;
import com.melihcan.realestateapp.repository.entity.House;
import com.melihcan.realestateapp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class HouseService extends ServiceManager<House,Long> {

    private final IHouseRepository houseRepository;

    HouseService(IHouseRepository houseRepository){
        super(houseRepository);
        this.houseRepository=houseRepository;
    }
}
