package com.joyin.demo.Attendance.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.joyin.demo.Attendance.entity.Attendance;
import com.joyin.demo.Attendance.service.impl.AttendanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wwx
 * @since 2019-04-18
 */
@RestController
@RequestMapping("/Attendance/attendance")
public class AttendanceController {

    @Autowired
    private AttendanceServiceImpl attendanceService;

    @GetMapping("/findAllUser")
    @ResponseBody
    public List<Attendance> findAllUser(){
        Attendance user = new Attendance();
        int page=3;//当前页
        int pageSize=1;//页面接收数据大小
        IPage<Attendance> iPage = attendanceService.selectPageExt(user, page, pageSize);
        iPage.getRecords();
        return  iPage.getRecords();
    }

}
