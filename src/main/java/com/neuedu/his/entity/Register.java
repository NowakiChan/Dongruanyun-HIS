package com.neuedu.his.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "register")
@Data
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RegisterID", unique = true, nullable = false, length = 64)
    private String registerNo; // 挂号编号

    @Column(name = "RealName", nullable = false, length = 64)
    private String patientName;

    @Column(name = "gender", length = 8)
    private String gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "HomeAddress", length = 32)
    private String HomeAddress;

    @Column(name = "DeptID", length = 64)
    private String department;

    @Column(name = "UserID", length = 64)
    private String doctor;

    @Column(name = "RegistTime")
    private LocalDateTime registerTime;

    @Column(name = "registLeID", length = 32)
    private String registerType; // 普通/专家/急诊

    @Column(name = "VisitState", length = 16)
    private Integer status; // 正常/退号/已诊
}
