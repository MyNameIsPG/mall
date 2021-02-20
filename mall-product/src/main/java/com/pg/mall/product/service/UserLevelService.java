package com.pg.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pg.common.utils.PageUtils;
import com.pg.mall.product.entity.UserLevelEntity;

import java.util.Map;

/**
 * 会员级别
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
public interface UserLevelService extends IService<UserLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

