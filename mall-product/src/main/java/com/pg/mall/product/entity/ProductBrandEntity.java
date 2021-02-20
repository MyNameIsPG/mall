package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:44
 */
@Data
@TableName("tb_product_brand")
public class ProductBrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 图标
	 */
	private String ico;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 是否删除 1、是 2、否
	 */
	private Integer isDelete;
	/**
	 * 修改时间
	 */
	private Date modifyTime;
	/**
	 * 添加时间
	 */
	private Date createTime;

}
