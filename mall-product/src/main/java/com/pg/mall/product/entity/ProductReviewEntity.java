package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品评论
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:44
 */
@Data
@TableName("tb_product_review")
public class ProductReviewEntity implements Serializable {
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
	 * 商品ID
	 */
	private String productId;
	/**
	 * 分值
	 */
	private Integer pointNumber;
	/**
	 * 评论内容
	 */
	private String context;
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

}
