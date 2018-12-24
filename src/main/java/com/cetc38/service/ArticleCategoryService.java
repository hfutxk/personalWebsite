package com.cetc38.service;

import java.util.ArrayList;

import com.cetc38.model.ArticleCategory;


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
	public ArrayList<ArticleCategory> queryCategory3Num(String classification);
	
	/**
	 * 查询所有分类
	 * @return
	 */
	public ArrayList<ArticleCategory> queryAllCategory();
}
