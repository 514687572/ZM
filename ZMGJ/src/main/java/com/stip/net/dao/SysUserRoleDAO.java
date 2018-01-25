package com.stip.net.dao;

import java.util.List;

import com.stip.net.common.config.ibatis.GenericDAO;
import com.stip.net.model.SysUserRole;
import com.stip.net.model.SysUserRoleExample;

public class SysUserRoleDAO extends GenericDAO<SysUserRole,SysUserRoleExample> implements ISysUserRoleDAO {

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public SysUserRoleDAO() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public int countByExample(SysUserRoleExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("SysUserRole.countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public int deleteByExample(SysUserRoleExample example) {
        int rows = getSqlMapClientTemplate().delete("SysUserRole.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public int deleteByPrimaryKey(String roleId) {
        SysUserRole key = new SysUserRole();
        key.setRoleId(roleId);
        int rows = getSqlMapClientTemplate().delete("SysUserRole.deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public void insert(SysUserRole record) {
        getSqlMapClientTemplate().insert("SysUserRole.insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public void insertSelective(SysUserRole record) {
        getSqlMapClientTemplate().insert("SysUserRole.insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    @SuppressWarnings("unchecked")
    public List<SysUserRole> selectByExample(SysUserRoleExample example) {
        List<SysUserRole> list = getSqlMapClientTemplate().queryForList("SysUserRole.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public SysUserRole selectByPrimaryKey(String roleId) {
        SysUserRole key = new SysUserRole();
        key.setRoleId(roleId);
        SysUserRole record = (SysUserRole) getSqlMapClientTemplate().queryForObject("SysUserRole.selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public int updateByExampleSelective(SysUserRole record, SysUserRoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysUserRole.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public int updateByExample(SysUserRole record, SysUserRoleExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("SysUserRole.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public int updateByPrimaryKeySelective(SysUserRole record) {
        int rows = getSqlMapClientTemplate().update("SysUserRole.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table t_sys_user_role
     *
     * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
     */
    public int updateByPrimaryKey(SysUserRole record) {
        int rows = getSqlMapClientTemplate().update("SysUserRole.updateByPrimaryKey", record);
        return rows;
    }

    /**
    /**
     * <p>t_sys_user_role查询条件参数。</p>
     */
    private static class UpdateByExampleParms extends SysUserRoleExample {
        private SysUserRole record;

        /**
         * <p>UpdateByExampleParms构造函数。</p>
         * @param record 实体
         * @param example 条件
         */
        public UpdateByExampleParms(SysUserRole record, SysUserRoleExample example) {
            super(example);
            this.record = record;
        }

        /**
         * This method was generated by Apache iBATIS ibator.
         * This method corresponds to the database table t_sys_user_role
         *
         * @ibatorgenerated Fri Apr 15 15:39:09 CST 2016
         */
        @SuppressWarnings("unused")
        public SysUserRole getRecord() {
            return record;
        }
    }
}