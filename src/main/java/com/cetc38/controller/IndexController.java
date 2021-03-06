package com.cetc38.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cetc38.model.ReleaseFeature;
import com.cetc38.service.ReleaseFeatureService;

@Controller
public class IndexController {
	
	@Resource
	private ReleaseFeatureService  releaseFeatureService;
	@RequestMapping("/index")
	public String index(){
	
		return "index" ;
	}
	
	@RequestMapping("/login")
	public String login(){
	
		return "/module/login" ;
	}
	
	@RequestMapping("/register")
	public String register(){
	
		return "/module/register" ;
	}
	
	
	
	@RequestMapping(value="/latestRlseFetr",method=RequestMethod.POST)
	@ResponseBody
	public ReleaseFeature latestRlseFetr(){
		
//		System.out.println("hello world");
		ReleaseFeature releaseFeature = this.releaseFeatureService.queryLatestReleaseFeature();
		
		return releaseFeature;
	}
	
	@RequestMapping(value="/module/blog")
	public String moreblog(){
		return "/topic/blog/blog";
	}
	
	@RequestMapping(value="/module/code")
	public String morecode(){
		return "/topic/code/code";
	}
	
	@RequestMapping(value="/module/message")
	public String moremessage(){
		return "/topic/message/message";
	}
	
	@RequestMapping(value="/module/contact")
	public String getContact(){
		
		return "/topic/contact/contact";
	}
	
	@RequestMapping(value="/module/download")
	public String getDownload(){
		
		return "/topic/download/download";
	}
	
	

}
