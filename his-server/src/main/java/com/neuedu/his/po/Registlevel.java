package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;

/**
 * @TableName registlevel
 */
@TableName(value = "registlevel")
public class Registlevel {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 号别编码
     */
    @TableField(value = "RegistCode")
    private String registcode;

    /**
     * 号别名称
     */
    @TableField(value = "RegistName")
    private String registname;

    /**
     * 显示顺序号
     */
    @TableField(value = "SequenceNo")
    private Integer sequenceno;

    /**
     * 挂号费
     */
    @TableField(value = "RegistFee")
    private BigDecimal registfee;

    /**
     * 挂号限额
     */
    @TableField(value = "RegistQuota")
    private Integer registquota;

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
     * 号别编码
     */
    public String getRegistcode() {
        return registcode;
    }

    /**
     * 号别编码
     */
    public void setRegistcode(String registcode) {
        this.registcode = registcode;
    }

    /**
     * 号别名称
     */
    public String getRegistname() {
        return registname;
    }

    /**
     * 号别名称
     */
    public void setRegistname(String registname) {
        this.registname = registname;
    }

    /**
     * 显示顺序号
     */
    public Integer getSequenceno() {
        return sequenceno;
    }

    /**
     * 显示顺序号
     */
    public void setSequenceno(Integer sequenceno) {
        this.sequenceno = sequenceno;
    }

    /**
     * 挂号费
     */
    public BigDecimal getRegistfee() {
        return registfee;
    }

    /**
     * 挂号费
     */
    public void setRegistfee(BigDecimal registfee) {
        this.registfee = registfee;
    }

    /**
     * 挂号限额
     */
    public Integer getRegistquota() {
        return registquota;
    }

    /**
     * 挂号限额
     */
    public void setRegistquota(Integer registquota) {
        this.registquota = registquota;
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
        Registlevel other = (Registlevel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getRegistcode() == null ? other.getRegistcode() == null : this.getRegistcode().equals(other.getRegistcode()))
                && (this.getRegistname() == null ? other.getRegistname() == null : this.getRegistname().equals(other.getRegistname()))
                && (this.getSequenceno() == null ? other.getSequenceno() == null : this.getSequenceno().equals(other.getSequenceno()))
                && (this.getRegistfee() == null ? other.getRegistfee() == null : this.getRegistfee().equals(other.getRegistfee()))
                && (this.getRegistquota() == null ? other.getRegistquota() == null : this.getRegistquota().equals(other.getRegistquota()))
                && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegistcode() == null) ? 0 : getRegistcode().hashCode());
        result = prime * result + ((getRegistname() == null) ? 0 : getRegistname().hashCode());
        result = prime * result + ((getSequenceno() == null) ? 0 : getSequenceno().hashCode());
        result = prime * result + ((getRegistfee() == null) ? 0 : getRegistfee().hashCode());
        result = prime * result + ((getRegistquota() == null) ? 0 : getRegistquota().hashCode());
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
        sb.append(", registcode=").append(registcode);
        sb.append(", registname=").append(registname);
        sb.append(", sequenceno=").append(sequenceno);
        sb.append(", registfee=").append(registfee);
        sb.append(", registquota=").append(registquota);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}