package com.cetc38.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cetc38.mapper.CodeLibraryMapper;
import com.cetc38.model.CodeLibrary;
import com.cetc38.model.CodeLibraryExample;
import com.cetc38.model.CodeLibraryWithBLOBs;
import com.cetc38.model.CodeLibraryExample.Criteria;
import com.cetc38.service.CodeLibraryService;
import com.github.pagehelper.PageHelper;
@Service
public class CodeLibraryServiceImpl implements CodeLibraryService {

	@Resource
	private CodeLibraryMapper codeLibraryMapper ;
	@Override
	public int queryCodeTotalCount(CodeLibrary cVo) {
		CodeLibraryExample example = new CodeLibraryExample();
		Criteria criteria = example.createCriteria();
		criteria.andCodeDeleteEqualTo(0);
		if(cVo.getCodeTitle()!=null && !cVo.getCodeTitle().trim().equals("")){
			criteria.andCodeTitleLike(cVo.getCodeTitle());
		}
		if(cVo.getCodeCategory()!=null &&cVo.getCodeCategory()!=-1){
			criteria.andCodeCategoryEqualTo(cVo.getCodeCategory());
		}
		int cnt = this.codeLibraryMapper.countByExample(example);
		return cnt;
	}

	@Override
	public List<CodeLibraryWithBLOBs> queryCodeLibraryPerPage(CodeLibrary cVo, int pageSize, int pageNo) {
		PageHelper.startPage(pageNo, pageSize);
		CodeLibraryExample example = new CodeLibraryExample();
		Criteria criteria = example.createCriteria();
		criteria.andCodeDeleteEqualTo(0);
		if(cVo.getCodeTitle()!=null && !cVo.getCodeTitle().trim().equals("")){
			criteria.andCodeTitleLike(cVo.getCodeTitle());
		}
		if(cVo.getCodeCategory()!=null &&cVo.getCodeCategory()!=-1){
			criteria.andCodeCategoryEqualTo(cVo.getCodeCategory());
		}
		List<CodeLibraryWithBLOBs> list = this.codeLibraryMapper.selectByExampleWithBLOBs(example);
		
		return list;
	}

	@Override
	public CodeLibrary queryPerCodeById(int codeId) {
		return this.codeLibraryMapper.selectByPrimaryKey(codeId);
		
	}

	@Override
	public int insertCodeLibrary(CodeLibrary cVo) {
		return this.insertCodeLibrary(cVo);
	}

	@Override
	public int updateCodeReadById(int codeId) {
		
		return this.codeLibraryMapper.updateCodeReadById(codeId);
	}

	@Override
	public int updateCodeById(CodeLibraryWithBLOBs cVo) {
		return this.codeLibraryMapper.updateByPrimaryKeyWithBLOBs(cVo);
	}

	@Override
	public int logicDeleteCodeById(int codeId) {
		return this.codeLibraryMapper.logicDeleteCodeById(codeId);
	}

	@Override
	public CodeLibraryWithBLOBs queryPreviousCode(int codeId) {
		return this.queryPreviousCode(codeId);
	}

	@Override
	public CodeLibraryWithBLOBs queryNextCode(int codeId) {
		return this.queryNextCode(codeId);
	}

}
