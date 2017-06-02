package com.zx.mes.service.bar;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.bar.Bar;

public interface BarServiceI {

	DataGrid dataGrid(Bar bar,PageHelper pHelper);
	
	void add(Bar bar);
	
	void delete(Bar bar);
	
	void update(Bar bar);
}
