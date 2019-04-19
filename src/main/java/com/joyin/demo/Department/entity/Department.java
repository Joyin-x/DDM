package com.joyin.demo.Department.entity;

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
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 负责人id
     */
    @TableField("employee_id")
    private Integer employeeId;

    /**
     * 部门名称
     */
    @TableField("department_name")
    private String departmentName;

    /**
     * 部门负责人
     */
    @TableField("principal")
    private String principal;

    /**
     * 成立时间
     */
    @TableField("established_time")
    private LocalDate establishedTime;

    /**
     * 部门描述
     */
    @TableField("description")
    private String description;

    /**
     * 部门底薪
     */
    @TableField("basic_salary")
    private Integer basicSalary;


}
