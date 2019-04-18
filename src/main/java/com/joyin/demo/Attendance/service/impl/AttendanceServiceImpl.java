package com.joyin.demo.Attendance.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joyin.demo.Attendance.entity.Attendance;
import com.joyin.demo.Attendance.dao.AttendanceDao;
import com.joyin.demo.Attendance.service.AttendanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wwx
 * @since 2019-04-18
 */
@Service
public class AttendanceServiceImpl extends ServiceImpl<AttendanceDao, Attendance> implements AttendanceService {

    @Autowired
    private AttendanceDao attendanceDao;

    public IPage<Attendance> selectPageExt(Attendance attendance, int page, int pageSize){
        Page<Attendance> p=new Page<>(page,pageSize);
        p.setRecords(attendanceDao.selectPageExt(p,attendance));
        return p;
    }

}
