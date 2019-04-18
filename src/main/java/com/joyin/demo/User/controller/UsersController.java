package com.joyin.demo.User.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.joyin.demo.User.dao.UsersDao;
import com.joyin.demo.User.entity.Users;
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
@RequestMapping("/User/users")
public class UsersController {

    @Autowired
    public UsersDao usersDao;

    public void test(){

    }

}
