package com.joyin.demo.Task.entity;

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
 * @since 2019-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工id
     */
    @TableField("employee_id")
    private Integer employeeId;

    /**
     * 工作内容
     */
    @TableField("work_content")
    private String workContent;

    /**
     * 当前状态（0已完成 1未完成）
     */
    @TableField("status")
    private Boolean status;

    /**
     * 开始时间
     */
    @TableField("start_time")
    private LocalDate startTime;

    /**
     * 截止时间
     */
    @TableField("end_time")
    private LocalDate endTime;


}
