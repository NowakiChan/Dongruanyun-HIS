package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @TableName department
 */
@TableName(value = "department")
public class Department {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 科室编码
     */
    @TableField(value = "DeptCode")
    private String deptcode;

    /**
     * 科室名称
     */
    @TableField(value = "DeptName")
    private String deptname;

    /**
     * 科室分类
     */
    @TableField(value = "DeptCategoryID")
    private Integer deptcategoryid;

    /**
     * 科室类型
     */
    @TableField(value = "DeptType")
    private Integer depttype;

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
     * 科室编码
     */
    public String getDeptcode() {
        return deptcode;
    }

    /**
     * 科室编码
     */
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    /**
     * 科室名称
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * 科室名称
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    /**
     * 科室分类
     */
    public Integer getDeptcategoryid() {
        return deptcategoryid;
    }

    /**
     * 科室分类
     */
    public void setDeptcategoryid(Integer deptcategoryid) {
        this.deptcategoryid = deptcategoryid;
    }

    /**
     * 科室类型
     */
    public Integer getDepttype() {
        return depttype;
    }

    /**
     * 科室类型
     */
    public void setDepttype(Integer depttype) {
        this.depttype = depttype;
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
        Department other = (Department) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getDeptcode() == null ? other.getDeptcode() == null : this.getDeptcode().equals(other.getDeptcode()))
                && (this.getDeptname() == null ? other.getDeptname() == null : this.getDeptname().equals(other.getDeptname()))
                && (this.getDeptcategoryid() == null ? other.getDeptcategoryid() == null : this.getDeptcategoryid().equals(other.getDeptcategoryid()))
                && (this.getDepttype() == null ? other.getDepttype() == null : this.getDepttype().equals(other.getDepttype()))
                && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDeptcode() == null) ? 0 : getDeptcode().hashCode());
        result = prime * result + ((getDeptname() == null) ? 0 : getDeptname().hashCode());
        result = prime * result + ((getDeptcategoryid() == null) ? 0 : getDeptcategoryid().hashCode());
        result = prime * result + ((getDepttype() == null) ? 0 : getDepttype().hashCode());
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
        sb.append(", deptcode=").append(deptcode);
        sb.append(", deptname=").append(deptname);
        sb.append(", deptcategoryid=").append(deptcategoryid);
        sb.append(", depttype=").append(depttype);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}