package com.cetc38.mapper;

import com.cetc38.model.FileDownload;
import com.cetc38.model.FileDownloadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileDownloadMapper {
    int countByExample(FileDownloadExample example);

    int deleteByExample(FileDownloadExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(FileDownload record);

    int insertSelective(FileDownload record);

    List<FileDownload> selectByExample(FileDownloadExample example);

    FileDownload selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") FileDownload record, @Param("example") FileDownloadExample example);

    int updateByExample(@Param("record") FileDownload record, @Param("example") FileDownloadExample example);

    int updateByPrimaryKeySelective(FileDownload record);

    int updateByPrimaryKey(FileDownload record);
    
    int updateFileDownCountByUrl(String fileUrl);
}