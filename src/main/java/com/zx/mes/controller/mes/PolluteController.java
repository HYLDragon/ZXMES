package com.zx.mes.controller.mes;

import com.zx.mes.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/3.
 */
@Controller
@RequestMapping("/polluteController")
public class PolluteController extends BaseController {

    @RequestMapping("/manager")
    public String manager(){
        return "/mes/pollute";
    }
}
