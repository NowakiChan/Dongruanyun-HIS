package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 
 * @TableName scheduling
 */
@TableName(value ="scheduling")
public class Scheduling {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 排班日期
     */
    @TableField(value = "SchedDate")
    private Date scheddate;

    /**
     * 科室ID
     */
    @TableField(value = "DeptID")
    private Integer deptid;

    /**
     * 医生ID
     */
    @TableField(value = "UserID")
    private Integer userid;

    /**
     * 午别
     */
    @TableField(value = "Noon")
    private String noon;

    /**
     * 排班规则ID
     */
    @TableField(value = "RuleID")
    private Integer ruleid;

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
     * 排班日期
     */
    public Date getScheddate() {
        return scheddate;
    }

    /**
     * 排班日期
     */
    public void setScheddate(Date scheddate) {
        this.scheddate = scheddate;
    }

    /**
     * 科室ID
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * 科室ID
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * 医生ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 医生ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 午别
     */
    public String getNoon() {
        return noon;
    }

    /**
     * 午别
     */
    public void setNoon(String noon) {
        this.noon = noon;
    }

    /**
     * 排班规则ID
     */
    public Integer getRuleid() {
        return ruleid;
    }

    /**
     * 排班规则ID
     */
    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
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
        Scheduling other = (Scheduling) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getScheddate() == null ? other.getScheddate() == null : this.getScheddate().equals(other.getScheddate()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getNoon() == null ? other.getNoon() == null : this.getNoon().equals(other.getNoon()))
            && (this.getRuleid() == null ? other.getRuleid() == null : this.getRuleid().equals(other.getRuleid()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScheddate() == null) ? 0 : getScheddate().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getNoon() == null) ? 0 : getNoon().hashCode());
        result = prime * result + ((getRuleid() == null) ? 0 : getRuleid().hashCode());
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
        sb.append(", scheddate=").append(scheddate);
        sb.append(", deptid=").append(deptid);
        sb.append(", userid=").append(userid);
        sb.append(", noon=").append(noon);
        sb.append(", ruleid=").append(ruleid);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}