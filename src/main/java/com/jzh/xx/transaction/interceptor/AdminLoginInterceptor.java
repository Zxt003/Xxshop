package com.jzh.xx.transaction.interceptor;

import com.jzh.xx.transaction.domain.Admin;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Component
public class AdminLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        //获取管理员信息
        Admin admin = (Admin) session.getAttribute("admin");
        System.out.println("xxAdmin:"+ admin);
        Boolean T = true;
        if (admin==null){
            response.sendRedirect("/admin/login");
            T=false;

        }
//         ;
//        //管理员未登录
//        if (admin == null){
//            response.sendRedirect("admin/login");
//            T = true;
//
//        }
//        //管理员已登录
//        else {
//
//            response.sendRedirect("admin/home");
//            T = false;
//
//        }
        System.out.println(T);
        return T;
    }
}
