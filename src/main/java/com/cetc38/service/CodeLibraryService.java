package com.cetc38.service;

import java.util.List;

import com.cetc38.model.CodeLibrary;
import com.cetc38.model.CodeLibraryWithBLOBs;

public interface CodeLibraryService {

	/**
	 * 根据条件查询代码库数量
	 * @param cVo
	 * @return
	 */
	public int queryCodeTotalCount(CodeLibrary cVo);
	
	/**
	 * 根据条件查询某一页的代码库
	 * @param cVo
	 * @param pageSize
	 * @param pageNo
	 * @return
	 */
	public List<CodeLibraryWithBLOBs> queryCodeLibraryPerPage(CodeLibrary cVo, int pageSize, int pageNo);
	
	/**
	 * 根据Id查询单独一处代码
	 * @param codeId
	 * @return
	 */
	public CodeLibrary queryPerCodeById(int codeId);
	
	/**
	 * 插入新纪录到代码库，返回id
	 * 
	 * @param cVo
	 * @return
	 */
	public int insertCodeLibrary(CodeLibrary cVo);
	
	/**
	 * 根据id更新代码库代码阅读次数
	 * @param codeId
	 * @return
	 */
	public int updateCodeReadById(int codeId);
	
	/**
	 * 根据id修改代码内容
	 * @param cVo
	 * @return
	 */
	public int updateCodeById(CodeLibraryWithBLOBs cVo);
	
	/**
	 * 根据id逻辑删除代码
	 * @param blogId
	 * @return
	 */
	public int logicDeleteCodeById(int blogId);
	
	/**
	 * 根据id查找上一篇有效代码
	 * @param codeId
	 * @return
	 */
	public CodeLibraryWithBLOBs queryPreviousCode(int codeId);
	
	/**
	 * 根据id查找下一篇有效代码
	 * @param codeId
	 * @return
	 */
	public CodeLibraryWithBLOBs queryNextCode(int codeId);
}
