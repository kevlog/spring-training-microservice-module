package com.metrodataacademy.domain.dto.request;

import org.springframework.web.multipart.MultipartFile;
import com.metrodataacademy.domain.dto.customvalidator.ValidImageContentType;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReqUploadProfilePicture {
    @NotNull
    @ValidImageContentType
    private MultipartFile image;
}
