package com.stip.net.dao;

import java.util.List;

import com.stip.net.model.SysMerchantInfo;
import com.stip.net.model.SysMerchantInfoExample;

public interface ISysMerchantInfoDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    int countByExample(SysMerchantInfoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    int deleteByExample(SysMerchantInfoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    int deleteByPrimaryKey(String merchantId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    void insert(SysMerchantInfo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    void insertSelective(SysMerchantInfo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    List<SysMerchantInfo> selectByExample(SysMerchantInfoExample example);
    
    List<SysMerchantInfo> selectTwoTableByExample(SysMerchantInfoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    SysMerchantInfo selectByPrimaryKey(String merchantId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    int updateByExampleSelective(SysMerchantInfo record, SysMerchantInfoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    int updateByExample(SysMerchantInfo record, SysMerchantInfoExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    int updateByPrimaryKeySelective(SysMerchantInfo record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_merchant_info
     *
     * @ibatorgenerated Wed Aug 24 14:54:29 CST 2016
     */
    int updateByPrimaryKey(SysMerchantInfo record);

	SysMerchantInfo getMerchantInfoByNameOrPhone(String search);
}