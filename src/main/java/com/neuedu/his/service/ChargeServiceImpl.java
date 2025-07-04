package com.neuedu.his.service;

import com.neuedu.his.dto.DailyChargeSummaryDTO;
import com.neuedu.his.repository.ChargeRepository;
import com.neuedu.his.service.ChargeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ChargeServiceImpl implements ChargeService {

    private final ChargeRepository chargeRepository;

    public ChargeServiceImpl(ChargeRepository chargeRepository) {
        this.chargeRepository = chargeRepository;
    }

    @Override
    public List<DailyChargeSummaryDTO> getDailySummary(Date date) {
        List<Object[]> rawList = chargeRepository.findRawDailySummary(date);
        List<DailyChargeSummaryDTO> result = new ArrayList<>();

        for (Object[] row : rawList) {
            Long userId = ((Number) row[0]).longValue();
            String userName = (String) row[1];
            Date chargeDate = (Date) row[2];
            Long count = ((Number) row[3]).longValue();
            Double total = ((Number) row[4]).doubleValue();

            result.add(new DailyChargeSummaryDTO(userId, userName, chargeDate, count, total));
        }

        return result;
    }
}
