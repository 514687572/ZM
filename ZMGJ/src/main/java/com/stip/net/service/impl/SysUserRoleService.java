package com.stip.net.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stip.net.dao.ISysUserRoleDAO;
import com.stip.net.model.SysUserRole;
import com.stip.net.model.SysUserRoleExample;
import com.stip.net.service.ISysUserRoleService;

@Service
@Transactional
public class SysUserRoleService implements ISysUserRoleService{
	@Resource
	private ISysUserRoleDAO sysUserRoleDAO;

	public List<SysUserRole> selectByExample(SysUserRoleExample example)
			throws Exception {
		return sysUserRoleDAO.selectByExample(example);
	}

	public SysUserRole selectByPrimaryKey(String roleId) throws Exception {
		return sysUserRoleDAO.selectByPrimaryKey(roleId);
	}

	public void insertSelective(SysUserRole record) throws Exception {
		sysUserRoleDAO.insertSelective(record);
	}

	public int updateByPrimaryKeySelective(SysUserRole record) {
		return sysUserRoleDAO.updateByPrimaryKeySelective(record);
	}

	public void deleteByPrimaryKey(String roleId) throws Exception {
		sysUserRoleDAO.deleteByPrimaryKey(roleId);
	}

}
