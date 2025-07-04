package com.neuedu.his.service;

import com.neuedu.his.dto.DoctorWorkloadDTO;

import java.util.Date;
import java.util.List;

public interface DoctorStatisticsService {
    List<DoctorWorkloadDTO> getDoctorStats(Date date);
}
