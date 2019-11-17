package com.campus.order.mapper;

import com.campus.order.domain.Address;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AddressMapper {
    int deleteByPrimaryKey(Long aid);

    int insert(Address record);

    Address selectByPrimaryKey(Long aid);

    List<Address> selectAll(Integer uid);

    int updateByPrimaryKey(Address record);

    /*修改地址*/
    Address selectAllByUid(Integer uid);
}