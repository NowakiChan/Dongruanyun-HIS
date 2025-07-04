package com.neuedu.his.service;

import com.neuedu.his.entity.Drug;
import com.neuedu.his.repository.DrugRepository;
import jakarta.annotation.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DrugService {

    @Resource
    private DrugRepository drugRepository;

    public Page<Drug> searchDrugs(String keyword, int page, int size) {
        return drugRepository.findByDrugsNameContainingOrMnemonicCodeContaining(keyword, keyword, PageRequest.of(page, size));
    }

    public Drug saveDrug(Drug drug) {
        return drugRepository.save(drug);
    }

    public Optional<Drug> getDrugById(Long id) {
        return drugRepository.findById(id);
    }

    public void deleteDrug(Long id) {
        drugRepository.deleteById(id);
    }
}
