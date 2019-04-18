package com.joyin.demo.Attendance.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    /**
     * 员工ID
     */
    @TableField("employee_id")
    private Integer employeeId;

    /**
     * 上班考勤时间
     */
    @TableField("office_time")
    private LocalDateTime officeTime;

    /**
     * 下班考勤时间
     */
    @TableField("after_work")
    private LocalDateTime afterWork;

    /**
     * 打卡地点
     */
    @TableField("location")
    private String location;


}
