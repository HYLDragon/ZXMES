package com.zx.mes.controller.bar;

import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.bar.Bar;
import com.zx.mes.service.bar.BarServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.mes.controller.BaseController;
import com.zx.mes.pageModel.DataGrid;


@Controller
@RequestMapping("/barController")
public class BarController extends BaseController {
	@Autowired
	private BarServiceI barService;
	
	@RequestMapping("/view")
	public String bar(){
		return "/bar/bar";
	}
	@ResponseBody
	@RequestMapping("/datagrid")
	public DataGrid datagrid(Bar bar, PageHelper pHelper){
		return barService.dataGrid(bar,pHelper);
	}
	
	
}
