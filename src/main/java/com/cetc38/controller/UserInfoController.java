package com.cetc38.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetc38.model.UserInfo;
import com.cetc38.service.UserInfoService;

@Controller
public class UserInfoController {

	@Resource
	private UserInfoService userInfoService ;
	@RequestMapping("/insert")
	public void insertUser(){
		UserInfo userInfo = new UserInfo();
		userInfo.setUserPassword("dgngsdgsdg");
		userInfo.setUserName("wjl");
		userInfo.setUserAddress("Beijingchaoyang");
		userInfo.setUserNickName("guominshit");
		userInfo.setUserAge(34);
		userInfo.setUserEmail("hfuxfjg@126.com");
		userInfoService.insertUserInfo(userInfo);
	}
	
}
