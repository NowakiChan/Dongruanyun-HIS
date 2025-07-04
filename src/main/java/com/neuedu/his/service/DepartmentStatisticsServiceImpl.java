package com.neuedu.his.service;

import com.neuedu.his.dto.DepartmentWorkloadDTO;
import com.neuedu.his.repository.DepartmentStatisticsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DepartmentStatisticsServiceImpl implements DepartmentStatisticsService {

    private final DepartmentStatisticsRepository repository;

    public DepartmentStatisticsServiceImpl(DepartmentStatisticsRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DepartmentWorkloadDTO> getDepartmentStats(Date date) {
        List<Object[]> rows = repository.findRawDepartmentStats(date);
        List<DepartmentWorkloadDTO> result = new ArrayList<>();

        for (Object[] row : rows) {
            String deptName = (String) row[0];
            Long visitCount = ((Number) row[1]).longValue();
            Long chargeCount = ((Number) row[2]).longValue();
            Double total = ((Number) row[3]).doubleValue();

            result.add(new DepartmentWorkloadDTO(deptName, visitCount, chargeCount, total));
        }

        return result;
    }
}
