package com.neuedu.his.controller;

import com.neuedu.his.dto.DepartmentWorkloadDTO;
import com.neuedu.his.service.DepartmentStatisticsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/statistics")
@Tag(name = "门诊统计", description = "门诊科室工作量统计")
public class DepartmentStatisticsController {

    private final DepartmentStatisticsService departmentStatisticsService;

    public DepartmentStatisticsController(DepartmentStatisticsService departmentStatisticsService) {
        this.departmentStatisticsService = departmentStatisticsService;
    }

    @Operation(summary = "按日期查询门诊科室工作量")
    @GetMapping("/department")
    public List<DepartmentWorkloadDTO> getStatsByDate(
            @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date) {
        return departmentStatisticsService.getDepartmentStats(date);
    }
}
