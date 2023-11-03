package com.metrodataacademy.domain.dto.response;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ResDetailAdvertisementDto {

    @NotBlank
    private String id;

    @NotBlank
    private String images_url;

    @NotBlank
    private String url_hyperlink;

    @NotBlank
    private String createdAt;

    @NotBlank
    private String updatedAt;
}
