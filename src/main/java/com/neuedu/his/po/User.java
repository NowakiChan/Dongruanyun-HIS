package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
public class User {
    /**
     * ID主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 登录名
     */
    @TableField(value = "UserName")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "Password")
    private String password;

    /**
     * 真实姓名
     */
    @TableField(value = "RealName")
    private String realname;

    /**
     * 用户类别
     */
    @TableField(value = "UseType")
    private Integer usetype;

    /**
     * 医生职称ID
     */
    @TableField(value = "DocTitleID")
    private Integer doctitleid;

    /**
     * 是否参与排班
     */
    @TableField(value = "IsScheduling")
    private String isscheduling;

    /**
     * 所在科室ID
     */
    @TableField(value = "DeptID")
    private Integer deptid;

    /**
     * 挂号级别ID
     */
    @TableField(value = "RegistLeID")
    private Integer registleid;

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
     * 登录名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 登录名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 用户类别
     */
    public Integer getUsetype() {
        return usetype;
    }

    /**
     * 用户类别
     */
    public void setUsetype(Integer usetype) {
        this.usetype = usetype;
    }

    /**
     * 医生职称ID
     */
    public Integer getDoctitleid() {
        return doctitleid;
    }

    /**
     * 医生职称ID
     */
    public void setDoctitleid(Integer doctitleid) {
        this.doctitleid = doctitleid;
    }

    /**
     * 是否参与排班
     */
    public String getIsscheduling() {
        return isscheduling;
    }

    /**
     * 是否参与排班
     */
    public void setIsscheduling(String isscheduling) {
        this.isscheduling = isscheduling;
    }

    /**
     * 所在科室ID
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * 所在科室ID
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * 挂号级别ID
     */
    public Integer getRegistleid() {
        return registleid;
    }

    /**
     * 挂号级别ID
     */
    public void setRegistleid(Integer registleid) {
        this.registleid = registleid;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getRealname() == null ? other.getRealname() == null : this.getRealname().equals(other.getRealname()))
            && (this.getUsetype() == null ? other.getUsetype() == null : this.getUsetype().equals(other.getUsetype()))
            && (this.getDoctitleid() == null ? other.getDoctitleid() == null : this.getDoctitleid().equals(other.getDoctitleid()))
            && (this.getIsscheduling() == null ? other.getIsscheduling() == null : this.getIsscheduling().equals(other.getIsscheduling()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getRegistleid() == null ? other.getRegistleid() == null : this.getRegistleid().equals(other.getRegistleid()))
            && (this.getDelmark() == null ? other.getDelmark() == null : this.getDelmark().equals(other.getDelmark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getRealname() == null) ? 0 : getRealname().hashCode());
        result = prime * result + ((getUsetype() == null) ? 0 : getUsetype().hashCode());
        result = prime * result + ((getDoctitleid() == null) ? 0 : getDoctitleid().hashCode());
        result = prime * result + ((getIsscheduling() == null) ? 0 : getIsscheduling().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getRegistleid() == null) ? 0 : getRegistleid().hashCode());
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", realname=").append(realname);
        sb.append(", usetype=").append(usetype);
        sb.append(", doctitleid=").append(doctitleid);
        sb.append(", isscheduling=").append(isscheduling);
        sb.append(", deptid=").append(deptid);
        sb.append(", registleid=").append(registleid);
        sb.append(", delmark=").append(delmark);
        sb.append("]");
        return sb.toString();
    }

}