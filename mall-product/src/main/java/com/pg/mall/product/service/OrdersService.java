package com.pg.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pg.common.utils.PageUtils;
import com.pg.mall.product.entity.OrdersEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:44
 */
public interface OrdersService extends IService<OrdersEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

