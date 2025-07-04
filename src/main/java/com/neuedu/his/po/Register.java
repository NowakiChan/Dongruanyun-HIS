package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 
 * @TableName register
 */
@TableName(value ="register")
public class Register {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 病历号
     */
    @TableField(value = "CaseNumber")
    private String casenumber;

    /**
     * 姓名
     */
    @TableField(value = "RealName")
    private String realname;

    /**
     * 性别
     */
    @TableField(value = "Gender")
    private Integer gender;

    /**
     * 身份证号
     */
    @TableField(value = "IDnumber")
    private String idnumber;

    /**
     * 出生日期
     */
    @TableField(value = "BirthDate")
    private Date birthdate;

    /**
     * 年龄
     */
    @TableField(value = "Age")
    private Integer age;

    /**
     * 年龄类型 岁 月 天
     */
    @TableField(value = "AgeType")
    private String agetype;

    /**
     * 家庭住址
     */
    @TableField(value = "HomeAddress")
    private String homeaddress;

    /**
     * 本次看诊日期
     */
    @TableField(value = "VisitDate")
    private Date visitdate;

    /**
     * 午别  上午/下午
     */
    @TableField(value = "Noon")
    private String noon;

    /**
     * 本次挂号科室ID
     */
    @TableField(value = "DeptID")
    private Integer deptid;

    /**
     * 本次挂号医生ID
     */
    @TableField(value = "UserID")
    private Integer userid;

    /**
     * 本次挂号级别ID
     */
    @TableField(value = "RegistLeID")
    private Integer registleid;

    /**
     * 结算类别ID
     */
    @TableField(value = "SettleID")
    private Integer settleid;

    /**
     * 病历本要否  是/否
     */
    @TableField(value = "IsBook")
    private String isbook;

    /**
     * 挂号时间
     */
    @TableField(value = "RegistTime")
    private Date registtime;

    /**
     * 挂号员ID
     */
    @TableField(value = "RegisterID")
    private Integer registerid;

    /**
     * 本次看诊状态
     */
    @TableField(value = "VisitState")
    private Integer visitstate;

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
     * 病历号
     */
    public String getCasenumber() {
        return casenumber;
    }

    /**
     * 病历号
     */
    public void setCasenumber(String casenumber) {
        this.casenumber = casenumber;
    }

    /**
     * 姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 身份证号
     */
    public String getIdnumber() {
        return idnumber;
    }

    /**
     * 身份证号
     */
    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    /**
     * 出生日期
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * 出生日期
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 年龄类型 岁 月 天
     */
    public String getAgetype() {
        return agetype;
    }

    /**
     * 年龄类型 岁 月 天
     */
    public void setAgetype(String agetype) {
        this.agetype = agetype;
    }

    /**
     * 家庭住址
     */
    public String getHomeaddress() {
        return homeaddress;
    }

    /**
     * 家庭住址
     */
    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    /**
     * 本次看诊日期
     */
    public Date getVisitdate() {
        return visitdate;
    }

    /**
     * 本次看诊日期
     */
    public void setVisitdate(Date visitdate) {
        this.visitdate = visitdate;
    }

    /**
     * 午别  上午/下午
     */
    public String getNoon() {
        return noon;
    }

    /**
     * 午别  上午/下午
     */
    public void setNoon(String noon) {
        this.noon = noon;
    }

    /**
     * 本次挂号科室ID
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * 本次挂号科室ID
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * 本次挂号医生ID
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 本次挂号医生ID
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 本次挂号级别ID
     */
    public Integer getRegistleid() {
        return registleid;
    }

    /**
     * 本次挂号级别ID
     */
    public void setRegistleid(Integer registleid) {
        this.registleid = registleid;
    }

    /**
     * 结算类别ID
     */
    public Integer getSettleid() {
        return settleid;
    }

    /**
     * 结算类别ID
     */
    public void setSettleid(Integer settleid) {
        this.settleid = settleid;
    }

    /**
     * 病历本要否  是/否
     */
    public String getIsbook() {
        return isbook;
    }

    /**
     * 病历本要否  是/否
     */
    public void setIsbook(String isbook) {
        this.isbook = isbook;
    }

    /**
     * 挂号时间
     */
    public Date getRegisttime() {
        return registtime;
    }

    /**
     * 挂号时间
     */
    public void setRegisttime(Date registtime) {
        this.registtime = registtime;
    }

    /**
     * 挂号员ID
     */
    public Integer getRegisterid() {
        return registerid;
    }

    /**
     * 挂号员ID
     */
    public void setRegisterid(Integer registerid) {
        this.registerid = registerid;
    }

    /**
     * 本次看诊状态
     */
    public Integer getVisitstate() {
        return visitstate;
    }

    /**
     * 本次看诊状态
     */
    public void setVisitstate(Integer visitstate) {
        this.visitstate = visitstate;
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
        Register other = (Register) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCasenumber() == null ? other.getCasenumber() == null : this.getCasenumber().equals(other.getCasenumber()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getIdnumber() == null ? other.getIdnumber() == null : this.getIdnumber().equals(other.getIdnumber()))
            && (this.getBirthdate() == null ? other.getBirthdate() == null : this.getBirthdate().equals(other.getBirthdate()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getAgetype() == null ? other.getAgetype() == null : this.getAgetype().equals(other.getAgetype()))
            && (this.getHomeaddress() == null ? other.getHomeaddress() == null : this.getHomeaddress().equals(other.getHomeaddress()))
            && (this.getVisitdate() == null ? other.getVisitdate() == null : this.getVisitdate().equals(other.getVisitdate()))
            && (this.getNoon() == null ? other.getNoon() == null : this.getNoon().equals(other.getNoon()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getRegistleid() == null ? other.getRegistleid() == null : this.getRegistleid().equals(other.getRegistleid()))
            && (this.getSettleid() == null ? other.getSettleid() == null : this.getSettleid().equals(other.getSettleid()))
            && (this.getIsbook() == null ? other.getIsbook() == null : this.getIsbook().equals(other.getIsbook()))
            && (this.getRegisttime() == null ? other.getRegisttime() == null : this.getRegisttime().equals(other.getRegisttime()))
            && (this.getRegisterid() == null ? other.getRegisterid() == null : this.getRegisterid().equals(other.getRegisterid()))
            && (this.getVisitstate() == null ? other.getVisitstate() == null : this.getVisitstate().equals(other.getVisitstate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCasenumber() == null) ? 0 : getCasenumber().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getIdnumber() == null) ? 0 : getIdnumber().hashCode());
        result = prime * result + ((getBirthdate() == null) ? 0 : getBirthdate().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getAgetype() == null) ? 0 : getAgetype().hashCode());
        result = prime * result + ((getHomeaddress() == null) ? 0 : getHomeaddress().hashCode());
        result = prime * result + ((getVisitdate() == null) ? 0 : getVisitdate().hashCode());
        result = prime * result + ((getNoon() == null) ? 0 : getNoon().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getRegistleid() == null) ? 0 : getRegistleid().hashCode());
        result = prime * result + ((getSettleid() == null) ? 0 : getSettleid().hashCode());
        result = prime * result + ((getIsbook() == null) ? 0 : getIsbook().hashCode());
        result = prime * result + ((getRegisttime() == null) ? 0 : getRegisttime().hashCode());
        result = prime * result + ((getRegisterid() == null) ? 0 : getRegisterid().hashCode());
        result = prime * result + ((getVisitstate() == null) ? 0 : getVisitstate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", casenumber=").append(casenumber);
        sb.append(", realname=").append(realname);
        sb.append(", gender=").append(gender);
        sb.append(", idnumber=").append(idnumber);
        sb.append(", birthdate=").append(birthdate);
        sb.append(", age=").append(age);
        sb.append(", agetype=").append(agetype);
        sb.append(", homeaddress=").append(homeaddress);
        sb.append(", visitdate=").append(visitdate);
        sb.append(", noon=").append(noon);
        sb.append(", deptid=").append(deptid);
        sb.append(", userid=").append(userid);
        sb.append(", registleid=").append(registleid);
        sb.append(", settleid=").append(settleid);
        sb.append(", isbook=").append(isbook);
        sb.append(", registtime=").append(registtime);
        sb.append(", registerid=").append(registerid);
        sb.append(", visitstate=").append(visitstate);
        sb.append("]");
        return sb.toString();
    }
}