package com.metrodataacademy.domain.dto.response;

import java.util.List;
import lombok.Data;

@Data
public class ResValidateTokenDto {

    private String id;
    private String name;
    private String email;
    private String profilePicture;
    private List<String> roles;

}
