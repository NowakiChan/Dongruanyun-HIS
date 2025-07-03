package com.neuedu.his.controller;

import com.neuedu.his.dto.DrugDispenseDTO;
import com.neuedu.his.dto.DrugIssueRequest;
import com.neuedu.his.dto.DrugReturnDTO;
import com.neuedu.his.dto.DrugReturnRequest;
import com.neuedu.his.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drug")
public class DrugController {

    @Autowired
    private DrugService drugService;

    @GetMapping("/unissued")
    public ResponseEntity<List<DrugDispenseDTO>> getUnissuedDrugs(@RequestParam Integer medicalId) {
        return ResponseEntity.ok(drugService.findUnissuedByMedicalId(medicalId));
    }
    @PostMapping("/issue")
    public ResponseEntity<String> issueDrugs(@RequestBody DrugIssueRequest request) {
        drugService.issueDrugs(request);
        return ResponseEntity.ok("发药成功");
    }

    @GetMapping("/issued")
    public ResponseEntity<List<DrugReturnDTO>> getIssuedDrugs(@RequestParam Integer medicalId) {
        return ResponseEntity.ok(drugService.findIssuedByMedicalId(medicalId));
    }
    @PostMapping("/return")
    public ResponseEntity<String> returnDrugs(@RequestBody DrugReturnRequest request) {
        drugService.returnDrugs(request);
        return ResponseEntity.ok("退药成功");
    }

}

