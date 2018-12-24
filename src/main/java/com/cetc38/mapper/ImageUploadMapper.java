package com.cetc38.mapper;

import com.cetc38.model.ImageUpload;
import com.cetc38.model.ImageUploadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImageUploadMapper {
    int countByExample(ImageUploadExample example);

    int deleteByExample(ImageUploadExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(ImageUpload record);

    int insertSelective(ImageUpload record);

    List<ImageUpload> selectByExample(ImageUploadExample example);

    ImageUpload selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") ImageUpload record, @Param("example") ImageUploadExample example);

    int updateByExample(@Param("record") ImageUpload record, @Param("example") ImageUploadExample example);

    int updateByPrimaryKeySelective(ImageUpload record);

    int updateByPrimaryKey(ImageUpload record);
}