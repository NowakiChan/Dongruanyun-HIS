package com.neuedu.his.service;

import com.neuedu.his.entity.Prescription;
import com.neuedu.his.repository.PrescriptionRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrescriptionService {

    @Resource
    private PrescriptionRepository prescriptionRepository;

    public List<Prescription> findAll() {
        return prescriptionRepository.findAll();
    }

    public Optional<Prescription> findById(Long id) {
        return prescriptionRepository.findById(id);
    }

    public Prescription save(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }

    public void delete(Long id) {
        prescriptionRepository.deleteById(id);
    }
}
