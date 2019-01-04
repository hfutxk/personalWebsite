package com.cetc38.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cetc38.mapper.ArticleCategoryMapper;
import com.cetc38.model.ArticleCategory;
import com.cetc38.model.ArticleCategoryExample;
import com.cetc38.model.ArticleCategoryVO;
import com.cetc38.model.BlogDetails;
import com.cetc38.model.CodeLibrary;
import com.cetc38.service.ArticleCategoryService;
import com.cetc38.service.BlogDetailsService;
import com.cetc38.service.CodeLibraryService;

@Service
public class ArticleCategoryServiceImpl implements ArticleCategoryService {

	@Resource
	private ArticleCategoryMapper articleCategoryMapper ;
	
	@Resource
	private BlogDetailsService blogDetailsService;
	
	@Resource
	private CodeLibraryService codeLibraryService;
	@Override
	public int insertCategory(ArticleCategory aVo) {
		
		return this.articleCategoryMapper.insert(aVo);
	}

	@Override
	public int queryMaxId() {
		
		return this.articleCategoryMapper.queryMaxId();
	}

	@Override
	public List<ArticleCategoryVO> queryBlogCategoryAndNum() {
		
		List<ArticleCategoryVO> aVos = this.articleCategoryMapper.queryBlogCategoryAndNum();
		BlogDetails bVo = new BlogDetails();
		bVo.setBlogCategory(-1);
		int totalNum = blogDetailsService.queryBlogTotalCount(bVo);
		if (aVos.get(0).getCategoryId() == 0) {
			aVos.get(0).setCategoryNum(totalNum);
		} else {
			ArticleCategoryVO aVo = new ArticleCategoryVO();
			aVo.setCategoryId(0);
			aVo.setCategoryName("所有文章");
			aVo.setCategoryNum(totalNum);

			aVos.add(0, aVo);
		}
		return aVos;
	}

	@Override
	public List<ArticleCategoryVO> queryCodeCategoryAndNum() {
		
		List<ArticleCategoryVO> aVos = this.articleCategoryMapper.queryCodeCategoryAndNum();
		CodeLibrary cl = new CodeLibrary();
		cl.setCodeCategory(-1);
		int totalNum = this.codeLibraryService.queryCodeTotalCount(cl) ;
		if (aVos.get(0).getCategoryId() == 0) {
			aVos.get(0).setCategoryNum(totalNum);
		} else {
			ArticleCategoryVO aVo = new ArticleCategoryVO();
			aVo.setCategoryId(0);
			aVo.setCategoryName("所有文章");
			aVo.setCategoryNum(totalNum);

			aVos.add(0, aVo);
		}
		return aVos;
	}
	
	@Override
	public List<ArticleCategory> queryAllCategory() {
		ArticleCategoryExample example = new ArticleCategoryExample();
		List<ArticleCategory> list = this.articleCategoryMapper.selectByExample(example);
		return list;
	}

}
