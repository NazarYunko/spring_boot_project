package com.spring_boot_project.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class MovieDto {

    @NonNull
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String country;

    @NonNull
    private LocalTime time;

    @NonNull
    private LocalDate premiere;

    private List<GenreDto> genres = new ArrayList<>();

    private List<ActorDto> actors = new ArrayList<>();

    private List<RateDto> rates = new ArrayList<>();

}
