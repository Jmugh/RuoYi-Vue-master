package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.AccountInfo;
import com.ruoyi.system.mapper.AccountInfoMapper;
import com.ruoyi.system.mapper.AccountInfoMapper;
import com.ruoyi.system.mapper.SysLogininforMapper;
import com.ruoyi.system.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountInfoMapper accountInfoMapper;


    @Override
    public List<AccountInfo> selectAccountList(AccountInfo accountInfo) {

        return accountInfoMapper.selectAccountList(accountInfo);
    }

    @Override
    public String getRegisterAccount() {
        return null;
    }

    @Override
    public boolean addAccount(AccountInfo accountInfo) {
        return accountInfoMapper.addAccount(accountInfo);
    }
}
