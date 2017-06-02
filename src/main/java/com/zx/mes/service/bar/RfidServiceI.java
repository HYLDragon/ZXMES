package com.zx.mes.service.bar;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.bar.Rfid;

public interface RfidServiceI {
	
	DataGrid datagrid(Rfid rfid,PageHelper pageHelper);
	
	void add(Rfid rfid);
	
	void delete(Rfid rfid);
	
	void update(Rfid rfid);
}
