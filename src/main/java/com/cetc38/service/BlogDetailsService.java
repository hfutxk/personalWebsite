package com.cetc38.service;

import java.util.ArrayList;
import java.util.List;

import com.cetc38.model.BlogDetails;
import com.cetc38.model.BlogDetailsWithBLOBs;


public interface BlogDetailsService {

	/** 
	 * 查询博客文章
	 * 
	 * @return 博客文章数组
	 */
	public List<BlogDetailsWithBLOBs> queryAllBlogDetailss();
	
	/**
	 * 根据条件询博客数量
	 * @return
	 */
	public int queryBlogTotalCount(BlogDetails bVo);
	
	/**
	 * 按照页面大小和页码查询博客
	 * @param bVo
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */
	public List<BlogDetailsWithBLOBs> queryBlogDetailsPerPage(BlogDetails bVo, int pageSize, int pageNo);
	
	/** 
	 * 根据id查询单独的一篇博客
	 *  
	 * @param blogId
	 * @return 一篇博客
	 */
	public BlogDetailsWithBLOBs queryPerBlogById(int blogId);
	
	/** 
	 * 插入记录
	 *  
	 * @param bVo
	 * @return 返回插入结果
	 */
	public int insertBlogDetails(BlogDetailsWithBLOBs bVo);
	
	/**
	 * 根据id更新博客阅读次数
	 * @param blogId
	 * @return
	 */
	public int updateBlogReadById(int blogId);
	
	/**
	 * 根据id修改博客内容
	 * @param bVo
	 * @return
	 */
	public int updateBlogById(BlogDetailsWithBLOBs bVo);
	
	/**
	 * 根据id逻辑删除博客
	 * @param blogId
	 * @return
	 */
	public int logicDeleteBlogById(int blogId);
	
	/**
	 * 根据id查找上一篇有效博客
	 * @param blogId
	 * @return
	 */
	public BlogDetails queryPreviousBlog(int blogId);
	
	/**
	 * 根据id查找下一篇有效博客
	 * @param blogId
	 * @return
	 */
	public BlogDetails queryNextBlog(int blogId);
}
