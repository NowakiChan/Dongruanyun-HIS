package com.neuedu.his.dto;

import java.util.List;

public class DrugIssueRequest {
    private List<Long> prescriptionIds;
    private String operator;

    public List<Long> getPrescriptionIds() {
        return prescriptionIds;
    }

    public void setPrescriptionIds(List<Long> prescriptionIds) {
        this.prescriptionIds = prescriptionIds;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}


