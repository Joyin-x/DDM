package com.joyin.demo.User.controller;


import com.joyin.demo.Public.Base.BaseResponse;
import com.joyin.demo.Public.Base.ResponseCode;
import com.joyin.demo.util.JwtUtil;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wwx
 * @since 2019-04-19
 */
@RestController
@RequestMapping("/User/user")
public class UserController {

    @RequestMapping(value = "/xi")
    public BaseResponse xi() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMsg("登录过期，请重新登录");
        return baseResponse;
    }


    @RequestMapping(value = "/error")
    public BaseResponse handleError(HttpServletRequest request, HttpServletResponse response) {
        BaseResponse baseResponse = new BaseResponse(ResponseCode.ERROR);
        Object status=request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if(status==null){
            status=response.getStatus();
        }
        int statusCode=Integer.parseInt(status.toString());
        switch(statusCode){
            case 401:
                baseResponse.setStatus(ResponseCode.UNAUTHORIZED);
                break;
            case 402:
                baseResponse.setStatus(ResponseCode.ERROR);
                break;
            case 403:
                baseResponse.setStatus(ResponseCode.TOKEN_EXPIRE);
                break;
            case 404:
                baseResponse.setStatus(ResponseCode.NOT_FOUND);
                break;
            case 406:
                baseResponse.setStatus(ResponseCode.NOT_ACCEPTABLE);
                break;
        }
        return baseResponse;
    }
}
