package com.pg.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pg.common.utils.PageUtils;
import com.pg.mall.product.entity.ProductClassAttributeEntity;

import java.util.Map;

/**
 * 商品类目属性表
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:44
 */
public interface ProductClassAttributeService extends IService<ProductClassAttributeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

