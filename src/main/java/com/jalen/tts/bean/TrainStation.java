package com.jalen.tts.bean;

import java.math.BigDecimal;
import java.util.Date;

public class TrainStation {
    private BigDecimal id;

    private BigDecimal trainId;

    private BigDecimal stationId;

    private String stationName;

    private Date arriveTime;

    private BigDecimal stopTime;

    private BigDecimal distance;
    
    private Train train;
    
    public Train getTrain() {
    	return train;
    }
    
    public void setTrain(Train train) {
    	this.train = train;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getTrainId() {
        return trainId;
    }

    public void setTrainId(BigDecimal trainId) {
        this.trainId = trainId;
    }

    public BigDecimal getStationId() {
        return stationId;
    }

    public void setStationId(BigDecimal stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public BigDecimal getStopTime() {
        return stopTime;
    }

    public void setStopTime(BigDecimal stopTime) {
        this.stopTime = stopTime;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }
}