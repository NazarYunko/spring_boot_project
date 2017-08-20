package com.spring_boot_project.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NonNull
    private Long id;

    @NonNull
    private String login;

    @NonNull
    private String email;

    @NonNull
    private String password;

    @NonNull
    private String pathImage;

    private List<RateDto> rates = new ArrayList<>();
}
