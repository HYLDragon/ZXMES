package com.zx.mes.controller.mes;

import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.mes.RFIDCard;
import com.zx.mes.service.mes.RFIDCardServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/8.
 */
//@Controller
//@RequestMapping("/rfidController")
public class RFIDController {

    @Autowired
    private RFIDCardServiceI rfidCardService;

    @RequestMapping("/view")
    public String view(){
        return "/bar/rfid";
    }

    @ResponseBody
    @RequestMapping("/datagrid")
    public DataGrid datagrid(RFIDCard card, PageHelper ph){
        return rfidCardService.datagrid(card,ph);
    }
}
