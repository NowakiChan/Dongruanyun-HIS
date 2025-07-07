package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @TableName invoice
 */
@TableName(value = "invoice")
public class Invoice {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 发票号码
     */
    @TableField(value = "InvoiceNum")
    private String invoicenum;

    /**
     * 发票金额
     */
    @TableField(value = "Money")
    private BigDecimal money;

    /**
     * 发票状态  1-正常  2-作废
     */
    @TableField(value = "State")
    private Integer state;

    /**
     * 收/退费时间
     */
    @TableField(value = "CreationTime")
    private Date creationtime;

    /**
     * 收/退费人员ID
     */
    @TableField(value = "UserID")
    private Integer userid;

    /**
     * 挂号ID
     */
    @TableField(value = "RegistID")
    private Integer registid;

    /**
     * 收费方式
     */
    @TableField(value = "FeeType")
    private Integer feetype;

    /**
     * 冲红发票号码
     */
    @TableField(value = "Back")
    private String back;

    /**
     * 发票状态  0-未日结  1-已提交  2-已审核
     */
    @TableField(value = "DailyState")
    private Integer dailystate;

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
     * 发票号码
     */
    public String getInvoicenum() {
        return invoicenum;
    }

    /**
     * 发票号码
     */
    public void setInvoicenum(String invoicenum) {
        this.invoicenum = invoicenum;
    }

    /**
     * 发票金额
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * 发票金额
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 发票状态  1-正常  2-作废
     */
    public Integer getState() {
        return state;
    }

    /**
     * 发票状态  1-正常  2-作废
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 收/退费时间
     */
    public Date getCreationtime() {
        return creationtime;
    }

    /**
     * 收/退费时间
     */
    public void setCreationtime(Date creationtime) {
        this.creationtime = creationtime;
    }

    /**
     * 收/退费人员ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 收/退费人员ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
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
     * 冲红发票号码
     */
    public String getBack() {
        return back;
    }

    /**
     * 冲红发票号码
     */
    public void setBack(String back) {
        this.back = back;
    }

    /**
     * 发票状态  0-未日结  1-已提交  2-已审核
     */
    public Integer getDailystate() {
        return dailystate;
    }

    /**
     * 发票状态  0-未日结  1-已提交  2-已审核
     */
    public void setDailystate(Integer dailystate) {
        this.dailystate = dailystate;
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
        Invoice other = (Invoice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getInvoicenum() == null ? other.getInvoicenum() == null : this.getInvoicenum().equals(other.getInvoicenum()))
                && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
                && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
                && (this.getCreationtime() == null ? other.getCreationtime() == null : this.getCreationtime().equals(other.getCreationtime()))
                && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
                && (this.getRegistid() == null ? other.getRegistid() == null : this.getRegistid().equals(other.getRegistid()))
                && (this.getFeetype() == null ? other.getFeetype() == null : this.getFeetype().equals(other.getFeetype()))
                && (this.getBack() == null ? other.getBack() == null : this.getBack().equals(other.getBack()))
                && (this.getDailystate() == null ? other.getDailystate() == null : this.getDailystate().equals(other.getDailystate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getInvoicenum() == null) ? 0 : getInvoicenum().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getCreationtime() == null) ? 0 : getCreationtime().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getRegistid() == null) ? 0 : getRegistid().hashCode());
        result = prime * result + ((getFeetype() == null) ? 0 : getFeetype().hashCode());
        result = prime * result + ((getBack() == null) ? 0 : getBack().hashCode());
        result = prime * result + ((getDailystate() == null) ? 0 : getDailystate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", invoicenum=").append(invoicenum);
        sb.append(", money=").append(money);
        sb.append(", state=").append(state);
        sb.append(", creationtime=").append(creationtime);
        sb.append(", userid=").append(userid);
        sb.append(", registid=").append(registid);
        sb.append(", feetype=").append(feetype);
        sb.append(", back=").append(back);
        sb.append(", dailystate=").append(dailystate);
        sb.append("]");
        return sb.toString();
    }
}