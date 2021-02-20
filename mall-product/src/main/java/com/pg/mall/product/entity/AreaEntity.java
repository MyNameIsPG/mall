package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 区域表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Data
@TableName("tb_area")
public class AreaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 上级id
	 */
	private String areaId;
	/**
	 * 级别
	 */
	private Integer level;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 地区区号
	 */
	private Integer areaTelno;
	/**
	 * 是否删除
	 */
	private Integer isDelete;
	/**
	 * 添加时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;

}
