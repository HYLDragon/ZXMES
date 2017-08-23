package com.zx.mes.service.mes.pollute;

import com.zx.mes.model.admin.BugType;
import com.zx.mes.model.mes.CareType;

import java.util.List;

/**
 * Created by Administrator on 2017/8/23.
 */
public interface CareTypeServiceI {

    /*
    * 获取CareType列表
    * return list
    * */
    public List<CareType> getCareTypeList();
}
