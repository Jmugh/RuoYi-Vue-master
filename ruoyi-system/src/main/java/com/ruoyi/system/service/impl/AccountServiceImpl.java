package com.ruoyi.system.service.impl;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.game.ProcessDataUtils;
import com.ruoyi.system.domain.AccountInfo;
import com.ruoyi.system.domain.IDnum;
import com.ruoyi.system.domain.vo.IDNumAccountVO;
import com.ruoyi.system.mapper.AccountInfoMapper;
import com.ruoyi.system.mapper.AccountInfoMapper;
import com.ruoyi.system.mapper.IDnumMapper;
import com.ruoyi.system.mapper.SysLogininforMapper;
import com.ruoyi.system.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountInfoMapper accountInfoMapper;

    @Autowired
    private IDnumMapper iDnumMapper;


    @Override
    public List<AccountInfo> selectAccountList(AccountInfo accountInfo) {

        return accountInfoMapper.selectAccountList(accountInfo);
    }

    /**
     * 返回账号密码身份证号 姓名
     * @return
     */
    @Override
    public IDNumAccountVO getRegisterAccount() {
        AccountInfo accountInfo = accountInfoMapper.getLatestAccount();
        IDNumAccountVO idNumAccountVO = new IDNumAccountVO();
        if(accountInfo != null && StringUtils.isNotEmpty(accountInfo.getUserName())){
            String toRegistAccountUserName = ProcessDataUtils.userNameIncrement(accountInfo.getUserName());
            idNumAccountVO.setUserName(toRegistAccountUserName);
            idNumAccountVO.setPwd("abcd12345");
        }else{
            String toRegistAccountUserName = "a00000000";
            idNumAccountVO.setUserName(toRegistAccountUserName);
            idNumAccountVO.setPwd("abcd12345");
        }
        //添加身份证号: 查询register_count最小的10个idnum信息，然后随机选一个身份证号，返回给页面
        List<IDnum> idnumList = iDnumMapper.selectAccessibleIDnum();
        final List<IDnum> filteredIdnumList = idnumList.stream().filter((idnum) -> {
            return idnum.getRegisterCount() < 5;
        }).collect(Collectors.toList());
        IDnum iDnum = filteredIdnumList.get(new Random().nextInt(filteredIdnumList.size()));
        idNumAccountVO.setIdNum(iDnum.getIdNum());
        idNumAccountVO.setName(iDnum.getName());
        System.out.println(idNumAccountVO.toString());
        return idNumAccountVO;
    }

    @Override
    public boolean addAccount(AccountInfo accountInfo) {
        return accountInfoMapper.addAccount(accountInfo);
    }
}
