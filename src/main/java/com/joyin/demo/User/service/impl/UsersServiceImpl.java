package com.joyin.demo.User.service.impl;

import com.joyin.demo.User.entity.Users;
import com.joyin.demo.User.dao.UsersDao;
import com.joyin.demo.User.service.IUsersService;
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
public class UsersServiceImpl extends ServiceImpl<UsersDao, Users> implements IUsersService {

}
