package com.neuedu.his.po;

/**
 * 作者: 张金山
 * 创建时间：2025/6/26 10:23   星期四
 * 描述：
 * 项目: his-server - com.neuedu.his.po
 * 作者的博客:  https://blog.fulfill.com.cn
 */

public class MyPerson {

    private String id;
    private String name;


    private boolean isSuccess;
    private String isOk;
    private Boolean isAbc;

    public String getIsOk() {
        return isOk;
    }

    public void setIsOk(String isOk) {
        this.isOk = isOk;
    }

    public Boolean getAbc() {
        return isAbc;
    }

    public void setAbc(Boolean abc) {
        isAbc = abc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }
}
