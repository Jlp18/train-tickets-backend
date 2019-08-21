package com.jalen.tts.dao;

import com.jalen.tts.bean.OrdersResult;
import com.jalen.tts.bean.OrdersResultExample;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdersResultMapper {
    long countByExample(OrdersResultExample example);

    int deleteByExample(OrdersResultExample example);

    int insert(OrdersResult record);

    int insertSelective(OrdersResult record);

    List<OrdersResult> selectByExample(OrdersResultExample example);

    int updateByExampleSelective(@Param("record") OrdersResult record, @Param("example") OrdersResultExample example);

    int updateByExample(@Param("record") OrdersResult record, @Param("example") OrdersResultExample example);
    
    List<OrdersResult> getOrdersByUserId(BigDecimal userId);
}