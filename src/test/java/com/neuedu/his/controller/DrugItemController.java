/*package com.neuedu.his.controller;

import com.neuedu.his.entity.DrugItem;
import com.neuedu.his.service.DrugItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/drugs")
public class DrugItemController {

    private final DrugItemService drugItemService;

    public DrugItemController(DrugItemService drugItemService) {
        this.drugItemService = drugItemService;
    }

    @Operation(summary = "获取所有药品")
    @GetMapping
    public List<DrugItem> getAll() {
        return drugItemService.findAll();
    }

    @Operation(summary = "根据ID获取药品")
    @GetMapping("/{id}")
    public DrugItem getById(@PathVariable Integer id) {
        return drugItemService.findById(id);
    }

    @Operation(summary = "新增或更新药品")
    @PostMapping
    public DrugItem save(@RequestBody DrugItem item) {
        return drugItemService.save(item);
    }

    @Operation(summary = "删除药品")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        drugItemService.deleteById(id);
    }

    @Operation(summary = "根据名称模糊搜索药品")
    @GetMapping("/search")
    public List<DrugItem> search(@RequestParam String keyword) {
        return drugItemService.searchByName(keyword);
    }
}
*/