package com.jalen.tts.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TrainSeatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainSeatExample() {
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

        public Criteria andSeatIdIsNull() {
            addCriterion("SEAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("SEAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(BigDecimal value) {
            addCriterion("SEAT_ID =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(BigDecimal value) {
            addCriterion("SEAT_ID <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(BigDecimal value) {
            addCriterion("SEAT_ID >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEAT_ID >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(BigDecimal value) {
            addCriterion("SEAT_ID <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEAT_ID <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<BigDecimal> values) {
            addCriterion("SEAT_ID in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<BigDecimal> values) {
            addCriterion("SEAT_ID not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEAT_ID between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEAT_ID not between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNull() {
            addCriterion("CARRIAGE is null");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNotNull() {
            addCriterion("CARRIAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageEqualTo(BigDecimal value) {
            addCriterion("CARRIAGE =", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotEqualTo(BigDecimal value) {
            addCriterion("CARRIAGE <>", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThan(BigDecimal value) {
            addCriterion("CARRIAGE >", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARRIAGE >=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThan(BigDecimal value) {
            addCriterion("CARRIAGE <", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARRIAGE <=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageIn(List<BigDecimal> values) {
            addCriterion("CARRIAGE in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotIn(List<BigDecimal> values) {
            addCriterion("CARRIAGE not in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARRIAGE between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARRIAGE not between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIsNull() {
            addCriterion("SEAT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIsNotNull() {
            addCriterion("SEAT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeEqualTo(String value) {
            addCriterion("SEAT_TYPE =", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotEqualTo(String value) {
            addCriterion("SEAT_TYPE <>", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeGreaterThan(String value) {
            addCriterion("SEAT_TYPE >", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SEAT_TYPE >=", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeLessThan(String value) {
            addCriterion("SEAT_TYPE <", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeLessThanOrEqualTo(String value) {
            addCriterion("SEAT_TYPE <=", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeLike(String value) {
            addCriterion("SEAT_TYPE like", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotLike(String value) {
            addCriterion("SEAT_TYPE not like", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIn(List<String> values) {
            addCriterion("SEAT_TYPE in", values, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotIn(List<String> values) {
            addCriterion("SEAT_TYPE not in", values, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeBetween(String value1, String value2) {
            addCriterion("SEAT_TYPE between", value1, value2, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotBetween(String value1, String value2) {
            addCriterion("SEAT_TYPE not between", value1, value2, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatLocationIsNull() {
            addCriterion("SEAT_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andSeatLocationIsNotNull() {
            addCriterion("SEAT_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andSeatLocationEqualTo(String value) {
            addCriterion("SEAT_LOCATION =", value, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationNotEqualTo(String value) {
            addCriterion("SEAT_LOCATION <>", value, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationGreaterThan(String value) {
            addCriterion("SEAT_LOCATION >", value, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationGreaterThanOrEqualTo(String value) {
            addCriterion("SEAT_LOCATION >=", value, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationLessThan(String value) {
            addCriterion("SEAT_LOCATION <", value, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationLessThanOrEqualTo(String value) {
            addCriterion("SEAT_LOCATION <=", value, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationLike(String value) {
            addCriterion("SEAT_LOCATION like", value, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationNotLike(String value) {
            addCriterion("SEAT_LOCATION not like", value, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationIn(List<String> values) {
            addCriterion("SEAT_LOCATION in", values, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationNotIn(List<String> values) {
            addCriterion("SEAT_LOCATION not in", values, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationBetween(String value1, String value2) {
            addCriterion("SEAT_LOCATION between", value1, value2, "seatLocation");
            return (Criteria) this;
        }

        public Criteria andSeatLocationNotBetween(String value1, String value2) {
            addCriterion("SEAT_LOCATION not between", value1, value2, "seatLocation");
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