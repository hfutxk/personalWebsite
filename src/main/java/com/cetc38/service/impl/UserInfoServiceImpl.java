package com.cetc38.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cetc38.mapper.UserInfoMapper;
import com.cetc38.model.UserInfo;
import com.cetc38.model.UserInfoExample;
import com.cetc38.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Resource
	private UserInfoMapper userInfoMapper;
	
	@Override
	public int insertUserInfo(UserInfo userInfoVo) {
		
		if(userInfoMapper == null)
			System.out.println("nihaofjaof");
		
		return this.userInfoMapper.insert(userInfoVo);
		
	}

	@Override
	public int updateUserInfoById(UserInfo uVo) {
		
		return this.userInfoMapper.updateByPrimaryKey(uVo);
		
	}

	@Override
	public int updateUserPwdByName(UserInfo uVo) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andUserNameEqualTo(uVo.getUserName());
		
		return this.userInfoMapper.updateByExampleSelective(uVo, example);
		
	}

	@Override
	public int updateUserPwdByNameAndEmail(UserInfo uVo) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andUserNameEqualTo(uVo.getUserName())
								.andUserEmailEqualTo(uVo.getUserEmail());
		
		return this.userInfoMapper.updateByExampleSelective(uVo, example);
	}

	@Override
	public int updateUserEmailByName(UserInfo uVo) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andUserNameEqualTo(uVo.getUserName());
		UserInfo user = new UserInfo();
		user.setUserEmail(uVo.getUserEmail());
		return this.userInfoMapper.updateByExampleSelective(user, example);
		
	}

	@Override
	public String queryPasswordByUserName(String userName) {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andUserNameEqualTo(userName);
		UserInfo user = this.userInfoMapper.selectByExample(example).get(0);
		return user.getUserPassword();
	}

	@Override
	public UserInfo queryUserInfoByName(String userName) {
		
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andUserNameEqualTo(userName);
		return this.userInfoMapper.selectByExample(example).get(0);
	}

	@Override
	public int queryUserTotalCount(UserInfo uVo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
