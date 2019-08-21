package com.jalen.tts.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jalen.tts.bean.TestBean;
import com.jalen.tts.dao.TestBeanMapper;

@Controller
public class TestController {
	@Autowired
	TestBeanMapper tbm ;

    @RequestMapping("stringTest")
    @ResponseBody
    public String returnStr() {
        return "hello,即使是中文也可以";
    }

    @RequestMapping("entityTest")
    @ResponseBody
    public TestBean returnEntify() {
        TestBean testBean = new TestBean();
//        testBean.setTestStr("测试实体");
//        testBean.setTestInt(12);
        return testBean;
    }
    
}