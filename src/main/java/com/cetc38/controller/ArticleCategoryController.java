package com.cetc38.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cetc38.model.ArticleCategoryVO;
import com.cetc38.service.ArticleCategoryService;

@Controller
public class ArticleCategoryController {

	@Resource
	private ArticleCategoryService articleCategoryService ;
	
	@RequestMapping(value="/queryCategory",method=RequestMethod.POST)
	@ResponseBody
	public List<ArticleCategoryVO> queryCategory(String classfication){
		System.out.println("hello jinlia l ");
		List<ArticleCategoryVO> list = null;
		if(classfication.equals("blog")){
			
			list = this.articleCategoryService.queryBlogCategoryAndNum();
		}else{
			list = this.articleCategoryService.queryCodeCategoryAndNum();
		}
		return list ;
	}
}
