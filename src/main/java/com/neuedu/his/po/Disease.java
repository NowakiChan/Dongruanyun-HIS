package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @TableName disease
 */
@TableName(value ="disease")
public class Disease {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 疾病助记编码
     */
    @TableField(value = "DiseaseCode")
    private String diseasecode;

    /**
     * 疾病名称
     */
    @TableField(value = "DiseaseName")
    private String diseasename;

    /**
     * 国际ICD编码
     */
    @TableField(value = "DiseaseICD")
    private String diseaseicd;

    /**
     * 疾病所属分类
     */
    @TableField(value = "DiseCategoryID")
    private Integer disecategoryid;

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
     * 疾病助记编码
     */
    public String getDiseasecode() {
        return diseasecode;
    }

    /**
     * 疾病助记编码
     */
    public void setDiseasecode(String diseasecode) {
        this.diseasecode = diseasecode;
    }

    /**
     * 疾病名称
     */
    public String getDiseasename() {
        return diseasename;
    }

    /**
     * 疾病名称
     */
    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    /**
     * 国际ICD编码
     */
    public String getDiseaseicd() {
        return diseaseicd;
    }

    /**
     * 国际ICD编码
     */
    public void setDiseaseicd(String diseaseicd) {
        this.diseaseicd = diseaseicd;
    }

    /**
     * 疾病所属分类
     */
    public Integer getDisecategoryid() {
        return disecategoryid;
    }

    /**
     * 疾病所属分类
     */
    public void setDisecategoryid(Integer disecategoryid) {
        this.disecategoryid = disecategoryid;
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
        Disease other = (Disease) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDiseasecode() == null ? other.getDiseasecode() == null : this.getDiseasecode().equals(other.getDiseasecode()))
            && (this.getDiseasename() == null ? other.getDiseasename() == null : this.getDiseasename().equals(other.getDiseasename()))
            && (this.getDiseaseicd() == null ? other.getDiseaseicd() == null : this.getDiseaseicd().equals(other.getDiseaseicd()))
            && (this.getDisecategoryid() == null ? other.getDisecategoryid() == null : this.getDisecategoryid().equals(other.getDisecategoryid()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDiseasecode() == null) ? 0 : getDiseasecode().hashCode());
        result = prime * result + ((getDiseasename() == null) ? 0 : getDiseasename().hashCode());
        result = prime * result + ((getDiseaseicd() == null) ? 0 : getDiseaseicd().hashCode());
        result = prime * result + ((getDisecategoryid() == null) ? 0 : getDisecategoryid().hashCode());
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
        sb.append(", diseasecode=").append(diseasecode);
        sb.append(", diseasename=").append(diseasename);
        sb.append(", diseaseicd=").append(diseaseicd);
        sb.append(", disecategoryid=").append(disecategoryid);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}