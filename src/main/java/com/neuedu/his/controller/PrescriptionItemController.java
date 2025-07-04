package com.neuedu.his.controller;

import com.neuedu.his.entity.PrescriptionItem;
import com.neuedu.his.service.PrescriptionItemService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "处方明细管理")
@RestController
@RequestMapping("/api/prescription-items")
public class PrescriptionItemController {

    @Resource
    private PrescriptionItemService itemService;

    @Operation(summary = "根据处方ID获取所有明细项")
    @GetMapping("/prescription/{prescriptionId}")
    public List<PrescriptionItem> getByPrescriptionId(@PathVariable Long prescriptionId) {
        return itemService.findByPrescriptionId(prescriptionId);
    }

    @Operation(summary = "根据ID获取明细项")
    @GetMapping("/{id}")
    public Optional<PrescriptionItem> getById(@PathVariable Long id) {
        return itemService.findById(id);
    }

    @Operation(summary = "新增或更新明细项")
    @PostMapping
    public PrescriptionItem save(@RequestBody PrescriptionItem item) {
        return itemService.save(item);
    }

    @Operation(summary = "删除明细项")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        itemService.delete(id);
    }
}
