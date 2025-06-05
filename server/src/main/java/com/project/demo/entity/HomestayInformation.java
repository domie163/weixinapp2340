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
 * 民宿信息：(HomestayInformation)表实体类
 *
 */
@TableName("`homestay_information`")
@Data
@EqualsAndHashCode(callSuper = false)
public class HomestayInformation implements Serializable {

    // HomestayInformation编号
    @TableId(value = "homestay_information_id", type = IdType.AUTO)
    private Integer homestay_information_id;

    // 民宿名称
    @TableField(value = "`name_of_homestay`")
    private String name_of_homestay;
    // 房东用户
    @TableField(value = "`landlord_user`")
    private Integer landlord_user;
    // 地区名称
    @TableField(value = "`region_name`")
    private String region_name;
    // 民宿地址
    @TableField(value = "`homestay_address`")
    private String homestay_address;
    // 房间号
    @TableField(value = "`room_number`")
    private String room_number;
    // 房间类型
    @TableField(value = "`room_type`")
    private String room_type;
    // 封面图片
    @TableField(value = "`cover_photo`")
    private String cover_photo;
    // 入住价格
    @TableField(value = "`check_in_price`")
    private String check_in_price;
    // 详情介绍
    @TableField(value = "`detailed_introduction`")
    private String detailed_introduction;

    // 点击数
    @TableField(value = "hits")
    private Integer hits;

    // 点赞数
    @TableField(value = "praise_len")
    private Integer praise_len;








    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
