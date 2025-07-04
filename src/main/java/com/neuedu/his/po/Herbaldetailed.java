package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;

/**
 * 
 * @TableName herbaldetailed
 */
@TableName(value ="herbaldetailed")
public class Herbaldetailed {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 草药处方ID
     */
    @TableField(value = "HerbalPresID")
    private Integer herbalpresid;

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
     * 药品单价
     */
    @TableField(value = "Price")
    private BigDecimal price;

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
     * 草药处方ID
     */
    public Integer getHerbalpresid() {
        return herbalpresid;
    }

    /**
     * 草药处方ID
     */
    public void setHerbalpresid(Integer herbalpresid) {
        this.herbalpresid = herbalpresid;
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
     * 药品单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 药品单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
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
        Herbaldetailed other = (Herbaldetailed) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHerbalpresid() == null ? other.getHerbalpresid() == null : this.getHerbalpresid().equals(other.getHerbalpresid()))
            && (this.getHerbalid() == null ? other.getHerbalid() == null : this.getHerbalid().equals(other.getHerbalid()))
            && (this.getDosage() == null ? other.getDosage() == null : this.getDosage().equals(other.getDosage()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getFootnote() == null ? other.getFootnote() == null : this.getFootnote().equals(other.getFootnote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHerbalpresid() == null) ? 0 : getHerbalpresid().hashCode());
        result = prime * result + ((getHerbalid() == null) ? 0 : getHerbalid().hashCode());
        result = prime * result + ((getDosage() == null) ? 0 : getDosage().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
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
        sb.append(", herbalpresid=").append(herbalpresid);
        sb.append(", herbalid=").append(herbalid);
        sb.append(", dosage=").append(dosage);
        sb.append(", price=").append(price);
        sb.append(", footnote=").append(footnote);
        sb.append("]");
        return sb.toString();
    }
}