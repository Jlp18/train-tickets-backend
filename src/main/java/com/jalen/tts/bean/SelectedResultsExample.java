package com.jalen.tts.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SelectedResultsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SelectedResultsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNull() {
            addCriterion("TRAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrainIdIsNotNull() {
            addCriterion("TRAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrainIdEqualTo(BigDecimal value) {
            addCriterion("TRAIN_ID =", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotEqualTo(BigDecimal value) {
            addCriterion("TRAIN_ID <>", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThan(BigDecimal value) {
            addCriterion("TRAIN_ID >", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAIN_ID >=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThan(BigDecimal value) {
            addCriterion("TRAIN_ID <", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRAIN_ID <=", value, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdIn(List<BigDecimal> values) {
            addCriterion("TRAIN_ID in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotIn(List<BigDecimal> values) {
            addCriterion("TRAIN_ID not in", values, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAIN_ID between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRAIN_ID not between", value1, value2, "trainId");
            return (Criteria) this;
        }

        public Criteria andTrainNameIsNull() {
            addCriterion("TRAIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTrainNameIsNotNull() {
            addCriterion("TRAIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTrainNameEqualTo(String value) {
            addCriterion("TRAIN_NAME =", value, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameNotEqualTo(String value) {
            addCriterion("TRAIN_NAME <>", value, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameGreaterThan(String value) {
            addCriterion("TRAIN_NAME >", value, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRAIN_NAME >=", value, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameLessThan(String value) {
            addCriterion("TRAIN_NAME <", value, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameLessThanOrEqualTo(String value) {
            addCriterion("TRAIN_NAME <=", value, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameLike(String value) {
            addCriterion("TRAIN_NAME like", value, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameNotLike(String value) {
            addCriterion("TRAIN_NAME not like", value, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameIn(List<String> values) {
            addCriterion("TRAIN_NAME in", values, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameNotIn(List<String> values) {
            addCriterion("TRAIN_NAME not in", values, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameBetween(String value1, String value2) {
            addCriterion("TRAIN_NAME between", value1, value2, "trainName");
            return (Criteria) this;
        }

        public Criteria andTrainNameNotBetween(String value1, String value2) {
            addCriterion("TRAIN_NAME not between", value1, value2, "trainName");
            return (Criteria) this;
        }

        public Criteria andStartStationIdIsNull() {
            addCriterion("START_STATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andStartStationIdIsNotNull() {
            addCriterion("START_STATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStartStationIdEqualTo(BigDecimal value) {
            addCriterion("START_STATION_ID =", value, "startStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIdNotEqualTo(BigDecimal value) {
            addCriterion("START_STATION_ID <>", value, "startStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIdGreaterThan(BigDecimal value) {
            addCriterion("START_STATION_ID >", value, "startStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("START_STATION_ID >=", value, "startStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIdLessThan(BigDecimal value) {
            addCriterion("START_STATION_ID <", value, "startStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("START_STATION_ID <=", value, "startStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIdIn(List<BigDecimal> values) {
            addCriterion("START_STATION_ID in", values, "startStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIdNotIn(List<BigDecimal> values) {
            addCriterion("START_STATION_ID not in", values, "startStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("START_STATION_ID between", value1, value2, "startStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("START_STATION_ID not between", value1, value2, "startStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdIsNull() {
            addCriterion("ARRIVE_STATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdIsNotNull() {
            addCriterion("ARRIVE_STATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdEqualTo(BigDecimal value) {
            addCriterion("ARRIVE_STATION_ID =", value, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdNotEqualTo(BigDecimal value) {
            addCriterion("ARRIVE_STATION_ID <>", value, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdGreaterThan(BigDecimal value) {
            addCriterion("ARRIVE_STATION_ID >", value, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ARRIVE_STATION_ID >=", value, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdLessThan(BigDecimal value) {
            addCriterion("ARRIVE_STATION_ID <", value, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ARRIVE_STATION_ID <=", value, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdIn(List<BigDecimal> values) {
            addCriterion("ARRIVE_STATION_ID in", values, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdNotIn(List<BigDecimal> values) {
            addCriterion("ARRIVE_STATION_ID not in", values, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARRIVE_STATION_ID between", value1, value2, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andArriveStationIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARRIVE_STATION_ID not between", value1, value2, "arriveStationId");
            return (Criteria) this;
        }

        public Criteria andStartStationIsNull() {
            addCriterion("START_STATION is null");
            return (Criteria) this;
        }

        public Criteria andStartStationIsNotNull() {
            addCriterion("START_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andStartStationEqualTo(String value) {
            addCriterion("START_STATION =", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationNotEqualTo(String value) {
            addCriterion("START_STATION <>", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationGreaterThan(String value) {
            addCriterion("START_STATION >", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationGreaterThanOrEqualTo(String value) {
            addCriterion("START_STATION >=", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationLessThan(String value) {
            addCriterion("START_STATION <", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationLessThanOrEqualTo(String value) {
            addCriterion("START_STATION <=", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationLike(String value) {
            addCriterion("START_STATION like", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationNotLike(String value) {
            addCriterion("START_STATION not like", value, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationIn(List<String> values) {
            addCriterion("START_STATION in", values, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationNotIn(List<String> values) {
            addCriterion("START_STATION not in", values, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationBetween(String value1, String value2) {
            addCriterion("START_STATION between", value1, value2, "startStation");
            return (Criteria) this;
        }

        public Criteria andStartStationNotBetween(String value1, String value2) {
            addCriterion("START_STATION not between", value1, value2, "startStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationIsNull() {
            addCriterion("ARRIVE_STATION is null");
            return (Criteria) this;
        }

        public Criteria andArriveStationIsNotNull() {
            addCriterion("ARRIVE_STATION is not null");
            return (Criteria) this;
        }

        public Criteria andArriveStationEqualTo(String value) {
            addCriterion("ARRIVE_STATION =", value, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationNotEqualTo(String value) {
            addCriterion("ARRIVE_STATION <>", value, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationGreaterThan(String value) {
            addCriterion("ARRIVE_STATION >", value, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationGreaterThanOrEqualTo(String value) {
            addCriterion("ARRIVE_STATION >=", value, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationLessThan(String value) {
            addCriterion("ARRIVE_STATION <", value, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationLessThanOrEqualTo(String value) {
            addCriterion("ARRIVE_STATION <=", value, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationLike(String value) {
            addCriterion("ARRIVE_STATION like", value, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationNotLike(String value) {
            addCriterion("ARRIVE_STATION not like", value, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationIn(List<String> values) {
            addCriterion("ARRIVE_STATION in", values, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationNotIn(List<String> values) {
            addCriterion("ARRIVE_STATION not in", values, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationBetween(String value1, String value2) {
            addCriterion("ARRIVE_STATION between", value1, value2, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andArriveStationNotBetween(String value1, String value2) {
            addCriterion("ARRIVE_STATION not between", value1, value2, "arriveStation");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("ARRIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("ARRIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(Date value) {
            addCriterion("ARRIVE_TIME =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(Date value) {
            addCriterion("ARRIVE_TIME <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(Date value) {
            addCriterion("ARRIVE_TIME >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ARRIVE_TIME >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(Date value) {
            addCriterion("ARRIVE_TIME <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("ARRIVE_TIME <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<Date> values) {
            addCriterion("ARRIVE_TIME in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<Date> values) {
            addCriterion("ARRIVE_TIME not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(Date value1, Date value2) {
            addCriterion("ARRIVE_TIME between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("ARRIVE_TIME not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceIsNull() {
            addCriterion("TOTAL_DISTANCE is null");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceIsNotNull() {
            addCriterion("TOTAL_DISTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DISTANCE =", value, "totalDistance");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DISTANCE <>", value, "totalDistance");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_DISTANCE >", value, "totalDistance");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DISTANCE >=", value, "totalDistance");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceLessThan(BigDecimal value) {
            addCriterion("TOTAL_DISTANCE <", value, "totalDistance");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DISTANCE <=", value, "totalDistance");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DISTANCE in", values, "totalDistance");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DISTANCE not in", values, "totalDistance");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DISTANCE between", value1, value2, "totalDistance");
            return (Criteria) this;
        }

        public Criteria andTotalDistanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DISTANCE not between", value1, value2, "totalDistance");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}