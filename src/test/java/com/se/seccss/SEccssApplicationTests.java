package com.se.seccss;

import antlr.build.Tool;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.se.seccss.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.UnsupportedEncodingException;
import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
class SEccssApplicationTests {

    @Test
    void contextLoads() {

    }

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testGetAllCourses() throws Exception {
        // 使用MockMvc模拟发送GET请求到/course/findAll接口

        MvcResult result = mockMvc.perform(get("/course/findAll"))
                .andExpect(status().isOk())
                .andReturn();

        // 从返回结果中获取响应体
        String responseBody = result.getResponse().getContentAsString();

        // 将响应体转换为Java对象
        List<Course> courses = objectMapper.readValue(responseBody, new TypeReference<List<Course>>(){});

        // 断言返回结果中的课程列表不为空
        assertThat(courses).isNotEmpty();
    }



}
