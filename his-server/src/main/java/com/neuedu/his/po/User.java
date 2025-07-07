package com.neuedu.his.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 作者: 张金山
 * 创建时间：2025/6/25 9:06   星期三
 * 描述：
 * 项目: his-server - com.neuedu.his.po
 * 作者的博客:  https://blog.fulfill.com.cn
 */

// 表示 跟那个数据库表 关联
@TableName("`user`")
public class User {

    @TableId(type = IdType.AUTO)
    @TableField(value = "ID")
    private Integer id;   // i_d

    @TableField(value = "UserName")
    private String userName;     // UserName    user_name   驼峰


    @TableField(value = "Password")
    private String password;

    @TableField(value = "RealName")
    private String realName;

    @TableField(value = "UseType")
    private String useType;

    @TableField(value = "DocTitleID")
    private String docTitleID;

    @TableField(value = "IsScheduling")
    private String isScheduling;

    @TableField(value = "DeptID")
    private Integer deptID;


    @TableField(value = "RegistLeID")
    private Integer registLeID;

    @TableField(value = "DelMark")
    private Integer delMark;

    // 生成Setter  getter 方法


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getDocTitleID() {
        return docTitleID;
    }

    public void setDocTitleID(String docTitleID) {
        this.docTitleID = docTitleID;
    }

    public String getIsScheduling() {
        return isScheduling;
    }

    public void setIsScheduling(String isScheduling) {
        this.isScheduling = isScheduling;
    }

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        this.deptID = deptID;
    }

    public Integer getRegistLeID() {
        return registLeID;
    }

    public void setRegistLeID(Integer registLeID) {
        this.registLeID = registLeID;
    }

    public Integer getDelMark() {
        return delMark;
    }

    public void setDelMark(Integer delMark) {
        this.delMark = delMark;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", useType='" + useType + '\'' +
                ", docTitleID='" + docTitleID + '\'' +
                ", isScheduling='" + isScheduling + '\'' +
                ", deptID=" + deptID +
                ", registLeID=" + registLeID +
                ", delMark=" + delMark +
                '}';
    }
}
