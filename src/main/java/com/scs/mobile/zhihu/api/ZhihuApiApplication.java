package com.scs.mobile.zhihu.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:yyt on 2020/1/16 13:20
 */

@SpringBootApplication
@MapperScan("com.scs.mobile.zhihu.api.mapper")
public class ZhihuApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhihuApiApplication.class, args);
    }

}
