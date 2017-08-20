package com.spring_boot_project.dao;

import com.spring_boot_project.entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateDao extends JpaRepository<Rate, Long> {
}
