package com.atguigu.java.ai.langchain4j.config;

import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: action
 * @create: 2025/12/1 15:41
 **/
@Configuration
public class SeparateChatAssistantConfig {

    @Bean
    public ChatMemoryProvider chatMemoryProvider(){
       return memoryId -> MessageWindowChatMemory.builder()
               .id(memoryId)
               .maxMessages(10)
               .build();
   }
}
