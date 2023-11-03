package com.metrodataacademy.domain.mapper;

import org.mapstruct.Mapper;
import com.metrodataacademy.domain.dto.response.ResCategoriesDto;
import com.metrodataacademy.domain.entity.Categories;

@Mapper(componentModel = "spring")
public interface CategoriesMapper {

    ResCategoriesDto categoriesToResCategoriesDto(Categories categories);

}
