package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReleaselearningcontentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaselearningcontentExample() {
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

        public Criteria andRlcIdIsNull() {
            addCriterion("RLC_ID is null");
            return (Criteria) this;
        }

        public Criteria andRlcIdIsNotNull() {
            addCriterion("RLC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRlcIdEqualTo(Integer value) {
            addCriterion("RLC_ID =", value, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcIdNotEqualTo(Integer value) {
            addCriterion("RLC_ID <>", value, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcIdGreaterThan(Integer value) {
            addCriterion("RLC_ID >", value, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RLC_ID >=", value, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcIdLessThan(Integer value) {
            addCriterion("RLC_ID <", value, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcIdLessThanOrEqualTo(Integer value) {
            addCriterion("RLC_ID <=", value, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcIdIn(List<Integer> values) {
            addCriterion("RLC_ID in", values, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcIdNotIn(List<Integer> values) {
            addCriterion("RLC_ID not in", values, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcIdBetween(Integer value1, Integer value2) {
            addCriterion("RLC_ID between", value1, value2, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RLC_ID not between", value1, value2, "rlcId");
            return (Criteria) this;
        }

        public Criteria andRlcClassIsNull() {
            addCriterion("RLC_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andRlcClassIsNotNull() {
            addCriterion("RLC_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andRlcClassEqualTo(String value) {
            addCriterion("RLC_CLASS =", value, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassNotEqualTo(String value) {
            addCriterion("RLC_CLASS <>", value, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassGreaterThan(String value) {
            addCriterion("RLC_CLASS >", value, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassGreaterThanOrEqualTo(String value) {
            addCriterion("RLC_CLASS >=", value, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassLessThan(String value) {
            addCriterion("RLC_CLASS <", value, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassLessThanOrEqualTo(String value) {
            addCriterion("RLC_CLASS <=", value, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassLike(String value) {
            addCriterion("RLC_CLASS like", value, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassNotLike(String value) {
            addCriterion("RLC_CLASS not like", value, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassIn(List<String> values) {
            addCriterion("RLC_CLASS in", values, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassNotIn(List<String> values) {
            addCriterion("RLC_CLASS not in", values, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassBetween(String value1, String value2) {
            addCriterion("RLC_CLASS between", value1, value2, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcClassNotBetween(String value1, String value2) {
            addCriterion("RLC_CLASS not between", value1, value2, "rlcClass");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsIsNull() {
            addCriterion("RLC_LEARNINGGOALS is null");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsIsNotNull() {
            addCriterion("RLC_LEARNINGGOALS is not null");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsEqualTo(String value) {
            addCriterion("RLC_LEARNINGGOALS =", value, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsNotEqualTo(String value) {
            addCriterion("RLC_LEARNINGGOALS <>", value, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsGreaterThan(String value) {
            addCriterion("RLC_LEARNINGGOALS >", value, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsGreaterThanOrEqualTo(String value) {
            addCriterion("RLC_LEARNINGGOALS >=", value, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsLessThan(String value) {
            addCriterion("RLC_LEARNINGGOALS <", value, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsLessThanOrEqualTo(String value) {
            addCriterion("RLC_LEARNINGGOALS <=", value, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsLike(String value) {
            addCriterion("RLC_LEARNINGGOALS like", value, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsNotLike(String value) {
            addCriterion("RLC_LEARNINGGOALS not like", value, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsIn(List<String> values) {
            addCriterion("RLC_LEARNINGGOALS in", values, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsNotIn(List<String> values) {
            addCriterion("RLC_LEARNINGGOALS not in", values, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsBetween(String value1, String value2) {
            addCriterion("RLC_LEARNINGGOALS between", value1, value2, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearninggoalsNotBetween(String value1, String value2) {
            addCriterion("RLC_LEARNINGGOALS not between", value1, value2, "rlcLearninggoals");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireIsNull() {
            addCriterion("RLC_LEARNINGREQUIRE is null");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireIsNotNull() {
            addCriterion("RLC_LEARNINGREQUIRE is not null");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireEqualTo(String value) {
            addCriterion("RLC_LEARNINGREQUIRE =", value, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireNotEqualTo(String value) {
            addCriterion("RLC_LEARNINGREQUIRE <>", value, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireGreaterThan(String value) {
            addCriterion("RLC_LEARNINGREQUIRE >", value, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireGreaterThanOrEqualTo(String value) {
            addCriterion("RLC_LEARNINGREQUIRE >=", value, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireLessThan(String value) {
            addCriterion("RLC_LEARNINGREQUIRE <", value, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireLessThanOrEqualTo(String value) {
            addCriterion("RLC_LEARNINGREQUIRE <=", value, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireLike(String value) {
            addCriterion("RLC_LEARNINGREQUIRE like", value, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireNotLike(String value) {
            addCriterion("RLC_LEARNINGREQUIRE not like", value, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireIn(List<String> values) {
            addCriterion("RLC_LEARNINGREQUIRE in", values, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireNotIn(List<String> values) {
            addCriterion("RLC_LEARNINGREQUIRE not in", values, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireBetween(String value1, String value2) {
            addCriterion("RLC_LEARNINGREQUIRE between", value1, value2, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcLearningrequireNotBetween(String value1, String value2) {
            addCriterion("RLC_LEARNINGREQUIRE not between", value1, value2, "rlcLearningrequire");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryIsNull() {
            addCriterion("RLC_UPLOADACCESSORY is null");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryIsNotNull() {
            addCriterion("RLC_UPLOADACCESSORY is not null");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryEqualTo(String value) {
            addCriterion("RLC_UPLOADACCESSORY =", value, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryNotEqualTo(String value) {
            addCriterion("RLC_UPLOADACCESSORY <>", value, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryGreaterThan(String value) {
            addCriterion("RLC_UPLOADACCESSORY >", value, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryGreaterThanOrEqualTo(String value) {
            addCriterion("RLC_UPLOADACCESSORY >=", value, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryLessThan(String value) {
            addCriterion("RLC_UPLOADACCESSORY <", value, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryLessThanOrEqualTo(String value) {
            addCriterion("RLC_UPLOADACCESSORY <=", value, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryLike(String value) {
            addCriterion("RLC_UPLOADACCESSORY like", value, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryNotLike(String value) {
            addCriterion("RLC_UPLOADACCESSORY not like", value, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryIn(List<String> values) {
            addCriterion("RLC_UPLOADACCESSORY in", values, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryNotIn(List<String> values) {
            addCriterion("RLC_UPLOADACCESSORY not in", values, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryBetween(String value1, String value2) {
            addCriterion("RLC_UPLOADACCESSORY between", value1, value2, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcUploadaccessoryNotBetween(String value1, String value2) {
            addCriterion("RLC_UPLOADACCESSORY not between", value1, value2, "rlcUploadaccessory");
            return (Criteria) this;
        }

        public Criteria andRlcConditionIsNull() {
            addCriterion("RLC_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andRlcConditionIsNotNull() {
            addCriterion("RLC_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andRlcConditionEqualTo(Integer value) {
            addCriterion("RLC_CONDITION =", value, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcConditionNotEqualTo(Integer value) {
            addCriterion("RLC_CONDITION <>", value, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcConditionGreaterThan(Integer value) {
            addCriterion("RLC_CONDITION >", value, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("RLC_CONDITION >=", value, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcConditionLessThan(Integer value) {
            addCriterion("RLC_CONDITION <", value, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcConditionLessThanOrEqualTo(Integer value) {
            addCriterion("RLC_CONDITION <=", value, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcConditionIn(List<Integer> values) {
            addCriterion("RLC_CONDITION in", values, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcConditionNotIn(List<Integer> values) {
            addCriterion("RLC_CONDITION not in", values, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcConditionBetween(Integer value1, Integer value2) {
            addCriterion("RLC_CONDITION between", value1, value2, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("RLC_CONDITION not between", value1, value2, "rlcCondition");
            return (Criteria) this;
        }

        public Criteria andRlcTimeIsNull() {
            addCriterion("RLC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRlcTimeIsNotNull() {
            addCriterion("RLC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRlcTimeEqualTo(Date value) {
            addCriterionForJDBCTime("RLC_TIME =", value, "rlcTime");
            return (Criteria) this;
        }

        public Criteria andRlcTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("RLC_TIME <>", value, "rlcTime");
            return (Criteria) this;
        }

        public Criteria andRlcTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("RLC_TIME >", value, "rlcTime");
            return (Criteria) this;
        }

        public Criteria andRlcTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("RLC_TIME >=", value, "rlcTime");
            return (Criteria) this;
        }

        public Criteria andRlcTimeLessThan(Date value) {
            addCriterionForJDBCTime("RLC_TIME <", value, "rlcTime");
            return (Criteria) this;
        }

        public Criteria andRlcTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("RLC_TIME <=", value, "rlcTime");
            return (Criteria) this;
        }

        public Criteria andRlcTimeIn(List<Date> values) {
            addCriterionForJDBCTime("RLC_TIME in", values, "rlcTime");
            return (Criteria) this;
        }

        public Criteria andRlcTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("RLC_TIME not in", values, "rlcTime");
            return (Criteria) this;
        }

        public Criteria andRlcTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("RLC_TIME between", value1, value2, "rlcTime");
            return (Criteria) this;
        }

        public Criteria andRlcTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("RLC_TIME not between", value1, value2, "rlcTime");
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