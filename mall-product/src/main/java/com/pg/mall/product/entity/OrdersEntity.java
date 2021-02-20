package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:44
 */
@Data
@TableName("tb_orders")
public class OrdersEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 
	 */
	private String 字段46;
	/**
	 * 
	 */
	private String 字段47;
	/**
	 * 
	 */
	private String 字段48;
	/**
	 * 
	 */
	private String 字段49;
	/**
	 * 
	 */
	private String 字段50;

}
