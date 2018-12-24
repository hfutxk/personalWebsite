package com.cetc38.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cetc38.constant.DbConstants;
import com.cetc38.mapper.BlogDetailsMapper;
import com.cetc38.model.BlogDetails;
import com.cetc38.model.BlogDetailsExample;
import com.cetc38.model.BlogDetailsExample.Criteria;
import com.cetc38.model.BlogDetailsWithBLOBs;
import com.cetc38.service.BlogDetailsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BlogDetailsServiceImpl implements BlogDetailsService{

	@Resource
	private BlogDetailsMapper blogDetailMapper ;
	@Override
	public List<BlogDetailsWithBLOBs> queryAllBlogDetailss() {
	    
		return  this.blogDetailMapper.queryAllBlogDetailss();
		
	}

	@Override
	public int queryBlogTotalCount(BlogDetails bVo) {
	
		BlogDetailsExample example = new BlogDetailsExample();
		Criteria criteria = example.createCriteria();
		criteria.andBlogDeleteEqualTo(DbConstants.FIELD_VALID_FLAG);
		if(bVo.getBlogTitle() != null && !bVo.getBlogTitle().trim().equals("")){
			criteria.andBlogTitleLike(bVo.getBlogTitle());
		}
		if(bVo.getBlogCategory() != null  && bVo.getBlogCategory() != -1){
			criteria.andBlogCategoryEqualTo(bVo.getBlogCategory());
		}
	
		int cnt = this.blogDetailMapper .countByExample(example);
	
		return cnt;
	}

	@Override
	public List<BlogDetailsWithBLOBs> queryBlogDetailsPerPage(BlogDetails bVo, int pageSize, int pageNo) {
	    PageHelper.startPage(pageNo, pageSize);
	    BlogDetailsExample example = new BlogDetailsExample();
	    Criteria criteria = example.createCriteria();
	    criteria.andBlogDeleteEqualTo(0);
	    if(bVo.getBlogTitle() != null && !bVo.getBlogTitle().trim().equals("")){
	    	criteria.andBlogTitleLike(bVo.getBlogTitle());
	    }
	    if(bVo.getBlogCategory() != null && bVo.getBlogCategory()!=-1){
	    	
	    	criteria.andBlogCategoryEqualTo(bVo.getBlogCategory());
	    }
	    List<BlogDetailsWithBLOBs> list = this.blogDetailMapper.selectByExampleWithBLOBs(example);
//		PageInfo<BlogDetailsWithBLOBs> pageInfo = new PageInfo<>(list);
		return list;
	}

	@Override
	public BlogDetailsWithBLOBs queryPerBlogById(int blogId) {
		
		return this.blogDetailMapper.selectByPrimaryKey(blogId);
	}

	@Override
	public int insertBlogDetails(BlogDetailsWithBLOBs bVo) {
		
		return this.blogDetailMapper.insert(bVo);
	}

	@Override
	public int updateBlogReadById(int blogId) {
		
		return this.blogDetailMapper.updateBlogReadById(blogId);
	}

	@Override
	public int updateBlogById(BlogDetailsWithBLOBs bVo) {
		
		return this.blogDetailMapper.updateByPrimaryKeyWithBLOBs(bVo);
		
	}

	@Override
	public int logicDeleteBlogById(int blogId) {
		
		return this.blogDetailMapper .logicDeleteBlogById(blogId);
		
	}

	@Override
	public BlogDetailsWithBLOBs queryPreviousBlog(int blogId) {
		
		return this.blogDetailMapper.queryPreviousBlog(blogId);
	}

	@Override
	public BlogDetailsWithBLOBs queryNextBlog(int blogId) {
		
		return this.blogDetailMapper.queryNextBlog(blogId);
	}

	
}
