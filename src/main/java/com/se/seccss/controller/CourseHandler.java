package com.se.seccss.controller;

import com.se.seccss.entity.Course;
import com.se.seccss.repository.CourseRepository;
import com.se.seccss.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述
 * Course相关的控制器
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月04日 16:15
 */

@RestController
@RequestMapping(value = "/course", produces = "application/json;charset=UTF-8")
public class CourseHandler {
    @Autowired
    private CourseService courseService;

    @GetMapping("/findAll")
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @GetMapping("/findCourseByDept")
    public List<Course> findCourseByDeptId(String dept_name, String college_name, String grade) {
        return courseService.findCourseByDept(dept_name, college_name, grade);
    }
}

