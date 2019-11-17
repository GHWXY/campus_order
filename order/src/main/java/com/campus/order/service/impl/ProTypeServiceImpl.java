package com.campus.order.service.impl;

import com.campus.order.domain.ProductType;
import com.campus.order.domain.ProductTypeExample;
import com.campus.order.mapper.ProductTypeMapper;
import com.campus.order.service.ProTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProTypeServiceImpl implements ProTypeService {
    @Autowired
    private ProductTypeMapper productTypeMapper;
    /*查询产品分类*/
    @Override
    public List<ProductType> selectByExample(ProductTypeExample example) {
        return productTypeMapper.selectByExample(example);
    }
}
