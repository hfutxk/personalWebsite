package com.cetc38.mapper;

import com.cetc38.model.ReleaseFeature;
import com.cetc38.model.ReleaseFeatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReleaseFeatureMapper {
    int countByExample(ReleaseFeatureExample example);

    int deleteByExample(ReleaseFeatureExample example);

    int deleteByPrimaryKey(Integer releaseId);

    int insert(ReleaseFeature record);

    int insertSelective(ReleaseFeature record);

    List<ReleaseFeature> selectByExampleWithBLOBs(ReleaseFeatureExample example);

    List<ReleaseFeature> selectByExample(ReleaseFeatureExample example);

    ReleaseFeature selectByPrimaryKey(Integer releaseId);
    
    ReleaseFeature queryLatestReleaseFeature();

    int updateByExampleSelective(@Param("record") ReleaseFeature record, @Param("example") ReleaseFeatureExample example);

    int updateByExampleWithBLOBs(@Param("record") ReleaseFeature record, @Param("example") ReleaseFeatureExample example);

    int updateByExample(@Param("record") ReleaseFeature record, @Param("example") ReleaseFeatureExample example);

    int updateByPrimaryKeySelective(ReleaseFeature record);

    int updateByPrimaryKeyWithBLOBs(ReleaseFeature record);

    int updateByPrimaryKey(ReleaseFeature record);
}