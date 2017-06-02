package com.zx.mes.controller.bar;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.bar.Barrfid;
import com.zx.mes.service.bar.BarrfidServiceI;
import com.zx.mes.service.bar.RfidServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.mes.controller.BaseController;
import com.zx.mes.pageModel.bar.Rfid;

@Controller
@RequestMapping("/rfidController")
public class RfidController extends BaseController {
	@Autowired
	private RfidServiceI rfidService;
	@Autowired
	private BarrfidServiceI barrfidService;
	
	@RequestMapping("/view")
	public String view(){
		return "bar/rfid";
	}
	
	@RequestMapping("/datagrid")
	@ResponseBody
	public DataGrid datagrid(Rfid rfid, PageHelper pageHelper){
		return rfidService.datagrid(rfid, pageHelper);
	}
	
	@RequestMapping("/datagrid2")
	@ResponseBody
	//BarrfidServiceI
	public DataGrid datagrid2(Barrfid barrfid, PageHelper pageHelper){
		return barrfidService.datagrid(barrfid, pageHelper);
	}
	
}
