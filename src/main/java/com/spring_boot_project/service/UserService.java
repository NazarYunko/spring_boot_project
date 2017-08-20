package com.spring_boot_project.service;

import com.spring_boot_project.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService{

    void save(User user);

    void update(User user);

    void delete(Long id);

    List<User> findAll();

    User findOne(Long id);
}
