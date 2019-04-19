package com.joyin.demo.Mobilize.entity;

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
public class Mobilize implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
    @TableField("employee_id")
    private Integer employeeId;

    /**
     * 原职务
     */
    @TableField("original_position")
    private String originalPosition;

    /**
     * 原部门id
     */
    @TableField("original_department_id")
    private Integer originalDepartmentId;

    /**
     * 现职务
     */
    @TableField("now_position")
    private String nowPosition;

    /**
     * 现部门id
     */
    @TableField("now_department_id")
    private Integer nowDepartmentId;

    /**
     * 调动日期
     */
    @TableField("transfer_date")
    private LocalDate transferDate;

    /**
     * 调动原因
     */
    @TableField("transfer_reason")
    private String transferReason;

    /**
     * 审批人
     */
    @TableField("approver")
    private String approver;

    /**
     * 备注信息
     */
    @TableField("mobilize_remark")
    private String mobilizeRemark;


}
