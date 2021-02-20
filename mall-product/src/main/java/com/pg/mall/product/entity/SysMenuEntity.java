package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 菜单表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Data
@TableName("tb_sys_menu")
public class SysMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 级别
	 */
	private Integer level;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 路径
	 */
	private String url;
	/**
	 * 上级菜单
	 */
	private String menuUuid;
	/**
	 * 是否删除
	 */
	private Integer isDelete;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;

}
