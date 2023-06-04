package com.ruoyi.system.service;

import com.ruoyi.system.domain.AccountInfo;
import com.ruoyi.system.domain.vo.IDNumAccountVO;

import java.util.List;

public interface IAccountService {
    public List<AccountInfo> selectAccountList(AccountInfo accountInfo);

    public IDNumAccountVO getRegisterAccount();

    public boolean addAccount(AccountInfo accountInfo);

}
