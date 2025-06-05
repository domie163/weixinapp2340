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
 * 销售数据：(SalesData)表实体类
 *
 */
@TableName("`sales_data`")
@Data
@EqualsAndHashCode(callSuper = false)
public class SalesData implements Serializable {

    // SalesData编号
    @TableId(value = "sales_data_id", type = IdType.AUTO)
    private Integer sales_data_id;

    // 报表标题
    @TableField(value = "`report_title`")
    private String report_title;
    // 报表日期
    @TableField(value = "`report_date`")
    private Timestamp report_date;
    // 销售数量
    @TableField(value = "`sales_volumes`")
    private String sales_volumes;
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
