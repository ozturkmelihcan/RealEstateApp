package com.melihcan.realestateapp.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AdminFindAllResponseDto {

    private Long id;
    private String username;
    private String email;
    private String phone;
}
