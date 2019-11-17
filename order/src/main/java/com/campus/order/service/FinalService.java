package com.campus.order.service;

import com.campus.order.domain.Final;
import com.campus.order.domain.FinalExample;

import java.util.List;

public interface FinalService {
    /*提交订单*/
    int insertSelective(Final record);

    List<Final> selectByExample(FinalExample example);
}
