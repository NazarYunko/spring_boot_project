package com.spring_boot_project.dao;

import com.spring_boot_project.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie, Long> {
}
