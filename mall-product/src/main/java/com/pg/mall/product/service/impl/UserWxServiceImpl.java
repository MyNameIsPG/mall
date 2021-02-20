package com.pg.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.Query;

import com.pg.mall.product.dao.UserWxDao;
import com.pg.mall.product.entity.UserWxEntity;
import com.pg.mall.product.service.UserWxService;


@Service("userWxService")
public class UserWxServiceImpl extends ServiceImpl<UserWxDao, UserWxEntity> implements UserWxService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserWxEntity> page = this.page(
                new Query<UserWxEntity>().getPage(params),
                new QueryWrapper<UserWxEntity>()
        );

        return new PageUtils(page);
    }

}