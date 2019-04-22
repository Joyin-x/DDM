package com.joyin.demo.Employee.dao;

import com.joyin.demo.Employee.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wwx
 * @since 2019-04-19
 */
public interface EmployeeDao extends BaseMapper<Employee> {

    //获取所有的员工信息记录
    List<Employee> getEmployeeList();

}
