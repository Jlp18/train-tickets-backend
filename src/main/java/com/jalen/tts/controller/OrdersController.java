package com.jalen.tts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jalen.tts.bean.Orders;
import com.jalen.tts.bean.OrdersResult;
import com.jalen.tts.bean.User;
import com.jalen.tts.model.ResultModel;
import com.jalen.tts.service.OrdersService;

@Controller
public class OrdersController {
	@Autowired
	private OrdersService orderService;
	
	@RequestMapping(value="/getCount", method=RequestMethod.POST)
	public ResponseEntity<ResultModel> getCount(){
		int count[] = orderService.getCountByMonth();
		System.out.println("count:"+ count);
		return new ResponseEntity<ResultModel>(ResultModel.ok(count), HttpStatus.OK);
	}
	
	@RequestMapping(value="/insertOrder", method=RequestMethod.POST)
	public ResponseEntity<ResultModel> insertOrder(Orders order){
		System.out.println("order:"+order.getUserId());
		int result = this.orderService.insertOrder(order);
		return new ResponseEntity<ResultModel>(ResultModel.ok(result), HttpStatus.OK);
	}
	
	@RequestMapping(value="/getOrders", method=RequestMethod.POST)
	public ResponseEntity<ResultModel> getOrders(User user){
		List<OrdersResult> list = this.orderService.getOrdersByUserId(user.getUserId());
		return new ResponseEntity<ResultModel>(ResultModel.ok(list), HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/getOrdersCount", method=RequestMethod.POST)
	public ResponseEntity<ResultModel> getOrdersCount(){
		int count = this.orderService.getOrdersCount();
		return new ResponseEntity<ResultModel>(ResultModel.ok(count), HttpStatus.OK);
	}
}
