package com.atguigu.java.ai.langchain4j.bean;

import lombok.Data;

/**
 * @author: action
 * @create: 2025/12/4 08:35
 **/
@Data
public class ChatForm {

   private Long memoryId;//对话id
   private String message;//用户问题

}
