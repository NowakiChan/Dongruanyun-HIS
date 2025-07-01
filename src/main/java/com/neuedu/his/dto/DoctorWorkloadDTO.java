package com.neuedu.his.dto;

public class DoctorWorkloadDTO {

    private String realName;
    private Long regCount;
    private Long prescriptionCount;
    private Long totalDrugCost;
    private Long chargeCount;
    private Double totalChargeAmount;

    public DoctorWorkloadDTO(String realName, Long regCount, Long prescriptionCount,
                             Long totalDrugCost, Long chargeCount, Double totalChargeAmount) {
        this.realName = realName;
        this.regCount = regCount;
        this.prescriptionCount = prescriptionCount;
        this.totalDrugCost = totalDrugCost;
        this.chargeCount = chargeCount;
        this.totalChargeAmount = totalChargeAmount;
    }

    // getter 和 setter 方法
    public String getRealName() { return realName; }
    public void setRealName(String realName) { this.realName = realName; }

    public Long getRegCount() { return regCount; }
    public void setRegCount(Long regCount) { this.regCount = regCount; }

    public Long getPrescriptionCount() { return prescriptionCount; }
    public void setPrescriptionCount(Long prescriptionCount) { this.prescriptionCount = prescriptionCount; }

    public Long getTotalDrugCost() { return totalDrugCost; }
    public void setTotalDrugCost(Long totalDrugCost) { this.totalDrugCost = totalDrugCost; }

    public Long getChargeCount() { return chargeCount; }
    public void setChargeCount(Long chargeCount) { this.chargeCount = chargeCount; }

    public Double getTotalChargeAmount() { return totalChargeAmount; }
    public void setTotalChargeAmount(Double totalChargeAmount) { this.totalChargeAmount = totalChargeAmount; }
}
