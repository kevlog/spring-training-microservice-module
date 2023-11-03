package com.metrodataacademy.domain.dto.request;

import java.util.List;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqCreateArticlesDto {

    @NotBlank
    private String title;

    @NotBlank
    private String body;

    @NotBlank
    private String banner;

    @NotBlank
    private String imageUrl;

    private List<ReqListCategoryDto> categories;

}
