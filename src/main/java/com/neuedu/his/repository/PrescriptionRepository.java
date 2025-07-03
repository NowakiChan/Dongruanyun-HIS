package com.neuedu.his.repository;

import com.neuedu.his.dto.DrugReturnDTO;
import com.neuedu.his.entity.PrescriptionDetail;
import com.neuedu.his.dto.DrugDispenseDTO;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface PrescriptionRepository extends JpaRepository<PrescriptionDetail, Long> {

    @Query("SELECT new com.neuedu.his.dto.DrugDispenseDTO(p.id, d.drugsName, d.drugsFormat, d.drugsUnit, p.amount, d.drugsPrice) " +
            "FROM PrescriptionDetail p JOIN DrugItem d ON p.drugsID = d.id " +
            "WHERE p.medicalID = :medicalId AND p.isIssued = 0")
    List<DrugDispenseDTO> findUnissuedByMedicalId(@Param("medicalId") Integer medicalId);

    @Query("SELECT new com.neuedu.his.dto.DrugReturnDTO(p.id, d.drugsName, d.drugsFormat, d.drugsUnit, p.amount, d.drugsPrice) " +
            "FROM PrescriptionDetail p JOIN DrugItem d ON p.drugsID = d.id " +
            "WHERE p.medicalID = :medicalId AND p.isIssued = 1")
    List<DrugReturnDTO> findIssuedByMedicalId(@Param("medicalId") Integer medicalId);

}


