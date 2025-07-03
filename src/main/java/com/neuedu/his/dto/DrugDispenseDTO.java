package com.neuedu.his.dto;

public class DrugDispenseDTO {
    private Long id;
    private String drugsName;
    private String drugsFormat;
    private String drugsUnit;
    private Integer amount;
    private Double drugsPrice;

    // ✅ 必须加上这个构造函数
    public DrugDispenseDTO(Long id, String drugsName, String drugsFormat, String drugsUnit, Integer amount, Double drugsPrice) {
        this.id = id;
        this.drugsName = drugsName;
        this.drugsFormat = drugsFormat;
        this.drugsUnit = drugsUnit;
        this.amount = amount;
        this.drugsPrice = drugsPrice;
    }

    // Getter（可选 setter）
    public Long getId() {
        return id;
    }

    public String getDrugsName() {
        return drugsName;
    }

    public String getDrugsFormat() {
        return drugsFormat;
    }

    public String getDrugsUnit() {
        return drugsUnit;
    }

    public Integer getAmount() {
        return amount;
    }

    public Double getDrugsPrice() {
        return drugsPrice;
    }
}
