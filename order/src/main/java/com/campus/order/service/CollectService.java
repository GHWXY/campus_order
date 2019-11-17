package com.campus.order.service;

import com.campus.order.domain.Collect;
import com.campus.order.domain.CollectExample;

import java.util.List;

public interface CollectService {

    /*收藏*/
    int insertSelective(Collect record);

    /*查询收藏*/
    List<Collect> selectByExample(CollectExample example);

    /*删除收藏*/
    int deleteByExample(CollectExample example);
}
