package com.erato.exampleforpagehelperintegration.dao;

import com.erato.exampleforpagehelperintegration.entity.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 品牌(Brand)表数据库访问层
 *
 * @author zhangyuan
 * @since 2021-02-10 16:42:13
 */
@Mapper
public interface BrandDao {
    
    List<Brand> selectAll();
    
    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    Brand queryById(Long brandId);
    
    /**
     * 新增数据
     *
     * @param brand 实例对象
     * @return 影响行数
     */
    int insert(Brand brand);
    
    /**
     * 修改数据
     *
     * @param brand 实例对象
     * @return 影响行数
     */
    int update(Brand brand);
    
    /**
     * 通过主键删除数据
     *
     * @param brandId 主键
     * @return 影响行数
     */
    int deleteById(Long brandId);
    
}

