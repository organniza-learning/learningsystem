package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class ReleaseexerciseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseexerciseExample() {
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

        public Criteria andReIdIsNull() {
            addCriterion("RE_ID is null");
            return (Criteria) this;
        }

        public Criteria andReIdIsNotNull() {
            addCriterion("RE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReIdEqualTo(Integer value) {
            addCriterion("RE_ID =", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotEqualTo(Integer value) {
            addCriterion("RE_ID <>", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThan(Integer value) {
            addCriterion("RE_ID >", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RE_ID >=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThan(Integer value) {
            addCriterion("RE_ID <", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdLessThanOrEqualTo(Integer value) {
            addCriterion("RE_ID <=", value, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdIn(List<Integer> values) {
            addCriterion("RE_ID in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotIn(List<Integer> values) {
            addCriterion("RE_ID not in", values, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdBetween(Integer value1, Integer value2) {
            addCriterion("RE_ID between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RE_ID not between", value1, value2, "reId");
            return (Criteria) this;
        }

        public Criteria andReTitleIsNull() {
            addCriterion("RE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andReTitleIsNotNull() {
            addCriterion("RE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andReTitleEqualTo(String value) {
            addCriterion("RE_TITLE =", value, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleNotEqualTo(String value) {
            addCriterion("RE_TITLE <>", value, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleGreaterThan(String value) {
            addCriterion("RE_TITLE >", value, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleGreaterThanOrEqualTo(String value) {
            addCriterion("RE_TITLE >=", value, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleLessThan(String value) {
            addCriterion("RE_TITLE <", value, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleLessThanOrEqualTo(String value) {
            addCriterion("RE_TITLE <=", value, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleLike(String value) {
            addCriterion("RE_TITLE like", value, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleNotLike(String value) {
            addCriterion("RE_TITLE not like", value, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleIn(List<String> values) {
            addCriterion("RE_TITLE in", values, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleNotIn(List<String> values) {
            addCriterion("RE_TITLE not in", values, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleBetween(String value1, String value2) {
            addCriterion("RE_TITLE between", value1, value2, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReTitleNotBetween(String value1, String value2) {
            addCriterion("RE_TITLE not between", value1, value2, "reTitle");
            return (Criteria) this;
        }

        public Criteria andReClassIsNull() {
            addCriterion("RE_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andReClassIsNotNull() {
            addCriterion("RE_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andReClassEqualTo(String value) {
            addCriterion("RE_CLASS =", value, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassNotEqualTo(String value) {
            addCriterion("RE_CLASS <>", value, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassGreaterThan(String value) {
            addCriterion("RE_CLASS >", value, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassGreaterThanOrEqualTo(String value) {
            addCriterion("RE_CLASS >=", value, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassLessThan(String value) {
            addCriterion("RE_CLASS <", value, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassLessThanOrEqualTo(String value) {
            addCriterion("RE_CLASS <=", value, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassLike(String value) {
            addCriterion("RE_CLASS like", value, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassNotLike(String value) {
            addCriterion("RE_CLASS not like", value, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassIn(List<String> values) {
            addCriterion("RE_CLASS in", values, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassNotIn(List<String> values) {
            addCriterion("RE_CLASS not in", values, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassBetween(String value1, String value2) {
            addCriterion("RE_CLASS between", value1, value2, "reClass");
            return (Criteria) this;
        }

        public Criteria andReClassNotBetween(String value1, String value2) {
            addCriterion("RE_CLASS not between", value1, value2, "reClass");
            return (Criteria) this;
        }

        public Criteria andReTextIsNull() {
            addCriterion("RE_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andReTextIsNotNull() {
            addCriterion("RE_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andReTextEqualTo(String value) {
            addCriterion("RE_TEXT =", value, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextNotEqualTo(String value) {
            addCriterion("RE_TEXT <>", value, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextGreaterThan(String value) {
            addCriterion("RE_TEXT >", value, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextGreaterThanOrEqualTo(String value) {
            addCriterion("RE_TEXT >=", value, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextLessThan(String value) {
            addCriterion("RE_TEXT <", value, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextLessThanOrEqualTo(String value) {
            addCriterion("RE_TEXT <=", value, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextLike(String value) {
            addCriterion("RE_TEXT like", value, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextNotLike(String value) {
            addCriterion("RE_TEXT not like", value, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextIn(List<String> values) {
            addCriterion("RE_TEXT in", values, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextNotIn(List<String> values) {
            addCriterion("RE_TEXT not in", values, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextBetween(String value1, String value2) {
            addCriterion("RE_TEXT between", value1, value2, "reText");
            return (Criteria) this;
        }

        public Criteria andReTextNotBetween(String value1, String value2) {
            addCriterion("RE_TEXT not between", value1, value2, "reText");
            return (Criteria) this;
        }

        public Criteria andReFileIsNull() {
            addCriterion("RE_FILE is null");
            return (Criteria) this;
        }

        public Criteria andReFileIsNotNull() {
            addCriterion("RE_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andReFileEqualTo(String value) {
            addCriterion("RE_FILE =", value, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileNotEqualTo(String value) {
            addCriterion("RE_FILE <>", value, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileGreaterThan(String value) {
            addCriterion("RE_FILE >", value, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileGreaterThanOrEqualTo(String value) {
            addCriterion("RE_FILE >=", value, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileLessThan(String value) {
            addCriterion("RE_FILE <", value, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileLessThanOrEqualTo(String value) {
            addCriterion("RE_FILE <=", value, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileLike(String value) {
            addCriterion("RE_FILE like", value, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileNotLike(String value) {
            addCriterion("RE_FILE not like", value, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileIn(List<String> values) {
            addCriterion("RE_FILE in", values, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileNotIn(List<String> values) {
            addCriterion("RE_FILE not in", values, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileBetween(String value1, String value2) {
            addCriterion("RE_FILE between", value1, value2, "reFile");
            return (Criteria) this;
        }

        public Criteria andReFileNotBetween(String value1, String value2) {
            addCriterion("RE_FILE not between", value1, value2, "reFile");
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