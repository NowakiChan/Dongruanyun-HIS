package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * @TableName registwork
 */
@TableName(value = "registwork")
public class Registwork {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 收费人员ID
     */
    @TableField(value = "RegisterID")
    private Integer registerid;

    /**
     * 日结起始时间
     */
    @TableField(value = "StartTime")
    private Date starttime;

    /**
     * 日结结束时间
     */
    @TableField(value = "EndTime")
    private Date endtime;

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
     * 收费人员ID
     */
    public Integer getRegisterid() {
        return registerid;
    }

    /**
     * 收费人员ID
     */
    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    /**
     * 日结起始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 日结起始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 日结结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 日结结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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
        Registwork other = (Registwork) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getRegisterid() == null ? other.getRegisterid() == null : this.getRegisterid().equals(other.getRegisterid()))
                && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
                && (this.getEndtime() == null ? other.getEndtime() == null : this.getEndtime().equals(other.getEndtime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegisterid() == null) ? 0 : getRegisterid().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", registerid=").append(registerid);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append("]");
        return sb.toString();
    }
}