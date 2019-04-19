package com.joyin.demo.Employee.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    /**
     * 员工姓名
     */
    @TableField("name")
    private String name;

    /**
     * 员工性别(0男1女 )
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 出生日期
     */
    @TableField("birthday")
    private LocalDate birthday;

    /**
     * 籍贯
     */
    @TableField("native_place")
    private String nativePlace;

    /**
     * 地址
     */
    @TableField("address")
    private String address;

    /**
     * 电话
     */
    @TableField("phone")
    private String phone;

    /**
     * 所在部门编号
     */
    @TableField("department_id")
    private Integer departmentId;

    /**
     * 职务
     */
    @TableField("position")
    private String position;

    /**
     * 学历
     */
    @TableField("education")
    private String education;

    /**
     * 毕业学校
     */
    @TableField("school")
    private String school;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 所学妆业
     */
    @TableField("professional")
    private String professional;

    /**
     * 备注信息
     */
    @TableField("remark")
    private String remark;


}
