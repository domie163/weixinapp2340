package com.project.demo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * 盈亏数据：(ProfitAndLossData)表实体类
 *
 */
@TableName("`profit_and_loss_data`")
@Data
@EqualsAndHashCode(callSuper = false)
public class ProfitAndLossData implements Serializable {

    // ProfitAndLossData编号
    @TableId(value = "profit_and_loss_data_id", type = IdType.AUTO)
    private Integer profit_and_loss_data_id;

    // 报表标题
    @TableField(value = "`report_title`")
    private String report_title;
    // 报表日期
    @TableField(value = "`report_date`")
    private Timestamp report_date;
    // 盈利金额
    @TableField(value = "`profit_amount`")
    private String profit_amount;
    // 亏损金额
    @TableField(value = "`loss_amount`")
    private String loss_amount;
    // 记录人员
    @TableField(value = "`recording_personnel`")
    private String recording_personnel;
    // 备注信息
    @TableField(value = "`remarks`")
    private String remarks;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
