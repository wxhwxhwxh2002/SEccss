package com.se.seccss.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * 功能描述
 * Time_info实体类
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月04日 16:27
 */

@Entity
@Data
public class Time_info {
    @Id
    @Column(name = "t_info_id")
    private Integer tInfoId;
    @Column(name = "course_id")
    private Integer courseId;
    private String classroom;
    private String teacher;
    @Column(name = "time_id")
    private Integer timeId;

}
