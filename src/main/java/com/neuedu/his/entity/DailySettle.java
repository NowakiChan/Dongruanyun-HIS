package com.neuedu.his.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "DailySettle")
public class DailySettle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer cashierId; // 收费员ID（用户表中的ID）

    private LocalDate settleDate; // 日结日期

    private Double totalAmount;   // 应缴金额
    private Double paidAmount;    // 实缴金额

    private Boolean isSettled;    // 是否已日结

    private String remark;

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getCashierId() { return cashierId; }
    public void setCashierId(Integer cashierId) { this.cashierId = cashierId; }

    public LocalDate getSettleDate() { return settleDate; }
    public void setSettleDate(LocalDate settleDate) { this.settleDate = settleDate; }

    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }

    public Double getPaidAmount() { return paidAmount; }
    public void setPaidAmount(Double paidAmount) { this.paidAmount = paidAmount; }

    public Boolean getIsSettled() { return isSettled; }
    public void setIsSettled(Boolean isSettled) { this.isSettled = isSettled; }

    public String getRemark() { return remark; }
    public void setRemark(String remark) { this.remark = remark; }
}
