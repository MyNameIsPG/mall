package com.pg.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.Query;

import com.pg.mall.product.dao.ProductBrandCategroyDao;
import com.pg.mall.product.entity.ProductBrandCategroyEntity;
import com.pg.mall.product.service.ProductBrandCategroyService;


@Service("productBrandCategroyService")
public class ProductBrandCategroyServiceImpl extends ServiceImpl<ProductBrandCategroyDao, ProductBrandCategroyEntity> implements ProductBrandCategroyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductBrandCategroyEntity> page = this.page(
                new Query<ProductBrandCategroyEntity>().getPage(params),
                new QueryWrapper<ProductBrandCategroyEntity>()
        );

        return new PageUtils(page);
    }

}