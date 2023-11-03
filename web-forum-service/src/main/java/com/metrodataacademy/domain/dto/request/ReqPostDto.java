package com.metrodataacademy.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqPostDto {

    @NotBlank
    private String idThreads;

    @NotBlank
    private String content;
}
