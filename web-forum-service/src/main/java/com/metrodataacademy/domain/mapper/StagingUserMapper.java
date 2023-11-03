package com.metrodataacademy.domain.mapper;

import org.mapstruct.Mapper;
import com.metrodataacademy.domain.dto.response.ResStagingUserDto;
import com.metrodataacademy.domain.entity.StagingUser;

@Mapper(componentModel = "spring")
public interface StagingUserMapper {

    ResStagingUserDto stagingUserToResStagingUserDto(StagingUser stagingUser);

}