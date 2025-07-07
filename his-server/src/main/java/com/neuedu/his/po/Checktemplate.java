package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @TableName checktemplate
 */
@TableName(value = "checktemplate")
public class Checktemplate {
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
    @TableField(value = "UserID")
    private Integer userid;

    /**
     * 创建时间
     */
    @TableField(value = "CreationTime")
    private Date creationtime;

    /**
     * 使用范围   全院/科室/个人
     */
    @TableField(value = "Scope")
    private String scope;

    /**
     * 记录类型 1-检查  2-检验 3-处置
     */
    @TableField(value = "RecordType")
    private Integer recordtype;

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
     * 使用范围   全院/科室/个人
     */
    public String getScope() {
        return scope;
    }

    /**
     * 使用范围   全院/科室/个人
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * 记录类型 1-检查  2-检验 3-处置
     */
    public Integer getRecordtype() {
        return recordtype;
    }

    /**
     * 记录类型 1-检查  2-检验 3-处置
     */
    public void setRecordtype(Integer recordtype) {
        this.recordtype = recordtype;
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
        Checktemplate other = (Checktemplate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
                && (this.getCreationtime() == null ? other.getCreationtime() == null : this.getCreationtime().equals(other.getCreationtime()))
                && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()))
                && (this.getRecordtype() == null ? other.getRecordtype() == null : this.getRecordtype().equals(other.getRecordtype()))
                && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getCreationtime() == null) ? 0 : getCreationtime().hashCode());
        result = prime * result + ((getScope() == null) ? 0 : getScope().hashCode());
        result = prime * result + ((getRecordtype() == null) ? 0 : getRecordtype().hashCode());
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
        sb.append(", userid=").append(userid);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", scope=").append(scope);
        sb.append(", recordtype=").append(recordtype);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}