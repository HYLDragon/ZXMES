package com.zx.mes.controller.mes;

import com.zx.mes.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/21.
 */
@Controller("electricController")
@RequestMapping("/electricController")
public class ElectricController extends BaseController {

    public String manager(){
        return "";
    }
}
