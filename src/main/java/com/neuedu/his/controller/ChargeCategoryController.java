package com.neuedu.his.controller;

import com.neuedu.his.entity.ChargeCategory;
import com.neuedu.his.service.ChargeCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@Tag(name = "费用科目管理")
@RestController
@RequestMapping("/api/charge-categories")
public class ChargeCategoryController {

    @Resource
    private ChargeCategoryService service;

    @Operation(summary = "获取所有未删除的费用科目")
    @GetMapping
    public List<ChargeCategory> list() {return service.findAll();}

    @Operation(summary = "按名称模糊搜索费用科目")
    @GetMapping("/search")
    public List<ChargeCategory> search(@RequestParam String name) {return service.searchByName(name);}

    @Operation(summary = "新增或修改费用科目")
    @PostMapping
    public ChargeCategory save(@RequestBody ChargeCategory category) {return service.save(category);}

    @Operation(summary = "根据 ID 查询")
    @GetMapping("/{id}")
    public Optional<ChargeCategory> getById(@PathVariable Long id) {return service.findById(id);}

    @Operation(summary = "逻辑删除")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {service.delete(id);}
}
