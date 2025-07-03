package com.neuedu.his.repository;

import com.neuedu.his.entity.ExpenseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, Integer> {
    boolean existsByCode(String code);
}
