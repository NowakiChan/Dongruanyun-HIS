package com.neuedu.his.controller;

import com.neuedu.his.dto.DeptWorkloadDTO;
import com.neuedu.his.service.StatisticsService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/statistics")
public class StatisticsController {

    private final StatisticsService service;

    public StatisticsController(StatisticsService service) {
        this.service = service;
    }

    @GetMapping("/department-workload")
    public List<DeptWorkloadDTO> getDepartmentWorkload(
            @RequestParam String start,
            @RequestParam String end) {
        return service.getDepartmentWorkload(LocalDate.parse(start), LocalDate.parse(end));
    }
}
