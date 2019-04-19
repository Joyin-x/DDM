package com.joyin.demo.Employee.service.impl;

import com.joyin.demo.Employee.entity.Employee;
import com.joyin.demo.Employee.dao.EmployeeDao;
import com.joyin.demo.Employee.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wwx
 * @since 2019-04-19
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, Employee> implements EmployeeService {

}
