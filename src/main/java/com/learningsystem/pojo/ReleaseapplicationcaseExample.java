package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReleaseapplicationcaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseapplicationcaseExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andRacIdIsNull() {
            addCriterion("RAC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRacIdIsNotNull() {
            addCriterion("RAC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRacIdEqualTo(Integer value) {
            addCriterion("RAC_ID =", value, "racId");
            return (Criteria) this;
        }

        public Criteria andRacIdNotEqualTo(Integer value) {
            addCriterion("RAC_ID <>", value, "racId");
            return (Criteria) this;
        }

        public Criteria andRacIdGreaterThan(Integer value) {
            addCriterion("RAC_ID >", value, "racId");
            return (Criteria) this;
        }

        public Criteria andRacIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RAC_ID >=", value, "racId");
            return (Criteria) this;
        }

        public Criteria andRacIdLessThan(Integer value) {
            addCriterion("RAC_ID <", value, "racId");
            return (Criteria) this;
        }

        public Criteria andRacIdLessThanOrEqualTo(Integer value) {
            addCriterion("RAC_ID <=", value, "racId");
            return (Criteria) this;
        }

        public Criteria andRacIdIn(List<Integer> values) {
            addCriterion("RAC_ID in", values, "racId");
            return (Criteria) this;
        }

        public Criteria andRacIdNotIn(List<Integer> values) {
            addCriterion("RAC_ID not in", values, "racId");
            return (Criteria) this;
        }

        public Criteria andRacIdBetween(Integer value1, Integer value2) {
            addCriterion("RAC_ID between", value1, value2, "racId");
            return (Criteria) this;
        }

        public Criteria andRacIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RAC_ID not between", value1, value2, "racId");
            return (Criteria) this;
        }

        public Criteria andRacClassIsNull() {
            addCriterion("RAC_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andRacClassIsNotNull() {
            addCriterion("RAC_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andRacClassEqualTo(String value) {
            addCriterion("RAC_CLASS =", value, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassNotEqualTo(String value) {
            addCriterion("RAC_CLASS <>", value, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassGreaterThan(String value) {
            addCriterion("RAC_CLASS >", value, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassGreaterThanOrEqualTo(String value) {
            addCriterion("RAC_CLASS >=", value, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassLessThan(String value) {
            addCriterion("RAC_CLASS <", value, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassLessThanOrEqualTo(String value) {
            addCriterion("RAC_CLASS <=", value, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassLike(String value) {
            addCriterion("RAC_CLASS like", value, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassNotLike(String value) {
            addCriterion("RAC_CLASS not like", value, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassIn(List<String> values) {
            addCriterion("RAC_CLASS in", values, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassNotIn(List<String> values) {
            addCriterion("RAC_CLASS not in", values, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassBetween(String value1, String value2) {
            addCriterion("RAC_CLASS between", value1, value2, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacClassNotBetween(String value1, String value2) {
            addCriterion("RAC_CLASS not between", value1, value2, "racClass");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionIsNull() {
            addCriterion("RAC_CASEDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionIsNotNull() {
            addCriterion("RAC_CASEDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionEqualTo(String value) {
            addCriterion("RAC_CASEDESCRIPTION =", value, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionNotEqualTo(String value) {
            addCriterion("RAC_CASEDESCRIPTION <>", value, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionGreaterThan(String value) {
            addCriterion("RAC_CASEDESCRIPTION >", value, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("RAC_CASEDESCRIPTION >=", value, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionLessThan(String value) {
            addCriterion("RAC_CASEDESCRIPTION <", value, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionLessThanOrEqualTo(String value) {
            addCriterion("RAC_CASEDESCRIPTION <=", value, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionLike(String value) {
            addCriterion("RAC_CASEDESCRIPTION like", value, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionNotLike(String value) {
            addCriterion("RAC_CASEDESCRIPTION not like", value, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionIn(List<String> values) {
            addCriterion("RAC_CASEDESCRIPTION in", values, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionNotIn(List<String> values) {
            addCriterion("RAC_CASEDESCRIPTION not in", values, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionBetween(String value1, String value2) {
            addCriterion("RAC_CASEDESCRIPTION between", value1, value2, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCasedescriptionNotBetween(String value1, String value2) {
            addCriterion("RAC_CASEDESCRIPTION not between", value1, value2, "racCasedescription");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgIsNull() {
            addCriterion("RAC_CASEIMG is null");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgIsNotNull() {
            addCriterion("RAC_CASEIMG is not null");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgEqualTo(String value) {
            addCriterion("RAC_CASEIMG =", value, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgNotEqualTo(String value) {
            addCriterion("RAC_CASEIMG <>", value, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgGreaterThan(String value) {
            addCriterion("RAC_CASEIMG >", value, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgGreaterThanOrEqualTo(String value) {
            addCriterion("RAC_CASEIMG >=", value, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgLessThan(String value) {
            addCriterion("RAC_CASEIMG <", value, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgLessThanOrEqualTo(String value) {
            addCriterion("RAC_CASEIMG <=", value, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgLike(String value) {
            addCriterion("RAC_CASEIMG like", value, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgNotLike(String value) {
            addCriterion("RAC_CASEIMG not like", value, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgIn(List<String> values) {
            addCriterion("RAC_CASEIMG in", values, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgNotIn(List<String> values) {
            addCriterion("RAC_CASEIMG not in", values, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgBetween(String value1, String value2) {
            addCriterion("RAC_CASEIMG between", value1, value2, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacCaseimgNotBetween(String value1, String value2) {
            addCriterion("RAC_CASEIMG not between", value1, value2, "racCaseimg");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryIsNull() {
            addCriterion("RAC_UPLOADACCESSORY is null");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryIsNotNull() {
            addCriterion("RAC_UPLOADACCESSORY is not null");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryEqualTo(String value) {
            addCriterion("RAC_UPLOADACCESSORY =", value, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryNotEqualTo(String value) {
            addCriterion("RAC_UPLOADACCESSORY <>", value, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryGreaterThan(String value) {
            addCriterion("RAC_UPLOADACCESSORY >", value, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("RAC_UPLOADACCESSORY >=", value, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryLessThan(String value) {
            addCriterion("RAC_UPLOADACCESSORY <", value, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryLessThanOrEqualTo(String value) {
            addCriterion("RAC_UPLOADACCESSORY <=", value, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryLike(String value) {
            addCriterion("RAC_UPLOADACCESSORY like", value, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryNotLike(String value) {
            addCriterion("RAC_UPLOADACCESSORY not like", value, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryIn(List<String> values) {
            addCriterion("RAC_UPLOADACCESSORY in", values, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryNotIn(List<String> values) {
            addCriterion("RAC_UPLOADACCESSORY not in", values, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryBetween(String value1, String value2) {
            addCriterion("RAC_UPLOADACCESSORY between", value1, value2, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacUploadaccessoryNotBetween(String value1, String value2) {
            addCriterion("RAC_UPLOADACCESSORY not between", value1, value2, "racUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRacConditionIsNull() {
            addCriterion("RAC_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andRacConditionIsNotNull() {
            addCriterion("RAC_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andRacConditionEqualTo(Integer value) {
            addCriterion("RAC_CONDITION =", value, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacConditionNotEqualTo(Integer value) {
            addCriterion("RAC_CONDITION <>", value, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacConditionGreaterThan(Integer value) {
            addCriterion("RAC_CONDITION >", value, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("RAC_CONDITION >=", value, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacConditionLessThan(Integer value) {
            addCriterion("RAC_CONDITION <", value, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacConditionLessThanOrEqualTo(Integer value) {
            addCriterion("RAC_CONDITION <=", value, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacConditionIn(List<Integer> values) {
            addCriterion("RAC_CONDITION in", values, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacConditionNotIn(List<Integer> values) {
            addCriterion("RAC_CONDITION not in", values, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacConditionBetween(Integer value1, Integer value2) {
            addCriterion("RAC_CONDITION between", value1, value2, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("RAC_CONDITION not between", value1, value2, "racCondition");
            return (Criteria) this;
        }

        public Criteria andRacTimeIsNull() {
            addCriterion("RAC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRacTimeIsNotNull() {
            addCriterion("RAC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRacTimeEqualTo(Date value) {
            addCriterionForJDBCTime("RAC_TIME =", value, "racTime");
            return (Criteria) this;
        }

        public Criteria andRacTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("RAC_TIME <>", value, "racTime");
            return (Criteria) this;
        }

        public Criteria andRacTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("RAC_TIME >", value, "racTime");
            return (Criteria) this;
        }

        public Criteria andRacTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("RAC_TIME >=", value, "racTime");
            return (Criteria) this;
        }

        public Criteria andRacTimeLessThan(Date value) {
            addCriterionForJDBCTime("RAC_TIME <", value, "racTime");
            return (Criteria) this;
        }

        public Criteria andRacTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("RAC_TIME <=", value, "racTime");
            return (Criteria) this;
        }

        public Criteria andRacTimeIn(List<Date> values) {
            addCriterionForJDBCTime("RAC_TIME in", values, "racTime");
            return (Criteria) this;
        }

        public Criteria andRacTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("RAC_TIME not in", values, "racTime");
            return (Criteria) this;
        }

        public Criteria andRacTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("RAC_TIME between", value1, value2, "racTime");
            return (Criteria) this;
        }

        public Criteria andRacTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("RAC_TIME not between", value1, value2, "racTime");
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