package com.pg.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.Query;

import com.pg.mall.product.dao.UserCollectDao;
import com.pg.mall.product.entity.UserCollectEntity;
import com.pg.mall.product.service.UserCollectService;


@Service("userCollectService")
public class UserCollectServiceImpl extends ServiceImpl<UserCollectDao, UserCollectEntity> implements UserCollectService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UserCollectEntity> page = this.page(
                new Query<UserCollectEntity>().getPage(params),
                new QueryWrapper<UserCollectEntity>()
        );

        return new PageUtils(page);
    }

}