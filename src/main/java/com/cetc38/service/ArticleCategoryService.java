package com.cetc38.service;

import java.util.List;

import com.cetc38.model.ArticleCategory;
import com.cetc38.model.ArticleCategoryVO;


public interface ArticleCategoryService {

	 /**
	 * 插入新的分类
	 * @param aVo
	 * @return
	 */
	public int insertCategory(ArticleCategory aVo);
	
	/**
	 * 查询当前最大id
	 * @return
	 */
	public int queryMaxId();
	
	/**
	 * 根据文章类别查询分类和相应的数量
	 * @param classification
	 * @return
	 */
	public List<ArticleCategoryVO> queryBlogCategoryAndNum();
	
	
	/**
	 * 根据文章类别查询分类和相应的数量
	 * @param classification
	 * @return
	 */
	public List<ArticleCategoryVO> queryCodeCategoryAndNum();
	/**
	 * 查询所有分类
	 * @return
	 */
	public List<ArticleCategory> queryAllCategory();
}
