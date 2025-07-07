package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @TableName medicaldisease
 */
@TableName(value = "medicaldisease")
public class Medicaldisease {
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
     * 疾病ID
     */
    @TableField(value = "DiseaseID")
    private Integer diseaseid;

    /**
     * 诊断类型 1-西医 2-中医
     */
    @TableField(value = "DiagnoseType")
    private Integer diagnosetype;

    /**
     * 发病日期
     */
    @TableField(value = "GetSiskDate")
    private Date getsiskdate;

    /**
     * 诊断种类 1-初诊 2-终诊
     */
    @TableField(value = "DiagnoseCate")
    private Integer diagnosecate;

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
     * 疾病ID
     */
    public Integer getDiseaseid() {
        return diseaseid;
    }

    /**
     * 疾病ID
     */
    public void setDiseaseid(Integer diseaseid) {
        this.diseaseid = diseaseid;
    }

    /**
     * 诊断类型 1-西医 2-中医
     */
    public Integer getDiagnosetype() {
        return diagnosetype;
    }

    /**
     * 诊断类型 1-西医 2-中医
     */
    public void setDiagnosetype(Integer diagnosetype) {
        this.diagnosetype = diagnosetype;
    }

    /**
     * 发病日期
     */
    public Date getGetsiskdate() {
        return getsiskdate;
    }

    /**
     * 发病日期
     */
    public void setGetsiskdate(Date getsiskdate) {
        this.getsiskdate = getsiskdate;
    }

    /**
     * 诊断种类 1-初诊 2-终诊
     */
    public Integer getDiagnosecate() {
        return diagnosecate;
    }

    /**
     * 诊断种类 1-初诊 2-终诊
     */
    public void setDiagnosecate(Integer diagnosecate) {
        this.diagnosecate = diagnosecate;
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
        Medicaldisease other = (Medicaldisease) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getMedicalid() == null ? other.getMedicalid() == null : this.getMedicalid().equals(other.getMedicalid()))
                && (this.getRegistid() == null ? other.getRegistid() == null : this.getRegistid().equals(other.getRegistid()))
                && (this.getDiseaseid() == null ? other.getDiseaseid() == null : this.getDiseaseid().equals(other.getDiseaseid()))
                && (this.getDiagnosetype() == null ? other.getDiagnosetype() == null : this.getDiagnosetype().equals(other.getDiagnosetype()))
                && (this.getGetsiskdate() == null ? other.getGetsiskdate() == null : this.getGetsiskdate().equals(other.getGetsiskdate()))
                && (this.getDiagnosecate() == null ? other.getDiagnosecate() == null : this.getDiagnosecate().equals(other.getDiagnosecate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalid() == null) ? 0 : getMedicalid().hashCode());
        result = prime * result + ((getRegistid() == null) ? 0 : getRegistid().hashCode());
        result = prime * result + ((getDiseaseid() == null) ? 0 : getDiseaseid().hashCode());
        result = prime * result + ((getDiagnosetype() == null) ? 0 : getDiagnosetype().hashCode());
        result = prime * result + ((getGetsiskdate() == null) ? 0 : getGetsiskdate().hashCode());
        result = prime * result + ((getDiagnosecate() == null) ? 0 : getDiagnosecate().hashCode());
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
        sb.append(", diseaseid=").append(diseaseid);
        sb.append(", diagnosetype=").append(diagnosetype);
        sb.append(", getsiskdate=").append(getsiskdate);
        sb.append(", diagnosecate=").append(diagnosecate);
        sb.append("]");
        return sb.toString();
    }
}