package com.metrodataacademy.domain.dto.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResDetailArticleDto {

    private String id;
    private String title;
    private String content;
    private String slug;
    private String caption;
    private ResStagingUserDto author;
    private Integer counter;
    private String imageUrl;
    private String createdAt;
    private String updatedAt;
    private List<ResCategoriesDto> categories;

}
