package com.pg.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pg.mall.product.entity.ProductClassAttributeEntity;
import com.pg.mall.product.service.ProductClassAttributeService;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.R;



/**
 * 商品类目属性表
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 14:38:47
 */
@RestController
@RequestMapping("product/productclassattribute")
public class ProductClassAttributeController {
    @Autowired
    private ProductClassAttributeService productClassAttributeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productClassAttributeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    public R info(@PathVariable("uuid") String uuid){
		ProductClassAttributeEntity productClassAttribute = productClassAttributeService.getById(uuid);

        return R.ok().put("productClassAttribute", productClassAttribute);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ProductClassAttributeEntity productClassAttribute){
		productClassAttributeService.save(productClassAttribute);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ProductClassAttributeEntity productClassAttribute){
		productClassAttributeService.updateById(productClassAttribute);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] uuids){
		productClassAttributeService.removeByIds(Arrays.asList(uuids));

        return R.ok();
    }

}
