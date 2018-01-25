package com.stip.net.service;

import java.util.List;

import com.stip.net.model.SysMerchantInfo;
import com.stip.net.model.SysMerchantInfoExample;


public interface ISysMerchantInfoService {
	List<SysMerchantInfo> selectByExample(SysMerchantInfoExample example);
	List<SysMerchantInfo> selectTwoTableByExample(SysMerchantInfoExample example);
	int updateByPrimaryKey(SysMerchantInfo record);
	void insert(SysMerchantInfo record);
	SysMerchantInfo selectByPrimaryKey(String id);
	SysMerchantInfo getMerchantInfoByNameOrPhone(String search);
	int updateByPrimaryKeySelective(SysMerchantInfo record);
	int countByExample(SysMerchantInfoExample example);
}