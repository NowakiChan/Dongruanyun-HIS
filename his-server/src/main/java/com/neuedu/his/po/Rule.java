package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @TableName rule
 */
@TableName(value = "rule")
public class Rule {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 规则名称
     */
    @TableField(value = "RuleName")
    private String rulename;

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
     * 星期
     */
    @TableField(value = "Week")
    private String week;

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
     * 规则名称
     */
    public String getRulename() {
        return rulename;
    }

    /**
     * 规则名称
     */
    public void setRulename(String rulename) {
        this.rulename = rulename;
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
     * 星期
     */
    public String getWeek() {
        return week;
    }

    /**
     * 星期
     */
    public void setWeek(String week) {
        this.week = week;
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
        Rule other = (Rule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getRulename() == null ? other.getRulename() == null : this.getRulename().equals(other.getRulename()))
                && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
                && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
                && (this.getWeek() == null ? other.getWeek() == null : this.getWeek().equals(other.getWeek()))
                && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRulename() == null) ? 0 : getRulename().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getWeek() == null) ? 0 : getWeek().hashCode());
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
        sb.append(", rulename=").append(rulename);
        sb.append(", deptid=").append(deptid);
        sb.append(", userid=").append(userid);
        sb.append(", week=").append(week);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}