package com.joyin.demo.User.entity;

import java.time.LocalDateTime;
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
 * @since 2019-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("username")
    private String username;

    @TableField("password")
    private String password;

    @TableField("realname")
    private String realname;

    @TableField("department_id")
    private Integer departmentId;

    @TableField("position_id")
    private Integer positionId;

    @TableField("is_del")
    private String isDel;

    @TableField("last_login_time")
    private LocalDateTime lastLoginTime;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
