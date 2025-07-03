package com.neuedu.his.repository;

import com.neuedu.his.dto.DeptWorkloadDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.time.LocalDate;
import java.util.List;

public interface StatisticsRepository extends Repository<Object, Long> {

    @Query("SELECT new com.neuedu.his.dto.DeptWorkloadDTO(" +
            "d.deptName, COUNT(r.id), SUM(r.fee), SUM(p.amount * di.drugsPrice)) " +
            "FROM Register r " +
            "JOIN Department d ON r.deptId = d.id " +
            "LEFT JOIN PrescriptionDetail p ON r.id = p.registerID " +
            "LEFT JOIN DrugItem di ON p.drugsID = di.id " +
            "WHERE r.visitDate BETWEEN :start AND :end " +
            "GROUP BY d.deptName")
    List<DeptWorkloadDTO> getDepartmentWorkload(LocalDate start, LocalDate end);
}
