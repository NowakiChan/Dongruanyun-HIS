package com.neuedu.his.controller;

import com.neuedu.his.entity.ExpenseCategory;
import com.neuedu.his.service.ExpenseCategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expense-categories")
public class ExpenseCategoryController {

    private final ExpenseCategoryService service;

    public ExpenseCategoryController(ExpenseCategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<ExpenseCategory> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ExpenseCategory getById(@PathVariable Integer id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public ExpenseCategory create(@RequestBody ExpenseCategory expenseCategory) {
        return service.save(expenseCategory);
    }

    @PutMapping("/{id}")
    public ExpenseCategory update(@PathVariable Integer id, @RequestBody ExpenseCategory expenseCategory) {
        expenseCategory.setId(id);
        return service.save(expenseCategory);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteById(id);
    }
}
