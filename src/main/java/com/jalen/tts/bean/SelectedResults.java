package com.jalen.tts.bean;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SelectedResults {
    private BigDecimal id;

    private BigDecimal trainId;

    private String trainName;

    private BigDecimal startStationId;

    private BigDecimal arriveStationId;

    private String startStation;

    private String arriveStation;

    private Date startTime;

    private Date arriveTime;

    private BigDecimal totalDistance;
    
    private String chosedDate;
    
    private List<TrainSeat> trainSeat;
    
    
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

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName == null ? null : trainName.trim();
    }

    public BigDecimal getStartStationId() {
        return startStationId;
    }

    public void setStartStationId(BigDecimal startStationId) {
        this.startStationId = startStationId;
    }

    public BigDecimal getArriveStationId() {
        return arriveStationId;
    }

    public void setArriveStationId(BigDecimal arriveStationId) {
        this.arriveStationId = arriveStationId;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation == null ? null : startStation.trim();
    }

    public String getArriveStation() {
        return arriveStation;
    }

    public void setArriveStation(String arriveStation) {
        this.arriveStation = arriveStation == null ? null : arriveStation.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public BigDecimal getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(BigDecimal totalDistance) {
        this.totalDistance = totalDistance;
    }
    
    public String getChosedDate() {
    	return chosedDate;
    }
    
    public void setChosedDate(String time) {
    	this.chosedDate = time;
    }
    
    public List<TrainSeat> getTrainSeat(){
    	return trainSeat;
    }
    
    public void setTrainSeat(List<TrainSeat> trainSeat) {
    	this.trainSeat = trainSeat;
    }

    
    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", trainId=" + trainId +
                ", trainName=" + trainName +
                ", startStationId=" + startStationId +
                ", arriveStationId=" + arriveStationId +
                ", startStation='" + startStation +
                ", arriveStation=" + arriveStation +
                ", startTime=" + startTime +
                ", arriveTime=" + arriveTime +
                ", totalDistance=" + totalDistance +
                ", trainSeat=" + trainSeat +
                '}';
    }
}