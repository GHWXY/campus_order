package com.campus.order.service.impl;

import com.campus.order.domain.Address;
import com.campus.order.mapper.AddressMapper;
import com.campus.order.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public int insert(Address address) {
        int i = addressMapper.insert(address);
        return i;
    }

    @Override
    public List<Address> selectAll(Integer uid) {

        return addressMapper.selectAll(uid);

    }

    @Override
    public int updateByPrimaryKey(Address record) {
        int i = addressMapper.updateByPrimaryKey(record);
        return i;
    }
}
