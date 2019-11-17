package com.campus.order.service;

import com.campus.order.domain.Address;

import java.util.List;

public interface AddressService {
    /*增加地址*/
    int insert(Address address);

    List<Address> selectAll(Integer uid);

    /*修改地址*/
    int updateByPrimaryKey(Address record);
}
