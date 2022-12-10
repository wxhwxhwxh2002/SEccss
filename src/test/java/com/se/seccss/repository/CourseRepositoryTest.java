package com.se.seccss.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void findAll() {
        System.out.println(courseRepository.findAll());
    }

    @Test
    @ParameterizedTest
    void findCourseByDept(String dept_name,String college_name,String grade){
        //input
        dept_name="软件工程";
        college_name="计算学院";
        grade="2020";
        System.out.println(courseRepository.findCourseByDept(dept_name,college_name,grade));
    }
}