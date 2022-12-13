package com.se.seccss.service;

import com.se.seccss.entity.Course;
import com.se.seccss.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述
 * Course相关的业务逻辑层
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月07日 14:07
 */

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    //查询所有课程
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    //根据专业查询课程
    public List<Course> findCourseByDept(String dept_name, String college_name, String grade) {
        return courseRepository.findCourseByDept(dept_name, college_name, grade);
    }
}

