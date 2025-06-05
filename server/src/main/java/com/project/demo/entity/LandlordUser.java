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
 * 房东用户：(LandlordUser)表实体类
 *
 */
@TableName("`landlord_user`")
@Data
@EqualsAndHashCode(callSuper = false)
public class LandlordUser implements Serializable {

    // LandlordUser编号
    @TableId(value = "landlord_user_id", type = IdType.AUTO)
    private Integer landlord_user_id;

    // 民宿名称
    @TableField(value = "`name_of_homestay`")
    private String name_of_homestay;
    // 房东姓名
    @TableField(value = "`landlord_name`")
    private String landlord_name;
    // 民宿地址
    @TableField(value = "`homestay_address`")
    private String homestay_address;







    // 用户编号
    @TableField(value = "user_id")
    private Integer userId;



    // 更新时间
    @TableField(value = "update_time")
    private Timestamp update_time;

    // 创建时间
    @TableField(value = "create_time")
    private Timestamp create_time;







}
