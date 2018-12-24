package com.cetc38.service;

import com.cetc38.model.UserInfo;

public interface UserInfoService {
	
	/*  增     */
	/**
	 * 插入新注册的用户信息
	 * @param userInfoVo
	 * @return
	 */
	public int insertUserInfo(UserInfo userInfoVo);
	
	/*  改     */
	/**
	 * 根据id更新用户信息
	 * @param uVo
	 * @return
	 */
	public int updateUserInfoById(UserInfo uVo);
	
	/**
	 * 根据用户名改密码
	 * @param uVo
	 * @return
	 */
	public int updateUserPwdByName(UserInfo uVo);
	
	/**
	 * 根据用户名和邮箱修改密码
	 * @param uVo
	 * @return
	 */
	public int updateUserPwdByNameAndEmail(UserInfo uVo);
	
	/**
	 * 根据用户名修改用户邮箱
	 * @param uVo
	 * @return
	 */
	public int updateUserEmailByName(UserInfo uVo);
	
	/*  查     */
	/**
	 * 根据用户名查询密码
	 * @param userName
	 * @return
	 */
	public String queryPasswordByUserName(String userName);
	
	/**
	 * 根据用户名查询用户信息
	 * @param userName
	 * @return
	 */
	public UserInfo queryUserInfoByName(String userName);
	
	/**
	 * 根据条件查询总的有效用户数量
	 * @param uVo
	 * @return
	 */
	public int 	queryUserTotalCount(UserInfo uVo);
	
	/**
	 * 根据页面大小和页码查询一页的用户
	 * @param uVo
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */

}
