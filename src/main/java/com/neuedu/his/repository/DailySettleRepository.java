package com.neuedu.his.repository;

import com.neuedu.his.entity.DailySettle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface DailySettleRepository extends JpaRepository<DailySettle, Integer> {
    List<DailySettle> findByCashierIdAndSettleDate(Integer cashierId, LocalDate settleDate);
}
