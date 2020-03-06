package com.codelean.service;

import com.codelean.model.Province;

import java.util.Optional;

public interface ProvinceService {
    Iterable<Province> findAll();

    Optional<Province> findById(Long id);

    void save(Province province);

    void remove(Long id);
}
