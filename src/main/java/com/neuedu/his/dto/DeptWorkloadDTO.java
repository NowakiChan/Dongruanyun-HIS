package com.neuedu.his.dto;

public class DeptWorkloadDTO {
    private String deptName;
    private Long totalCount;
    private Double registerTotal;
    private Double drugTotal;

    public DeptWorkloadDTO(String deptName, Long totalCount, Double registerTotal, Double drugTotal) {
        this.deptName = deptName;
        this.totalCount = totalCount;
        this.registerTotal = registerTotal;
        this.drugTotal = drugTotal;
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }

    public Long getTotalCount() { return totalCount; }
    public void setTotalCount(Long totalCount) { this.totalCount = totalCount; }

    public Double getRegisterTotal() { return registerTotal; }
    public void setRegisterTotal(Double registerTotal) { this.registerTotal = registerTotal; }

    public Double getDrugTotal() { return drugTotal; }
    public void setDrugTotal(Double drugTotal) { this.drugTotal = drugTotal; }
}
