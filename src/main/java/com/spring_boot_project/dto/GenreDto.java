package com.spring_boot_project.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class GenreDto {

    @NonNull
    private Long id;

    @NonNull
    private String name;

    private List<MovieDto> movies = new ArrayList<>();
}
