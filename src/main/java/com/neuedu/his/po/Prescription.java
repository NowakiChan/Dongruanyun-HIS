package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 
 * @TableName prescription
 */
@TableName(value ="prescription")
public class Prescription {
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
    @TableField(value = "PrescriptionTime")
    private Date prescriptiontime;

    /**
     * 处方状态
     */
    @TableField(value = "PrescriptionState")
    private Integer prescriptionstate;

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
    public Date getPrescriptiontime() {
        return prescriptiontime;
    }

    /**
     * 开立时间
     */
    public void setPrescriptiontime(Date prescriptiontime) {
        this.prescriptiontime = prescriptiontime;
    }

    /**
     * 处方状态
     */
    public Integer getPrescriptionstate() {
        return prescriptionstate;
    }

    /**
     * 处方状态
     */
    public void setPrescriptionstate(Integer prescriptionstate) {
        this.prescriptionstate = prescriptionstate;
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
        Prescription other = (Prescription) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalid() == null ? other.getMedicalid() == null : this.getMedicalid().equals(other.getMedicalid()))
            && (this.getRegistid() == null ? other.getRegistid() == null : this.getRegistid().equals(other.getRegistid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getPrescriptionname() == null ? other.getPrescriptionname() == null : this.getPrescriptionname().equals(other.getPrescriptionname()))
            && (this.getPrescriptiontime() == null ? other.getPrescriptiontime() == null : this.getPrescriptiontime().equals(other.getPrescriptiontime()))
            && (this.getPrescriptionstate() == null ? other.getPrescriptionstate() == null : this.getPrescriptionstate().equals(other.getPrescriptionstate()));
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
        result = prime * result + ((getPrescriptiontime() == null) ? 0 : getPrescriptiontime().hashCode());
        result = prime * result + ((getPrescriptionstate() == null) ? 0 : getPrescriptionstate().hashCode());
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
        sb.append(", prescriptiontime=").append(prescriptiontime);
        sb.append(", prescriptionstate=").append(prescriptionstate);
        sb.append("]");
        return sb.toString();
    }
}