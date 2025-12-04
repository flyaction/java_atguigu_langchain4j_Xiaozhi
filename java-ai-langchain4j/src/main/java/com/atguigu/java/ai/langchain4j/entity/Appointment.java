package com.atguigu.java.ai.langchain4j.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName appointment
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value ="appointment")
public class Appointment {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private String idCard;

    /**
     * 
     */
    private String department;

    /**
     * 
     */
    private String date;

    /**
     * 
     */
    private String time;

    /**
     * 
     */
    private String doctorName;
}