package com.metrodataacademy.controller;

import com.metrodataacademy.domain.constant.ConstantVariable;
import com.metrodataacademy.domain.dto.AuthorizationDto;
import com.metrodataacademy.domain.dto.request.ReqCreateThreadsDto;
import com.metrodataacademy.domain.dto.request.ReqGetListThreads;
import com.metrodataacademy.domain.dto.response.ResBaseDto;
import com.metrodataacademy.service.intrf.ThreadsService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/threads")
public class ThreadsController {

    private final ThreadsService threadsService;

    // TODO: POST Mapping List Threads
    @PostMapping("/create")
    public ResponseEntity<ResBaseDto> insertThread(@Valid @RequestBody ReqCreateThreadsDto threadsDto,
            HttpServletRequest servletRequest) {
        AuthorizationDto authDto = (AuthorizationDto) servletRequest.getAttribute(ConstantVariable.USER);
        return threadsService.insertThreads(threadsDto, authDto);
    }

    // TODO: GET Mapping Get Threads By Id
    @GetMapping("")
    public ResponseEntity<ResBaseDto> getById(@RequestParam String id) {
        return threadsService.getThreadsById(id);
    }

    // TODO: POST Mapping Create Threads
    @PostMapping("/list")
    public ResponseEntity<?> getListThreads(@Valid @RequestBody ReqGetListThreads reqGetListThreads,
            HttpServletRequest httpServletRequest) {
        return threadsService.getListThreads(reqGetListThreads);
    }

    // TODO: DELETE Mapping Delete Threads
    @DeleteMapping("/delete")
    public ResponseEntity<ResBaseDto> deleteThread(@RequestParam String id, HttpServletRequest servletRequest) {
        return threadsService.deleteThreads(id);
    }
}