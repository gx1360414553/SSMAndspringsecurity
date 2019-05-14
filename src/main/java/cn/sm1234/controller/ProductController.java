package cn.sm1234.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author http://www.sm1234.cn
 * @version 1.0
 * @description PACKAGE_NAME
 * @date 18/4/12
 */
@Controller
@RequestMapping("/product")
public class  ProductController {


    /**
     * 商品主页
     */
    @RequestMapping("/index")
    public String index(Model model){

        //获取登录后用户: UserDetail对象
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal!=null){
            if(principal instanceof  UserDetails){
                UserDetails userDetails = (UserDetails)principal;
                String username = userDetails.getUsername();
                model.addAttribute("username",username);
            }
        }

        return "index";
    }


    /**
     * 商品添加
     */
    @RequestMapping("/add")
    public String add(){
        return "product/productAdd";
    }

    /**
     * 商品修改
     */
    @RequestMapping("/update")
    public String update(){
        return "product/productUpdate";
    }

    /**
     * 商品修改
     */
    @RequestMapping("/list")
    public String list(){
        return "product/productList";
    }

    /**
     * 商品删除
     */
    @RequestMapping("/delete")
    public String delete(){
        return "product/productDelete";
    }


}
