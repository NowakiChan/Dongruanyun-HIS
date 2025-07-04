package com.neuedu.his.repository;

import com.neuedu.his.entity.Charge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface DepartmentStatisticsRepository extends JpaRepository<Charge, Integer> {

    @Query(value = """
        SELECT 
            d.DeptName AS departmentName,
            COUNT(DISTINCT r.id) AS visitCount,
            COUNT(DISTINCT c.id) AS chargeCount,
            SUM(c.Price) AS totalAmount
        FROM register r
        JOIN user u ON r.UserID = u.UserName
        JOIN department d ON u.DeptID = d.DeptName
        JOIN patientcosts c ON c.RegistID = r.id
        WHERE DATE(c.PayTime) = :date
          AND r.VisitState = 1
          AND d.DelMark = 0
        GROUP BY d.DeptName
        """, nativeQuery = true)
    List<Object[]> findRawDepartmentStats(@Param("date") Date date);
}
