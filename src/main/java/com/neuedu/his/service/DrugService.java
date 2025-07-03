package com.neuedu.his.service;

import com.neuedu.his.dto.DrugDispenseDTO;
import com.neuedu.his.dto.DrugIssueRequest;
import com.neuedu.his.dto.DrugReturnDTO;
import com.neuedu.his.dto.DrugReturnRequest;
import com.neuedu.his.entity.PrescriptionDetail;
import com.neuedu.his.repository.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {

    @Autowired
    private PrescriptionRepository prescriptionRepo;

    public List<DrugDispenseDTO> findUnissuedByMedicalId(Integer medicalId) {
        return prescriptionRepo.findUnissuedByMedicalId(medicalId);
    }

    public void issueDrugs(DrugIssueRequest request) {
        List<PrescriptionDetail> list = prescriptionRepo.findAllById(request.getPrescriptionIds());
        for (PrescriptionDetail p : list) {
            if (p.getIsIssued() == 0) {
                p.setIsIssued(1); // 标记已发药
            }
        }
        prescriptionRepo.saveAll(list);
    }
    public List<DrugReturnDTO> findIssuedByMedicalId(Integer medicalId) {
        return prescriptionRepo.findIssuedByMedicalId(medicalId);
    }

    public void returnDrugs(DrugReturnRequest request) {
        List<PrescriptionDetail> list = prescriptionRepo.findAllById(request.getPrescriptionIds());
        for (PrescriptionDetail p : list) {
            if (p.getIsIssued() == 1) {
                p.setIsIssued(0); // 退药回滚为未发药
            }
        }
        prescriptionRepo.saveAll(list);
    }

}


