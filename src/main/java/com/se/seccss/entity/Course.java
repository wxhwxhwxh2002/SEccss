package com.se.seccss.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.security.PrivateKey;

/**
 * 功能描述
 * Course实体类
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月04日 16:00
 */

@Entity
@Data
public class Course {
    @Id
    @Column(name = "course_id")
    private Integer courseId;
    @Column(name = "course_num")
    private String courseNum;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "dept_id")
    private Integer deptId;
    private String college;
}
