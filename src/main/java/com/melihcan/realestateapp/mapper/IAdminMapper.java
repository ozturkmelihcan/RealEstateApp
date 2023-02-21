package com.melihcan.realestateapp.mapper;

import com.melihcan.realestateapp.dto.request.AdminSaveRequestDto;
import com.melihcan.realestateapp.dto.response.AdminFindAllResponseDto;
import com.melihcan.realestateapp.repository.entity.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface IAdminMapper {

    IAdminMapper INSTANCE = Mappers.getMapper(IAdminMapper.class);

    Admin toAdmin(final AdminSaveRequestDto dto);

    AdminFindAllResponseDto adminFindAllResponseDtoFromAdmin(final Admin admin);
}
