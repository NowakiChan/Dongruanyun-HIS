package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName fmeditem
 */
@TableName(value ="fmeditem")
public class Fmeditem {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 项目编码
     */
    @TableField(value = "ItemCode")
    private String itemcode;

    /**
     * 项目名称
     */
    @TableField(value = "ItemName")
    private String itemname;

    /**
     * 规格
     */
    @TableField(value = "Format")
    private String format;

    /**
     * 单价
     */
    @TableField(value = "Price")
    private BigDecimal price;

    /**
     * 所属费用科目ID
     */
    @TableField(value = "ExpClassID")
    private Integer expclassid;

    /**
     * 执行科室ID
     */
    @TableField(value = "DeptID")
    private Integer deptid;

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
     * 项目类型
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
     * 项目编码
     */
    public String getItemcode() {
        return itemcode;
    }

    /**
     * 项目编码
     */
    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    /**
     * 项目名称
     */
    public String getItemname() {
        return itemname;
    }

    /**
     * 项目名称
     */
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    /**
     * 规格
     */
    public String getFormat() {
        return format;
    }

    /**
     * 规格
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 所属费用科目ID
     */
    public Integer getExpclassid() {
        return expclassid;
    }

    /**
     * 所属费用科目ID
     */
    public void setExpclassid(Integer expclassid) {
        this.expclassid = expclassid;
    }

    /**
     * 执行科室ID
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * 执行科室ID
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
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
     * 项目类型
     */
    public Integer getRecordtype() {
        return recordtype;
    }

    /**
     * 项目类型
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
        Fmeditem other = (Fmeditem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getItemcode() == null ? other.getItemcode() == null : this.getItemcode().equals(other.getItemcode()))
            && (this.getItemname() == null ? other.getItemname() == null : this.getItemname().equals(other.getItemname()))
            && (this.getFormat() == null ? other.getFormat() == null : this.getFormat().equals(other.getFormat()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getExpclassid() == null ? other.getExpclassid() == null : this.getExpclassid().equals(other.getExpclassid()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getMnemoniccode() == null ? other.getMnemoniccode() == null : this.getMnemoniccode().equals(other.getMnemoniccode()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getLastupdatedate() == null ? other.getLastupdatedate() == null : this.getLastupdatedate().equals(other.getLastupdatedate()))
            && (this.getRecordtype() == null ? other.getRecordtype() == null : this.getRecordtype().equals(other.getRecordtype()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getItemcode() == null) ? 0 : getItemcode().hashCode());
        result = prime * result + ((getItemname() == null) ? 0 : getItemname().hashCode());
        result = prime * result + ((getFormat() == null) ? 0 : getFormat().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getExpclassid() == null) ? 0 : getExpclassid().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getMnemoniccode() == null) ? 0 : getMnemoniccode().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getLastupdatedate() == null) ? 0 : getLastupdatedate().hashCode());
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
        sb.append(", itemcode=").append(itemcode);
        sb.append(", itemname=").append(itemname);
        sb.append(", format=").append(format);
        sb.append(", price=").append(price);
        sb.append(", expclassid=").append(expclassid);
        sb.append(", deptid=").append(deptid);
        sb.append(", mnemoniccode=").append(mnemoniccode);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", lastupdatedate=").append(lastupdatedate);
        sb.append(", recordtype=").append(recordtype);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }
}