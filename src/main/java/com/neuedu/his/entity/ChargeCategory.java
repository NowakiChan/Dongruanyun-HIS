package com.neuedu.his.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "expenseclass")
@Data
public class ChargeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ExpCode", length = 64, nullable = false, unique = true)
    private String categoryCode;

    @Column(name = "ExpName", length = 64, nullable = false)
    private String categoryName;

    @Column(name = "delMark", nullable = false)
    private Integer deleted = 0; // 0: 未删除, 1: 已删除
}
