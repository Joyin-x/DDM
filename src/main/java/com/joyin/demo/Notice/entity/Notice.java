package com.joyin.demo.Notice.entity;

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
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工Id
     */
    @TableField("employee_id")
    private Integer employeeId;

    /**
     * 公告标题
     */
    @TableField("header")
    private String header;

    /**
     * 公告内容
     */
    @TableField("content")
    private String content;

    /**
     * 发布时间
     */
    @TableField("notice_time")
    private LocalDate noticeTime;

    /**
     * 点赞人数
     */
    @TableField("like")
    private Integer like;


}
