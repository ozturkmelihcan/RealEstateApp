package com.melihcan.realestateapp.repository;

import com.melihcan.realestateapp.repository.entity.Admin;
import com.melihcan.realestateapp.repository.entity.Village;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVillageRepository extends JpaRepository<Village,Long> {
}
