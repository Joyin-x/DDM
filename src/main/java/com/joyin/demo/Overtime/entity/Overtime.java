package com.joyin.demo.Overtime.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2019-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Overtime implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 加班表id
     */
    @TableId(value = "overtimeID", type = IdType.AUTO)
    private Integer overtimeID;

    /**
     * 部门id
     */
    @TableField("department_id")
    private Integer departmentId;

    /**
     * 工作内容
     */
    @TableField("overtime_reason")
    private String overtimeReason;

    /**
     * 加班开始时间
     */
    @TableField("startTime")
    private LocalDateTime startTime;

    /**
     * 加班结束时间
     */
    @TableField("endTime")
    private LocalDateTime endTime;

    /**
     * 审批人
     */
    @TableField("approve")
    private String approve;

    /**
     * 审批状态（1通过，0驳回）
     */
    @TableField("status")
    private Boolean status;


}
