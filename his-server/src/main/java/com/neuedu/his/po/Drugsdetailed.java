package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @TableName drugsdetailed
 */
@TableName(value = "drugsdetailed")
public class Drugsdetailed {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 成药模板ID
     */
    @TableField(value = "DrugsTempID")
    private Integer drugstempid;

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
     * 成药模板ID
     */
    public Integer getDrugstempid() {
        return drugstempid;
    }

    /**
     * 成药模板ID
     */
    public void setDrugstempid(Integer drugstempid) {
        this.drugstempid = drugstempid;
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
        Drugsdetailed other = (Drugsdetailed) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getDrugstempid() == null ? other.getDrugstempid() == null : this.getDrugstempid().equals(other.getDrugstempid()))
                && (this.getDrugsid() == null ? other.getDrugsid() == null : this.getDrugsid().equals(other.getDrugsid()))
                && (this.getDrugsusage() == null ? other.getDrugsusage() == null : this.getDrugsusage().equals(other.getDrugsusage()))
                && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
                && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDrugstempid() == null) ? 0 : getDrugstempid().hashCode());
        result = prime * result + ((getDrugsid() == null) ? 0 : getDrugsid().hashCode());
        result = prime * result + ((getDrugsusage() == null) ? 0 : getDrugsusage().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", drugstempid=").append(drugstempid);
        sb.append(", drugsid=").append(drugsid);
        sb.append(", drugsusage=").append(drugsusage);
        sb.append(", dosage=").append(dosage);
        sb.append(", frequency=").append(frequency);
        sb.append("]");
        return sb.toString();
    }
}