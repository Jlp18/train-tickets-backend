package com.jalen.tts.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jalen.tts.bean.Orders;
import com.jalen.tts.bean.OrdersResult;
import com.jalen.tts.dao.OrdersMapper;
import com.jalen.tts.dao.OrdersResultMapper;
import com.jalen.tts.service.OrdersService;

@Service
public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersMapper orderMapper;
	@Autowired
	private OrdersResultMapper ordersResultMapper;
	public int[] getCountByMonth() {
		int one = orderMapper.getCountByMonth("01");
		int two = orderMapper.getCountByMonth("02");
		int three = orderMapper.getCountByMonth("03");
		int four = orderMapper.getCountByMonth("04");
		int five = orderMapper.getCountByMonth("05");
		int six = orderMapper.getCountByMonth("06");
		int seven = orderMapper.getCountByMonth("07");
		int eight = orderMapper.getCountByMonth("08");
		int nine = orderMapper.getCountByMonth("09");
		int ten = orderMapper.getCountByMonth("10");
		int eleven = orderMapper.getCountByMonth("11");
		int twelve = orderMapper.getCountByMonth("12");
		int[] arr = {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve};
		return arr;
	}
	
	public int insertOrder(Orders record) {
		return this.orderMapper.insert(record);
	}
	
	public List<OrdersResult> getOrdersByUserId(BigDecimal userId){
		List<OrdersResult> list = this.ordersResultMapper.getOrdersByUserId(userId);
		return list;
	}
	
	public int getOrdersCount() {
		return this.orderMapper.getOrdersCount();
	}
}
