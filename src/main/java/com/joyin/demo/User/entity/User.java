package com.joyin.demo.User.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wwx
 * @since 2019-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableField("userId")
    private Integer userId;

    /**
     * 登录电话号
     */
    @TableField("phone")
    private String phone;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 用户权限表标识0（普通员工）1（经理）2（超级管理员）
     */
    @TableField("flag")
    private Integer flag;

    /**
     * 用户图片路径
     */
    @TableField("picture")
    private String picture;


}
