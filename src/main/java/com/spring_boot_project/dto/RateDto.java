package com.spring_boot_project.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RateDto {

    private long id;

    private byte rate;

    private UserDto user;

    private MovieDto movie;
}
