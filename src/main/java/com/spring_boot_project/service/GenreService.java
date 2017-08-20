package com.spring_boot_project.service;

import com.spring_boot_project.entity.Genre;

import java.util.List;

public interface GenreService {

    void save(Genre genre);

    void update(Genre genre);

    void delete(Long id);

    List<Genre> findAll();

    Genre findOne(Long id);
}
