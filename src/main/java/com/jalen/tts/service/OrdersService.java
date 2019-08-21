package com.jalen.tts.service;

import java.math.BigDecimal;
import java.util.List;

import com.jalen.tts.bean.Orders;
import com.jalen.tts.bean.OrdersResult;

public interface OrdersService {
	public int[] getCountByMonth();
	
	public int insertOrder(Orders record);
	
	public List<OrdersResult> getOrdersByUserId(BigDecimal userId);
	
	public int getOrdersCount();
}
