package com.pg.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.Query;

import com.pg.mall.product.dao.ProductClassAttributeDao;
import com.pg.mall.product.entity.ProductClassAttributeEntity;
import com.pg.mall.product.service.ProductClassAttributeService;


@Service("productClassAttributeService")
public class ProductClassAttributeServiceImpl extends ServiceImpl<ProductClassAttributeDao, ProductClassAttributeEntity> implements ProductClassAttributeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductClassAttributeEntity> page = this.page(
                new Query<ProductClassAttributeEntity>().getPage(params),
                new QueryWrapper<ProductClassAttributeEntity>()
        );

        return new PageUtils(page);
    }

}