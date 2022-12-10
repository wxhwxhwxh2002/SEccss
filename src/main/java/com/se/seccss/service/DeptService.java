package com.se.seccss.service;

import com.se.seccss.entity.Dept;
import com.se.seccss.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述
 *
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月07日 14:08
 */

@Service
public class DeptService {

    @Autowired
    private DeptRepository deptRepository;

    public List<Dept> findAll(){
        return deptRepository.findAll();
    }

}
