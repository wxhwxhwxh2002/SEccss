package com.se.seccss.controller;

import com.se.seccss.entity.Dept;
import com.se.seccss.repository.DeptRepository;
import com.se.seccss.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述
 *
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月04日 16:24
 */

@RestController
@RequestMapping(value = "/dept",produces = "application/json;charset=UTF-8")
public class DeptHandler {
    @Autowired
    private DeptService deptService;

    @GetMapping("/findAll")
    public List<Dept> findAll(){
        return deptService.findAll();
    }


}
