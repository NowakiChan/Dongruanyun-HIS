package com.neuedu.his.dto;

import java.util.Date;

public class DailyChargeSummaryDTO {
    private Long userId;
    private String userName;
    private Date date;
    private Long chargeCount;
    private Double totalAmount;

    public DailyChargeSummaryDTO(Long userId, String userName, Date date, Long chargeCount, Double totalAmount) {
        this.userId = userId;
        this.userName = userName;
        this.date = date;
        this.chargeCount = chargeCount;
        this.totalAmount = totalAmount;
    }

    public Long getUserId() { return userId; }
    public String getUserName() { return userName; }
    public Date getDate() { return date; }
    public Long getChargeCount() { return chargeCount; }
    public Double getTotalAmount() { return totalAmount; }
}
