package com.spring_boot_project.service.Impl;

import com.spring_boot_project.dao.RateDao;
import com.spring_boot_project.entity.Rate;
import com.spring_boot_project.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateServiceImpl implements RateService {

    @Autowired
    private RateDao rateDao;

    @Override
    public void save(Rate rate) {

    }

    @Override
    public void update(Rate rate) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Rate> findAll() {
        return null;
    }

    @Override
    public Rate findOne(Long id) {
        return null;
    }
}
