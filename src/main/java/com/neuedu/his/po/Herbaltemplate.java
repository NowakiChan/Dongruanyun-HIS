package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 
 * @TableName herbaltemplate
 */
@TableName(value ="herbaltemplate")
public class Herbaltemplate {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    @TableField(value = "Name")
    private String name;

    /**
     * 医生ID
     */
    @TableField(value = "DoctorID")
    private Integer doctorid;

    /**
     * 创建时间
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
     * 用法
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
     * 使用范围 全院/科室/个人
     */
    @TableField(value = "Scope")
    private String scope;

    /**
     * 删除标记
     */
    @TableField(value = "DelMark")
    private Integer delmark;

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
     * 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 医生ID
     */
    public Integer getDoctorid() {
        return doctorid;
    }

    /**
     * 医生ID
     */
    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    /**
     * 创建时间
     */
    public Date getCreationtime() {
        return creationtime;
    }

    /**
     * 创建时间
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
     * 使用范围 全院/科室/个人
     */
    public String getScope() {
        return scope;
    }

    /**
     * 使用范围 全院/科室/个人
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * 删除标记
     */
    public Integer getDelmark() {
        return delmark;
    }

    /**
     * 删除标记
     */
    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
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
        Herbaltemplate other = (Herbaltemplate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getDoctorid() == null ? other.getDoctorid() == null : this.getDoctorid().equals(other.getDoctorid()))
            && (this.getCreationtime() == null ? other.getCreationtime() == null : this.getCreationtime().equals(other.getCreationtime()))
            && (this.getPrescriptiotype() == null ? other.getPrescriptiotype() == null : this.getPrescriptiotype().equals(other.getPrescriptiotype()))
            && (this.getPaynumber() == null ? other.getPaynumber() == null : this.getPaynumber().equals(other.getPaynumber()))
            && (this.getDrugsusage() == null ? other.getDrugsusage() == null : this.getDrugsusage().equals(other.getDrugsusage()))
            && (this.getTherapy() == null ? other.getTherapy() == null : this.getTherapy().equals(other.getTherapy()))
            && (this.getDetailed() == null ? other.getDetailed() == null : this.getDetailed().equals(other.getDetailed()))
            && (this.getAdvice() == null ? other.getAdvice() == null : this.getAdvice().equals(other.getAdvice()))
            && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getDoctorid() == null) ? 0 : getDoctorid().hashCode());
        result = prime * result + ((getCreationtime() == null) ? 0 : getCreationtime().hashCode());
        result = prime * result + ((getPrescriptiotype() == null) ? 0 : getPrescriptiotype().hashCode());
        result = prime * result + ((getPaynumber() == null) ? 0 : getPaynumber().hashCode());
        result = prime * result + ((getDrugsusage() == null) ? 0 : getDrugsusage().hashCode());
        result = prime * result + ((getTherapy() == null) ? 0 : getTherapy().hashCode());
        result = prime * result + ((getDetailed() == null) ? 0 : getDetailed().hashCode());
        result = prime * result + ((getAdvice() == null) ? 0 : getAdvice().hashCode());
        result = prime * result + ((getScope() == null) ? 0 : getScope().hashCode());
        result = prime * result + ((getDelmark() == null) ? 0 : getDelmark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", doctorid=").append(doctorid);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", prescriptiotype=").append(prescriptiotype);
        sb.append(", paynumber=").append(paynumber);
        sb.append(", drugsusage=").append(drugsusage);
        sb.append(", therapy=").append(therapy);
        sb.append(", detailed=").append(detailed);
        sb.append(", advice=").append(advice);
        sb.append(", scope=").append(scope);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}