package com.cetc38.mapper;

import com.cetc38.model.BlogDetails;
import com.cetc38.model.BlogDetailsExample;
import com.cetc38.model.BlogDetailsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogDetailsMapper {
    int countByExample(BlogDetailsExample example);

    int deleteByExample(BlogDetailsExample example);

    int deleteByPrimaryKey(Integer blogId);

    int insert(BlogDetailsWithBLOBs record);

    int insertSelective(BlogDetailsWithBLOBs record);

    List<BlogDetailsWithBLOBs> selectByExampleWithBLOBs(BlogDetailsExample example);

    List<BlogDetails> selectByExample(BlogDetailsExample example);

    BlogDetailsWithBLOBs selectByPrimaryKey(Integer blogId);
    
    BlogDetailsWithBLOBs queryPreviousBlog(Integer blogId);
    
    BlogDetailsWithBLOBs queryNextBlog(Integer blogId);
    
    List<BlogDetailsWithBLOBs> queryAllBlogDetailss();

    int updateByExampleSelective(@Param("record") BlogDetailsWithBLOBs record, @Param("example") BlogDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") BlogDetailsWithBLOBs record, @Param("example") BlogDetailsExample example);

    int updateByExample(@Param("record") BlogDetails record, @Param("example") BlogDetailsExample example);

    int updateByPrimaryKeySelective(BlogDetailsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BlogDetailsWithBLOBs record);

    int updateByPrimaryKey(BlogDetails record);
    
    int updateBlogReadById(int blogId);
    
    int logicDeleteBlogById(int blogId);
}