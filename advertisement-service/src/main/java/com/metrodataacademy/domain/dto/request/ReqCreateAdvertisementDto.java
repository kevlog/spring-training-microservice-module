package com.metrodataacademy.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqCreateAdvertisementDto {
    @NotBlank
    private String images_url;

    @NotBlank
    private String url_hyperlink;
}
