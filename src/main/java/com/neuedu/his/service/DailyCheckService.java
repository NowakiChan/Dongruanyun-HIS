package com.neuedu.his.service;

import com.neuedu.his.dto.DailyChargeSummaryDTO;
import com.neuedu.his.repository.ChargeRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class DailyCheckService {

    @Resource
    private ChargeRepository chargeRepository;

    public List<DailyChargeSummaryDTO> getDailySummary(Date date) {
        List<Object[]> rawList = chargeRepository.findRawDailySummary(date);
        List<DailyChargeSummaryDTO> result = new ArrayList<>();
        for (Object[] row : rawList) {
            Long userId = ((Number) row[0]).longValue();
            String userName = (String) row[1];
            Date summaryDate = (Date) row[2];
            Long count = ((Number) row[3]).longValue();
            Double total = ((Number) row[4]).doubleValue();
            result.add(new DailyChargeSummaryDTO(userId, userName, summaryDate, count, total));
        }
        return result;
    }
}

