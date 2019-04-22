package com.joyin.demo.util;

import com.alibaba.druid.util.StringUtils;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.extern.slf4j.Slf4j;
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

    long start = System.currentTimeMillis();


    @Override
    //请求发生前
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        httpServletResponse.setCharacterEncoding("utf-8");
        String token = httpServletRequest.getHeader("accessToken");
        //token不存在
        if (StringUtils.isEmpty(token)) {
            forwardError(401, httpServletRequest, httpServletResponse);
            return false;
        }
        Algorithm algorithm = Algorithm.HMAC256(JwtUtil.TOKEN_SECRET);
        JWTVerifier verifier = JWT.require(algorithm).build();
        DecodedJWT jwt = null;
        try {
            //解密
            jwt = verifier.verify(token);
        } catch (TokenExpiredException e) {
            forwardError(403,httpServletRequest,httpServletResponse);
        }catch(JWTVerificationException e){
            forwardError(401,httpServletRequest,httpServletResponse);
        }
        return true;
    }


    @Override
    //当前请求进行处理之后
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("Interceptor cost=" + (System.currentTimeMillis() - start));
    }


    @Override
    //当前对应的Interceptor的preHandle方法的返回值为true时才会执行，即在视图渲染完成后回调,主要用于资源清理工作。
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }


    private void forwardError(int code, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setStatus(code);
        request.getRequestDispatcher("/User/user/error?code=" + code).forward(request, response);
    }
}
