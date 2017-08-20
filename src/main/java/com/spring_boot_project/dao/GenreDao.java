package com.spring_boot_project.dao;

import com.spring_boot_project.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreDao extends JpaRepository<Genre, Long> {
}
