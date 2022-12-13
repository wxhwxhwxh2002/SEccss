package com.se.seccss.repository;

import com.se.seccss.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 功能描述
 * Dept相关的数据库接口
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月04日
 */
public interface DeptRepository extends JpaRepository<Dept, Integer> {
    List<Dept> findAll();
    List<String> findDeptByCollegeName(String collegeName);

    @Query(value = "SELECT DISTINCT(d.collegeName) FROM dept d",nativeQuery = true)
    List<String> findAllCollegeNames();


}

