package com.neuedu.his.service;

import com.neuedu.his.entity.PrescriptionItem;
import com.neuedu.his.repository.PrescriptionItemRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrescriptionItemService {

    @Resource
    private PrescriptionItemRepository itemRepository;

    public List<PrescriptionItem> findByPrescriptionId(Long prescriptionId) {
        return itemRepository.findByPrescriptionId(Math.toIntExact(prescriptionId));
    }

    public Optional<PrescriptionItem> findById(Long id) {
        return itemRepository.findById(id);
    }

    public PrescriptionItem save(PrescriptionItem item) {
        return itemRepository.save(item);
    }

    public void delete(Long id) {
        itemRepository.deleteById(id);
    }
}
