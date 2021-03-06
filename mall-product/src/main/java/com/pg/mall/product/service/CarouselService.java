package com.pg.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pg.common.utils.PageUtils;
import com.pg.mall.product.entity.CarouselEntity;

import java.util.Map;

/**
 * 轮播图表
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
public interface CarouselService extends IService<CarouselEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

