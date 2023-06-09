package com.jzh.xx.transaction.controller.admin;

import com.jzh.xx.transaction.domain.Admin;
import com.jzh.xx.transaction.service.AdminService;
import com.jzh.xx.transaction.service.GoodsService;
import com.jzh.xx.transaction.service.SellerService;
import com.jzh.xx.transaction.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @Resource
    private GoodsService goodsService;

    @Resource
    private SellerService sellerService;

    @Resource
    private UserService userService;

    @GetMapping("home")
    public String home(Model model,HttpSession session){
        if (session.getAttribute("admin") == null){
            System.out.println("homeaa");
            return "admin/login";
        }
        else {
        double totalSum = goodsService.getTotalSum();
        int goodsCount = goodsService.getGoodsCount();

        int sellerCount = sellerService.getSellerCount();
        int userCount = userService.getUserCount();

        int usCount = sellerCount + userCount;

        model.addAttribute("totalSum",totalSum);
        model.addAttribute("goodsCount",goodsCount);
        model.addAttribute("sellerCount",sellerCount);
        model.addAttribute("usCount",usCount);
            System.out.println("homebb");
        return "admin/home";
    }
}

    @GetMapping("login")
    public String login(){
        return "admin/login";
    }

    /**
     * 管理员登录
     * @param username
     * @param password
     * @param model
     * @param session
     * @return
     */
    @PostMapping("login")
    public String tologin(String username, String password, Model model, HttpSession session){

        Admin admin = adminService.login(username,password);

        if (admin == null){
            model.addAttribute("msg","用户名与密码错误");
            return "admin/login";
        }
        else {
            System.out.println("管理登录成功");
            session.setAttribute("admin",admin);
            System.out.println("session:"+session);
            return "redirect:home";
        }
    }

    @GetMapping("logout")
    public String logout(HttpServletRequest request){
        System.out.println(1);
        request.getSession().invalidate();
        System.out.println(2);
        return "admin/login";

    }
    @GetMapping("toEcharts")
    public String toEcharts(){
        return "admin/good_echarts";
    }
}
