package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @TableName constantitem
 */
@TableName(value ="constantitem")
public class Constantitem {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 所属常数类别ID
     */
    @TableField(value = "ConstantTypeID")
    private Integer constanttypeid;

    /**
     * 常数项编码
     */
    @TableField(value = "ConstantCode")
    private String constantcode;

    /**
     * 常数项名称
     */
    @TableField(value = "ConstantName")
    private String constantname;

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
     * 所属常数类别ID
     */
    public Integer getConstanttypeid() {
        return constanttypeid;
    }

    /**
     * 所属常数类别ID
     */
    public void setConstanttypeid(Integer constanttypeid) {
        this.constanttypeid = constanttypeid;
    }

    /**
     * 常数项编码
     */
    public String getConstantcode() {
        return constantcode;
    }

    /**
     * 常数项编码
     */
    public void setConstantcode(String constantcode) {
        this.constantcode = constantcode;
    }

    /**
     * 常数项名称
     */
    public String getConstantname() {
        return constantname;
    }

    /**
     * 常数项名称
     */
    public void setConstantname(String constantname) {
        this.constantname = constantname;
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
        Constantitem other = (Constantitem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getConstanttypeid() == null ? other.getConstanttypeid() == null : this.getConstanttypeid().equals(other.getConstanttypeid()))
            && (this.getConstantcode() == null ? other.getConstantcode() == null : this.getConstantcode().equals(other.getConstantcode()))
            && (this.getConstantname() == null ? other.getConstantname() == null : this.getConstantname().equals(other.getConstantname()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getConstanttypeid() == null) ? 0 : getConstanttypeid().hashCode());
        result = prime * result + ((getConstantcode() == null) ? 0 : getConstantcode().hashCode());
        result = prime * result + ((getConstantname() == null) ? 0 : getConstantname().hashCode());
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
        sb.append(", constanttypeid=").append(constanttypeid);
        sb.append(", constantcode=").append(constantcode);
        sb.append(", constantname=").append(constantname);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}