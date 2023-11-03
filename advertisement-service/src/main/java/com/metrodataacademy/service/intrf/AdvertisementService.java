package com.metrodataacademy.service.intrf;

import org.springframework.http.ResponseEntity;

import com.metrodataacademy.domain.dto.AuthorizationDto;
import com.metrodataacademy.domain.dto.request.ReqCreateAdvertisementDto;
import com.metrodataacademy.domain.dto.request.ReqGetAdvertisementDto;
import com.metrodataacademy.domain.dto.response.ResBaseAdvertisementDto;

import jakarta.servlet.http.HttpServletRequest;

public interface AdvertisementService {

    ResponseEntity<ResBaseAdvertisementDto> insertAdvertisement(ReqCreateAdvertisementDto reqCreateAdvertisementDto,
            HttpServletRequest servletRequest);

    ResponseEntity<ResBaseAdvertisementDto> getAdvertisementById(String id);

    ResponseEntity<ResBaseAdvertisementDto> deleteAdvertisement(String id);

    ResponseEntity<ResBaseAdvertisementDto> getAllAdvertisementList(ReqGetAdvertisementDto requestDetail);

    ResponseEntity<ResBaseAdvertisementDto> updateAdvertisement(String id,
            ReqCreateAdvertisementDto reqCreateAdvertisementDto, AuthorizationDto authDto);
}
