package com.campus.order.mapper;

import com.campus.order.domain.Product;
import com.campus.order.domain.ProductExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Long pId);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    List<Product> selectByExample2(ProductExample example);

    Product selectByPrimaryKey(Long pId);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    /*查询所有*/
    List<Product> selectAll();

    /*根据mid查询所有*/
    List<Product> selectBymid(Long mid);
}