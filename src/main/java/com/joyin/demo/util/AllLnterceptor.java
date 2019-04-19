package com.joyin.demo.util;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.joyin.demo.Public.Base.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
        httpServletResponse.setCharacterEncoding("utf-8");
        String token=httpServletRequest.getHeader("accessToken");
        //token不存在
        if(null!=token){
            //验证token是否正确
            boolean result=JwtUtil.verify(token);
            if(result){
                return true;
            }
        }
        start=System.currentTimeMillis();
        forwardError(420,httpServletRequest,httpServletResponse);
        return false;
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


    private void forwardError(int code, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(code);
        request.getRequestDispatcher("/User/user/error").forward(request, response);
    }
}
