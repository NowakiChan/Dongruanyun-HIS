package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName drugs
 */
@TableName(value ="drugs")
public class Drugs {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 药品编码
     */
    @TableField(value = "DrugsCode")
    private String drugscode;

    /**
     * 药品名称
     */
    @TableField(value = "DrugsName")
    private String drugsname;

    /**
     * 药品规格
     */
    @TableField(value = "DrugsFormat")
    private String drugsformat;

    /**
     * 包装单位
     */
    @TableField(value = "DrugsUnit")
    private String drugsunit;

    /**
     * 生产厂家
     */
    @TableField(value = "Manufacturer")
    private String manufacturer;

    /**
     * 药品剂型
     */
    @TableField(value = "DrugsDosageID")
    private Integer drugsdosageid;

    /**
     * 药品类型
     */
    @TableField(value = "DrugsTypeID")
    private Integer drugstypeid;

    /**
     * 药品单价
     */
    @TableField(value = "DrugsPrice")
    private BigDecimal drugsprice;

    /**
     * 拼音助记码
     */
    @TableField(value = "MnemonicCode")
    private String mnemoniccode;

    /**
     * 创建时间
     */
    @TableField(value = "CreationDate")
    private Date creationdate;

    /**
     * 最后修改时间
     */
    @TableField(value = "LastUpdateDate")
    private Date lastupdatedate;

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
     * 药品编码
     */
    public String getDrugscode() {
        return drugscode;
    }

    /**
     * 药品编码
     */
    public void setDrugscode(String drugscode) {
        this.drugscode = drugscode;
    }

    /**
     * 药品名称
     */
    public String getDrugsname() {
        return drugsname;
    }

    /**
     * 药品名称
     */
    public void setDrugsname(String drugsname) {
        this.drugsname = drugsname;
    }

    /**
     * 药品规格
     */
    public String getDrugsformat() {
        return drugsformat;
    }

    /**
     * 药品规格
     */
    public void setDrugsformat(String drugsformat) {
        this.drugsformat = drugsformat;
    }

    /**
     * 包装单位
     */
    public String getDrugsunit() {
        return drugsunit;
    }

    /**
     * 包装单位
     */
    public void setDrugsunit(String drugsunit) {
        this.drugsunit = drugsunit;
    }

    /**
     * 生产厂家
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 生产厂家
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * 药品剂型
     */
    public Integer getDrugsdosageid() {
        return drugsdosageid;
    }

    /**
     * 药品剂型
     */
    public void setDrugsdosageid(Integer drugsdosageid) {
        this.drugsdosageid = drugsdosageid;
    }

    /**
     * 药品类型
     */
    public Integer getDrugstypeid() {
        return drugstypeid;
    }

    /**
     * 药品类型
     */
    public void setDrugstypeid(Integer drugstypeid) {
        this.drugstypeid = drugstypeid;
    }

    /**
     * 药品单价
     */
    public BigDecimal getDrugsprice() {
        return drugsprice;
    }

    /**
     * 药品单价
     */
    public void setDrugsprice(BigDecimal drugsprice) {
        this.drugsprice = drugsprice;
    }

    /**
     * 拼音助记码
     */
    public String getMnemoniccode() {
        return mnemoniccode;
    }

    /**
     * 拼音助记码
     */
    public void setMnemoniccode(String mnemoniccode) {
        this.mnemoniccode = mnemoniccode;
    }

    /**
     * 创建时间
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * 创建时间
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * 最后修改时间
     */
    public Date getLastupdatedate() {
        return lastupdatedate;
    }

    /**
     * 最后修改时间
     */
    public void setLastupdatedate(Date lastupdatedate) {
        this.lastupdatedate = lastupdatedate;
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
        Drugs other = (Drugs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDrugscode() == null ? other.getDrugscode() == null : this.getDrugscode().equals(other.getDrugscode()))
            && (this.getDrugsname() == null ? other.getDrugsname() == null : this.getDrugsname().equals(other.getDrugsname()))
            && (this.getDrugsformat() == null ? other.getDrugsformat() == null : this.getDrugsformat().equals(other.getDrugsformat()))
            && (this.getDrugsunit() == null ? other.getDrugsunit() == null : this.getDrugsunit().equals(other.getDrugsunit()))
            && (this.getManufacturer() == null ? other.getManufacturer() == null : this.getManufacturer().equals(other.getManufacturer()))
            && (this.getDrugsdosageid() == null ? other.getDrugsdosageid() == null : this.getDrugsdosageid().equals(other.getDrugsdosageid()))
            && (this.getDrugstypeid() == null ? other.getDrugstypeid() == null : this.getDrugstypeid().equals(other.getDrugstypeid()))
            && (this.getDrugsprice() == null ? other.getDrugsprice() == null : this.getDrugsprice().equals(other.getDrugsprice()))
            && (this.getMnemoniccode() == null ? other.getMnemoniccode() == null : this.getMnemoniccode().equals(other.getMnemoniccode()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getLastupdatedate() == null ? other.getLastupdatedate() == null : this.getLastupdatedate().equals(other.getLastupdatedate()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDrugscode() == null) ? 0 : getDrugscode().hashCode());
        result = prime * result + ((getDrugsname() == null) ? 0 : getDrugsname().hashCode());
        result = prime * result + ((getDrugsformat() == null) ? 0 : getDrugsformat().hashCode());
        result = prime * result + ((getDrugsunit() == null) ? 0 : getDrugsunit().hashCode());
        result = prime * result + ((getManufacturer() == null) ? 0 : getManufacturer().hashCode());
        result = prime * result + ((getDrugsdosageid() == null) ? 0 : getDrugsdosageid().hashCode());
        result = prime * result + ((getDrugstypeid() == null) ? 0 : getDrugstypeid().hashCode());
        result = prime * result + ((getDrugsprice() == null) ? 0 : getDrugsprice().hashCode());
        result = prime * result + ((getMnemoniccode() == null) ? 0 : getMnemoniccode().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getLastupdatedate() == null) ? 0 : getLastupdatedate().hashCode());
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
        sb.append(", drugscode=").append(drugscode);
        sb.append(", drugsname=").append(drugsname);
        sb.append(", drugsformat=").append(drugsformat);
        sb.append(", drugsunit=").append(drugsunit);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", drugsdosageid=").append(drugsdosageid);
        sb.append(", drugstypeid=").append(drugstypeid);
        sb.append(", drugsprice=").append(drugsprice);
        sb.append(", mnemoniccode=").append(mnemoniccode);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", lastupdatedate=").append(lastupdatedate);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}