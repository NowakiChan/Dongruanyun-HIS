package com.neuedu.his.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "drugs")
public class DrugItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String drugsCode;     // 药品编码
    private String drugsName;     // 药品名称
    private String drugsFormat;   // 药品规格
    private String drugsUnit;     // 单位
    private Double drugsPrice;    // 单价
    private String mnemonicCode;  // 助记码
    private Integer drugsType;    // 药品类型（如西药、中成药）
    private Integer drugsClass;   // 药品分类（如抗生素等）
    private Integer manufacturer; // 生产厂家
    private Integer inventory;    // 当前库存

    // getter/setter 略，为简洁可使用 Lombok
}
