package com.joyin.demo.User.service.impl;

import com.joyin.demo.User.entity.User;
import com.joyin.demo.User.dao.UserDao;
import com.joyin.demo.User.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
