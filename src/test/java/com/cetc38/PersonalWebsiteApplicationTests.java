package com.cetc38;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cetc38.model.UserInfo;
import com.cetc38.service.BlogDetailsService;
import com.cetc38.service.UserInfoService;
import com.cetc38.service.impl.UserInfoServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PersonalWebsiteApplicationTests {
//	@Resource
//	private UserInfoService userInfoService;

	@Resource
	private BlogDetailsService blogDetailsService;
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testService(){
//		UserInfoService userService = new UserInfoServiceImpl();
		UserInfo userInfo = new UserInfo();
		userInfo.setUserPassword("helloworld");
		userInfo.setUserName("ninig");
		userInfo.setUserAddress("Beijingchaoyang");
		userInfo.setUserNickName("guominshit");
		userInfo.setUserAge(34);
		userInfo.setUserEmail("adhahf@qq.com");
//		userInfo.setUserId(12);
//		userInfoService.updateUserEmailByName(userInfo);
	}
	
	@Test
	public void testCount(){
		this.blogDetailsService.updateBlogReadById(1);
	}

}

