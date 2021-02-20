package com.pg.mall.product.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pg.mall.product.entity.SysAdminEntity;
import com.pg.mall.product.service.SysAdminService;
import com.pg.common.utils.PageUtils;
import com.pg.common.utils.R;



/**
 * 管理员表
 *
 * @author pengg
 * @email 493871850@qq.com
 * @date 2021-02-20 14:38:47
 */
@RestController
@RequestMapping("product/sysadmin")
public class SysAdminController {
    @Autowired
    private SysAdminService sysAdminService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = sysAdminService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    public R info(@PathVariable("uuid") String uuid){
		SysAdminEntity sysAdmin = sysAdminService.getById(uuid);

        return R.ok().put("sysAdmin", sysAdmin);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SysAdminEntity sysAdmin){
		sysAdminService.save(sysAdmin);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SysAdminEntity sysAdmin){
		sysAdminService.updateById(sysAdmin);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] uuids){
		sysAdminService.removeByIds(Arrays.asList(uuids));

        return R.ok();
    }

}
