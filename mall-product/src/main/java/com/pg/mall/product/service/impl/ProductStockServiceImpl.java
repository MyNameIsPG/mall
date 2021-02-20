package com.pg.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.Query;

import com.pg.mall.product.dao.ProductStockDao;
import com.pg.mall.product.entity.ProductStockEntity;
import com.pg.mall.product.service.ProductStockService;


@Service("productStockService")
public class ProductStockServiceImpl extends ServiceImpl<ProductStockDao, ProductStockEntity> implements ProductStockService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductStockEntity> page = this.page(
                new Query<ProductStockEntity>().getPage(params),
                new QueryWrapper<ProductStockEntity>()
        );

        return new PageUtils(page);
    }

}