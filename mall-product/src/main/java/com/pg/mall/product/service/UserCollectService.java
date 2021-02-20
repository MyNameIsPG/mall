package com.pg.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pg.common.utils.PageUtils;
import com.pg.mall.product.entity.UserCollectEntity;

import java.util.Map;

/**
 * 会员收藏表、关注
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
public interface UserCollectService extends IService<UserCollectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

