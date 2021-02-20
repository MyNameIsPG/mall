package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 管理员表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Data
@TableName("tb_sys_admin")
public class SysAdminEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 手机号码
	 */
	private String phone;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 所属角色
	 */
	private String roleId;
	/**
	 * 头像地址
	 */
	private String headPic;
	/**
	 * 状态 状态 状态 状态 1正常 2.禁用
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;

}
