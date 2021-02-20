package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 微信登录的用户表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Data
@TableName("tb_user_wx")
public class UserWxEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 昵称
	 */
	private String nickName;
	/**
	 * 微信用户唯一id
	 */
	private String openId;
	/**
	 * 绑定的people用户
	 */
	private String bindUser;
	/**
	 * 性别 性别（1.男 2女）
	 */
	private Integer gender;
	/**
	 * 头像
	 */
	private String avatarUrl;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;

}
