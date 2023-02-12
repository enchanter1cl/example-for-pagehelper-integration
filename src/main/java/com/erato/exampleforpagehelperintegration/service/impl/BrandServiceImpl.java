package com.erato.exampleforpagehelperintegration.service.impl;

import com.erato.exampleforpagehelperintegration.entity.Brand;
import com.erato.exampleforpagehelperintegration.dao.BrandDao;
import com.erato.exampleforpagehelperintegration.service.BrandService;
import com.erato.exampleforpagehelperintegration.vo.BrandsPageResp;
import com.erato.exampleforpagehelperintegration.vo.RequiredBrandPageResp;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌(Brand)表服务实现类
 *
 * @author zhangyuan
 * @since 2021-02-10 16:42:16
 */
@Service("brandService")
public class BrandServiceImpl implements BrandService {
    @Resource
    private BrandDao brandDao;
    
    @Override
    public BrandsPageResp queryAllByPage(int page, int pageSize) {
        Page<Object> startPage = PageHelper.startPage(page, pageSize);
        List<Brand> brands = brandDao.selectAll();
    
        BrandsPageResp brandsPageResp = new BrandsPageResp();
        brandsPageResp.setTotal(((Page) brands).getTotal());
        brandsPageResp.setBrands(brands);
    
        return brandsPageResp;
    }
    
    @Override
    public RequiredBrandPageResp queryByPage(Brand brand, int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        List<Brand> brands = brandDao.selectRequired(brand);
    
        RequiredBrandPageResp requiredBrandPageResp = new RequiredBrandPageResp();
        requiredBrandPageResp.setTotal(((Page) brands).getTotal());
        requiredBrandPageResp.setBrands(brands);
        
        return requiredBrandPageResp;
    }
    
    
//    /**
//     * Implement paging by PageHelper
//     * @param brand queryCondition
//     * @param pageNum current page num
//     * @param pageSize items per page
//     * @return pageInfo
//     */
//    public PageInfo<Brand> queryByPage(Brand brand, Integer pageNum, Integer pageSize) {
//        //1.Start to page, pageNum is current page, pageSize is the number of item on each page.
//        PageHelper.startPage(pageNum, pageSize);
//        //2.Query conditional, without paging
//        List<Brand> brands = brandDao.queryAllByLimit(brand);
//        //3.Stuff all things you query into PageInfo
//        PageInfo<Brand> pageInfo = new PageInfo<>(brands);
//        //4.Return pageInfo
//        return pageInfo;
//    }
    
    /**
     * 通过ID查询单条数据
     *
     * @param brandId 主键
     * @return 实例对象
     */
    @Override
    public Brand queryById(Long brandId) {
        return this.brandDao.queryById(brandId);
    }
}
