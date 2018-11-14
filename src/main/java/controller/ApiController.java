package controller;


import model.po.base.BasePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author 陈旭
 * @version $Id: DemoMapper, v0.1
 * @company 杭州信牛网络科技有限公司
 * @date 2018年04月18日 10:06 陈旭 Exp $
 */

@Controller
@RequestMapping("/")
public class ApiController {


    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}
