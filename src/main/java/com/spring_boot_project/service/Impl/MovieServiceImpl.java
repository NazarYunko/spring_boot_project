package com.spring_boot_project.service.Impl;

import com.spring_boot_project.dao.MovieDao;
import com.spring_boot_project.entity.Movie;
import com.spring_boot_project.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public void save(Movie movie) {

    }

    @Override
    public void update(Movie movie) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public Movie findOne(Long id) {
        return null;
    }
}
