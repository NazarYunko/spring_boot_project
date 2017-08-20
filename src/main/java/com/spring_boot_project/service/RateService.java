package com.spring_boot_project.service;

import com.spring_boot_project.entity.Rate;

import java.util.List;

public interface RateService {

    void save(Rate rate);

    void update(Rate rate);

    void delete(Long id);

    List<Rate> findAll();

    Rate findOne(Long id);

}
