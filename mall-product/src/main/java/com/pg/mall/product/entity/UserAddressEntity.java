package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 会员收货地址
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:43
 */
@Data
@TableName("tb_user_address")
public class UserAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 会员id
	 */
	private String userId;
	/**
	 * 当前地址 0=不是，1=是
	 */
	private Integer isUse;
	/**
	 * 收货人
	 */
	private String receiveName;
	/**
	 * 手机
	 */
	private Integer phone;
	/**
	 * 是否删除
	 */
	private Integer isDelete;
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
	private String createdate;
	/**
	 * 修改时间
	 */
	private Date modifyTime;
	/**
	 * 添加时间
	 */
	private Date createTime;

}
