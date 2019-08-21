package com.jalen.tts.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private BigDecimal id;

    private BigDecimal userId;

    private BigDecimal trainId;

    private BigDecimal seatId;

    private Date createTime;

    private Short price;

    private String startStation;

    private String arriveStation;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getTrainId() {
        return trainId;
    }

    public void setTrainId(BigDecimal trainId) {
        this.trainId = trainId;
    }

    public BigDecimal getSeatId() {
        return seatId;
    }

    public void setSeatId(BigDecimal seatId) {
        this.seatId = seatId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Short getPrice() {
        return price;
    }

    public void setPrice(Short price) {
        this.price = price;
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
}