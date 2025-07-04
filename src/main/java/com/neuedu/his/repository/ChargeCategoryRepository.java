package com.neuedu.his.repository;

import com.neuedu.his.entity.ChargeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChargeCategoryRepository extends JpaRepository<ChargeCategory, Long> {
    List<ChargeCategory> findByDeleted(Integer deleted);
    List<ChargeCategory> findByCategoryNameContainingAndDeleted(String name, Integer deleted);
}
