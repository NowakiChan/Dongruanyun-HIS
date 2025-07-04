package com.neuedu.his.repository;

import com.neuedu.his.dto.DailyChargeSummaryDTO;
import com.neuedu.his.entity.Charge;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.time.LocalDate;
import java.util.List;

public interface ChargeRepository extends Repository<Charge, Long> {

    @Query(value = """
        SELECT 
            c.CreateOperID AS userId,
            u.RealName AS userName,
            DATE(c.PayTime) AS date,
            COUNT(*) AS chargeCount,
            SUM(c.Price) AS totalAmount
        FROM patientcosts c
        JOIN user u ON c.CreateOperID = u.id
        WHERE DATE(c.PayTime) = :date
        GROUP BY c.CreateOperID, u.RealName, DATE(c.PayTime)
        """, nativeQuery = true)
    List<Object[]> findRawDailySummary(@Param("date") Date date);
}

