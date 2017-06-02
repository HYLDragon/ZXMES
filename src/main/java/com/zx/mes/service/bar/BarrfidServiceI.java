package com.zx.mes.service.bar;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;

import com.zx.mes.pageModel.bar.Barrfid;
import com.zx.mes.pageModel.bar.Rfid;

public interface BarrfidServiceI {
	
	DataGrid datagrid(Barrfid barrfid,PageHelper pageHelper);
	
}
