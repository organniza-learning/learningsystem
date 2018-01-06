package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCClassidIsNull() {
            addCriterion("C_CLASSID is null");
            return (Criteria) this;
        }

        public Criteria andCClassidIsNotNull() {
            addCriterion("C_CLASSID is not null");
            return (Criteria) this;
        }

        public Criteria andCClassidEqualTo(Integer value) {
            addCriterion("C_CLASSID =", value, "cClassid");
            return (Criteria) this;
        }

        public Criteria andCClassidNotEqualTo(Integer value) {
            addCriterion("C_CLASSID <>", value, "cClassid");
            return (Criteria) this;
        }

        public Criteria andCClassidGreaterThan(Integer value) {
            addCriterion("C_CLASSID >", value, "cClassid");
            return (Criteria) this;
        }

        public Criteria andCClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_CLASSID >=", value, "cClassid");
            return (Criteria) this;
        }

        public Criteria andCClassidLessThan(Integer value) {
            addCriterion("C_CLASSID <", value, "cClassid");
            return (Criteria) this;
        }

        public Criteria andCClassidLessThanOrEqualTo(Integer value) {
            addCriterion("C_CLASSID <=", value, "cClassid");
            return (Criteria) this;
        }

        public Criteria andCClassidIn(List<Integer> values) {
            addCriterion("C_CLASSID in", values, "cClassid");
            return (Criteria) this;
        }

        public Criteria andCClassidNotIn(List<Integer> values) {
            addCriterion("C_CLASSID not in", values, "cClassid");
            return (Criteria) this;
        }

        public Criteria andCClassidBetween(Integer value1, Integer value2) {
            addCriterion("C_CLASSID between", value1, value2, "cClassid");
            return (Criteria) this;
        }

        public Criteria andCClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("C_CLASSID not between", value1, value2, "cClassid");
            return (Criteria) this;
        }

        public Criteria andTTeacherIsNull() {
            addCriterion("T_TEACHER is null");
            return (Criteria) this;
        }

        public Criteria andTTeacherIsNotNull() {
            addCriterion("T_TEACHER is not null");
            return (Criteria) this;
        }

        public Criteria andTTeacherEqualTo(String value) {
            addCriterion("T_TEACHER =", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotEqualTo(String value) {
            addCriterion("T_TEACHER <>", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherGreaterThan(String value) {
            addCriterion("T_TEACHER >", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("T_TEACHER >=", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherLessThan(String value) {
            addCriterion("T_TEACHER <", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherLessThanOrEqualTo(String value) {
            addCriterion("T_TEACHER <=", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherLike(String value) {
            addCriterion("T_TEACHER like", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotLike(String value) {
            addCriterion("T_TEACHER not like", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherIn(List<String> values) {
            addCriterion("T_TEACHER in", values, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotIn(List<String> values) {
            addCriterion("T_TEACHER not in", values, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherBetween(String value1, String value2) {
            addCriterion("T_TEACHER between", value1, value2, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotBetween(String value1, String value2) {
            addCriterion("T_TEACHER not between", value1, value2, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_NAME =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_NAME <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_NAME >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_NAME >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_NAME <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_NAME <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_NAME like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_NAME not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_NAME in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_NAME not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_NAME between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_NAME not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCCollegeIsNull() {
            addCriterion("C_COLLEGE is null");
            return (Criteria) this;
        }

        public Criteria andCCollegeIsNotNull() {
            addCriterion("C_COLLEGE is not null");
            return (Criteria) this;
        }

        public Criteria andCCollegeEqualTo(String value) {
            addCriterion("C_COLLEGE =", value, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeNotEqualTo(String value) {
            addCriterion("C_COLLEGE <>", value, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeGreaterThan(String value) {
            addCriterion("C_COLLEGE >", value, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("C_COLLEGE >=", value, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeLessThan(String value) {
            addCriterion("C_COLLEGE <", value, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeLessThanOrEqualTo(String value) {
            addCriterion("C_COLLEGE <=", value, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeLike(String value) {
            addCriterion("C_COLLEGE like", value, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeNotLike(String value) {
            addCriterion("C_COLLEGE not like", value, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeIn(List<String> values) {
            addCriterion("C_COLLEGE in", values, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeNotIn(List<String> values) {
            addCriterion("C_COLLEGE not in", values, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeBetween(String value1, String value2) {
            addCriterion("C_COLLEGE between", value1, value2, "cCollege");
            return (Criteria) this;
        }

        public Criteria andCCollegeNotBetween(String value1, String value2) {
            addCriterion("C_COLLEGE not between", value1, value2, "cCollege");
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