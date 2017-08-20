package com.spring_boot_project.service.Impl;

import com.spring_boot_project.dao.ActorDao;
import com.spring_boot_project.entity.Actor;
import com.spring_boot_project.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorDao actorDao;

    @Override
    public void save(Actor actor) {

    }

    @Override
    public void update(Actor actor) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Actor> findAll() {
        return null;
    }

    @Override
    public Actor findOne(Long id) {
        return null;
    }
}
