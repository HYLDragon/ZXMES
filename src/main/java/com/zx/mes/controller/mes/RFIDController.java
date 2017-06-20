package com.zx.mes.controller.mes;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.zx.mes.pageModel.DataGrid;
import com.zx.mes.pageModel.PageHelper;
import com.zx.mes.pageModel.mes.Prfidcard;
import com.zx.mes.service.mes.RFIDCardServiceI;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/6/8.
 */
@Controller
@RequestMapping("/rfidController")
public class RFIDController {

    @Autowired
    private RFIDCardServiceI rfidCardService;

    @RequestMapping("/view")
    public String view(){
        return "/bar/rfid";
    }

    @ResponseBody
    @RequestMapping("/datagrid")
    public DataGrid datagrid(Prfidcard card, PageHelper ph){
        DataGrid datagrid=null;
        try {
            datagrid= rfidCardService.datagrid(card,ph);
        }catch (Exception e){
            System.out.println(" 这是错误信息:" +e);
        }

        return datagrid;
    }
}
