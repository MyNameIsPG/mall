package com.pg.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合MybatisPlus
 *      1)、导入依赖
 *      2）、配置
 *          1、配置数据源
 */
@MapperScan("com.pg.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
