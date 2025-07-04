package com.neuedu.his.service;

import com.neuedu.his.dto.DepartmentWorkloadDTO;

import java.util.Date;
import java.util.List;

public interface DepartmentStatisticsService {
    List<DepartmentWorkloadDTO> getDepartmentStats(Date date);
}
