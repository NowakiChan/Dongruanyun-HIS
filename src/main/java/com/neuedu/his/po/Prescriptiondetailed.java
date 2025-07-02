package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;

/**
 * 
 * @TableName prescriptiondetailed
 */
@TableName(value ="prescriptiondetailed")
public class Prescriptiondetailed {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 成药处方ID
     */
    @TableField(value = "PrescriptionID")
    private Integer prescriptionid;

    /**
     * 药品ID
     */
    @TableField(value = "DrugsID")
    private Integer drugsid;

    /**
     * 用法
     */
    @TableField(value = "DrugsUsage")
    private String drugsusage;

    /**
     * 用量
     */
    @TableField(value = "Dosage")
    private String dosage;

    /**
     * 频次
     */
    @TableField(value = "Frequency")
    private String frequency;

    /**
     * 数量
     */
    @TableField(value = "Amount")
    private BigDecimal amount;

    /**
     * 状态
     */
    @TableField(value = "State")
    private Integer state;

    /**
     * ID主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * ID主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 成药处方ID
     */
    public Integer getPrescriptionid() {
        return prescriptionid;
    }

    /**
     * 成药处方ID
     */
    public void setPrescriptionid(Integer prescriptionid) {
        this.prescriptionid = prescriptionid;
    }

    /**
     * 药品ID
     */
    public Integer getDrugsid() {
        return drugsid;
    }

    /**
     * 药品ID
     */
    public void setDrugsid(Integer drugsid) {
        this.drugsid = drugsid;
    }

    /**
     * 用法
     */
    public String getDrugsusage() {
        return drugsusage;
    }

    /**
     * 用法
     */
    public void setDrugsusage(String drugsusage) {
        this.drugsusage = drugsusage;
    }

    /**
     * 用量
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * 用量
     */
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    /**
     * 频次
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * 频次
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * 数量
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 数量
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 状态
     */
    public Integer getState() {
        return state;
    }

    /**
     * 状态
     */
    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Prescriptiondetailed other = (Prescriptiondetailed) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPrescriptionid() == null ? other.getPrescriptionid() == null : this.getPrescriptionid().equals(other.getPrescriptionid()))
            && (this.getDrugsid() == null ? other.getDrugsid() == null : this.getDrugsid().equals(other.getDrugsid()))
            && (this.getDrugsusage() == null ? other.getDrugsusage() == null : this.getDrugsusage().equals(other.getDrugsusage()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPrescriptionid() == null) ? 0 : getPrescriptionid().hashCode());
        result = prime * result + ((getDrugsid() == null) ? 0 : getDrugsid().hashCode());
        result = prime * result + ((getDrugsusage() == null) ? 0 : getDrugsusage().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prescriptionid=").append(prescriptionid);
        sb.append(", drugsid=").append(drugsid);
        sb.append(", drugsusage=").append(drugsusage);
        sb.append(", dosage=").append(dosage);
        sb.append(", frequency=").append(frequency);
        sb.append(", amount=").append(amount);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}