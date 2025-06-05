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
 * 季度分析：(QuarterlyAnalysis)表实体类
 *
 */
@TableName("`quarterly_analysis`")
@Data
@EqualsAndHashCode(callSuper = false)
public class QuarterlyAnalysis implements Serializable {

    // QuarterlyAnalysis编号
    @TableId(value = "quarterly_analysis_id", type = IdType.AUTO)
    private Integer quarterly_analysis_id;

    // 报表季度
    @TableField(value = "`reporting_quarter`")
    private String reporting_quarter;
    // 报表日期
    @TableField(value = "`report_date`")
    private String report_date;
    // 盈利金额
    @TableField(value = "`profit_amount`")
    private String profit_amount;
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
