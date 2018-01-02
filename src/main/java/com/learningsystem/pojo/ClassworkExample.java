package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassworkExample() {
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

        public Criteria andCkIdIsNull() {
            addCriterion("CK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCkIdIsNotNull() {
            addCriterion("CK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCkIdEqualTo(Integer value) {
            addCriterion("CK_ID =", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdNotEqualTo(Integer value) {
            addCriterion("CK_ID <>", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdGreaterThan(Integer value) {
            addCriterion("CK_ID >", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CK_ID >=", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdLessThan(Integer value) {
            addCriterion("CK_ID <", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdLessThanOrEqualTo(Integer value) {
            addCriterion("CK_ID <=", value, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdIn(List<Integer> values) {
            addCriterion("CK_ID in", values, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdNotIn(List<Integer> values) {
            addCriterion("CK_ID not in", values, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdBetween(Integer value1, Integer value2) {
            addCriterion("CK_ID between", value1, value2, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CK_ID not between", value1, value2, "ckId");
            return (Criteria) this;
        }

        public Criteria andCkCalssIsNull() {
            addCriterion("CK_CALSS is null");
            return (Criteria) this;
        }

        public Criteria andCkCalssIsNotNull() {
            addCriterion("CK_CALSS is not null");
            return (Criteria) this;
        }

        public Criteria andCkCalssEqualTo(String value) {
            addCriterion("CK_CALSS =", value, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssNotEqualTo(String value) {
            addCriterion("CK_CALSS <>", value, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssGreaterThan(String value) {
            addCriterion("CK_CALSS >", value, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssGreaterThanOrEqualTo(String value) {
            addCriterion("CK_CALSS >=", value, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssLessThan(String value) {
            addCriterion("CK_CALSS <", value, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssLessThanOrEqualTo(String value) {
            addCriterion("CK_CALSS <=", value, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssLike(String value) {
            addCriterion("CK_CALSS like", value, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssNotLike(String value) {
            addCriterion("CK_CALSS not like", value, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssIn(List<String> values) {
            addCriterion("CK_CALSS in", values, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssNotIn(List<String> values) {
            addCriterion("CK_CALSS not in", values, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssBetween(String value1, String value2) {
            addCriterion("CK_CALSS between", value1, value2, "ckCalss");
            return (Criteria) this;
        }

        public Criteria andCkCalssNotBetween(String value1, String value2) {
            addCriterion("CK_CALSS not between", value1, value2, "ckCalss");
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

        public Criteria andCkWeekIsNull() {
            addCriterion("CK_WEEK is null");
            return (Criteria) this;
        }

        public Criteria andCkWeekIsNotNull() {
            addCriterion("CK_WEEK is not null");
            return (Criteria) this;
        }

        public Criteria andCkWeekEqualTo(Integer value) {
            addCriterion("CK_WEEK =", value, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkWeekNotEqualTo(Integer value) {
            addCriterion("CK_WEEK <>", value, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkWeekGreaterThan(Integer value) {
            addCriterion("CK_WEEK >", value, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("CK_WEEK >=", value, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkWeekLessThan(Integer value) {
            addCriterion("CK_WEEK <", value, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkWeekLessThanOrEqualTo(Integer value) {
            addCriterion("CK_WEEK <=", value, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkWeekIn(List<Integer> values) {
            addCriterion("CK_WEEK in", values, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkWeekNotIn(List<Integer> values) {
            addCriterion("CK_WEEK not in", values, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkWeekBetween(Integer value1, Integer value2) {
            addCriterion("CK_WEEK between", value1, value2, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("CK_WEEK not between", value1, value2, "ckWeek");
            return (Criteria) this;
        }

        public Criteria andCkFileIsNull() {
            addCriterion("CK_FILE is null");
            return (Criteria) this;
        }

        public Criteria andCkFileIsNotNull() {
            addCriterion("CK_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andCkFileEqualTo(String value) {
            addCriterion("CK_FILE =", value, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileNotEqualTo(String value) {
            addCriterion("CK_FILE <>", value, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileGreaterThan(String value) {
            addCriterion("CK_FILE >", value, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileGreaterThanOrEqualTo(String value) {
            addCriterion("CK_FILE >=", value, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileLessThan(String value) {
            addCriterion("CK_FILE <", value, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileLessThanOrEqualTo(String value) {
            addCriterion("CK_FILE <=", value, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileLike(String value) {
            addCriterion("CK_FILE like", value, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileNotLike(String value) {
            addCriterion("CK_FILE not like", value, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileIn(List<String> values) {
            addCriterion("CK_FILE in", values, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileNotIn(List<String> values) {
            addCriterion("CK_FILE not in", values, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileBetween(String value1, String value2) {
            addCriterion("CK_FILE between", value1, value2, "ckFile");
            return (Criteria) this;
        }

        public Criteria andCkFileNotBetween(String value1, String value2) {
            addCriterion("CK_FILE not between", value1, value2, "ckFile");
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