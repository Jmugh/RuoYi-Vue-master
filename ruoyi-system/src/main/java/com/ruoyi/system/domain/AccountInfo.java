package com.ruoyi.system.domain;

import java.util.Date;

public class AccountInfo {
    private Integer id;
    private String ipAddress;
    private String userName;
    private String pwd;
    private Integer subNum;
    private Integer isLogin;
    private Integer babySize;

    private String windowsNum;
    private Integer isGod;
    private Integer isWljj;
    private Integer xjd;
    private Date smallAddTime;
    private Date wljjEndTime;
    private Integer saveX;
    private Integer status;
    private Integer jsIp;
    private Long create_user_id;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

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

    public Integer getSubNum() {
        return subNum;
    }

    public void setSubNum(Integer subNum) {
        this.subNum = subNum;
    }

    public Integer getIsLogin() {
        return isLogin;
    }

    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    public Integer getBabySize() {
        return babySize;
    }

    public void setBabySize(Integer babySize) {
        this.babySize = babySize;
    }

    public String getWindowsNum() {
        return windowsNum;
    }

    public void setWindowsNum(String windowsNum) {
        this.windowsNum = windowsNum;
    }

    public Integer getIsGod() {
        return isGod;
    }

    public void setIsGod(Integer isGod) {
        this.isGod = isGod;
    }

    public Integer getIsWljj() {
        return isWljj;
    }

    public void setIsWljj(Integer isWljj) {
        this.isWljj = isWljj;
    }

    public Integer getXjd() {
        return xjd;
    }

    public void setXjd(Integer xjd) {
        this.xjd = xjd;
    }

    public Date getSmallAddTime() {
        return smallAddTime;
    }

    public void setSmallAddTime(Date smallAddTime) {
        this.smallAddTime = smallAddTime;
    }

    public Date getWljjEndTime() {
        return wljjEndTime;
    }

    public void setWljjEndTime(Date wljjEndTime) {
        this.wljjEndTime = wljjEndTime;
    }

    public Integer getSaveX() {
        return saveX;
    }

    public void setSaveX(Integer saveX) {
        this.saveX = saveX;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getJsIp() {
        return jsIp;
    }

    public void setJsIp(Integer jsIp) {
        this.jsIp = jsIp;
    }
}
