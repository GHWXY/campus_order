package com.campus.order.service.impl;

import com.campus.order.domain.Product;
import com.campus.order.domain.ProductExample;
import com.campus.order.mapper.ProductMapper;
import com.campus.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> selectAll() {
        List<Product> products = productMapper.selectAll();
        return products;
    }

    @Override
    public Product selectByPrimaryKey(Long pId) {

        return productMapper.selectByPrimaryKey(pId);
    }

    @Override
    public List<Product> selectByExample(ProductExample example) {
        List<Product> products = productMapper.selectByExample(example);
        return products;
    }

    @Override
    public List<Product> selectByExample2(ProductExample example) {
        List<Product> products = productMapper.selectByExample2(example);
        return products;
    }

    /*根据mid查询所有*/
    @Override
    public List<Product> selectBymid(Long mid) {
        return productMapper.selectBymid(mid);
    }
}
