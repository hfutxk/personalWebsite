package com.cetc38.mapper;

import com.cetc38.model.MessageArea;
import com.cetc38.model.MessageAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageAreaMapper {
    int countByExample(MessageAreaExample example);

    int deleteByExample(MessageAreaExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(MessageArea record);

    int insertSelective(MessageArea record);

    List<MessageArea> selectByExampleWithBLOBs(MessageAreaExample example);

    List<MessageArea> selectByExample(MessageAreaExample example);

    MessageArea selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") MessageArea record, @Param("example") MessageAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") MessageArea record, @Param("example") MessageAreaExample example);

    int updateByExample(@Param("record") MessageArea record, @Param("example") MessageAreaExample example);

    int updateByPrimaryKeySelective(MessageArea record);

    int updateByPrimaryKeyWithBLOBs(MessageArea record);

    int updateByPrimaryKey(MessageArea record);
}