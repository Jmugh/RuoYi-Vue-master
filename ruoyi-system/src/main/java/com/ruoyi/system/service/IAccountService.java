package com.ruoyi.system.service;

import com.ruoyi.system.domain.AccountInfo;

import java.util.List;

public interface IAccountService {
    public List<AccountInfo> selectAccountList(AccountInfo accountInfo);

    public String getRegisterAccount();

    public boolean addAccount(AccountInfo accountInfo);

}
