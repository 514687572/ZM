package com.stip.net.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stip.net.dao.ISysDictionaryDAO;
import com.stip.net.model.SysDictionary;
import com.stip.net.model.SysDictionaryExample;
import com.stip.net.service.ISysDictionaryService;


@Service
@Transactional
public class SysDictionaryServiceImpl implements ISysDictionaryService {
	@Resource
	private ISysDictionaryDAO sysDictionaryDao ;
	
	public List<SysDictionary> selectByExample(SysDictionaryExample example) throws Exception{
		return sysDictionaryDao.selectByExample(example);
	}

	public int countByExample(SysDictionaryExample example) {
		return sysDictionaryDao.countByExample(example);
	}

	public int deleteByPrimaryKey(Long id) {
		return sysDictionaryDao.deleteByPrimaryKey(id);
	}

	public void insertSelective(SysDictionary record) {
		sysDictionaryDao.insertSelective(record);
	}

	public int updateByPrimaryKeySelective(SysDictionary record) {
		return sysDictionaryDao.updateByPrimaryKeySelective(record);
	}
	
	/* (non-Javadoc)
	 * @see com.yuguo.net.service.ISysDictionaryService#getModules()
	 */
	@Override
	public Map<String, Object> getModules(HttpServletRequest request) throws Exception {
		String type = request.getSession().getAttribute("type") + "";
		if(type == null || "".equals(type) || "null".equals(type))
			type = "1";
		SysDictionaryExample example = new SysDictionaryExample();
		SysDictionaryExample.Criteria cri = example.createCriteria();
		cri.andRemarkEqualTo("0");
		cri.andDicKeyEqualTo(type);
		List<SysDictionary> list = selectByExample(example);

		SysDictionaryExample example2 = new SysDictionaryExample();
		SysDictionaryExample.Criteria cri2 = example2.createCriteria();
		if(type.equals("2")) {
			cri2.andRemarkEqualTo("23");
		}else {
			cri2.andRemarkEqualTo("3");
		}
		cri2.andDicKeyEqualTo(type);
		List<SysDictionary> list2 = selectByExample(example2);
		Map<String,Object> jsonResult = new HashMap<String, Object>();
		List<String> list3 = new ArrayList<String>();
		if(type.equals("1")) {
			list3.add("走进<i class='wicon'></i>知脉");
			list3.add("知脉公益");
			list3.add("公司介绍");
			list3.add("知脉团队");
			list3.add("合作机构");
			list3.add("全球资源");
		} else {
			list3.add("About<i class='wicon'></i>Us");
			list3.add("Volunteer Programs");
			list3.add("ZM at a Glance");
			list3.add("ZM’s Leadership");
			list3.add("Co-operation Agencies");
			list3.add("Global Resources");
		}
		if(list != null && list.size() > 0) {
			jsonResult.put("success", Boolean.TRUE);
			jsonResult.put("list", list);
		}else {
			jsonResult.put("success", Boolean.FALSE);
		}
		jsonResult.put("wlist", list2);
		jsonResult.put("jlist", list3);
		jsonResult.put("type", type);
		return jsonResult;
		
	}
	
	@Override
	public Map<String, Object> getModulesByParentId(String pId,String type) throws Exception {
		SysDictionaryExample example = new SysDictionaryExample();
		SysDictionaryExample.Criteria cri = example.createCriteria();
		cri.andRemarkEqualTo(pId);
		cri.andDicKeyEqualTo(type);
		List<SysDictionary> list = selectByExample(example);
		Map<String,Object> jsonResult = new HashMap<String, Object>();
		if(list != null && list.size() > 0) {
			jsonResult.put("success", Boolean.TRUE);
			jsonResult.put("list", list);
		}else {
			jsonResult.put("success", Boolean.FALSE);
		}
		return jsonResult;
	}

}