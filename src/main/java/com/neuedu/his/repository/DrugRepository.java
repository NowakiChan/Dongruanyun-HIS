package com.neuedu.his.repository;

import com.neuedu.his.entity.Drug;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepository extends JpaRepository<Drug, Long> {
    // 模糊搜索：按药品名称或拼音码
    Page<Drug> findByDrugsNameContainingOrMnemonicCodeContaining(String drugName, String pinyinCode, Pageable pageable);
}
