package com.jalen.tts.bean;

import java.math.BigDecimal;

public class TrainSeat {
    private BigDecimal id;

    private BigDecimal trainId;

    private BigDecimal seatId;

    private BigDecimal carriage;

    private String seatType;

    private String seatLocation;

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

    public BigDecimal getSeatId() {
        return seatId;
    }

    public void setSeatId(BigDecimal seatId) {
        this.seatId = seatId;
    }

    public BigDecimal getCarriage() {
        return carriage;
    }

    public void setCarriage(BigDecimal carriage) {
        this.carriage = carriage;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType == null ? null : seatType.trim();
    }

    public String getSeatLocation() {
        return seatLocation;
    }

    public void setSeatLocation(String seatLocation) {
        this.seatLocation = seatLocation == null ? null : seatLocation.trim();
    }
}