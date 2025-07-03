package com.neuedu.his.repository;

import com.neuedu.his.entity.DrugItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrugItemRepository extends JpaRepository<DrugItem, Integer> {
    List<DrugItem> findByDrugsNameContainingIgnoreCase(String keyword);
}
