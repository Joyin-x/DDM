package com.joyin.demo.Task.service.impl;

import com.joyin.demo.Task.entity.Task;
import com.joyin.demo.Task.dao.TaskDao;
import com.joyin.demo.Task.service.TaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class TaskServiceImpl extends ServiceImpl<TaskDao, Task> implements TaskService {

}
