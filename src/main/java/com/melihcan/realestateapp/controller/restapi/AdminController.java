package com.melihcan.realestateapp.controller.restapi;

import com.melihcan.realestateapp.dto.request.AdminSaveRequestDto;
import com.melihcan.realestateapp.dto.response.AdminFindAllResponseDto;
import com.melihcan.realestateapp.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/save")
    public ResponseEntity<Void> save(AdminSaveRequestDto dto){
        adminService.save(dto);
       return ResponseEntity.ok().build();

    }

    @GetMapping("/findall")
    public ResponseEntity<List<AdminFindAllResponseDto>>findAll(){
        return ResponseEntity.ok(adminService.findAllResponseDtos());
    }
}
