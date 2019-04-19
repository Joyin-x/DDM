package com.joyin.demo.Wage.entity;

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
public class Wage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
    @TableField("employee_id")
    private Integer employeeId;

    /**
     * 底薪
     */
    @TableField("basic_salary")
    private Float basicSalary;

    /**
     * 奖金
     */
    @TableField("bonus")
    private Float bonus;

    /**
     * 加班费
     */
    @TableField("overtime_pay")
    private Float overtimePay;

    /**
     * 实发工资
     */
    @TableField("net_payroll")
    private Float netPayroll;

    /**
     * 工资计算起止时间
     */
    @TableField("start_time")
    private LocalDate startTime;

    /**
     * 工资计算截止时间
     */
    @TableField("end_time")
    private LocalDate endTime;

    /**
     * 发薪水日期
     */
    @TableField("pay_date")
    private LocalDate payDate;


}
