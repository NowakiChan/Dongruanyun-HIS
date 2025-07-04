package com.neuedu.his.dto;

import java.io.Serializable;
import java.util.Date;

public class DoctorWorkloadDTO implements Serializable {

    private Long doctorId;
    private String doctorName;
    private Date chargeDate;
    private Long visitCount;
    private Long chargeCount;
    private Double totalAmount;

    public DoctorWorkloadDTO(Long doctorId, String doctorName, Date chargeDate, Long visitCount, Long chargeCount, Double totalAmount) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.chargeDate = chargeDate;
        this.visitCount = visitCount;
        this.chargeCount = chargeCount;
        this.totalAmount = totalAmount;
    }

    public Long getDoctorId() {return doctorId;}
    public void setDoctorId(Long doctorId) {this.doctorId = doctorId;}
    public String getDoctorName() {return doctorName;}
    public void setDoctorName(String doctorName) {this.doctorName = doctorName;}
    public Date getChargeDate() {return chargeDate;}
    public void setChargeDate(Date chargeDate) {this.chargeDate = chargeDate;}
    public Long getVisitCount() {return visitCount;}
    public void setVisitCount(Long visitCount) {this.visitCount = visitCount;}
    public Long getChargeCount() {return chargeCount;}
    public void setChargeCount(Long chargeCount) {this.chargeCount = chargeCount;}
    public Double getTotalAmount() {return totalAmount;}
    public void setTotalAmount(Double totalAmount) {this.totalAmount = totalAmount;}
}
