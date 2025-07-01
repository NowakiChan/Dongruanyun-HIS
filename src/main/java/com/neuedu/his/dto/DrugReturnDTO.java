package com.neuedu.his.dto;

import java.math.BigDecimal;

public class DrugReturnDTO {
    private Long prescriptionId;
    private String drugName;
    private String spec;
    private String unit;
    private Integer amount;
    private BigDecimal price;

    public DrugReturnDTO(Long prescriptionId, String drugName, String spec, String unit, Integer amount, BigDecimal price) {
        this.prescriptionId = prescriptionId;
        this.drugName = drugName;
        this.spec = spec;
        this.unit = unit;
        this.amount = amount;
        this.price = price;
    }

    // getter/setter
}

