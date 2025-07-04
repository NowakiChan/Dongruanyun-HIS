package com.neuedu.his.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "patientcosts")
@Data
public class Charge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "RegistID")
    private Integer registId;

    @Column(name = "CreateOperID")
    private Integer userId;

    @Column(name = "PayTime")
    private LocalDateTime chargeTime;

    @Column(name = "Price")
    private Double totalAmount;

    @Column(name = "FeeType")
    private String payType; // 如：现金、医保、银行卡等
}
