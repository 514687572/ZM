package com.stip.net.service;

import java.util.List;
import java.util.Map;

import com.stip.net.model.MallGoodsClass;
import com.stip.net.model.MallGoodsClassExample;

public interface IMallGoodsClassService {
	
	/**
	 * 获取热搜词分类名
	 * */
	List<MallGoodsClass> getClassNameForHotWords();
	//查询分类
    public List<MallGoodsClass> selectByExample(MallGoodsClassExample example);
       
	
	Map<String,Object> selectByExample();
}
