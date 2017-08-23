package com.zx.mes.controller.mes.pollute;

import com.zx.mes.controller.BaseController;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.Json;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.mes.pollute.Pcare;
import com.zx.mes.service.mes.pollute.CareServiceI;
import com.zx.mes.service.mes.pollute.CareTypeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/8/23.
 */
@Controller
@RequestMapping("/careController")
public class CareController extends BaseController {

    @Autowired
    private CareServiceI careService;

    @Autowired
    private CareTypeServiceI careTypeService;

    @RequestMapping("/datagrid")
    @ResponseBody
    public DataGrid datagrid(HttpServletRequest request, Pcare pcare, PageHelper ph){
        request.setAttribute("careTypeList", careTypeService.getCareTypeList());
        return careService.datagrid(pcare,ph);
    }
}
