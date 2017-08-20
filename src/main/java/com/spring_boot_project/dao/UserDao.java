package com.spring_boot_project.dao;

import com.spring_boot_project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User, Long> {

    @Query("select u from User u where u.login=:param or u.email=:param")
    User findByLoginOrEmail(@Param("param") String param);
}
