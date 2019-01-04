package com.cetc38.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cetc38.model.FileDownload;
import com.cetc38.service.FileDownLoadService;

@Controller
public class DownLoadController {

	@Resource
	private FileDownLoadService fileDownLoadService;
	
	@RequestMapping("/file/queryTotalNum")
	@ResponseBody
	public int queryTotalNum(){
		
		int cnt = this.fileDownLoadService.queryFileTotalCount();
		
		return cnt ;
	}
	
	@RequestMapping("/file/queryOnePage")
	@ResponseBody
	public List<FileDownload> queryOnePage(Integer pageSize,Integer pageNo){
		
		List<FileDownload> list = this.fileDownLoadService.queryFileDownlaodPerPage(pageSize, pageNo);
		
		return list ;
	}
	
	@RequestMapping("/file/download")
	@ResponseBody
	public String downloadFile(String fileUrl){
		
		
		return "" ;
	}
	
}
