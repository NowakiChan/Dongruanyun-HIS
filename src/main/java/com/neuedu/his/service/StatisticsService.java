package com.neuedu.his.service;

import com.neuedu.his.dto.DeptWorkloadDTO;
import com.neuedu.his.repository.StatisticsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StatisticsService {

    private final StatisticsRepository repository;

    public StatisticsService(StatisticsRepository repository) {
        this.repository = repository;
    }

    public List<DeptWorkloadDTO> getDepartmentWorkload(LocalDate start, LocalDate end) {
        return repository.getDepartmentWorkload(start, end);
    }
}
