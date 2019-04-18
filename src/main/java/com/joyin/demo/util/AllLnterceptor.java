package com.joyin.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wwx
 * @date 2019/4/18 10:57
 **/
@Slf4j
public class AllLnterceptor extends HandlerInterceptorAdapter {
    long start=System.currentTimeMillis();


    @Override
    //请求发生前
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o)throws Exception{
        start=System.currentTimeMillis();
        return true;
    }


    @Override
    //当前请求进行处理之后
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView)throws Exception{
        System.out.println("Interceptor cost="+(System.currentTimeMillis()-start));
    }


    @Override
    //当前对应的Interceptor的preHandle方法的返回值为true时才会执行，即在视图渲染完成后回调,主要用于资源清理工作。
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }
}
