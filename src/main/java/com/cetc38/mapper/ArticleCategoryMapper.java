package com.cetc38.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cetc38.model.ArticleCategory;
import com.cetc38.model.ArticleCategoryExample;
import com.cetc38.model.ArticleCategoryVO;

public interface ArticleCategoryMapper {
    int countByExample(ArticleCategoryExample example);

    int deleteByExample(ArticleCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(ArticleCategory record);

    int insertSelective(ArticleCategory record);

    List<ArticleCategory> selectByExample(ArticleCategoryExample example);

    ArticleCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") ArticleCategory record, @Param("example") ArticleCategoryExample example);

    int updateByExample(@Param("record") ArticleCategory record, @Param("example") ArticleCategoryExample example);

    int updateByPrimaryKeySelective(ArticleCategory record);

    int updateByPrimaryKey(ArticleCategory record);
    
    int queryMaxId();
    
    List<ArticleCategoryVO> queryBlogCategoryAndNum();
    
    List<ArticleCategoryVO> queryCodeCategoryAndNum();
}