package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Data
@TableName("tb_sys_role")
public class SysRoleEntity implements Serializable {
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
	 * 描述
	 */
	private String description;
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
