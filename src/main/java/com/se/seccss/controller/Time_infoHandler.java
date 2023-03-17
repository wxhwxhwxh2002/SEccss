package com.se.seccss.controller;

import com.se.seccss.entity.Time_info;
import com.se.seccss.repository.Time_infoRepository;
import com.se.seccss.service.Time_infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述
 * Time_info相关的控制器
 * @author: WenXiaohan_32005231_ZUCC
 * @date: 2022年12月04日 16:30
 */

@RestController
@RequestMapping(value = "/time",produces = "application/json;charset=UTF-8")
public class Time_infoHandler {
    @Autowired
    private Time_infoService time_infoService;
    @GetMapping("/findAll")
    public List<Time_info> findAll(){
        return time_infoService.findAll();
    }

    @GetMapping("/findTimeByCourseId")
    public List<Time_info> findTimeByCourseId(@RequestParam Integer courseId){
        return time_infoService.findTimeByCourseId(courseId);
    }
}