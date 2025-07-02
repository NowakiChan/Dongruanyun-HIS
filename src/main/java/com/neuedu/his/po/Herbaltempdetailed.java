package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @TableName herbaltempdetailed
 */
@TableName(value ="herbaltempdetailed")
public class Herbaltempdetailed {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 草药模板ID
     */
    @TableField(value = "HerbalTempID")
    private Integer herbaltempid;

    /**
     * 药品ID
     */
    @TableField(value = "HerbalID")
    private Integer herbalid;

    /**
     * 用量
     */
    @TableField(value = "Dosage")
    private String dosage;

    /**
     * 药品单位
     */
    @TableField(value = "Unit")
    private String unit;

    /**
     * 脚注
     */
    @TableField(value = "Footnote")
    private String footnote;

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
     * 草药模板ID
     */
    public Integer getHerbaltempid() {
        return herbaltempid;
    }

    /**
     * 草药模板ID
     */
    public void setHerbaltempid(Integer herbaltempid) {
        this.herbaltempid = herbaltempid;
    }

    /**
     * 药品ID
     */
    public Integer getHerbalid() {
        return herbalid;
    }

    /**
     * 药品ID
     */
    public void setHerbalid(Integer herbalid) {
        this.herbalid = herbalid;
    }

    /**
     * 用量
     */
    public String getDosage() {
        return dosage;
    }

    /**
     * 用量
     */
    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    /**
     * 药品单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 药品单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 脚注
     */
    public String getFootnote() {
        return footnote;
    }

    /**
     * 脚注
     */
    public void setFootnote(String footnote) {
        this.footnote = footnote;
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
        Herbaltempdetailed other = (Herbaltempdetailed) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHerbaltempid() == null ? other.getHerbaltempid() == null : this.getHerbaltempid().equals(other.getHerbaltempid()))
            && (this.getHerbalid() == null ? other.getHerbalid() == null : this.getHerbalid().equals(other.getHerbalid()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getFootnote() == null ? other.getFootnote() == null : this.getFootnote().equals(other.getFootnote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHerbaltempid() == null) ? 0 : getHerbaltempid().hashCode());
        result = prime * result + ((getHerbalid() == null) ? 0 : getHerbalid().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getFootnote() == null) ? 0 : getFootnote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", herbaltempid=").append(herbaltempid);
        sb.append(", herbalid=").append(herbalid);
        sb.append(", dosage=").append(dosage);
        sb.append(", unit=").append(unit);
        sb.append(", footnote=").append(footnote);
        sb.append("]");
        return sb.toString();
    }
}