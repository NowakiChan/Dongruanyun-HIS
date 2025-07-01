package com.neuedu.his.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Register")
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer userId;      // 医生ID
    private Integer deptId;      // 科室ID
    private LocalDate visitDate; // 就诊日期

    // getter/setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getUserId() { return userId; }
    public void setUserId(Integer userId) { this.userId = userId; }

    public Integer getDeptId() { return deptId; }
    public void setDeptId(Integer deptId) { this.deptId = deptId; }

    public LocalDate getVisitDate() { return visitDate; }
    public void setVisitDate(LocalDate visitDate) { this.visitDate = visitDate; }
}
