package com.campus.order.service;

import com.campus.order.domain.Product;
import com.campus.order.domain.ProductExample;

import java.util.List;

public interface ProductService {
    /*查询所有*/
    List<Product> selectAll();

    Product selectByPrimaryKey(Long pId);

    List<Product> selectByExample(ProductExample example);

    List<Product> selectByExample2(ProductExample example);

    /*根据mid查询所有*/
    List<Product> selectBymid(Long mid);
}
