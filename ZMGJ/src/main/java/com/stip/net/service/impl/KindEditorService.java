package com.stip.net.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.stip.net.dao.ISysPictureInfoDAO;
import com.stip.net.model.SysPictureInfo;
import com.stip.net.service.IKindEditorService;

@Transactional
public class KindEditorService implements IKindEditorService{
	private ISysPictureInfoDAO sysPictureInfoDAO;
	
	public void insert(SysPictureInfo tSysPicUpload) {
		sysPictureInfoDAO.insert(tSysPicUpload);
	}

	public ISysPictureInfoDAO getSysPictureInfoDAO() {
		return sysPictureInfoDAO;
	}

	public void setSysPictureInfoDAO(ISysPictureInfoDAO sysPictureInfoDAO) {
		this.sysPictureInfoDAO = sysPictureInfoDAO;
	}
	
}
