package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @TableName settlecategory
 */
@TableName(value ="settlecategory")
public class Settlecategory {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 类别编码
     */
    @TableField(value = "SettleCode")
    private String settlecode;

    /**
     * 类别名称
     */
    @TableField(value = "SettleName")
    private String settlename;

    /**
     * 显示顺序号
     */
    @TableField(value = "SequenceNo")
    private Integer sequenceno;

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
     * 类别编码
     */
    public String getSettlecode() {
        return settlecode;
    }

    /**
     * 类别编码
     */
    public void setSettlecode(String settlecode) {
        this.settlecode = settlecode;
    }

    /**
     * 类别名称
     */
    public String getSettlename() {
        return settlename;
    }

    /**
     * 类别名称
     */
    public void setSettlename(String settlename) {
        this.settlename = settlename;
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
        Settlecategory other = (Settlecategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSettlecode() == null ? other.getSettlecode() == null : this.getSettlecode().equals(other.getSettlecode()))
            && (this.getSettlename() == null ? other.getSettlename() == null : this.getSettlename().equals(other.getSettlename()))
            && (this.getSequenceno() == null ? other.getSequenceno() == null : this.getSequenceno().equals(other.getSequenceno()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSettlecode() == null) ? 0 : getSettlecode().hashCode());
        result = prime * result + ((getSettlename() == null) ? 0 : getSettlename().hashCode());
        result = prime * result + ((getSequenceno() == null) ? 0 : getSequenceno().hashCode());
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
        sb.append(", settlecode=").append(settlecode);
        sb.append(", settlename=").append(settlename);
        sb.append(", sequenceno=").append(sequenceno);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}