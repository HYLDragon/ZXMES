package com.zx.mes.service.bar;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.bar.Repertory;

public interface RepertoryServiceI {
	DataGrid datagrid(Repertory repertory,PageHelper pageHelper);
	
	void add(Repertory repertory);
	
	void delete(Repertory repertory);
	
	void update(Repertory repertory);
}
