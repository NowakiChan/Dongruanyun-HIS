package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @TableName disecategory
 */
@TableName(value = "disecategory")
public class Disecategory {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 分类编码
     */
    @TableField(value = "DicaCode")
    private String dicacode;

    /**
     * 分类名称
     */
    @TableField(value = "DicaName")
    private String dicaname;

    /**
     * 显示顺序号
     */
    @TableField(value = "SequenceNo")
    private Integer sequenceno;

    /**
     * 疾病类型
     */
    @TableField(value = "DicaType")
    private Integer dicatype;

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
     * 分类编码
     */
    public String getDicacode() {
        return dicacode;
    }

    /**
     * 分类编码
     */
    public void setDicacode(String dicacode) {
        this.dicacode = dicacode;
    }

    /**
     * 分类名称
     */
    public String getDicaname() {
        return dicaname;
    }

    /**
     * 分类名称
     */
    public void setDicaname(String dicaname) {
        this.dicaname = dicaname;
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
     * 疾病类型
     */
    public Integer getDicatype() {
        return dicatype;
    }

    /**
     * 疾病类型
     */
    public void setDicatype(Integer dicatype) {
        this.dicatype = dicatype;
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
        Disecategory other = (Disecategory) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getDicacode() == null ? other.getDicacode() == null : this.getDicacode().equals(other.getDicacode()))
                && (this.getDicaname() == null ? other.getDicaname() == null : this.getDicaname().equals(other.getDicaname()))
                && (this.getSequenceno() == null ? other.getSequenceno() == null : this.getSequenceno().equals(other.getSequenceno()))
                && (this.getDicatype() == null ? other.getDicatype() == null : this.getDicatype().equals(other.getDicatype()))
                && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDicacode() == null) ? 0 : getDicacode().hashCode());
        result = prime * result + ((getDicaname() == null) ? 0 : getDicaname().hashCode());
        result = prime * result + ((getSequenceno() == null) ? 0 : getSequenceno().hashCode());
        result = prime * result + ((getDicatype() == null) ? 0 : getDicatype().hashCode());
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
        sb.append(", dicacode=").append(dicacode);
        sb.append(", dicaname=").append(dicaname);
        sb.append(", sequenceno=").append(sequenceno);
        sb.append(", dicatype=").append(dicatype);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}