package com.joyin.demo.User.controller;


import com.joyin.demo.Public.Base.BaseResponse;
import com.joyin.demo.Public.Base.ResponseCode;
import com.joyin.demo.util.JwtUtil;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    public BaseResponse ha() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMsg("登录过期，请重新登录");
        return baseResponse;
    }
}
