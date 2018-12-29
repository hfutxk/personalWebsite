package com.cetc38.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cetc38.common.CommonResult;
import com.cetc38.model.MessageArea;
import com.cetc38.service.MessageAreaService;

@Controller
public class MessageAreaController {

	@Resource
	private MessageAreaService messageAreaService ;
	
	@RequestMapping("/queryMessage")
	@ResponseBody
	public List<MessageArea> getMessage(Integer messageId){
		List<MessageArea> list = this.messageAreaService.queryAllMessageArea(messageId);
		return list ;
		
	}
	
	@RequestMapping("/createMessage")
	@ResponseBody
	public CommonResult createMessage(MessageArea newMessage){
		if(newMessage == null)
			System.out.println("jinlai le ");
			
		System.out.println(newMessage.getMessageContent()+"  "+newMessage.getMessageParent());
		int res = this.messageAreaService.insertMessageNew(newMessage);
		CommonResult common = new CommonResult();
		common.setResult(1);
		return common ;
		
	}

}
