package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.AccountInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountInfoMapper {

    public List<AccountInfo> selectAccountList(AccountInfo accountInfo);

    public boolean addAccount(AccountInfo accountInfo);
}
