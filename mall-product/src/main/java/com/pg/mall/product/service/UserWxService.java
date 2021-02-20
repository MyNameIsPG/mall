package com.pg.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pg.common.utils.PageUtils;
import com.pg.mall.product.entity.UserWxEntity;

import java.util.Map;

/**
 * 微信登录的用户表
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
public interface UserWxService extends IService<UserWxEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

