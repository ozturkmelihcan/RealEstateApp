package com.melihcan.realestateapp.service;

import com.melihcan.realestateapp.repository.IVillageRepository;
import com.melihcan.realestateapp.repository.entity.Village;
import com.melihcan.realestateapp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class VillageService extends ServiceManager<Village,Long> {

    private final IVillageRepository villageRepository;

    public VillageService(IVillageRepository villageRepository){
        super(villageRepository);
        this.villageRepository = villageRepository;
    }
}
