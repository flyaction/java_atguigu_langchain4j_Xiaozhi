package com.atguigu.java.ai.langchain4j.mapper;

import com.atguigu.java.ai.langchain4j.entity.Appointment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author action
* @description 针对表【appointment】的数据库操作Mapper
* @createDate 2025-12-04 10:07:25
* @Entity com.atguigu.java.ai.langchain4j.entity.Appointment
*/
@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {

}




