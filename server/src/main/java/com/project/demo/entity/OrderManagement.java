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
 * 订单管理：(OrderManagement)表实体类
 *
 */
@TableName("`order_management`")
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderManagement implements Serializable {

    // OrderManagement编号
    @TableId(value = "order_management_id", type = IdType.AUTO)
    private Integer order_management_id;

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
    // 联系方式
    @TableField(value = "`contact_information`")
    private String contact_information;
    // 身份证号
    @TableField(value = "`id_number`")
    private String id_number;
    // 入住天数
    @TableField(value = "`number_of_check_in_days`")
    private String number_of_check_in_days;
    // 合计总价
    @TableField(value = "`total_price`")
    private String total_price;
    // 订单状态
    @TableField(value = "`order_status`")
    private String order_status;




    // 支付状态
    @TableField(value = "pay_state")
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @TableField(value = "pay_type")
    private String pay_type;






    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
