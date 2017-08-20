package com.spring_boot_project.service.Impl;

import com.spring_boot_project.dao.GenreDao;
import com.spring_boot_project.entity.Genre;
import com.spring_boot_project.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreDao genreDao;

    @Override
    public void save(Genre genre) {

    }

    @Override
    public void update(Genre genre) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Genre> findAll() {
        return null;
    }

    @Override
    public Genre findOne(Long id) {
        return null;
    }
}
