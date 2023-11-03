package com.metrodataacademy.domain.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReqGetArticlesDto {

    private String title = "";
    private String category = "";

    @NotNull
    @Min(1)
    private int page;

}
