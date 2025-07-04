package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @TableName constanttype
 */
@TableName(value ="constanttype")
public class Constanttype {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 常数类别编码
     */
    @TableField(value = "ConstantTypeCode")
    private String constanttypecode;

    /**
     * 常数类别名称
     */
    @TableField(value = "ConstantTypeName")
    private String constanttypename;

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
     * 常数类别编码
     */
    public String getConstanttypecode() {
        return constanttypecode;
    }

    /**
     * 常数类别编码
     */
    public void setConstanttypecode(String constanttypecode) {
        this.constanttypecode = constanttypecode;
    }

    /**
     * 常数类别名称
     */
    public String getConstanttypename() {
        return constanttypename;
    }

    /**
     * 常数类别名称
     */
    public void setConstanttypename(String constanttypename) {
        this.constanttypename = constanttypename;
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
        Constanttype other = (Constanttype) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConstanttypecode() == null ? other.getConstanttypecode() == null : this.getConstanttypecode().equals(other.getConstanttypecode()))
            && (this.getConstanttypename() == null ? other.getConstanttypename() == null : this.getConstanttypename().equals(other.getConstanttypename()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConstanttypecode() == null) ? 0 : getConstanttypecode().hashCode());
        result = prime * result + ((getConstanttypename() == null) ? 0 : getConstanttypename().hashCode());
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
        sb.append(", constanttypecode=").append(constanttypecode);
        sb.append(", constanttypename=").append(constanttypename);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}