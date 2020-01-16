package com.scs.mobile.zhihu.api.service;

import com.scs.mobile.zhihu.api.entity.Special;

import java.util.List;
import java.util.Map;

/**
 * @Author:yyt on 2020/1/16 14:14
 * @Description:
 */
public interface SpecialService {
    /**
     *查询所有专题
     * @return List<Map>
     */
    List<Map> selectAll();

    /**
     * 查询最新专题
     * @return List<Special>
     */
    List<Special> selectRecent();
}
