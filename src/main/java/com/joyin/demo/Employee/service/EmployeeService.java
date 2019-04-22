package com.joyin.demo.Employee.service;

import com.joyin.demo.Employee.entity.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wwx
 * @since 2019-04-19
 */
public interface EmployeeService extends IService<Employee> {

    List<Employee> getEmployeeList();
}
