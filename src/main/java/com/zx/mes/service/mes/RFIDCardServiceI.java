package com.zx.mes.service.mes;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.mes.Prfidcard;

/**
 * Created by Administrator on 2017/6/8.
 */
public interface RFIDCardServiceI {
    DataGrid datagrid(Prfidcard card, PageHelper ph);
}
