package com.neuedu.his.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "UserName", length = 64, unique = true)
    private String userCode; // 工号或用户名

    @Column(name = "RealName", length = 64)
    private String realName; // 真实姓名

    @Column(name = "Password", length = 128)
    private String password;

    @Column(name = "UseType", length = 32)
    private String role; // 医生/挂号员/管理员等

    @Column(name = "DeptID", length = 64)
    private String department; // 所属科室

    @Column(name = "DelMark")
    private Integer status; // 0=正常, 1=停用
}
