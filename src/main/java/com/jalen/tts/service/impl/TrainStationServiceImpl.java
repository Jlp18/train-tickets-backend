package com.jalen.tts.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jalen.tts.bean.SelectedResults;
import com.jalen.tts.bean.TrainSeat;
import com.jalen.tts.dao.SelectedResultsMapper;
import com.jalen.tts.dao.TrainSeatMapper;
import com.jalen.tts.dao.TrainStationMapper;
import com.jalen.tts.service.TrainStationService;

@Service
public class TrainStationServiceImpl implements TrainStationService {
	
	@Autowired
	private TrainStationMapper trainStationMapper;
	@Autowired 
	SelectedResultsMapper selectResultsMapper;
	@Autowired
	TrainSeatMapper trainSeatMapper;
	
	public List<SelectedResults> selectTicketsByFromAndTo(SelectedResults selectedResults){
//		selectedResults.setStartStation(startStation);
//		selectedResults.setArriveStation(arriveStation);
		
		List<SelectedResults> ticketsList = trainStationMapper.selectTrainByFromAndTo(selectedResults);
		for(SelectedResults oneRecord: ticketsList) {
			this.selectResultsMapper.insert(oneRecord);
			System.out.println(oneRecord.getTrainId());
			List<TrainSeat> trainSeatDetails = this.trainSeatMapper.selectTrainSeatDetail(oneRecord.getTrainId());
			oneRecord.setTrainSeat(trainSeatDetails);
		}
		return ticketsList;
	}
	
	public int getSelectsCount() {
		return this.trainStationMapper.getSelectsCount();
	}
}
