package com.cetc38.controller;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cetc38.common.CommonResult;
import com.cetc38.common.SendEmailHelper;

@Controller
public class ContactController {

	
	@PostMapping("/contact")
	@ResponseBody
	public int contact(String contactName,String contactEmail,String contactPhone,String contactContent){
		SendEmailHelper sendEmail = new SendEmailHelper();
		int result = sendEmail.sendEmail2Admin(contactName, contactEmail, contactPhone, contactContent);
		return result ;
	}
	
}
