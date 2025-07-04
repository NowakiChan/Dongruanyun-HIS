package com.neuedu.his.controller;

import com.neuedu.his.dto.DailyChargeSummaryDTO;
import com.neuedu.his.service.ChargeService;
import com.neuedu.his.service.DailyCheckService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.time.LocalDate;
import java.util.List;

@Tag(name = "门诊日结核对")
@RestController
@RequestMapping("/api/charges")
public class ChargeController {

    @Autowired
    private ChargeService chargeService;

    @GetMapping("/daily-summary")
    public List<DailyChargeSummaryDTO> getDailySummary(
            @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return chargeService.getDailySummary(date);
    }
}


