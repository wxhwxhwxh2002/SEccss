package com.se.seccss.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

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
    @MethodSource("provideDeptAndCollegeAndGrade")
    void findCourseByDept(){

    }

    static Stream<Arguments> provideDeptAndCollegeAndGrade(){
        return Stream.of(
                Arguments.of("计算学院", "2020"),
                Arguments.of("计算机科学", "计算学院", "2020"),
                Arguments.of("大数据", "计算学院", "2020")

        );
    }

}