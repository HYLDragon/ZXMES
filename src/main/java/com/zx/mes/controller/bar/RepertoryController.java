package com.zx.mes.controller.bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.mes.controller.BaseController;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.bar.Repertory;
import com.zx.mes.service.bar.RepertoryServiceI;
@Controller
@RequestMapping("/repertoryController")
public class RepertoryController extends BaseController {
	@Autowired
	private RepertoryServiceI repertoryService;
	@RequestMapping("/view")
	public String view(){
		return "/bar/repertory";
	}
	@RequestMapping("/datagrid")
	@ResponseBody
	public DataGrid datagrid(Repertory repertory,PageHelper pageHelper){
		return repertoryService.datagrid(repertory, pageHelper);
	}
}
