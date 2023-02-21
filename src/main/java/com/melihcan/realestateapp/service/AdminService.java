package com.melihcan.realestateapp.service;

import com.melihcan.realestateapp.dto.request.AdminSaveRequestDto;
import com.melihcan.realestateapp.dto.response.AdminFindAllResponseDto;
import com.melihcan.realestateapp.mapper.IAdminMapper;
import com.melihcan.realestateapp.repository.IAdminRepository;
import com.melihcan.realestateapp.repository.ICityRepository;
import com.melihcan.realestateapp.repository.entity.Admin;
import com.melihcan.realestateapp.utility.ServiceManager;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService extends ServiceManager<Admin,Long> {

    private final IAdminRepository adminRepository;
    public AdminService(IAdminRepository adminRepository) {
        super(adminRepository);
        this.adminRepository=adminRepository;
    }

    public void save(AdminSaveRequestDto dto){
        Admin admin = IAdminMapper.INSTANCE.toAdmin(dto);
        if (admin.getUsername()==null || admin.getPassword()==null || admin.getPassword().isEmpty())return;
        save(admin);
    }

    public List<AdminFindAllResponseDto> findAllResponseDtos(){

        List<AdminFindAllResponseDto> result = new ArrayList<>();

        findAll().forEach(x->{
            result.add(IAdminMapper.INSTANCE.adminFindAllResponseDtoFromAdmin(x));
        });
        return result;
    }


}
