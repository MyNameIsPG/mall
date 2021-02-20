package com.pg.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pg.mall.product.entity.ProductBrandCategroyEntity;
import com.pg.mall.product.service.ProductBrandCategroyService;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.R;



/**
 * 品牌分类关联表
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 14:38:47
 */
@RestController
@RequestMapping("product/productbrandcategroy")
public class ProductBrandCategroyController {
    @Autowired
    private ProductBrandCategroyService productBrandCategroyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productBrandCategroyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    public R info(@PathVariable("uuid") String uuid){
		ProductBrandCategroyEntity productBrandCategroy = productBrandCategroyService.getById(uuid);

        return R.ok().put("productBrandCategroy", productBrandCategroy);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ProductBrandCategroyEntity productBrandCategroy){
		productBrandCategroyService.save(productBrandCategroy);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ProductBrandCategroyEntity productBrandCategroy){
		productBrandCategroyService.updateById(productBrandCategroy);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] uuids){
		productBrandCategroyService.removeByIds(Arrays.asList(uuids));

        return R.ok();
    }

}
