package com.pg.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.Query;

import com.pg.mall.product.dao.ProductBrandDao;
import com.pg.mall.product.entity.ProductBrandEntity;
import com.pg.mall.product.service.ProductBrandService;


@Service("productBrandService")
public class ProductBrandServiceImpl extends ServiceImpl<ProductBrandDao, ProductBrandEntity> implements ProductBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductBrandEntity> page = this.page(
                new Query<ProductBrandEntity>().getPage(params),
                new QueryWrapper<ProductBrandEntity>()
        );

        return new PageUtils(page);
    }

}