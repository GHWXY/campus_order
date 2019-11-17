package com.campus.order.service.impl;

import com.campus.order.domain.Collect;
import com.campus.order.domain.CollectExample;
import com.campus.order.mapper.CollectMapper;
import com.campus.order.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    private CollectMapper collectMapper;

    @Override
    public int insertSelective(Collect record) {
        return collectMapper.insertSelective(record);
    }

    @Override
    public List<Collect> selectByExample(CollectExample example) {
        return collectMapper.selectByExample(example);
    }

    @Override
    public int deleteByExample(CollectExample example) {
        return collectMapper.deleteByExample(example);
    }
}
