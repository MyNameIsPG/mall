package com.pg.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.Query;

import com.pg.mall.product.dao.SysAdminDao;
import com.pg.mall.product.entity.SysAdminEntity;
import com.pg.mall.product.service.SysAdminService;


@Service("sysAdminService")
public class SysAdminServiceImpl extends ServiceImpl<SysAdminDao, SysAdminEntity> implements SysAdminService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SysAdminEntity> page = this.page(
                new Query<SysAdminEntity>().getPage(params),
                new QueryWrapper<SysAdminEntity>()
        );

        return new PageUtils(page);
    }

}