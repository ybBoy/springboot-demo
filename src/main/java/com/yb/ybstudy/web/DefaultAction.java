package com.yb.ybstudy.web;


import com.yb.ybstudy.aop.LoggerAOP;
import com.yb.ybstudy.service.itl.ITestService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultAction
{

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    @Qualifier("testServiceImpl")
    private ITestService iTestService;

    @GetMapping("/")
    @LoggerAOP(module = "额外若若若若若若若若若若若若")
    public String index(){
        String test = iTestService.test("小明");

        System.out.println(test);
        return "index";
    }
}
