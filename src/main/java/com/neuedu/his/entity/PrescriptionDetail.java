package com.neuedu.his.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "prescriptiondetailed")
public class PrescriptionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer medicalID;   // 病历号
    private Integer registerID;  // 挂号ID
    private Integer drugsID;     // 药品ID
    private Integer amount;      // 数量
    private Integer isIssued;    // 是否发药 0未发 1已发
    private LocalDateTime creationTime;
    // getter/setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getMedicalID() {
        return medicalID;
    }
    public void setMedicalID(Integer medicalID) {
        this.medicalID = medicalID;
    }
    public Integer getRegisterID() {
        return registerID;
    }
    public void setRegisterID(Integer registerID) {
        this.registerID = registerID;
    }
    public Integer getDrugsID() {
        return drugsID;
    }
    public void setDrugsID(Integer drugsID) {
        this.drugsID = drugsID;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Integer getIsIssued() {
        return isIssued;
    }
    public void setIsIssued(Integer isIssued) {
        this.isIssued = isIssued;
    }
    public LocalDateTime getCreationTime() {
        return creationTime;
    }
    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }
}
