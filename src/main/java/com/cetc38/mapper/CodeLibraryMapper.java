package com.cetc38.mapper;

import com.cetc38.model.CodeLibrary;
import com.cetc38.model.CodeLibraryExample;
import com.cetc38.model.CodeLibraryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CodeLibraryMapper {
    int countByExample(CodeLibraryExample example);

    int deleteByExample(CodeLibraryExample example);

    int deleteByPrimaryKey(Integer codeId);

    int insert(CodeLibraryWithBLOBs record);

    int insertSelective(CodeLibraryWithBLOBs record);

    List<CodeLibraryWithBLOBs> selectByExampleWithBLOBs(CodeLibraryExample example);

    List<CodeLibrary> selectByExample(CodeLibraryExample example);

    CodeLibraryWithBLOBs selectByPrimaryKey(Integer codeId);

    int updateByExampleSelective(@Param("record") CodeLibraryWithBLOBs record, @Param("example") CodeLibraryExample example);

    int updateByExampleWithBLOBs(@Param("record") CodeLibraryWithBLOBs record, @Param("example") CodeLibraryExample example);

    int updateByExample(@Param("record") CodeLibrary record, @Param("example") CodeLibraryExample example);

    int updateByPrimaryKeySelective(CodeLibraryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CodeLibraryWithBLOBs record);

    int updateByPrimaryKey(CodeLibrary record);
    
    
    int updateCodeReadById(int codeId);
    
	/**
	 * 根据id逻辑删除代码
	 * @param blogId
	 * @return
	 */
	int logicDeleteCodeById(int blogId);
	
	/**
	 * 根据id查找上一篇有效代码
	 * @param codeId
	 * @return
	 */
	 CodeLibraryWithBLOBs queryPreviousCode(int codeId);
	
	/**
	 * 根据id查找下一篇有效代码
	 * @param codeId
	 * @return
	 */
	 CodeLibraryWithBLOBs queryNextCode(int codeId);
}