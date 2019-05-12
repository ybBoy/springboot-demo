package com.yb.ybstudy.service.impl;

import com.yb.ybstudy.aop.LoggerAOP;
import com.yb.ybstudy.service.itl.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements ITestService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

//    @LoggerAOP(module = "sdfsddddddddddddddd")
    public String test(String name) {

        String sql = " select * from user ";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        System.out.println(list.size());
        return "1111111111";
    }
}
