package com.zx.mes.controller.mes.pollute;

import com.zx.mes.controller.BaseController;
import com.zx.mes.model.mes.Care;
import com.zx.mes.model.mes.CareType;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.Json;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.Pbug;
import com.zx.mes.pageModel.mes.pollute.Pcare;
import com.zx.mes.service.mes.pollute.CareServiceI;
import com.zx.mes.service.mes.pollute.CareTypeServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

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

        return careService.datagrid(pcare,ph);
    }

    @RequestMapping("/addPage")
    public String addPage(HttpServletRequest request){
        Care care=new Care();
        care.setId(UUID.randomUUID().toString());
        request.setAttribute("care", care);
        request.setAttribute("careTypeList", careTypeService.getCareTypeList());
        return "/mes/pollute/addCarePage";
    }

    @RequestMapping("/editPage")
    public String editPage(HttpServletRequest request,String id){
        Pcare pcare =careService.get(id);
        request.setAttribute("care", pcare);
        request.setAttribute("careTypeList", careTypeService.getCareTypeList());
        return "/mes/pollute/editCarePage";
    }

    @RequestMapping("/add")
    @ResponseBody
    public Json add(Pcare pcare){
        Json json=new Json();
        try {
            careService.add(pcare);
            json.setMsg("添加成功!");
            json.setSuccess(true);
        }catch (Exception e){
            json.setMsg("添加失败!");
            json.setSuccess(false);
     }
        return json;

    }

    @RequestMapping("/delete")
    @ResponseBody
    public Json delete(Pcare pcare){
        Json json=new Json();
        try {
            careService.delete(pcare);
            json.setMsg("删除成功!");
            json.setSuccess(true);
        }catch (Exception e){
            json.setMsg("删除失败!");
            json.setSuccess(false);
        }
        return json;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public Json edit(Pcare pcare){
        Json json=new Json();
        try {
            careService.edit(pcare);
            json.setMsg("编辑成功!");
            json.setSuccess(true);
        }catch (Exception e){
            json.setMsg("编辑失败!");
            json.setSuccess(false);
        }
        return json;
    }
}
