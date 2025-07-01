package com.neuedu.his.repository;

import com.neuedu.his.dto.DoctorWorkloadDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.time.LocalDate;
import java.util.List;

public interface DoctorStatisticsRepository extends Repository<Object, Long> {

    @Query("SELECT new com.neuedu.his.dto.DoctorWorkloadDTO(" +
            "u.realName, COUNT(DISTINCT r.id), COUNT(DISTINCT p.id), " +
            "SUM(p.amount * d.drugsPrice), COUNT(DISTINCT ch.id), SUM(ch.totalAmount)) " +
            "FROM Register r " +
            "JOIN User u ON r.userId = u.id " +
            "LEFT JOIN PrescriptionDetail p ON r.id = p.registerID " +
            "LEFT JOIN DrugItem d ON p.drugsID = d.id " +
            "LEFT JOIN Charge ch ON r.id = ch.registerId " +
            "WHERE r.visitDate BETWEEN :start AND :end " +
            "GROUP BY u.realName")
    List<DoctorWorkloadDTO> getDoctorWorkload(LocalDate start, LocalDate end);
}
