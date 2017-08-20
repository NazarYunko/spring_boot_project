package com.spring_boot_project.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String name;

    @NonNull
    private String country;

    @NonNull
    private LocalTime time;

    @NonNull
    private LocalDate premiere;

    @ManyToMany
    @JoinTable(name = "movie_genre",
            joinColumns = @JoinColumn(name = "id_genre"),
            inverseJoinColumns = @JoinColumn(name = "id_movie"))
    private List<Genre> genres = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "movie_actor",
            joinColumns = @JoinColumn(name = "id_actor"),
            inverseJoinColumns = @JoinColumn(name = "id_movie"))
    private List<Actor> actors = new ArrayList<>();

    @OneToMany(mappedBy = "movie")
    private List<Rate> rates = new ArrayList<>();

}
