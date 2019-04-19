package com.joyin.demo.Praise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Praise implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 点赞员工id
     */
    @TableField("employee_id")
    private Integer employeeId;

    /**
     * 点赞文章id
     */
    @TableField("article_id")
    private Integer articleId;


}
