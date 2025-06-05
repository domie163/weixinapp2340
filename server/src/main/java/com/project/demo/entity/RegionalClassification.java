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
 * 地区分类：(RegionalClassification)表实体类
 *
 */
@TableName("`regional_classification`")
@Data
@EqualsAndHashCode(callSuper = false)
public class RegionalClassification implements Serializable {

    // RegionalClassification编号
    @TableId(value = "regional_classification_id", type = IdType.AUTO)
    private Integer regional_classification_id;

    // 地区名称
    @TableField(value = "`region_name`")
    private String region_name;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
