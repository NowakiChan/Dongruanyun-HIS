package com.neuedu.his.service;

import com.neuedu.his.dto.DoctorWorkloadDTO;
import com.neuedu.his.repository.DoctorStatisticsRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DoctorStatisticsService {

    private final DoctorStatisticsRepository repository;

    public DoctorStatisticsService(DoctorStatisticsRepository repository) {
        this.repository = repository;
    }

    public List<DoctorWorkloadDTO> getDoctorWorkload(LocalDate start, LocalDate end) {
        return repository.getDoctorWorkload(start, end);
    }
}
