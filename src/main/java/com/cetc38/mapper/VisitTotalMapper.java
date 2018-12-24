package com.cetc38.mapper;

import com.cetc38.model.VisitTotal;
import com.cetc38.model.VisitTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitTotalMapper {
    int countByExample(VisitTotalExample example);

    int deleteByExample(VisitTotalExample example);

    int deleteByPrimaryKey(Integer visitId);

    int insert(VisitTotal record);

    int insertSelective(VisitTotal record);

    List<VisitTotal> selectByExample(VisitTotalExample example);

    VisitTotal selectByPrimaryKey(Integer visitId);

    int updateByExampleSelective(@Param("record") VisitTotal record, @Param("example") VisitTotalExample example);

    int updateByExample(@Param("record") VisitTotal record, @Param("example") VisitTotalExample example);

    int updateByPrimaryKeySelective(VisitTotal record);

    int updateByPrimaryKey(VisitTotal record);
}