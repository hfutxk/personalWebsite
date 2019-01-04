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
		System.out.println("jinglai e ma ");
		SendEmailHelper sendEmail = new SendEmailHelper();
		System.out.println(contactName+" "+ contactEmail+"  "+contactPhone+"   "+contactContent);
		int result = sendEmail.sendEmail2Admin(contactName, contactEmail, contactPhone, contactContent);
		System.out.println(result);
		return result ;
	}
	
}
