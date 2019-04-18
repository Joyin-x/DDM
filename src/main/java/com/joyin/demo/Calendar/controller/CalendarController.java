package com.joyin.demo.Calendar.controller;


import com.joyin.demo.Calendar.dao.CalendarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wwx
 * @since 2019-04-18
 */
@RestController
@RequestMapping("/Calendar/calendar")
public class CalendarController {

    @Autowired
    public CalendarDao calendarDao;


}
