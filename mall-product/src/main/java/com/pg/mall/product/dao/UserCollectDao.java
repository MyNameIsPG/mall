package com.pg.mall.product.dao;

import com.pg.mall.product.entity.UserCollectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏表、关注
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Mapper
public interface UserCollectDao extends BaseMapper<UserCollectEntity> {
	
}
