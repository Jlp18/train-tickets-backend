package com.jalen.tts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jalen.tts.bean.SelectedResults;
import com.jalen.tts.model.ResultModel;
import com.jalen.tts.service.TrainStationService;

@Controller
public class TrainStationController {
	
	@Autowired
	private TrainStationService trainStationService;
	
	@RequestMapping(value="/selectTickets", method=RequestMethod.POST)
	public ResponseEntity<ResultModel> selectTickets(SelectedResults selectedResults){
		List<SelectedResults> list = trainStationService.selectTicketsByFromAndTo(selectedResults);
		System.out.println(selectedResults.getStartStation());
		return new ResponseEntity<ResultModel>(ResultModel.ok(list), HttpStatus.OK);
	}
	
	@RequestMapping(value="/getSelectsCount", method=RequestMethod.POST)
	public ResponseEntity<ResultModel> getSelectsOrder(){
		int count = this.trainStationService.getSelectsCount();
		return new ResponseEntity<ResultModel>(ResultModel.ok(count), HttpStatus.OK);
	}
}
