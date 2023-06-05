package com.jzh.xx.transaction.config;

import com.jzh.xx.transaction.interceptor.AdminLoginInterceptor;
import com.jzh.xx.transaction.interceptor.LoginInterceptor;

import com.jzh.xx.transaction.interceptor.SellerLoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 拦截器配置
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {
    @Autowired
    private AdminLoginInterceptor adminLoginInterceptor;

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Autowired
    private SellerLoginInterceptor sellerLoginInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //用户的登录拦截
         registry.addInterceptor(loginInterceptor).addPathPatterns("/**").excludePathPatterns("/index","/login");
         registry.addInterceptor(adminLoginInterceptor).addPathPatterns("/admin/**").excludePathPatterns("/admin/login");
         //registry.addInterceptor(sellerLoginInterceptor).addPathPatterns("/seller**").excludePathPatterns("/sellerLogin/login");
         registry.addInterceptor(sellerLoginInterceptor).addPathPatterns("/sellerOrder/**")
                .addPathPatterns("/sellerGoods/**")
                .addPathPatterns("/sellerCentre/**")
                .excludePathPatterns("/sellerLogin/login");
    }
}
