package com.cetc38.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cetc38.common.JsonUtils;
import com.cetc38.model.BlogDetails;
import com.cetc38.model.BlogDetailsWithBLOBs;
import com.cetc38.service.BlogDetailsService;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.minidev.json.JSONObject;

@Controller
public class BlogController {

	@Resource
	private BlogDetailsService blogDetailsService;
	
	@RequestMapping(value="/blog/queryTotalNum",method=RequestMethod.POST)
	@ResponseBody
	public int queryTotalNum(String keywords,String category){
//		System.out.println("hello world");
//		System.out.println("keywords:"+keywords+"      "+"category:"+category);
		BlogDetails bVo = new BlogDetails();
		bVo.setBlogTitle(keywords);
		if(category!=null&&!category.trim().equals("")){
			bVo.setBlogCategory(Integer.parseInt(category));
		}
		int cnt = this.blogDetailsService.queryBlogTotalCount(bVo) ;
//		CommonResult res = new CommonResult();
//		res.setTotalNum(cnt);
		return cnt;
	}
	
	@RequestMapping(value="/blog/queryOnePage",method=RequestMethod.POST)
	@ResponseBody
	public List<BlogDetailsWithBLOBs> queryOnePage(String keywords,String category,Integer pageSize,Integer pageNo){
//		System.out.println("jinlai le");
		BlogDetails bVo = new BlogDetails();
		bVo.setBlogTitle(keywords);
		if(category!=null&&!category.trim().equals("")){
			bVo.setBlogCategory(Integer.parseInt(category));
		}
		List<BlogDetailsWithBLOBs> list = this.blogDetailsService.queryBlogDetailsPerPage(bVo, pageSize, pageNo);
		return list;
	}
	@RequestMapping(value="/queryBlog")
	public String queryBlog(Integer blogId,Model model) {
		System.out.println("jinlai le ");
		System.out.println("blogId:++++++++++++====="+blogId);
		BlogDetailsWithBLOBs blog = (BlogDetailsWithBLOBs) this.blogDetailsService.queryPerBlogById(blogId);
		this.blogDetailsService.updateBlogReadById(blogId);
//		String json = JsonUtils.objectToJson(blog);
		model.addAttribute("blog", blog);
		return "/topic/blog/blog_template";
	}
	
}
