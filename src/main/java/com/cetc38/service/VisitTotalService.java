package com.cetc38.service;

public interface VisitTotalService {

	/**
	 * 查询所有访问量
	 * @return
	 */
	public int queryVisitTotal();
	
	/**
	 * 查询当日访问量
	 * @return
	 */
	public int queryVisitToday();
	
	/**
	 * 更新当日访问量和总访问量
	 * 
	 * @param visitDate
	 * @return
	 */
	public int updateVisitCount();
}
