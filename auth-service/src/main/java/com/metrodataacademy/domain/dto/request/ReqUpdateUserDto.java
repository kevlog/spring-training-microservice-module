package com.metrodataacademy.domain.dto.request;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ReqUpdateUserDto {

    @NotBlank
    private String username;

    @NotBlank
    private String name;

    @NotBlank
    private String alamat;

    @NotBlank
    private String jenisKelamin;

    @NotBlank
    private String profilePicture;

    @NotBlank
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate tanggalLahir;

    @NotBlank
    @Email
    private String email;

}
