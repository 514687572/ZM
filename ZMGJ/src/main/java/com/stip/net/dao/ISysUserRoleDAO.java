package com.stip.net.dao;

import java.util.List;

import com.stip.net.model.SysUserRole;
import com.stip.net.model.SysUserRoleExample;

public interface ISysUserRoleDAO {
    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    int countByExample(SysUserRoleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    int deleteByExample(SysUserRoleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    int deleteByPrimaryKey(String roleId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    void insert(SysUserRole record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    void insertSelective(SysUserRole record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    List<SysUserRole> selectByExample(SysUserRoleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    SysUserRole selectByPrimaryKey(String roleId);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    int updateByExampleSelective(SysUserRole record, SysUserRoleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    int updateByExample(SysUserRole record, SysUserRoleExample example);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    int updateByPrimaryKey(SysUserRole record);
}