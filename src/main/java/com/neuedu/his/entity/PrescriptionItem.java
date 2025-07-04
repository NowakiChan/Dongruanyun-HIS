package com.neuedu.his.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "prescriptiondetailed")
@Data
public class PrescriptionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "prescriptionID", nullable = false)
    private Prescription prescription;// 关联处方主表

    @ManyToOne
    @JoinColumn(name = "drugsID", nullable = false)
    private Drug drug;// 药品

    @Column(nullable = false)
    private Integer quantity;// 数量

    @Column(nullable = false)
    private Double price;// 单价（冗余字段，防止药价变动）

    @Column(name = "DrugsUsage", length = 64)
    private String usage;// 用法（口服、注射）

    @Column(name = "state", length = 32)// 是否发药状态
    private String state; // 未发药、已发药、部分发药

}
