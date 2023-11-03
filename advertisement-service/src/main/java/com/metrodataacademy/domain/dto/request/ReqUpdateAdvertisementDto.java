package com.metrodataacademy.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqUpdateAdvertisementDto {
    @NotBlank
    private String id;

    @NotBlank
    private String urlHyperlink;

    @NotBlank
    private String imageUrl;
}
