package com.erato.exampleforpagehelperintegration.service;

import com.erato.exampleforpagehelperintegration.entity.Brand;
import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * 品牌(Brand)表服务接口
 *
 * @author zhangyuan
 * @since 2021-02-10 16:42:15
 */
public interface BrandService {
    
//    /**
//     * 分页查询
//     *
//     * @param brand       筛选条件
//     * @param pageRequest 分页对象
//     * @return 查询结果
//     */
//    Page<Brand> queryByPage(Brand brand, PageRequest pageRequest);
    
    List<Brand> queryAllByPage(int page, int pageSize);
//
//    PageInfo<Brand> queryByPage(Brand brand, Integer page, Integer pageSize);
//
    
    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    Brand queryById(Long brandId);
}
