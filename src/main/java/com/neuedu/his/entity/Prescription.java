package com.neuedu.his.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "prescription")
@Data
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "MedicalID")
    private Integer medicalId;

    @Column(name = "RegistID")
    private Integer registId;

    @Column(name = "UserID")
    private Integer userId;

    @Column(name = "PrescriptionName")
    private String prescriptionName;

    @Column(name = "PrescriptionTime")
    private LocalDateTime prescriptionTime;

    @Column(name = "PrescriptionState")
    private Integer prescriptionState;
}
