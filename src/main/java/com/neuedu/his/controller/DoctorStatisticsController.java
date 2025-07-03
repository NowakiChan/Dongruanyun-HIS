package com.neuedu.his.controller;

import com.neuedu.his.dto.DoctorWorkloadDTO;
import com.neuedu.his.service.DoctorStatisticsService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/statistics")
public class DoctorStatisticsController {

    private final DoctorStatisticsService service;

    public DoctorStatisticsController(DoctorStatisticsService service) {
        this.service = service;
    }

    @GetMapping("/doctor-workload")
    public List<DoctorWorkloadDTO> getDoctorWorkload(
            @RequestParam String start,
            @RequestParam String end) {
        return service.getDoctorWorkload(LocalDate.parse(start), LocalDate.parse(end));
    }
}
