package com.pg.mall.product.dao;

import com.pg.mall.product.entity.ProductReviewEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评论
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:44
 */
@Mapper
public interface ProductReviewDao extends BaseMapper<ProductReviewEntity> {
	
}
