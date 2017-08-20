package com.spring_boot_project.service;

import com.spring_boot_project.entity.Actor;

import java.util.List;

public interface ActorService {

    void save(Actor actor);

    void update(Actor actor);

    void delete(Long id);

    List<Actor> findAll();

    Actor findOne(Long id);

}
