package com.spring_boot_project.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String name;

    @ManyToMany
    @JoinTable(name = "movie_genre",
            joinColumns = @JoinColumn(name = "id_movie"),
            inverseJoinColumns = @JoinColumn(name = "id_genre"))
    private List<Movie> movies = new ArrayList<>();
}
