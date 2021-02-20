package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 分类表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Data
@TableName("tb_product_category")
public class ProductCategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 上级id
	 */
	private String categoryId;
	/**
	 * 级别
	 */
	private Integer level;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 分类CODE
	 */
	private String categoryCode;
	/**
	 * 分类图片
	 */
	private String icon;
	/**
	 * 是否删除 是否删除 是否删除 是否删除 1、是 2、否
	 */
	private Integer isDelete;
	/**
	 * 类目属性code
	 */
	private String clasAttribute;
	/**
	 * 销售信息code 多的已逗号隔开
	 */
	private String salesInformation;
	/**
	 * 修改时间
	 */
	private Date modifyTime;
	/**
	 * 添加时间
	 */
	private Date createTime;

}
