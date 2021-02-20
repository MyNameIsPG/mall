package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品类目属性表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:44
 */
@Data
@TableName("tb_product_class_attribute")
public class ProductClassAttributeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 编码code
	 */
	private String code;
	/**
	 * 键
	 */
	private String name;
	/**
	 * 单位
	 */
	private String unit;
	/**
	 * 值
	 */
	private String value;
	/**
	 * 级别
	 */
	private Integer level;
	/**
	 * 修改时间
	 */
	private Date modifyTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 是否必填
	 */
	private Integer required;
	/**
	 * 1、输入框  2、时间  3、选择框
	 */
	private Integer type;
	/**
	 * 对应的字典表code
	 */
	private String typeCode;

}
