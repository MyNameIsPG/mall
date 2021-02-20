package com.pg.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品表
 * 
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 12:33:44
 */
@Data
@TableName("tb_product")
public class ProductEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private String uuid;
	/**
	 * 品牌id
	 */
	private String brandId;
	/**
	 * 分类id
	 */
	private String categoryId;
	/**
	 * 评论id
	 */
	private String reviewId;
	/**
	 * 库存id
	 */
	private String skuId;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 编号
	 */
	private String productNumber;
	/**
	 * 市场价
	 */
	private BigDecimal marketPrice;
	/**
	 * 会员价
	 */
	private BigDecimal memberPrice;
	/**
	 * 好评率
	 */
	private BigDecimal praiseRate;
	/**
	 * 商品封面
	 */
	private String coverImage;
	/**
	 * 商品图片
	 */
	private String secondImage;
	/**
	 * 商品详情
	 */
	private String content;
	/**
	 * 评分数
	 */
	private Integer scoreNumber;
	/**
	 * 商品积分数
	 */
	private Integer pointNumber;
	/**
	 * 是否首页
	 */
	private Integer isIndex;
	/**
	 * 是否推荐
	 */
	private Integer isRecommend;
	/**
	 * 是否置顶
	 */
	private Integer isTop;
	/**
	 * 是否热点
	 */
	private Integer isHot;
	/**
	 * 是否上架
	 */
	private Integer isSell;
	/**
	 * 是否删除
	 */
	private Integer isDelete;
	/**
	 * 总数量
	 */
	private Integer stockNumber;
	/**
	 * 剩余商品
	 */
	private Integer surplusNumber;
	/**
	 * 已售商品
	 */
	private Integer soldNumber;
	/**
	 * 开始日期
	 */
	private Date startTime;
	/**
	 * 截止日期
	 */
	private Date endTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;
	/**
	 * 添加时间
	 */
	private Date createTime;

}
