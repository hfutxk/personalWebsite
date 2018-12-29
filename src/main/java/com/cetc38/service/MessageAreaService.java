package com.cetc38.service;

import java.util.List;

import com.cetc38.model.MessageArea;


public interface MessageAreaService {

	/**
	 * 查询留言区所有留言
	 * 
	 * @param messageId
	 * @return
	 */
	public List<MessageArea> queryAllMessageArea(int messageId);
	
	/**
	 * 插入新的留言
	 * @param mVo
	 * @return
	 */
	public int insertMessageNew(MessageArea mVo);
}
