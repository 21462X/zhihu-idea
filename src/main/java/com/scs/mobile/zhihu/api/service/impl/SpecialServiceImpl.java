package com.scs.mobile.zhihu.api.service.impl;

import com.scs.mobile.zhihu.api.entity.Special;
import com.scs.mobile.zhihu.api.mapper.SpecialMapper;
import com.scs.mobile.zhihu.api.service.SpecialService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author:yyt on 2020/1/16 14:34
 * @Description:
 */
@Service
public class SpecialServiceImpl implements SpecialService {
    @Resource
    private SpecialMapper specialMapper;

    @Override
    public List<Map> selectAll() {
        return specialMapper.selectAll();
    }

    @Override
    public List<Special> selectRecent() {
        return specialMapper.selectRecent();
    }
}
