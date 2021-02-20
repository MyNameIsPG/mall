package com.pg.mall.product.dao;

import com.pg.mall.product.entity.UserWxEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 微信登录的用户表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Mapper
public interface UserWxDao extends BaseMapper<UserWxEntity> {
	
}
