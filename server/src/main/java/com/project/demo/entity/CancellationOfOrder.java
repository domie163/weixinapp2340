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
 * 取消订单：(CancellationOfOrder)表实体类
 *
 */
@TableName("`cancellation_of_order`")
@Data
@EqualsAndHashCode(callSuper = false)
public class CancellationOfOrder implements Serializable {

    // CancellationOfOrder编号
    @TableId(value = "cancellation_of_order_id", type = IdType.AUTO)
    private Integer cancellation_of_order_id;

    // 订单编号
    @TableField(value = "`order_number`")
    private String order_number;
    // 民宿名称
    @TableField(value = "`name_of_homestay`")
    private String name_of_homestay;
    // 房间号
    @TableField(value = "`room_number`")
    private String room_number;
    // 房间房型
    @TableField(value = "`room_type`")
    private String room_type;
    // 入住价格
    @TableField(value = "`check_in_price`")
    private String check_in_price;
    // 预订用户
    @TableField(value = "`booking_users`")
    private Integer booking_users;
    // 用户姓名
    @TableField(value = "`user_name`")
    private String user_name;
    // 退订原因
    @TableField(value = "`reason_for_unsubscription`")
    private String reason_for_unsubscription;










    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
