package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 
 * @TableName checkapply
 */
@TableName(value ="checkapply")
public class Checkapply {
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
     * 项目ID
     */
    @TableField(value = "ItemID")
    private Integer itemid;

    /**
     * 项目名称
     */
    @TableField(value = "Name")
    private String name;

    /**
     * 目的要求
     */
    @TableField(value = "Objective")
    private String objective;

    /**
     * 检查部位
     */
    @TableField(value = "Position")
    private String position;

    /**
     * 是否加急 1为加急 0为不加急
     */
    @TableField(value = "IsUrgent")
    private Integer isurgent;

    /**
     * 数量
     */
    @TableField(value = "Num")
    private Integer num;

    /**
     * 开立时间
     */
    @TableField(value = "CreationTime")
    private Date creationtime;

    /**
     * 开立医生ID
     */
    @TableField(value = "DoctorID")
    private Integer doctorid;

    /**
     * 检查人员ID
     */
    @TableField(value = "CheckOperID")
    private Integer checkoperid;

    /**
     * 结果录入人员ID
     */
    @TableField(value = "ResultOperID")
    private Integer resultoperid;

    /**
     * 检查时间
     */
    @TableField(value = "CheckTime")
    private Date checktime;

    /**
     * 检查结果
     */
    @TableField(value = "Result")
    private String result;

    /**
     * 结果时间
     */
    @TableField(value = "ResultTime")
    private Date resulttime;

    /**
     * 状态
     */
    @TableField(value = "State")
    private Integer state;

    /**
     * 记录类型 1-检查 2-检验 3-处置
     */
    @TableField(value = "RecordType")
    private Integer recordtype;

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
     * 项目ID
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * 项目ID
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * 项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 项目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 目的要求
     */
    public String getObjective() {
        return objective;
    }

    /**
     * 目的要求
     */
    public void setObjective(String objective) {
        this.objective = objective;
    }

    /**
     * 检查部位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 检查部位
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 是否加急 1为加急 0为不加急
     */
    public Integer getIsurgent() {
        return isurgent;
    }

    /**
     * 是否加急 1为加急 0为不加急
     */
    public void setIsurgent(Integer isurgent) {
        this.isurgent = isurgent;
    }

    /**
     * 数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 数量
     */
    public void setNum(Integer num) {
        this.num = num;
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
     * 开立医生ID
     */
    public Integer getDoctorid() {
        return doctorid;
    }

    /**
     * 开立医生ID
     */
    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    /**
     * 检查人员ID
     */
    public Integer getCheckoperid() {
        return checkoperid;
    }

    /**
     * 检查人员ID
     */
    public void setCheckoperid(Integer checkoperid) {
        this.checkoperid = checkoperid;
    }

    /**
     * 结果录入人员ID
     */
    public Integer getResultoperid() {
        return resultoperid;
    }

    /**
     * 结果录入人员ID
     */
    public void setResultoperid(Integer resultoperid) {
        this.resultoperid = resultoperid;
    }

    /**
     * 检查时间
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
     * 检查时间
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    /**
     * 检查结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 检查结果
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * 结果时间
     */
    public Date getResulttime() {
        return resulttime;
    }

    /**
     * 结果时间
     */
    public void setResulttime(Date resulttime) {
        this.resulttime = resulttime;
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

    /**
     * 记录类型 1-检查 2-检验 3-处置
     */
    public Integer getRecordtype() {
        return recordtype;
    }

    /**
     * 记录类型 1-检查 2-检验 3-处置
     */
    public void setRecordtype(Integer recordtype) {
        this.recordtype = recordtype;
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
        Checkapply other = (Checkapply) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedicalid() == null ? other.getMedicalid() == null : this.getMedicalid().equals(other.getMedicalid()))
            && (this.getRegistid() == null ? other.getRegistid() == null : this.getRegistid().equals(other.getRegistid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getObjective() == null ? other.getObjective() == null : this.getObjective().equals(other.getObjective()))
            && (this.getPosition() == null ? other.getPosition() == null : this.getPosition().equals(other.getPosition()))
            && (this.getIsurgent() == null ? other.getIsurgent() == null : this.getIsurgent().equals(other.getIsurgent()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getCreationtime() == null ? other.getCreationtime() == null : this.getCreationtime().equals(other.getCreationtime()))
            && (this.getDoctorid() == null ? other.getDoctorid() == null : this.getDoctorid().equals(other.getDoctorid()))
            && (this.getCheckoperid() == null ? other.getCheckoperid() == null : this.getCheckoperid().equals(other.getCheckoperid()))
            && (this.getResultoperid() == null ? other.getResultoperid() == null : this.getResultoperid().equals(other.getResultoperid()))
            && (this.getChecktime() == null ? other.getChecktime() == null : this.getChecktime().equals(other.getChecktime()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.getResulttime() == null ? other.getResulttime() == null : this.getResulttime().equals(other.getResulttime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getRecordtype() == null ? other.getRecordtype() == null : this.getRecordtype().equals(other.getRecordtype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedicalid() == null) ? 0 : getMedicalid().hashCode());
        result = prime * result + ((getRegistid() == null) ? 0 : getRegistid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getObjective() == null) ? 0 : getObjective().hashCode());
        result = prime * result + ((getPosition() == null) ? 0 : getPosition().hashCode());
        result = prime * result + ((getIsurgent() == null) ? 0 : getIsurgent().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getCreationtime() == null) ? 0 : getCreationtime().hashCode());
        result = prime * result + ((getDoctorid() == null) ? 0 : getDoctorid().hashCode());
        result = prime * result + ((getCheckoperid() == null) ? 0 : getCheckoperid().hashCode());
        result = prime * result + ((getResultoperid() == null) ? 0 : getResultoperid().hashCode());
        result = prime * result + ((getChecktime() == null) ? 0 : getChecktime().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getResulttime() == null) ? 0 : getResulttime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getRecordtype() == null) ? 0 : getRecordtype().hashCode());
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
        sb.append(", itemid=").append(itemid);
        sb.append(", name=").append(name);
        sb.append(", objective=").append(objective);
        sb.append(", position=").append(position);
        sb.append(", isurgent=").append(isurgent);
        sb.append(", num=").append(num);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", doctorid=").append(doctorid);
        sb.append(", checkoperid=").append(checkoperid);
        sb.append(", resultoperid=").append(resultoperid);
        sb.append(", checktime=").append(checktime);
        sb.append(", result=").append(result);
        sb.append(", resulttime=").append(resulttime);
        sb.append(", state=").append(state);
        sb.append(", recordtype=").append(recordtype);
        sb.append("]");
        return sb.toString();
    }
}