package com.spring_boot_project.dao;

import com.spring_boot_project.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorDao extends JpaRepository<Actor, Long> {
}
