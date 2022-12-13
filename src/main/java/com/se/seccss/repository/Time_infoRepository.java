package com.se.seccss.repository;

import com.se.seccss.entity.Time_info;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 功能描述
 * Time_info相关的数据库接口
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月04日
 */
public interface Time_infoRepository extends JpaRepository<Time_info, Integer> {
    List<Time_info> findByCourseId(Integer courseId);
    List<String> findTeacherByCourseId(Integer courseId);
}

