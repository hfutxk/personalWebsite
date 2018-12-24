package com.cetc38.service;

import com.cetc38.model.ReleaseFeature;

public interface ReleaseFeatureService {

	/**
	 * 插入新的版本特性
	 * 
	 * @param ReleaseFeature
	 * @return
	 */
	public int insertReleaseFeature(ReleaseFeature ReleaseFeature);
	
	/**
	 * 查询最新的版本特性
	 * 
	 * @return
	 */
	public ReleaseFeature queryLatestReleaseFeature();
	
	/**
	 * 根据id查询版本
	 * @param releaseId
	 * @return
	 */
	public ReleaseFeature queryReleaseById(int releaseId);
	
	/**
	 * 根据id修改版本信息
	 * @param rVo
	 * @return
	 */
	public int updateReleaseContentById(ReleaseFeature rVo);
}
