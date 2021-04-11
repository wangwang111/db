package com.wang.service;

import com.wang.entity.Employ;
import com.wang.mapper.EmployMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployService {

    @Autowired
    private EmployMapper employMapper;

    /**
     * 使用非空值查询
     */
    public void selectOne() {
        Employ employ = new Employ(null, "aa", null, 1);
        Employ returnEmploy = employMapper.selectOne(employ);
        System.out.println(returnEmploy);
    }

    /**
     * 根据主键查询
     * @Id
     */
    public void selectByPrimaryKey() {
        Employ employ = employMapper.selectByPrimaryKey(1);
        System.out.println(employ);
    }
}
