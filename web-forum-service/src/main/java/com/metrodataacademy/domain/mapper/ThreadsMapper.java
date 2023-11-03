package com.metrodataacademy.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.metrodataacademy.domain.dto.request.ReqCreateThreadsDto;
import com.metrodataacademy.domain.dto.response.ResGetThreadsDto;
import com.metrodataacademy.domain.entity.Threads;

@Mapper(componentModel = "spring")
public interface ThreadsMapper {

    @Mapping(target = "author", ignore = true)
    @Mapping(target = "totalViews", source = "counter")
    @Mapping(target = "totalPostComments", ignore = true)
    ResGetThreadsDto threadsToResGetThreads(Threads threads);

    Threads ReqCreateThreadsDtoToThreads(ReqCreateThreadsDto reqCreateThreadsDto);

}
