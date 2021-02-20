package com.pg.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.Query;

import com.pg.mall.product.dao.OrdersDao;
import com.pg.mall.product.entity.OrdersEntity;
import com.pg.mall.product.service.OrdersService;


@Service("ordersService")
public class OrdersServiceImpl extends ServiceImpl<OrdersDao, OrdersEntity> implements OrdersService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrdersEntity> page = this.page(
                new Query<OrdersEntity>().getPage(params),
                new QueryWrapper<OrdersEntity>()
        );

        return new PageUtils(page);
    }

}