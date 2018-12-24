package com.cetc38.service;

import com.cetc38.model.ImageUpload;

public interface ImageUploadService {

	/**
	 * 插入新纪录到图片数据库
	 * @param iVo
	 * @return
	 */
	public int insertImageUpload(ImageUpload iVo);
}
