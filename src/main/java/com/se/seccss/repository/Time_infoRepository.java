package com.se.seccss.repository;

import com.se.seccss.entity.Time_info;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Time_infoRepository extends JpaRepository<Time_info, Integer> {
    List<Time_info> findByCourseId(Integer courseId);
    List<String> findTeacherByCourseId(Integer courseId);
}

