package com.jalen.tts.dao;

import com.jalen.tts.bean.TestBean;
import com.jalen.tts.bean.TestBeanExample;
import com.jalen.tts.bean.User;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestBeanMapper {
    long countByExample(TestBeanExample example);

    int deleteByExample(TestBeanExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(User record);

    int insertSelective(TestBean record);

    List<TestBean> selectByExample(TestBeanExample example);

    TestBean selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") TestBean record, @Param("example") TestBeanExample example);

    int updateByExample(@Param("record") TestBean record, @Param("example") TestBeanExample example);

    int updateByPrimaryKeySelective(TestBean record);

    int updateByPrimaryKey(TestBean record);
}