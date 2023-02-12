package com.erato.exampleforpagehelperintegration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


/**
 * 品牌(Brand)表 pojo 层
 *
 * @author zhangyuan
 * @since 2021-02-10 16:46:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand implements Serializable {
    private static final long serialVersionUID = 642064695048292372L;
    /**
     * 品牌id
     */
    private Long brandId;
    /**
     * 品牌名
     */
    private String name;
    /**
     * 品牌logo地址
     */
    private String logo;
    /**
     * 介绍
     */
    private String description;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    private Integer showStatus;
    /**
     * 检索首字母
     */
    private String firstLetter;
    /**
     * 排序
     */
    private Integer sort;
    
}