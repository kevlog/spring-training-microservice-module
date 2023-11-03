package com.metrodataacademy.domain.dto.response;

import java.time.LocalDate;
import lombok.Data;

@Data
public class ResUserProfileDto {

    private String username;
    private String name;
    private String alamat;
    private String jenisKelamin;
    private String profilePicture;
    private LocalDate tanggalLahir;
    private String email;

}
