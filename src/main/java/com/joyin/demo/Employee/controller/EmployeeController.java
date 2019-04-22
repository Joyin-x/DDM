package com.joyin.demo.Employee.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joyin.demo.Employee.dao.EmployeeDao;
import com.joyin.demo.Employee.entity.Employee;
import com.joyin.demo.Employee.service.EmployeeService;
import com.joyin.demo.Public.Base.BaseResponse;
import com.joyin.demo.Public.Base.ResponseCode;
import com.joyin.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;


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
    private EmployeeService employeeService;

    @Autowired
    private EmployeeDao employeeDao;

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

    @RequestMapping("/getAll")
    public BaseResponse getAllEmployee(){
        BaseResponse baseResponse=new BaseResponse();
        List<Employee> list=employeeService.getEmployeeList();
        if(list.size()>0){
            baseResponse.setStatus(ResponseCode.SUCCESS);
            baseResponse.setData(list);
        }
        return baseResponse;
    }

    @RequestMapping("/getByPage")
    public BaseResponse getByPage(int current,int size){
        BaseResponse baseResponse=new BaseResponse();
        QueryWrapper<Employee> queryWrapper=new QueryWrapper<>();
        queryWrapper.orderByAsc("id");
        Page<Employee> page=new Page<Employee>(current,size);
        IPage<Employee> result=employeeDao.selectPage(page,queryWrapper);
        baseResponse.setStatus(ResponseCode.SUCCESS);
        baseResponse.setData(result.getRecords());
        return baseResponse;
    }

    @RequestMapping("/insert")
    public BaseResponse insert() {
        BaseResponse baseResponse = new BaseResponse();
        Employee employee=new Employee();
        employee.setAddress("广州市");
        employee.setBirthday(LocalDate.now());
        employee.setDepartmentId(1);
        employee.setEmail("1461483915@qq.com");
        employee.setPhone("15017814621");
        employee.setPosition("de ");
        employee.setSex(1);
        employee.setName("ad");
        if(employeeDao.insert(employee)==1){
            employeeDao.deleteById(employee.getId());
            baseResponse.setStatus(ResponseCode.SUCCESS);
            Map<String,Object> stringObjectMap=new HashMap<>();
            stringObjectMap.put("education","本科1");
            employeeDao.deleteByMap(stringObjectMap);
        }
        return baseResponse;
    }
}
