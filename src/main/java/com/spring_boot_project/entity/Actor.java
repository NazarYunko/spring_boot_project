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
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

    @ManyToMany
    @JoinTable(name = "movie_actor",
            joinColumns = @JoinColumn(name = "id_movie"),
            inverseJoinColumns = @JoinColumn(name = "id_actor"))
    private List<Movie> movies = new ArrayList<>();

}
