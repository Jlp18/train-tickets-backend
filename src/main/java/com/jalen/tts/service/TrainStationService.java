package com.jalen.tts.service;

import java.util.List;

import com.jalen.tts.bean.SelectedResults;

public interface TrainStationService {
	public List<SelectedResults> selectTicketsByFromAndTo(SelectedResults selectedResults);
	
	public int getSelectsCount();
}
