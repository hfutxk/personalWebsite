package com.cetc38.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cetc38.mapper.ReleaseFeatureMapper;
import com.cetc38.model.ReleaseFeature;
import com.cetc38.model.ReleaseFeatureExample;
import com.cetc38.service.ReleaseFeatureService;
@Service
public class ReleaseFeatureServiceImpl implements ReleaseFeatureService {

	@Resource
	private ReleaseFeatureMapper releaseFeatureMapper ;
	@Override
	public int insertReleaseFeature(ReleaseFeature ReleaseFeature) {
		
		return this.releaseFeatureMapper.insert(ReleaseFeature);
	}

	@Override
	public ReleaseFeature queryLatestReleaseFeature() {
		
		return this.releaseFeatureMapper.queryLatestReleaseFeature();
	}

	@Override
	public ReleaseFeature queryReleaseById(int releaseId) {
		return this.releaseFeatureMapper.selectByPrimaryKey(releaseId);
	}

	@Override
	public int updateReleaseContentById(ReleaseFeature rVo) {
		
		return this.releaseFeatureMapper.updateByPrimaryKeyWithBLOBs(rVo);
	
	}

}
