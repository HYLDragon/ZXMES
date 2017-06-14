package com.zx.mes.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.zx.mes.pageModel.Pbug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.Json;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.service.admin.BugServiceI;
import com.zx.mes.service.admin.BugTypeServiceI;

/**
 * BUG管理控制器
 * 
 * @author  hyl
 * 
 */
@Controller
@RequestMapping("/bugController")
public class BugController extends BaseController {

	@Autowired
	private BugServiceI bugService;

	@Autowired
	private BugTypeServiceI bugTypeService;

	/**
	 * 跳转到BUG管理页面
	 * 
	 * @return
	 */
	@RequestMapping("/manager")
	public String manager(HttpServletRequest request) {
		request.setAttribute("bugTypeList", bugTypeService.getBugTypeList());
		return "/admin/bug";
	}

	/**
	 * 获取BUG数据表格
	 * 
	 * @param bug,ph
	 * @return
	 */
	@RequestMapping("/dataGrid")
	@ResponseBody
	public DataGrid dataGrid(Pbug bug, PageHelper ph) {
		return bugService.dataGrid(bug, ph);
	}

	/**
	 * 跳转到添加BUG页面
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/addPage")
	public String addPage(HttpServletRequest request) {
		Pbug b = new Pbug();
		b.setId(UUID.randomUUID().toString());
		request.setAttribute("bug", b);
		request.setAttribute("bugTypeList", bugTypeService.getBugTypeList());
		return "/admin/bugAdd";
	}

	/**
	 * 添加BUG
	 * 
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public Json add(Pbug bug) {
		Json j = new Json();
		try {
			bugService.add(bug);
			j.setSuccess(true);
			j.setMsg("添加成功！");
		} catch (Exception e) {
			// e.printStackTrace();
			j.setMsg(e.getMessage());
		}
		return j;
	}

	/**
	 * 跳转到BUG查看页面
	 * 
	 * @return string
	 */
	@RequestMapping("/view")
	public String view(HttpServletRequest request, String id) {
		Pbug b = bugService.get(id);
		request.setAttribute("bug", b);
		return "/admin/bugView";
	}

	/**
	 * 跳转到BUG修改页面
	 * 
	 * @return
	 */
	@RequestMapping("/editPage")
	public String editPage(HttpServletRequest request, String id) {
		Pbug b = bugService.get(id);
		request.setAttribute("bug", b);
		request.setAttribute("bugTypeList", bugTypeService.getBugTypeList());
		return "/admin/bugEdit";
	}

	/**
	 * 修改BUG
	 * 
	 * @param bug
	 * @return
	 */
	@RequestMapping("/edit")
	@ResponseBody
	public Json edit(Pbug bug) {
		Json j = new Json();
		try {
			bugService.edit(bug);
			j.setSuccess(true);
			j.setMsg("编辑成功！");
		} catch (Exception e) {
			// e.printStackTrace();
			j.setMsg(e.getMessage());
		}
		return j;
	}

	/**
	 * 删除BUG
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public Json delete(String id) {
		Json j = new Json();
		bugService.delete(id);
		j.setMsg("删除成功！");
		j.setSuccess(true);
		return j;
	}

}
