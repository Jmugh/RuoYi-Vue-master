package com.ruoyi.system.domain;

public class IDNnum {
    private String name;
    private String idNum;

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
        return "IDNnum{" +
                "name='" + name + '\'' +
                ", idNum='" + idNum + '\'' +
                '}';
    }
}
