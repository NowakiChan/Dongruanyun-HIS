package com.neuedu.his.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface DoctorStatisticsRepository extends Repository<com.neuedu.his.entity.Register, Long> {
    @Query(value = """
        SELECT 
            u.id AS doctorId,
            u.RealName AS doctorName,
            DATE(c.PayTime) AS chargeDate,
            COUNT(DISTINCT r.id) AS visitCount,
            COUNT(DISTINCT c.id) AS chargeCount,
            SUM(c.Price) AS totalAmount
        FROM register r
        JOIN user u ON r.UserID = u.UserName
        JOIN patientcosts c ON c.RegistID = r.id
        WHERE DATE(c.PayTime) = :date
          AND r.VisitState = 1
          AND u.UseType = '医生'
        GROUP BY u.id, u.RealName, DATE(c.PayTime)
        """, nativeQuery = true)
    List<Object[]> findRawDoctorStats(@Param("date") Date date);
}
