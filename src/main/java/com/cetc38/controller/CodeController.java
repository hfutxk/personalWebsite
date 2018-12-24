package com.cetc38.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cetc38.model.CodeLibrary;
import com.cetc38.model.CodeLibraryWithBLOBs;
import com.cetc38.service.CodeLibraryService;

@Controller
public class CodeController {
	
	@Resource
	private CodeLibraryService codeLibraryService;
	
	
	@RequestMapping(value="/code/queryTotalNum",method=RequestMethod.POST)
	@ResponseBody
	public int queryTotalNum(String keywords,String category){
//		System.out.println("hello world");
//		System.out.println("keywords:"+keywords+"      "+"category:"+category);
		CodeLibrary cVo = new CodeLibrary();
		cVo.setCodeTitle(keywords);
		if(category!=null&&!category.trim().equals("")){
			cVo.setCodeCategory(Integer.parseInt(category));
		}
		int cnt = this.codeLibraryService.queryCodeTotalCount(cVo) ;
//		CommonResult res = new CommonResult();
//		res.setTotalNum(cnt);
		return cnt;
	}
	
	@RequestMapping(value="/code/queryOnePage",method=RequestMethod.POST)
	@ResponseBody
	public List<CodeLibraryWithBLOBs> queryOnePage(String keywords,String category,Integer pageSize,Integer pageNo){
//		System.out.println("jinlai le");
		CodeLibrary bVo = new CodeLibrary();
		bVo.setCodeTitle(keywords);
		if(category!=null&&!category.trim().equals("")){
			bVo.setCodeCategory(Integer.parseInt(category));
		}
		List<CodeLibraryWithBLOBs> list = this.codeLibraryService.queryCodeLibraryPerPage(bVo, pageSize, pageNo);
		return list;
	}

}
