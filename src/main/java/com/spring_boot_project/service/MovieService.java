package com.spring_boot_project.service;

import com.spring_boot_project.entity.Movie;

import java.util.List;

public interface MovieService {

    void save(Movie movie);

    void update(Movie movie);

    void delete(Long id);

    List<Movie> findAll();

    Movie findOne(Long id);
}
