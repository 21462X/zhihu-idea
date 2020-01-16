package com.scs.mobile.zhihu.api.controller;

import com.scs.mobile.zhihu.api.common.Result;
import com.scs.mobile.zhihu.api.service.SpecialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author:yyt on 2020/1/16 14:28

 * @Description:
 */

@RestController
@RequestMapping(value = "/api/special")
public class SpecialController {
    @Resource
    private SpecialService specialService;

    @GetMapping
    public Result getRecent(){
        return Result.success(specialService.selectRecent());
    }

    @GetMapping(value = "/all")
    public Result getAll(){
        return Result.success(specialService.selectAll());
    }
}
