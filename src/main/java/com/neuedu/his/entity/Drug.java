package com.neuedu.his.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "drugs")
@Data
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DrugsCode", unique = true, nullable = false, length = 64)
    private String DrugsCode; // 药品编码

    @Column(name = "DrugsName", nullable = false, length = 128)
    private String DrugsName; // 药品名称

    @Column(name = "MnemonicCode", length = 64)
    private String MnemonicCode; // 拼音助记码

    @Column(name = "DrugsFormat", length = 128)
    private String DrugsFormat; // 药品规格

    @Column(name = "DrugsDosageID", length = 64)
    private String DrugsDosageID; // 剂型（针剂、片剂等）

    @Column(name = "DrugsUnit", length = 32)
    private String DrugsUnit; // 包装单位

    @Column(name = "Manufacturer", length = 32)
    private String Manufacturer; // 生产厂家

    @Column(name = "DrugsPrice", nullable = false)
    private Double DrugsPrice; // 单价

    @Column(name = "DrugsTypeID", length = 32)
    private String DrugsTypeID; // 药品类型（西药、中成药、中草药）

}
