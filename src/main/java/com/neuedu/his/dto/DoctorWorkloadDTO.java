package com.neuedu.his.dto;

public class DoctorWorkloadDTO {
    private String doctorName;
    private Long registerCount;
    private Long prescriptionCount;
    private Double drugTotal;
    private Long chargeCount;
    private Double totalAmount;

    public DoctorWorkloadDTO(String doctorName, Long registerCount, Long prescriptionCount,
                             Double drugTotal, Long chargeCount, Double totalAmount) {
        this.doctorName = doctorName;
        this.registerCount = registerCount;
        this.prescriptionCount = prescriptionCount;
        this.drugTotal = drugTotal;
        this.chargeCount = chargeCount;
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }

    public Long getRegisterCount() { return registerCount; }
    public void setRegisterCount(Long registerCount) { this.registerCount = registerCount; }

    public Long getPrescriptionCount() { return prescriptionCount; }
    public void setPrescriptionCount(Long prescriptionCount) { this.prescriptionCount = prescriptionCount; }

    public Double getDrugTotal() { return drugTotal; }
    public void setDrugTotal(Double drugTotal) { this.drugTotal = drugTotal; }

    public Long getChargeCount() { return chargeCount; }
    public void setChargeCount(Long chargeCount) { this.chargeCount = chargeCount; }

    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }
}
