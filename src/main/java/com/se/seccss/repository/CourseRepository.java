package com.se.seccss.repository;

import com.se.seccss.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 功能描述
 * Course相关的数据库接口
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月04日
 */

public interface CourseRepository extends JpaRepository<Course, Integer> {
    //    input dept_name,college_name,grade,get all the course that dept_id equals to the dept_id of the dept or college equals to the college_name of the dept
    @Query(value = "select * from course where college=?2 and dept_id=-9 or (dept_id in (select dept_id from dept where dept_name=?1 and college_name=?2 and grade=?3))",nativeQuery = true)
    List<Course> findCourseByDept(String dept_name,String college_name,String grade);
}

