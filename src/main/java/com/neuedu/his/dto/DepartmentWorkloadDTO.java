package com.neuedu.his.dto;

import java.io.Serializable;

public class DepartmentWorkloadDTO implements Serializable {
    private String departmentName;
    private Long visitCount;
    private Long chargeCount;
    private Double totalAmount;

    public DepartmentWorkloadDTO(String departmentName, Long visitCount, Long chargeCount, Double totalAmount) {
        this.departmentName = departmentName;
        this.visitCount = visitCount;
        this.chargeCount = chargeCount;
        this.totalAmount = totalAmount;
    }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public Long getVisitCount() { return visitCount; }
    public void setVisitCount(Long visitCount) { this.visitCount = visitCount; }
    public Long getChargeCount() { return chargeCount; }
    public void setChargeCount(Long chargeCount) { this.chargeCount = chargeCount; }
    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }
}
