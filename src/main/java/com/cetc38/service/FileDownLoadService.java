package com.cetc38.service;

import java.util.List;

import com.cetc38.model.FileDownload;


public interface FileDownLoadService {

	/**
	 * 查询下载区数量
	 * 
	 * @return
	 */
	public int queryFileTotalCount();
	
	/**
	 * 查询某一页的下载区
	 * 
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */
	public List<FileDownload> queryFileDownlaodPerPage(int pageSize, int pageNo);
	
	/**
	 * 根据Id查询查询某个下载
	 * @param fileId
	 * @return
	 */
	public FileDownload queryPerFileById(int fileId);
	
	/**
	 * 插入新纪录到下载区
	 * 
	 * @param fVo
	 * @return
	 */
	public int insertFileDownload(FileDownload fVo);
	
	/**
	 * 根据file_url更新文件下载次数
	 * @param fileUrl
	 * @return
	 */
	public int updateFileDownCountByUrl(String fileUrl);
}
