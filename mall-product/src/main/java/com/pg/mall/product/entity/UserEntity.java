package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Data
@TableName("tb_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 昵称
	 */
	private String nickname;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private Integer sex;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 会员头像图片
	 */
	private String headImageurl;
	/**
	 * 手机
	 */
	private Integer mobile;
	/**
	 * 会员积分
	 */
	private Integer pointNumber;
	/**
	 * 级别id
	 */
	private String levelId;
	/**
	 * 是否删除
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
	/**
	 * 省
	 */
	private String provinceId;
	/**
	 * 市
	 */
	private String cityId;
	/**
	 * 区
	 */
	private String areaId;
	/**
	 * 详细地址
	 */
	private String address;

}
