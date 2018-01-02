package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestgradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestgradeExample() {
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

        public Criteria andTgIdIsNull() {
            addCriterion("TG_ID is null");
            return (Criteria) this;
        }

        public Criteria andTgIdIsNotNull() {
            addCriterion("TG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTgIdEqualTo(Integer value) {
            addCriterion("TG_ID =", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdNotEqualTo(Integer value) {
            addCriterion("TG_ID <>", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdGreaterThan(Integer value) {
            addCriterion("TG_ID >", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TG_ID >=", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdLessThan(Integer value) {
            addCriterion("TG_ID <", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdLessThanOrEqualTo(Integer value) {
            addCriterion("TG_ID <=", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdIn(List<Integer> values) {
            addCriterion("TG_ID in", values, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdNotIn(List<Integer> values) {
            addCriterion("TG_ID not in", values, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdBetween(Integer value1, Integer value2) {
            addCriterion("TG_ID between", value1, value2, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TG_ID not between", value1, value2, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingIsNull() {
            addCriterion("TG_IDENTIFYING is null");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingIsNotNull() {
            addCriterion("TG_IDENTIFYING is not null");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingEqualTo(Integer value) {
            addCriterion("TG_IDENTIFYING =", value, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingNotEqualTo(Integer value) {
            addCriterion("TG_IDENTIFYING <>", value, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingGreaterThan(Integer value) {
            addCriterion("TG_IDENTIFYING >", value, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingGreaterThanOrEqualTo(Integer value) {
            addCriterion("TG_IDENTIFYING >=", value, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingLessThan(Integer value) {
            addCriterion("TG_IDENTIFYING <", value, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingLessThanOrEqualTo(Integer value) {
            addCriterion("TG_IDENTIFYING <=", value, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingIn(List<Integer> values) {
            addCriterion("TG_IDENTIFYING in", values, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingNotIn(List<Integer> values) {
            addCriterion("TG_IDENTIFYING not in", values, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingBetween(Integer value1, Integer value2) {
            addCriterion("TG_IDENTIFYING between", value1, value2, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgIdentifyingNotBetween(Integer value1, Integer value2) {
            addCriterion("TG_IDENTIFYING not between", value1, value2, "tgIdentifying");
            return (Criteria) this;
        }

        public Criteria andTgGradeIsNull() {
            addCriterion("TG_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andTgGradeIsNotNull() {
            addCriterion("TG_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andTgGradeEqualTo(Integer value) {
            addCriterion("TG_GRADE =", value, "tgGrade");
            return (Criteria) this;
        }

        public Criteria andTgGradeNotEqualTo(Integer value) {
            addCriterion("TG_GRADE <>", value, "tgGrade");
            return (Criteria) this;
        }

        public Criteria andTgGradeGreaterThan(Integer value) {
            addCriterion("TG_GRADE >", value, "tgGrade");
            return (Criteria) this;
        }

        public Criteria andTgGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TG_GRADE >=", value, "tgGrade");
            return (Criteria) this;
        }

        public Criteria andTgGradeLessThan(Integer value) {
            addCriterion("TG_GRADE <", value, "tgGrade");
            return (Criteria) this;
        }

        public Criteria andTgGradeLessThanOrEqualTo(Integer value) {
            addCriterion("TG_GRADE <=", value, "tgGrade");
            return (Criteria) this;
        }

        public Criteria andTgGradeIn(List<Integer> values) {
            addCriterion("TG_GRADE in", values, "tgGrade");
            return (Criteria) this;
        }

        public Criteria andTgGradeNotIn(List<Integer> values) {
            addCriterion("TG_GRADE not in", values, "tgGrade");
            return (Criteria) this;
        }

        public Criteria andTgGradeBetween(Integer value1, Integer value2) {
            addCriterion("TG_GRADE between", value1, value2, "tgGrade");
            return (Criteria) this;
        }

        public Criteria andTgGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("TG_GRADE not between", value1, value2, "tgGrade");
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