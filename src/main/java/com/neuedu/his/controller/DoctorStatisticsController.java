package com.neuedu.his.controller;

import com.neuedu.his.dto.DoctorWorkloadDTO;
import com.neuedu.his.service.DoctorStatisticsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/statistics")
@Tag(name = "门诊统计", description = "门诊医生工作量统计")
public class DoctorStatisticsController {

    private final DoctorStatisticsService doctorStatisticsService;

    public DoctorStatisticsController(DoctorStatisticsService doctorStatisticsService) {
        this.doctorStatisticsService = doctorStatisticsService;
    }

    @Operation(summary = "按日期查询门诊医生工作量")
    @GetMapping("/doctor")
    public List<DoctorWorkloadDTO> getStatsByDate(
            @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return doctorStatisticsService.getDoctorStats(date);
    }
}
