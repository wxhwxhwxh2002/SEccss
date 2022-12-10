package com.se.seccss.service;

import com.se.seccss.entity.Time_info;
import com.se.seccss.repository.Time_infoRepository;
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
public class Time_infoService {
    @Autowired
    private Time_infoRepository time_infoRepository;

    public List<Time_info> findAll(){
        return time_infoRepository.findAll();
    }

    public List<Time_info> findTimeByCourseId(Integer courseId){
        return time_infoRepository.findByCourseId(courseId);
    }

}
