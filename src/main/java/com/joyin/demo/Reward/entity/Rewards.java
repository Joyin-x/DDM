package com.joyin.demo.Reward.entity;

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
public class Rewards implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工ID
     */
    @TableField("employee_id")
    private Integer employeeId;

    /**
     * 奖惩日期
     */
    @TableField("rewards_date")
    private LocalDate rewardsDate;

    /**
     * 奖励金额
     */
    @TableField("money")
    private Integer money;

    /**
     * 奖惩原因
     */
    @TableField("rewards_reason")
    private String rewardsReason;


}
