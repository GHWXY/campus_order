package com.campus.order.mapper;

import com.campus.order.domain.Final;
import com.campus.order.domain.FinalExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FinalMapper {
    int countByExample(FinalExample example);

    int deleteByExample(FinalExample example);

    int deleteByPrimaryKey(Long fId);

    int insert(Final record);

    int insertSelective(Final record);

    List<Final> selectByExample(FinalExample example);

    Final selectByPrimaryKey(Long fId);

    int updateByExampleSelective(@Param("record") Final record, @Param("example") FinalExample example);

    int updateByExample(@Param("record") Final record, @Param("example") FinalExample example);

    int updateByPrimaryKeySelective(Final record);

    int updateByPrimaryKey(Final record);
}