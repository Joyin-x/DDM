package com.joyin.demo.Employee.controller;


import com.joyin.demo.Employee.service.EmployeeService;
import com.joyin.demo.Public.Base.BaseResponse;
import com.joyin.demo.Public.Base.ResponseCode;
import com.joyin.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author wwx
 * @since 2019-04-19
 */
@RestController
@RequestMapping("/Employee")
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse login(String username,Integer id) {
        System.out.println(username+id);
        BaseResponse baseResponse = new BaseResponse();
        String token = JwtUtil.sign(username, id);
        if(token!=null){
            baseResponse.setStatus(ResponseCode.SUCCESS);
            baseResponse.setData(token);
        }
        return baseResponse;
    }

    @RequestMapping(value = "/error")
    public BaseResponse ha() {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMsg("登录过期，请重新登录");
        return baseResponse;
    }
}
