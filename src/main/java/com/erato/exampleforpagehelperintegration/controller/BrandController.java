package com.erato.exampleforpagehelperintegration.controller;

import com.erato.exampleforpagehelperintegration.entity.Brand;
import com.erato.exampleforpagehelperintegration.service.BrandService;
import com.erato.exampleforpagehelperintegration.vo.BrandsPageResp;
import com.erato.exampleforpagehelperintegration.vo.MyRespEnt;
import com.erato.exampleforpagehelperintegration.vo.RequiredBrandPageResp;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 品牌(Brand)表控制层
 *
 * @author zhangyuan
 * @since 2021-02-10 16:42:10
 */
@RestController
@RequestMapping("example-for-pagehelper/brand")
public class BrandController {
    @Resource
    private BrandService brandService;
    
    /**
     * Query All the items, then page them
     *
     * @param page default 1
     * @param pageSize default 5
     * @return brand list
     */
    @GetMapping
    public MyRespEnt<BrandsPageResp> queryAllByPage(
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "page-size", required = false, defaultValue = "5") int pageSize) {
        BrandsPageResp brandPageResp = brandService.queryAllByPage(page, pageSize);
        MyRespEnt result = MyRespEnt.ok().setData(brandPageResp);
        return result;
    }
    
    /**
     * Query some items with uncertain conditions, then page them
     *
     * @param name condition
     * @param firstLetter condition
     * @param sort condition
     * @param page default 1
     * @param pageSize default 5
     * @return requiredBrandPageResp
     */
    public MyRespEnt<RequiredBrandPageResp> queryByPage(
            @RequestParam String name,
            @RequestParam String firstLetter,
            @RequestParam Integer sort,
            @RequestParam(value = "page", required = false, defaultValue = "1") int page,
            @RequestParam(value = "page-size", required = false, defaultValue = "5") int pageSize
    ) {
        Brand brand = new Brand();
        brand.setName(name);
        brand.setFirstLetter(firstLetter);
        brand.setSort(sort);
        RequiredBrandPageResp brandPageResp = brandService.queryByPage(brand, page, pageSize);
        MyRespEnt myRespEnt = MyRespEnt.ok().setData(brandPageResp);
        return myRespEnt;
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Brand> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(this.brandService.queryById(id));
    }
}

