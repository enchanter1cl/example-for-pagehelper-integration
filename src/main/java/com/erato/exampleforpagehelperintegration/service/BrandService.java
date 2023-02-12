package com.erato.exampleforpagehelperintegration.service;

import com.erato.exampleforpagehelperintegration.entity.Brand;
import com.erato.exampleforpagehelperintegration.vo.BrandsPageResp;
import com.erato.exampleforpagehelperintegration.vo.RequiredBrandPageResp;
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
    
    /**
     * Query all the items, then page them.
     * @param page current page
     * @param pageSize number of items per page
     * @return brandPageResp
     */
    BrandsPageResp queryAllByPage(int page, int pageSize);
    
    /**
     * Query some items with uncertain conditions, then page them
     *
     * @param brand  pojo who carrying conditions
     * @param page default 1
     * @param pageSize default 5
     * @return requiredBrandPageResp
     */
    RequiredBrandPageResp queryByPage(Brand brand, int page, int pageSize);

    
    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    Brand queryById(Long brandId);
}
