package com.joyin.demo.Attendance.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.joyin.demo.Attendance.entity.Attendance;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wwx
 * @since 2019-04-18
 */
public interface AttendanceDao extends BaseMapper<Attendance> {


    List<Attendance> selectPageExt(Page<Attendance> page, @Param("attendance") Attendance user);


}
