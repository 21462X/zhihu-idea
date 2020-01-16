package com.scs.mobile.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @Author:yyt on 2020/1/16 13:30
 * @Description:
 */
@Data
@Builder
public class Section {
    private String sectionId;
    private String specialId;
    private String sectionTitle;
}
