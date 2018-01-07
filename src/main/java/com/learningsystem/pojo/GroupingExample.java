package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class GroupingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupingExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("G_ID is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("G_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Integer value) {
            addCriterion("G_ID =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Integer value) {
            addCriterion("G_ID <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Integer value) {
            addCriterion("G_ID >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("G_ID >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Integer value) {
            addCriterion("G_ID <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Integer value) {
            addCriterion("G_ID <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Integer> values) {
            addCriterion("G_ID in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Integer> values) {
            addCriterion("G_ID not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Integer value1, Integer value2) {
            addCriterion("G_ID between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Integer value1, Integer value2) {
            addCriterion("G_ID not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingIsNull() {
            addCriterion("G_IDENTIFYING is null");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingIsNotNull() {
            addCriterion("G_IDENTIFYING is not null");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingEqualTo(Integer value) {
            addCriterion("G_IDENTIFYING =", value, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingNotEqualTo(Integer value) {
            addCriterion("G_IDENTIFYING <>", value, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingGreaterThan(Integer value) {
            addCriterion("G_IDENTIFYING >", value, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingGreaterThanOrEqualTo(Integer value) {
            addCriterion("G_IDENTIFYING >=", value, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingLessThan(Integer value) {
            addCriterion("G_IDENTIFYING <", value, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingLessThanOrEqualTo(Integer value) {
            addCriterion("G_IDENTIFYING <=", value, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingIn(List<Integer> values) {
            addCriterion("G_IDENTIFYING in", values, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingNotIn(List<Integer> values) {
            addCriterion("G_IDENTIFYING not in", values, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingBetween(Integer value1, Integer value2) {
            addCriterion("G_IDENTIFYING between", value1, value2, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGIdentifyingNotBetween(Integer value1, Integer value2) {
            addCriterion("G_IDENTIFYING not between", value1, value2, "gIdentifying");
            return (Criteria) this;
        }

        public Criteria andGNameIsNull() {
            addCriterion("G_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("G_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("G_NAME =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("G_NAME <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("G_NAME >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("G_NAME >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("G_NAME <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("G_NAME <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("G_NAME like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("G_NAME not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("G_NAME in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("G_NAME not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("G_NAME between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("G_NAME not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGStudentidIsNull() {
            addCriterion("G_STUDENTID is null");
            return (Criteria) this;
        }

        public Criteria andGStudentidIsNotNull() {
            addCriterion("G_STUDENTID is not null");
            return (Criteria) this;
        }

        public Criteria andGStudentidEqualTo(String value) {
            addCriterion("G_STUDENTID =", value, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidNotEqualTo(String value) {
            addCriterion("G_STUDENTID <>", value, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidGreaterThan(String value) {
            addCriterion("G_STUDENTID >", value, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("G_STUDENTID >=", value, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidLessThan(String value) {
            addCriterion("G_STUDENTID <", value, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidLessThanOrEqualTo(String value) {
            addCriterion("G_STUDENTID <=", value, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidLike(String value) {
            addCriterion("G_STUDENTID like", value, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidNotLike(String value) {
            addCriterion("G_STUDENTID not like", value, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidIn(List<String> values) {
            addCriterion("G_STUDENTID in", values, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidNotIn(List<String> values) {
            addCriterion("G_STUDENTID not in", values, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidBetween(String value1, String value2) {
            addCriterion("G_STUDENTID between", value1, value2, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGStudentidNotBetween(String value1, String value2) {
            addCriterion("G_STUDENTID not between", value1, value2, "gStudentid");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumIsNull() {
            addCriterion("G_SPEAKNUM is null");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumIsNotNull() {
            addCriterion("G_SPEAKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumEqualTo(Integer value) {
            addCriterion("G_SPEAKNUM =", value, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumNotEqualTo(Integer value) {
            addCriterion("G_SPEAKNUM <>", value, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumGreaterThan(Integer value) {
            addCriterion("G_SPEAKNUM >", value, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("G_SPEAKNUM >=", value, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumLessThan(Integer value) {
            addCriterion("G_SPEAKNUM <", value, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumLessThanOrEqualTo(Integer value) {
            addCriterion("G_SPEAKNUM <=", value, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumIn(List<Integer> values) {
            addCriterion("G_SPEAKNUM in", values, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumNotIn(List<Integer> values) {
            addCriterion("G_SPEAKNUM not in", values, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumBetween(Integer value1, Integer value2) {
            addCriterion("G_SPEAKNUM between", value1, value2, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGSpeaknumNotBetween(Integer value1, Integer value2) {
            addCriterion("G_SPEAKNUM not between", value1, value2, "gSpeaknum");
            return (Criteria) this;
        }

        public Criteria andGDutyIsNull() {
            addCriterion("G_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andGDutyIsNotNull() {
            addCriterion("G_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andGDutyEqualTo(String value) {
            addCriterion("G_DUTY =", value, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyNotEqualTo(String value) {
            addCriterion("G_DUTY <>", value, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyGreaterThan(String value) {
            addCriterion("G_DUTY >", value, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyGreaterThanOrEqualTo(String value) {
            addCriterion("G_DUTY >=", value, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyLessThan(String value) {
            addCriterion("G_DUTY <", value, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyLessThanOrEqualTo(String value) {
            addCriterion("G_DUTY <=", value, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyLike(String value) {
            addCriterion("G_DUTY like", value, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyNotLike(String value) {
            addCriterion("G_DUTY not like", value, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyIn(List<String> values) {
            addCriterion("G_DUTY in", values, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyNotIn(List<String> values) {
            addCriterion("G_DUTY not in", values, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyBetween(String value1, String value2) {
            addCriterion("G_DUTY between", value1, value2, "gDuty");
            return (Criteria) this;
        }

        public Criteria andGDutyNotBetween(String value1, String value2) {
            addCriterion("G_DUTY not between", value1, value2, "gDuty");
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