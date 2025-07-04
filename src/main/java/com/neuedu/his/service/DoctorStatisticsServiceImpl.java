package com.neuedu.his.service;

import com.neuedu.his.dto.DoctorWorkloadDTO;
import com.neuedu.his.repository.DoctorStatisticsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DoctorStatisticsServiceImpl implements DoctorStatisticsService {

    private final DoctorStatisticsRepository repository;

    public DoctorStatisticsServiceImpl(DoctorStatisticsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DoctorWorkloadDTO> getDoctorStats(Date date) {
        List<Object[]> rows = repository.findRawDoctorStats(date);
        List<DoctorWorkloadDTO> result = new ArrayList<>();

        for (Object[] row : rows) {
            Long id = ((Number) row[0]).longValue();
            String name = (String) row[1];
            Date chargeDate = (Date) row[2];
            Long visits = ((Number) row[3]).longValue();
            Long charges = ((Number) row[4]).longValue();
            Double total = ((Number) row[5]).doubleValue();

            result.add(new DoctorWorkloadDTO(id, name, chargeDate, visits, charges, total));
        }

        return result;
    }
}
