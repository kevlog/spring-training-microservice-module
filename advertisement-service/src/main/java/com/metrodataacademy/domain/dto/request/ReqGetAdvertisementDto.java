package com.metrodataacademy.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqGetAdvertisementDto {

    @NotBlank
    private String imageUrl;

    @NotBlank
    private Object urlHyperlink;
}
