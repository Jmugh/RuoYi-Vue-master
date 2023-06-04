package com.ruoyi.web.controller.game;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.entity.SysRole;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.AccountInfo;
import com.ruoyi.system.domain.SysConfig;
import com.ruoyi.system.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game/account")
public class AccountController extends BaseController {
    @Autowired
    private IAccountService accountService;

    @PreAuthorize("@ss.hasPermi('game:account:list')")
    @GetMapping("/list")
    public TableDataInfo list(AccountInfo accountInfo)
    {
        startPage();
        List<AccountInfo> list = accountService.selectAccountList(accountInfo);
        return getDataTable(list);
    }

    @GetMapping("/getRegisterAccount")
    public AjaxResult getRegisterAccount()
    {
        return success(accountService.getRegisterAccount());
    }

//    @PreAuthorize("@ss.hasPermi('game:account:add')")
    @PostMapping("/addAccount")
    public AjaxResult add(AccountInfo accountInfo){
        return toAjax(accountService.addAccount(accountInfo));
    }
}
