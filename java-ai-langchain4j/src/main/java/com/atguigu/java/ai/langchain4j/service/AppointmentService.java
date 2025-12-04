package com.atguigu.java.ai.langchain4j.service;

import com.atguigu.java.ai.langchain4j.entity.Appointment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author action
* @description 针对表【appointment】的数据库操作Service
* @createDate 2025-12-04 10:07:25
*/
public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}
