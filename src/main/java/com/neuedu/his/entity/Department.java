package com.neuedu.his.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "department")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "DeptName")
    private String deptName;

    @Column(name = "DelMark")
    private Integer deleted = 0;
}
