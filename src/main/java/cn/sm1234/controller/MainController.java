package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description cn.sm1234.controller
 * @date 18/4/12
 */
@Controller
public class MainController {

    /**
     * 登录页面
     * @return
     */
    @RequestMapping("/userLogin")
    public String login(){
        return "login";
    }

    /**
     * 错误页面
     * @return
     */
    @RequestMapping("/error")
    public String error(){
        return "error";
    }

    /**
     * 生成验证码
     */
    @RequestMapping("/imageCode")
    public String imageCode(){
        return "imageCode";
    }
}
