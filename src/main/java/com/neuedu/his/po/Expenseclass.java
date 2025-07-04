package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @TableName expenseclass
 */
@TableName(value ="expenseclass")
public class Expenseclass {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 费用科目编码
     */
    @TableField(value = "ExpCode")
    private String expcode;

    /**
     * 费用科目名称
     */
    @TableField(value = "ExpName")
    private String expname;

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
     * 费用科目编码
     */
    public String getExpcode() {
        return expcode;
    }

    /**
     * 费用科目编码
     */
    public void setExpcode(String expcode) {
        this.expcode = expcode;
    }

    /**
     * 费用科目名称
     */
    public String getExpname() {
        return expname;
    }

    /**
     * 费用科目名称
     */
    public void setExpname(String expname) {
        this.expname = expname;
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
        Expenseclass other = (Expenseclass) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getExpcode() == null ? other.getExpcode() == null : this.getExpcode().equals(other.getExpcode()))
            && (this.getExpname() == null ? other.getExpname() == null : this.getExpname().equals(other.getExpname()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getExpcode() == null) ? 0 : getExpcode().hashCode());
        result = prime * result + ((getExpname() == null) ? 0 : getExpname().hashCode());
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
        sb.append(", expcode=").append(expcode);
        sb.append(", expname=").append(expname);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}