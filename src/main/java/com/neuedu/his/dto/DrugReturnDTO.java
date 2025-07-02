package com.neuedu.his.dto;

public class DrugReturnDTO {

    private Long id;
    private String drugsName;
    private String drugsFormat;
    private String drugsUnit;
    private Integer amount;
    private Double drugsPrice;

    public DrugReturnDTO(Long id, String drugsName, String drugsFormat,
                         String drugsUnit, Integer amount, Double drugsPrice) {
        this.id = id;
        this.drugsName = drugsName;
        this.drugsFormat = drugsFormat;
        this.drugsUnit = drugsUnit;
        this.amount = amount;
        this.drugsPrice = drugsPrice;
    }
    // Getter & Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDrugsName() { return drugsName; }
    public void setDrugsName(String drugsName) { this.drugsName = drugsName; }

    public String getDrugsFormat() { return drugsFormat; }
    public void setDrugsFormat(String drugsFormat) { this.drugsFormat = drugsFormat; }

    public String getDrugsUnit() { return drugsUnit; }
    public void setDrugsUnit(String drugsUnit) { this.drugsUnit = drugsUnit; }

    public Integer getAmount() { return amount; }
    public void setAmount(Integer amount) { this.amount = amount; }

    public Double getDrugsPrice() { return drugsPrice; }
    public void setDrugsPrice(Double drugsPrice) { this.drugsPrice = drugsPrice; }
}
