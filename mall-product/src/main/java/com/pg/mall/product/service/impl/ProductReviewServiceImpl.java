package com.pg.mall.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.Query;

import com.pg.mall.product.dao.ProductReviewDao;
import com.pg.mall.product.entity.ProductReviewEntity;
import com.pg.mall.product.service.ProductReviewService;


@Service("productReviewService")
public class ProductReviewServiceImpl extends ServiceImpl<ProductReviewDao, ProductReviewEntity> implements ProductReviewService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ProductReviewEntity> page = this.page(
                new Query<ProductReviewEntity>().getPage(params),
                new QueryWrapper<ProductReviewEntity>()
        );

        return new PageUtils(page);
    }

}