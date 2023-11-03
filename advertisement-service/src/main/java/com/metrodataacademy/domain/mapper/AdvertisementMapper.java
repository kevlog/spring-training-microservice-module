package com.metrodataacademy.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.metrodataacademy.domain.dto.request.ReqCreateAdvertisementDto;
import com.metrodataacademy.domain.dto.response.ResDetailAdvertisementDto;
import com.metrodataacademy.domain.entity.Advertisement;

@Mapper(componentModel = "spring")
public interface AdvertisementMapper {

    void update(@MappingTarget Advertisement advertisement, ReqCreateAdvertisementDto reqCreateAdvertisementDto);

    Advertisement reqCreateAdvertisementDtoToAdvertisement(ReqCreateAdvertisementDto reqCreateAdvertisementDto);

    ResDetailAdvertisementDto resDetailAdvertisementDto(Advertisement advertisement);
}
