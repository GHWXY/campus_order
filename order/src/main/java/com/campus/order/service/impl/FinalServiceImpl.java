package com.campus.order.service.impl;

import com.campus.order.domain.Final;
import com.campus.order.domain.FinalExample;
import com.campus.order.mapper.FinalMapper;
import com.campus.order.service.FinalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinalServiceImpl implements FinalService {
    @Autowired
    private FinalMapper finalMapper;
    @Override
    public int insertSelective(Final record) {
        return finalMapper.insertSelective(record);
    }

    @Override
    public List<Final> selectByExample(FinalExample example) {
        return finalMapper.selectByExample(example);
    }
}
