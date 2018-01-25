package com.stip.net.controller;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;

import com.stip.net.model.SysAdvertiseAdmin;
import com.stip.net.model.SysAdvertiseAdminExample;
import com.stip.net.service.ISysAdvertiseAdminService;
import com.stip.net.service.ISysDictionaryService;


@Controller
@Scope("request")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = { RuntimeException.class, Exception.class })
@RequestMapping("zmgj")
public class IndexController {

	public static void main(String[] args) {
		System.out.println('4' + 0 + "0");
	}
	@Resource
	private ISysDictionaryService sysDictionaryService;
	@Resource
	private ISysAdvertiseAdminService advertiseAdminService;
	/**
	 * 获取分类并跳转至主页
	 * 
	 * @param request
	 *            请求信息
	 * @param response
	 *            响应信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/index.do", method = { RequestMethod.GET, RequestMethod.HEAD })
	public ModelAndView selectDataToIndex(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		jsonResult.put("success", Boolean.TRUE);
		RequestContext req = new RequestContext(request);
		jsonResult.put("username", req.getMessage("username"));
		jsonResult.put("password", req.getMessage("password"));
		ModelAndView modelAndView = new ModelAndView("index", jsonResult);

		return modelAndView;
	}
	
	/**
	 * 获取分类并跳转至主页
	 * 
	 * @param request
	 *            请求信息
	 * @param response
	 *            响应信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/test.do", method = { RequestMethod.GET, RequestMethod.HEAD })
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		jsonResult.put("success", Boolean.TRUE);
		RequestContext req = new RequestContext(request);
		jsonResult.put("helloworld", req.getMessage("helloworld"));
		jsonResult.put("username", req.getMessage("username"));
		jsonResult.put("password", req.getMessage("password"));
		ModelAndView modelAndView = new ModelAndView("index", jsonResult);

		return modelAndView;
	}
	
	/**
	 * 获取模块信息
	 * 
	 * @param request
	 *            请求信息
	 * @param response
	 *            响应信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/loadModules.do", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Map<String,Object> loadModules(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		jsonResult = sysDictionaryService.getModules(request);
		return jsonResult;
	}
	
	/**
	 * 获取模块信息
	 * 
	 * @param request
	 *            请求信息
	 * @param response
	 *            响应信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getBusinessCollege.do", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Map<String,Object> getBusinessCollege(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		String pId = request.getParameter("id");
		String type = request.getSession().getAttribute("type") + "";
		if(type == null || "".equals(type) || "null".equals(type))
			type = "1";
		jsonResult = sysDictionaryService.getModulesByParentId(pId,type);
		return jsonResult;
	}

	/**
	 * 获取模块信息
	 * 
	 * @param request
	 *            请求信息
	 * @param response
	 *            响应信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getAdvertise.do", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Map<String,Object> getAdvertise(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		String pId = request.getParameter("id");
		String page = request.getParameter("page");
		jsonResult = advertiseAdminService.getAdvertiseInfoByDicId(pId,page);
		request.setAttribute("totalPages", jsonResult.get("totalPages"));
		request.setAttribute("nowPage", jsonResult.get("nowPage"));
		return jsonResult;
	}
	
	/**
	 * 获取模块信息
	 * 
	 * @param request
	 *            请求信息
	 * @param response
	 *            响应信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/getAdvertiseWithoutPage.do", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Map<String,Object> getAdvertiseWithoutPage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		String pId = request.getParameter("id");
		SysAdvertiseAdminExample example  = new SysAdvertiseAdminExample();
		example.createCriteria().andAdTypeEqualTo(pId);
		List<SysAdvertiseAdmin> list = advertiseAdminService.selectByExample(example);
		if(list != null && list.size() > 0) {
			SysAdvertiseAdmin adv = list.get(0);
			String str = new String(adv.getAdDesc(),"GBK");
			adv.setRemark1(str);
			jsonResult.put("list", adv);
		}
		jsonResult.put("success", (list != null && list.size() > 0));
		return jsonResult;
	}

	/**
	 * 
	 * @param request
	 *            请求信息
	 * @param response
	 *            响应信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/loadAdDetails.do", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Map<String, Object> loadAdDetails(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		jsonResult.put("success", Boolean.TRUE);
		String adId = request.getParameter("adId");
		SysAdvertiseAdminExample example = new SysAdvertiseAdminExample();
		example.createCriteria().andAdIdEqualTo(adId);
		example.setOrderByClause("sysAdvertiseAdmin.AD_INDEX");
		List<SysAdvertiseAdmin> list = advertiseAdminService.selectByExample(example);
		if(list != null && list.size() > 0) {
			SysAdvertiseAdmin adv = list.get(0);
			String content= "";
			for (int i = 0; i < list.size(); i++) {
				String title = "<p id='title_" + (i+1) +"'>" + adv.getRemark() + "</p>";
				if(adv.getRemark() != null && !"".equals(adv.getRemark()))
					content += title + new String(adv.getAdDesc(),"gbk");
				else 
					content += new String(adv.getAdDesc(),"gbk");
			}
			adv.setRemark1(content);
			adv.setRemark2(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(adv.getCreateTime()));
			jsonResult.put("adv", adv);
			String typeName = request.getParameter("typeName");
			typeName = java.net.URLDecoder.decode(typeName,"UTF-8");
			jsonResult.put("typeName", typeName);
			jsonResult.put("list", list);
		}
		
		return jsonResult;
	}
	

	/**
	 * 
	 * @param request
	 *            请求信息
	 * @param response
	 *            响应信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/changeLaug.do", method = { RequestMethod.POST, RequestMethod.GET })
	public @ResponseBody Map<String, Object> changeLaug(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> jsonResult = new HashMap<String, Object>();
		jsonResult.put("success", Boolean.TRUE);
		String type = request.getParameter("type");
/*		type = !"".equals(type) && type != null ? type : "1";
		request.getSession().setAttribute("type", type);
*/		return jsonResult;
	}
	
	
	

}
