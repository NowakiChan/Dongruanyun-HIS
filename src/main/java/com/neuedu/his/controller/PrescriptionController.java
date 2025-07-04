package com.neuedu.his.controller;

import com.neuedu.his.entity.Prescription;
import com.neuedu.his.service.PrescriptionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "处方管理")
@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @Resource
    private PrescriptionService prescriptionService;

    @Operation(summary = "获取所有处方")
    @GetMapping
    public List<Prescription> getAll() {
        return prescriptionService.findAll();
    }

    @Operation(summary = "根据ID获取处方")
    @GetMapping("/{id}")
    public Optional<Prescription> getById(@PathVariable Long id) {
        return prescriptionService.findById(id);
    }

    @Operation(summary = "新增或更新处方")
    @PostMapping
    public Prescription save(@RequestBody Prescription prescription) {
        return prescriptionService.save(prescription);
    }

    @Operation(summary = "删除处方")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        prescriptionService.delete(id);
    }
}
