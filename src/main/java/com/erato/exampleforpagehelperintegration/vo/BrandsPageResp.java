package com.erato.exampleforpagehelperintegration.vo;

import com.erato.exampleforpagehelperintegration.entity.Brand;
import lombok.Data;

import java.util.List;

/**
 * @author ZhangYuan
 * @date 2023/2/12
 */

@Data
public class BrandsPageResp {
    
    Long total;
    
    List<Brand> brands;
}
