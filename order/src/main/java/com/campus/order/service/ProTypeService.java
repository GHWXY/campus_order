package com.campus.order.service;

import com.campus.order.domain.ProductType;
import com.campus.order.domain.ProductTypeExample;

import java.util.List;

public interface ProTypeService {
    /*查询产品分类*/
    List<ProductType> selectByExample(ProductTypeExample example);
}
