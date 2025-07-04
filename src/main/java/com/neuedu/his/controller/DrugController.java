package com.neuedu.his.controller;

import com.neuedu.his.entity.Drug;
import com.neuedu.his.service.DrugService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Page;

import java.util.Optional;

@Tag(name = "药品管理")
@RestController
@RequestMapping("/api/drugs")
public class DrugController {

    @Resource
    private DrugService drugService;

    @Operation(summary = "分页搜索药品（按名称或拼音码）")
    @GetMapping
    public Page<Drug> searchDrugs(@RequestParam(defaultValue = "") String keyword,
                                  @RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "10") int size) {
        return drugService.searchDrugs(keyword, page, size);
    }

    @Operation(summary = "新增或更新药品")
    @PostMapping
    public Drug saveDrug(@RequestBody Drug drug) {
        return drugService.saveDrug(drug);
    }

    @Operation(summary = "根据ID查询药品")
    @GetMapping("/{id}")
    public Optional<Drug> getDrug(@PathVariable Long id) {
        return drugService.getDrugById(id);
    }

    @Operation(summary = "根据ID删除药品")
    @DeleteMapping("/{id}")
    public void deleteDrug(@PathVariable Long id) {
        drugService.deleteDrug(id);
    }
}
