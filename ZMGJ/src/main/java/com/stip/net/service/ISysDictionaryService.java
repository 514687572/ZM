package com.stip.net.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.stip.net.model.SysDictionary;
import com.stip.net.model.SysDictionaryExample;


public interface ISysDictionaryService {
	List<SysDictionary> selectByExample(SysDictionaryExample example) throws Exception;
	
	int countByExample(SysDictionaryExample example);
	
	int deleteByPrimaryKey(Long id);
	
	void insertSelective(SysDictionary record);
	
	int updateByPrimaryKeySelective(SysDictionary record);

	/**
	 * @return
	 * @throws Exception 
	 */
	Map<String, Object> getModules(HttpServletRequest request) throws Exception;

	/**
	 * @param pId
	 * @return
	 * @throws Exception 
	 */
	Map<String, Object> getModulesByParentId(String pId,String type) throws Exception;

}