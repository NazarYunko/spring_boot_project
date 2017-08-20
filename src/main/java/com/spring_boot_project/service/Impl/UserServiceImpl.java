package com.spring_boot_project.service.Impl;

import com.spring_boot_project.dao.UserDao;
import com.spring_boot_project.entity.User;
import com.spring_boot_project.service.UserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userDetailsService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findOne(Long id) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(@NonNull String s) throws UsernameNotFoundException {
        return userDao.findByLoginOrEmail(s);
    }
}
