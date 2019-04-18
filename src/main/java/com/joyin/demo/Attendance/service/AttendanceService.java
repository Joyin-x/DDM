package com.joyin.demo.Attendance.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.joyin.demo.Attendance.entity.Attendance;
import com.baomidou.mybatisplus.extension.service.IService;
import freemarker.ext.servlet.IncludePage;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wwx
 * @since 2019-04-18
 */
public interface AttendanceService extends IService<Attendance> {


    IPage<Attendance> selectPageExt(Attendance attendance,int page,int pageSize);
}
