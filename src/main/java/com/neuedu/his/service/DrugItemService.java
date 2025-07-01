package com.neuedu.his.service;

import com.neuedu.his.entity.DrugItem;
import com.neuedu.his.repository.DrugItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugItemService {

    private final DrugItemRepository drugRepo;

    public DrugItemService(DrugItemRepository drugRepo) {
        this.drugRepo = drugRepo;
    }

    public List<DrugItem> findAll() {
        return drugRepo.findAll();
    }

    public DrugItem findById(Integer id) {
        return drugRepo.findById(id).orElse(null);
    }

    public DrugItem save(DrugItem drugItem) {
        return drugRepo.save(drugItem);
    }

    public void deleteById(Integer id) {
        drugRepo.deleteById(id);
    }

    public List<DrugItem> searchByName(String keyword) {
        return drugRepo.findByDrugsNameContainingIgnoreCase(keyword);
    }
}
