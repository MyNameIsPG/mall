package com.pg.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pg.mall.product.entity.UserWxEntity;
import com.pg.mall.product.service.UserWxService;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.R;



/**
 * 微信登录的用户表
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 14:38:47
 */
@RestController
@RequestMapping("product/userwx")
public class UserWxController {
    @Autowired
    private UserWxService userWxService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = userWxService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    public R info(@PathVariable("uuid") String uuid){
		UserWxEntity userWx = userWxService.getById(uuid);

        return R.ok().put("userWx", userWx);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserWxEntity userWx){
		userWxService.save(userWx);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserWxEntity userWx){
		userWxService.updateById(userWx);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] uuids){
		userWxService.removeByIds(Arrays.asList(uuids));

        return R.ok();
    }

}
