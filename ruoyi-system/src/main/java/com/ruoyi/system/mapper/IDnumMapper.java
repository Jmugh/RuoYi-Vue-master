package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.AccountInfo;
import com.ruoyi.system.domain.IDnum;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDnumMapper {

    public List<IDnum> selectAccessibleIDnum();
}
