package com.se.seccss.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 功能描述
 *
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月04日 16:21
 */

@Entity
@Data
public class Dept {
    @Id
    @Column(name = "dept_id")
    private Integer deptId;
    @Column(name = "dept_name")
    private String deptName;
    @Column(name = "college_name")
    private String collegeName;
    private String grade;
}
