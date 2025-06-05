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
 * 房间分类：(RoomClassification)表实体类
 *
 */
@TableName("`room_classification`")
@Data
@EqualsAndHashCode(callSuper = false)
public class RoomClassification implements Serializable {

    // RoomClassification编号
    @TableId(value = "room_classification_id", type = IdType.AUTO)
    private Integer room_classification_id;

    // 房间类型
    @TableField(value = "`room_type`")
    private String room_type;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
