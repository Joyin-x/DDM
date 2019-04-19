package com.joyin.demo.Discuss.entity;

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
public class Discuss implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论员工姓名
     */
    @TableField("employeeName")
    private String employeeName;

    /**
     * 评论的员工
     */
    @TableField("employeeID")
    private Integer employeeID;

    /**
     * 评论的内容
     */
    @TableField("content")
    private String content;

    /**
     * 评论的时间
     */
    @TableField("discussTime")
    private LocalDate discussTime;

    /**
     * 点赞人数
     */
    @TableField("like")
    private Integer like;


}
