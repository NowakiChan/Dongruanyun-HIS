package com.neuedu.his.service;

import com.neuedu.his.entity.ExpenseCategory;
import com.neuedu.his.repository.ExpenseCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseCategoryService {

    private final ExpenseCategoryRepository repository;

    public ExpenseCategoryService(ExpenseCategoryRepository repository) {
        this.repository = repository;
    }

    public List<ExpenseCategory> findAll() {
        return repository.findAll();
    }

    public Optional<ExpenseCategory> findById(Integer id) {
        return repository.findById(id);
    }

    public ExpenseCategory save(ExpenseCategory expenseCategory) {
        return repository.save(expenseCategory);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public boolean codeExists(String code) {
        return repository.existsByCode(code);
    }
}
