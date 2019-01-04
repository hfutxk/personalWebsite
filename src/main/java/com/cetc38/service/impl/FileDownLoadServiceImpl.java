package com.cetc38.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cetc38.mapper.FileDownloadMapper;
import com.cetc38.model.FileDownload;
import com.cetc38.model.FileDownloadExample;
import com.cetc38.service.FileDownLoadService;
import com.github.pagehelper.PageHelper;

@Service
public class FileDownLoadServiceImpl implements FileDownLoadService {

	@Resource
	private FileDownloadMapper fileDownloadMapper ;
	
	@Override
	public int queryFileTotalCount() {
		FileDownloadExample example = new FileDownloadExample();
		int cnt = this.fileDownloadMapper.countByExample(example);
		return cnt;
	}

	@Override
	public List<FileDownload> queryFileDownlaodPerPage(int pageSize, int pageNo) {
	
		PageHelper.startPage(pageNo, pageSize);
		FileDownloadExample example = new FileDownloadExample();
		List<FileDownload> list = this.fileDownloadMapper.selectByExample(example);
		return list;
	}

	@Override
	public FileDownload queryPerFileById(int fileId) {
		return this.fileDownloadMapper.selectByPrimaryKey(fileId);
	}

	@Override
	public int insertFileDownload(FileDownload fVo) {
		return this.fileDownloadMapper.insert(fVo);
	}

	@Override
	public int updateFileDownCountByUrl(String fileUrl) {
		
		return this.fileDownloadMapper.updateFileDownCountByUrl(fileUrl);
	}

}
