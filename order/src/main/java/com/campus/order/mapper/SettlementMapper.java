package com.campus.order.mapper;

import com.campus.order.domain.Settlement;
import com.campus.order.domain.SettlementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettlementMapper {
    int countByExample(SettlementExample example);

    int deleteByExample(SettlementExample example);

    int deleteByPrimaryKey(Long sId);

    int insert(Settlement record);

    int insertSelective(Settlement record);

    List<Settlement> selectByExample(SettlementExample example);

    Settlement selectByPrimaryKey(Long sId);

    int updateByExampleSelective(@Param("record") Settlement record, @Param("example") SettlementExample example);

    int updateByExample(@Param("record") Settlement record, @Param("example") SettlementExample example);

    int updateByPrimaryKeySelective(Settlement record);

    int updateByPrimaryKey(Settlement record);
}