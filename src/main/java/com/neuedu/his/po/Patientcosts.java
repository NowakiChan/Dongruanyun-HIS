package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName patientcosts
 */
@TableName(value ="patientcosts")
public class Patientcosts {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 挂号ID
     */
    @TableField(value = "RegistID")
    private Integer registid;

    /**
     * 发票ID
     */
    @TableField(value = "InvoiceID")
    private Integer invoiceid;

    /**
     * 项目ID
     */
    @TableField(value = "ItemID")
    private Integer itemid;

    /**
     * 项目类型 1-非药品 2-药品
     */
    @TableField(value = "ItemType")
    private Integer itemtype;

    /**
     * 项目名称
     */
    @TableField(value = "Name")
    private String name;

    /**
     * 项目单价
     */
    @TableField(value = "Price")
    private BigDecimal price;

    /**
     * 数量
     */
    @TableField(value = "Amount")
    private BigDecimal amount;

    /**
     * 执行科室ID
     */
    @TableField(value = "DeptID")
    private Integer deptid;

    /**
     * 开立时间
     */
    @TableField(value = "Createtime")
    private Date createtime;

    /**
     * 开立人员ID
     */
    @TableField(value = "CreateOperID")
    private Integer createoperid;

    /**
     * 收/退费时间
     */
    @TableField(value = "PayTime")
    private Date paytime;

    /**
     * 收/退费人员ID
     */
    @TableField(value = "RegisterID")
    private Integer registerid;

    /**
     * 收费方式
     */
    @TableField(value = "FeeType")
    private Integer feetype;

    /**
     * 退费对应记录ID
     */
    @TableField(value = "BackID")
    private Integer backid;

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
     * 挂号ID
     */
    public Integer getRegistid() {
        return registid;
    }

    /**
     * 挂号ID
     */
    public void setRegistid(Integer registid) {
        this.registid = registid;
    }

    /**
     * 发票ID
     */
    public Integer getInvoiceid() {
        return invoiceid;
    }

    /**
     * 发票ID
     */
    public void setInvoiceid(Integer invoiceid) {
        this.invoiceid = invoiceid;
    }

    /**
     * 项目ID
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * 项目ID
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * 项目类型 1-非药品 2-药品
     */
    public Integer getItemtype() {
        return itemtype;
    }

    /**
     * 项目类型 1-非药品 2-药品
     */
    public void setItemtype(Integer itemtype) {
        this.itemtype = itemtype;
    }

    /**
     * 项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 项目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 项目单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 项目单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 数量
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 数量
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
     * 开立时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 开立时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 开立人员ID
     */
    public Integer getCreateoperid() {
        return createoperid;
    }

    /**
     * 开立人员ID
     */
    public void setCreateoperid(Integer createoperid) {
        this.createoperid = createoperid;
    }

    /**
     * 收/退费时间
     */
    public Date getPaytime() {
        return paytime;
    }

    /**
     * 收/退费时间
     */
    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    /**
     * 收/退费人员ID
     */
    public Integer getRegisterid() {
        return registerid;
    }

    /**
     * 收/退费人员ID
     */
    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    /**
     * 收费方式
     */
    public Integer getFeetype() {
        return feetype;
    }

    /**
     * 收费方式
     */
    public void setFeetype(Integer feetype) {
        this.feetype = feetype;
    }

    /**
     * 退费对应记录ID
     */
    public Integer getBackid() {
        return backid;
    }

    /**
     * 退费对应记录ID
     */
    public void setBackid(Integer backid) {
        this.backid = backid;
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
        Patientcosts other = (Patientcosts) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRegistid() == null ? other.getRegistid() == null : this.getRegistid().equals(other.getRegistid()))
            && (this.getInvoiceid() == null ? other.getInvoiceid() == null : this.getInvoiceid().equals(other.getInvoiceid()))
            && (this.getItemid() == null ? other.getItemid() == null : this.getItemid().equals(other.getItemid()))
            && (this.getItemtype() == null ? other.getItemtype() == null : this.getItemtype().equals(other.getItemtype()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreateoperid() == null ? other.getCreateoperid() == null : this.getCreateoperid().equals(other.getCreateoperid()))
            && (this.getPaytime() == null ? other.getPaytime() == null : this.getPaytime().equals(other.getPaytime()))
            && (this.getRegisterid() == null ? other.getRegisterid() == null : this.getRegisterid().equals(other.getRegisterid()))
            && (this.getFeetype() == null ? other.getFeetype() == null : this.getFeetype().equals(other.getFeetype()))
            && (this.getBackid() == null ? other.getBackid() == null : this.getBackid().equals(other.getBackid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRegistid() == null) ? 0 : getRegistid().hashCode());
        result = prime * result + ((getInvoiceid() == null) ? 0 : getInvoiceid().hashCode());
        result = prime * result + ((getItemid() == null) ? 0 : getItemid().hashCode());
        result = prime * result + ((getItemtype() == null) ? 0 : getItemtype().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreateoperid() == null) ? 0 : getCreateoperid().hashCode());
        result = prime * result + ((getPaytime() == null) ? 0 : getPaytime().hashCode());
        result = prime * result + ((getRegisterid() == null) ? 0 : getRegisterid().hashCode());
        result = prime * result + ((getFeetype() == null) ? 0 : getFeetype().hashCode());
        result = prime * result + ((getBackid() == null) ? 0 : getBackid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", registid=").append(registid);
        sb.append(", invoiceid=").append(invoiceid);
        sb.append(", itemid=").append(itemid);
        sb.append(", itemtype=").append(itemtype);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", amount=").append(amount);
        sb.append(", deptid=").append(deptid);
        sb.append(", createtime=").append(createtime);
        sb.append(", createoperid=").append(createoperid);
        sb.append(", paytime=").append(paytime);
        sb.append(", registerid=").append(registerid);
        sb.append(", feetype=").append(feetype);
        sb.append(", backid=").append(backid);
        sb.append("]");
        return sb.toString();
    }
}