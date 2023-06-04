package com.ruoyi.system.domain.vo;

public class IDNumAccountVO {
    private String userName;
    private String pwd;
    private String name;
    private String idNum;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return "IDNumAccountVO{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", idNum='" + idNum + '\'' +
                '}';
    }
}
