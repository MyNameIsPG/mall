package com.pg.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pg.common.utils.PageUtils;
import com.pg.mall.product.entity.ProductStockEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
public interface ProductStockService extends IService<ProductStockEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

