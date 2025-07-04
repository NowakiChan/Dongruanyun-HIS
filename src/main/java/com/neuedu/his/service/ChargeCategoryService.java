package com.neuedu.his.service;

import com.neuedu.his.entity.ChargeCategory;
import com.neuedu.his.repository.ChargeCategoryRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChargeCategoryService {

    @Resource
    private ChargeCategoryRepository repository;

    public List<ChargeCategory> findAll() {
        return repository.findByDeleted(0);
    }

    public List<ChargeCategory> searchByName(String name) {
        return repository.findByCategoryNameContainingAndDeleted(name, 0);
    }

    public ChargeCategory save(ChargeCategory category) {
        return repository.save(category);
    }

    public Optional<ChargeCategory> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.findById(id).ifPresent(cat -> {
            cat.setDeleted(1);
            repository.save(cat);
        });
    }
}
