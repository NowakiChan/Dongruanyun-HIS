package com.neuedu.his.service;

import com.neuedu.his.dto.DailyChargeSummaryDTO;

import java.util.Date;
import java.util.List;

public interface ChargeService {
    List<DailyChargeSummaryDTO> getDailySummary(Date date);
}
