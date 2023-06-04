package com.ruoyi.system.domain.vo;

import com.ruoyi.system.domain.AccountInfo;

import java.util.Date;

public class AccountInfoVO extends AccountInfo {
    private String create_user_name;

    public String getCreate_user_name() {
        return create_user_name;
    }

    public void setCreate_user_name(String create_user_name) {
        this.create_user_name = create_user_name;
    }
}
