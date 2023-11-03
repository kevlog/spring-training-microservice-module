package com.metrodataacademy.domain.dto.response;

import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResGetThreadsDto {

    private String id;
    private String title;
    private String content;
    private ResStagingUserDto author;
    private Timestamp createdAt;
    private Integer totalViews;
    private long totalPostComments;

}
