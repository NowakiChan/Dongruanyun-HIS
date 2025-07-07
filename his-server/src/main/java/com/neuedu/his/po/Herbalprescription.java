package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @TableName herbalprescription
 */
@TableName(value = "herbalprescription")
public class Herbalprescription {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 病历ID
     */
    @TableField(value = "MedicalID")
    private Integer medicalid;

    /**
     * 挂号ID
     */
    @TableField(value = "RegistID")
    private Integer registid;

    /**
     * 开立医生ID
     */
    @TableField(value = "UserID")
    private Integer userid;

    /**
     * 处方名称
     */
    @TableField(value = "PrescriptionName")
    private String prescriptionname;

    /**
     * 开立时间
     */
    @TableField(value = "CreationTime")
    private Date creationtime;

    /**
     * 处方类型 水煎煮/酒泡/打粉/制丸/装胶囊等
     */
    @TableField(value = "PrescriptioType")
    private String prescriptiotype;

    /**
     * 付数
     */
    @TableField(value = "PayNumber")
    private Integer paynumber;

    /**
     * 频次
     */
    @TableField(value = "Frequency")
    private String frequency;

    /**
     * 用法 内服/外用
     */
    @TableField(value = "DrugsUsage")
    private String drugsusage;

    /**
     * 治法
     */
    @TableField(value = "Therapy")
    private String therapy;

    /**
     * 治法详细
     */
    @TableField(value = "Detailed")
    private String detailed;

    /**
     * 医嘱
     */
    @TableField(value = "Advice")
    private String advice;

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
     * 病历ID
     */
    public Integer getMedicalid() {
        return medicalid;
    }

    /**
     * 病历ID
     */
    public void setMedicalid(Integer medicalid) {
        this.medicalid = medicalid;
    }

    /**
     * 挂号ID
     */
    public Integer getRegistid() {
        return registid;
    }

    /**
     * 挂号ID
     */
    public void setRegistid(Integer registid) {
        this.registid = registid;
    }

    /**
     * 开立医生ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 开立医生ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 处方名称
     */
    public String getPrescriptionname() {
        return prescriptionname;
    }

    /**
     * 处方名称
     */
    public void setPrescriptionname(String prescriptionname) {
        this.prescriptionname = prescriptionname;
    }

    /**
     * 开立时间
     */
    public Date getCreationtime() {
        return creationtime;
    }

    /**
     * 开立时间
     */
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**
     * 处方类型 水煎煮/酒泡/打粉/制丸/装胶囊等
     */
    public String getPrescriptiotype() {
        return prescriptiotype;
    }

    /**
     * 处方类型 水煎煮/酒泡/打粉/制丸/装胶囊等
     */
    public void setPrescriptiotype(String prescriptiotype) {
        this.prescriptiotype = prescriptiotype;
    }

    /**
     * 付数
     */
    public Integer getPaynumber() {
        return paynumber;
    }

    /**
     * 付数
     */
    public void setPaynumber(Integer paynumber) {
        this.paynumber = paynumber;
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
     * 用法 内服/外用
     */
    public String getDrugsusage() {
        return drugsusage;
    }

    /**
     * 用法 内服/外用
     */
    public void setDrugsusage(String drugsusage) {
        this.drugsusage = drugsusage;
    }

    /**
     * 治法
     */
    public String getTherapy() {
        return therapy;
    }

    /**
     * 治法
     */
    public void setTherapy(String therapy) {
        this.therapy = therapy;
    }

    /**
     * 治法详细
     */
    public String getDetailed() {
        return detailed;
    }

    /**
     * 治法详细
     */
    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    /**
     * 医嘱
     */
    public String getAdvice() {
        return advice;
    }

    /**
     * 医嘱
     */
    public void setAdvice(String advice) {
        this.advice = advice;
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
        Herbalprescription other = (Herbalprescription) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getMedicalid() == null ? other.getMedicalid() == null : this.getMedicalid().equals(other.getMedicalid()))
                && (this.getRegistid() == null ? other.getRegistid() == null : this.getRegistid().equals(other.getRegistid()))
                && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
                && (this.getPrescriptionname() == null ? other.getPrescriptionname() == null : this.getPrescriptionname().equals(other.getPrescriptionname()))
                && (this.getCreationtime() == null ? other.getCreationtime() == null : this.getCreationtime().equals(other.getCreationtime()))
                && (this.getPrescriptiotype() == null ? other.getPrescriptiotype() == null : this.getPrescriptiotype().equals(other.getPrescriptiotype()))
                && (this.getPaynumber() == null ? other.getPaynumber() == null : this.getPaynumber().equals(other.getPaynumber()))
                && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
                && (this.getDrugsusage() == null ? other.getDrugsusage() == null : this.getDrugsusage().equals(other.getDrugsusage()))
                && (this.getTherapy() == null ? other.getTherapy() == null : this.getTherapy().equals(other.getTherapy()))
                && (this.getDetailed() == null ? other.getDetailed() == null : this.getDetailed().equals(other.getDetailed()))
                && (this.getAdvice() == null ? other.getAdvice() == null : this.getAdvice().equals(other.getAdvice()))
                && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalid() == null) ? 0 : getMedicalid().hashCode());
        result = prime * result + ((getRegistid() == null) ? 0 : getRegistid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getPrescriptionname() == null) ? 0 : getPrescriptionname().hashCode());
        result = prime * result + ((getCreationtime() == null) ? 0 : getCreationtime().hashCode());
        result = prime * result + ((getPrescriptiotype() == null) ? 0 : getPrescriptiotype().hashCode());
        result = prime * result + ((getPaynumber() == null) ? 0 : getPaynumber().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getDrugsusage() == null) ? 0 : getDrugsusage().hashCode());
        result = prime * result + ((getTherapy() == null) ? 0 : getTherapy().hashCode());
        result = prime * result + ((getDetailed() == null) ? 0 : getDetailed().hashCode());
        result = prime * result + ((getAdvice() == null) ? 0 : getAdvice().hashCode());
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
        sb.append(", medicalid=").append(medicalid);
        sb.append(", registid=").append(registid);
        sb.append(", userid=").append(userid);
        sb.append(", prescriptionname=").append(prescriptionname);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", prescriptiotype=").append(prescriptiotype);
        sb.append(", paynumber=").append(paynumber);
        sb.append(", frequency=").append(frequency);
        sb.append(", drugsusage=").append(drugsusage);
        sb.append(", therapy=").append(therapy);
        sb.append(", detailed=").append(detailed);
        sb.append(", advice=").append(advice);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}