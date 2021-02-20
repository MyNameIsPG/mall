package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 轮播图表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Data
@TableName("tb_carousel")
public class CarouselEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private String uuid;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 图片地址
	 */
	private String url;
	/**
	 * 权重
	 */
	private Integer layer;
	/**
	 * 1、普通轮播  2、首页轮播
	 */
	private Integer type;
	/**
	 * 跳转地址
	 */
	private String link;
	/**
	 * 
	 */
	private Date modifyTime;
	/**
	 * 
	 */
	private Date createTime;

}
