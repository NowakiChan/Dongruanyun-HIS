package com.neuedu.his.repository;

import com.neuedu.his.entity.PrescriptionItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescriptionItemRepository extends JpaRepository<PrescriptionItem, Long> {
    List<PrescriptionItem> findByPrescriptionId(Integer prescription_id);

    List<PrescriptionItem> findByState(String state);
}
