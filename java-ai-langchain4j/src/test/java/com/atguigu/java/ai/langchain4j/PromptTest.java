package com.atguigu.java.ai.langchain4j;

import com.atguigu.java.ai.langchain4j.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: action
 * @create: 2025/12/2 15:11
 **/
@SpringBootTest
public class PromptTest {

    @Autowired
    private SeparateChatAssistant separateChatAssistant;

    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(3,"今天几号");
        System.out.println(answer);
    }

}
