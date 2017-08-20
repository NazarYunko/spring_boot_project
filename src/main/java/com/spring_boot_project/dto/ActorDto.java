package com.spring_boot_project.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class ActorDto {

    @NonNull
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String lastName;

    @NonNull
    private String country;

    @NonNull
    private String city;

    @NonNull
    private String pathImage;

    private List<MovieDto> movies = new ArrayList<>();

}
