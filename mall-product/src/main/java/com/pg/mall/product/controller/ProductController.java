package com.pg.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pg.mall.product.entity.ProductEntity;
import com.pg.mall.product.service.ProductService;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.R;



/**
 * 商品表
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 14:38:47
 */
@RestController
@RequestMapping("product/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = productService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    public R info(@PathVariable("uuid") String uuid){
		ProductEntity product = productService.getById(uuid);

        return R.ok().put("product", product);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ProductEntity product){
		productService.save(product);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ProductEntity product){
		productService.updateById(product);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] uuids){
		productService.removeByIds(Arrays.asList(uuids));

        return R.ok();
    }

}
