package com.cetc38.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cetc38.mapper.MessageAreaMapper;
import com.cetc38.model.MessageArea;
import com.cetc38.model.MessageAreaExample;
import com.cetc38.service.MessageAreaService;
@Service
public class MessageAreaServiceImpl implements MessageAreaService {

	@Resource
	private MessageAreaMapper messageAreaMapper ;
	
	@Override
	public List<MessageArea> queryAllMessageArea(int messageId) {
		MessageAreaExample example = new MessageAreaExample();
		this.messageAreaMapper.selectByExampleWithBLOBs(example);
		return this.messageAreaMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public int insertMessageNew(MessageArea mVo) {
		
		return this.messageAreaMapper.insert(mVo);
	}

}
