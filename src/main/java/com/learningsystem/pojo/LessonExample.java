package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class LessonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LessonExample() {
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

        public Criteria andLIdIsNull() {
            addCriterion("L_ID is null");
            return (Criteria) this;
        }

        public Criteria andLIdIsNotNull() {
            addCriterion("L_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLIdEqualTo(Integer value) {
            addCriterion("L_ID =", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotEqualTo(Integer value) {
            addCriterion("L_ID <>", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThan(Integer value) {
            addCriterion("L_ID >", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("L_ID >=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThan(Integer value) {
            addCriterion("L_ID <", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdLessThanOrEqualTo(Integer value) {
            addCriterion("L_ID <=", value, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdIn(List<Integer> values) {
            addCriterion("L_ID in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotIn(List<Integer> values) {
            addCriterion("L_ID not in", values, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdBetween(Integer value1, Integer value2) {
            addCriterion("L_ID between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLIdNotBetween(Integer value1, Integer value2) {
            addCriterion("L_ID not between", value1, value2, "lId");
            return (Criteria) this;
        }

        public Criteria andLNameIsNull() {
            addCriterion("L_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLNameIsNotNull() {
            addCriterion("L_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLNameEqualTo(String value) {
            addCriterion("L_NAME =", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotEqualTo(String value) {
            addCriterion("L_NAME <>", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThan(String value) {
            addCriterion("L_NAME >", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThanOrEqualTo(String value) {
            addCriterion("L_NAME >=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThan(String value) {
            addCriterion("L_NAME <", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThanOrEqualTo(String value) {
            addCriterion("L_NAME <=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLike(String value) {
            addCriterion("L_NAME like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotLike(String value) {
            addCriterion("L_NAME not like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameIn(List<String> values) {
            addCriterion("L_NAME in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotIn(List<String> values) {
            addCriterion("L_NAME not in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameBetween(String value1, String value2) {
            addCriterion("L_NAME between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotBetween(String value1, String value2) {
            addCriterion("L_NAME not between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNumberIsNull() {
            addCriterion("L_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLNumberIsNotNull() {
            addCriterion("L_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLNumberEqualTo(String value) {
            addCriterion("L_NUMBER =", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberNotEqualTo(String value) {
            addCriterion("L_NUMBER <>", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberGreaterThan(String value) {
            addCriterion("L_NUMBER >", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberGreaterThanOrEqualTo(String value) {
            addCriterion("L_NUMBER >=", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberLessThan(String value) {
            addCriterion("L_NUMBER <", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberLessThanOrEqualTo(String value) {
            addCriterion("L_NUMBER <=", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberLike(String value) {
            addCriterion("L_NUMBER like", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberNotLike(String value) {
            addCriterion("L_NUMBER not like", value, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberIn(List<String> values) {
            addCriterion("L_NUMBER in", values, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberNotIn(List<String> values) {
            addCriterion("L_NUMBER not in", values, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberBetween(String value1, String value2) {
            addCriterion("L_NUMBER between", value1, value2, "lNumber");
            return (Criteria) this;
        }

        public Criteria andLNumberNotBetween(String value1, String value2) {
            addCriterion("L_NUMBER not between", value1, value2, "lNumber");
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

        public Criteria andTTeacherEqualTo(Integer value) {
            addCriterion("T_TEACHER =", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotEqualTo(Integer value) {
            addCriterion("T_TEACHER <>", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherGreaterThan(Integer value) {
            addCriterion("T_TEACHER >", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_TEACHER >=", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherLessThan(Integer value) {
            addCriterion("T_TEACHER <", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherLessThanOrEqualTo(Integer value) {
            addCriterion("T_TEACHER <=", value, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherIn(List<Integer> values) {
            addCriterion("T_TEACHER in", values, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotIn(List<Integer> values) {
            addCriterion("T_TEACHER not in", values, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherBetween(Integer value1, Integer value2) {
            addCriterion("T_TEACHER between", value1, value2, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andTTeacherNotBetween(Integer value1, Integer value2) {
            addCriterion("T_TEACHER not between", value1, value2, "tTeacher");
            return (Criteria) this;
        }

        public Criteria andStuStudentidIsNull() {
            addCriterion("STU_STUDENTID is null");
            return (Criteria) this;
        }

        public Criteria andStuStudentidIsNotNull() {
            addCriterion("STU_STUDENTID is not null");
            return (Criteria) this;
        }

        public Criteria andStuStudentidEqualTo(String value) {
            addCriterion("STU_STUDENTID =", value, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidNotEqualTo(String value) {
            addCriterion("STU_STUDENTID <>", value, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidGreaterThan(String value) {
            addCriterion("STU_STUDENTID >", value, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidGreaterThanOrEqualTo(String value) {
            addCriterion("STU_STUDENTID >=", value, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidLessThan(String value) {
            addCriterion("STU_STUDENTID <", value, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidLessThanOrEqualTo(String value) {
            addCriterion("STU_STUDENTID <=", value, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidLike(String value) {
            addCriterion("STU_STUDENTID like", value, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidNotLike(String value) {
            addCriterion("STU_STUDENTID not like", value, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidIn(List<String> values) {
            addCriterion("STU_STUDENTID in", values, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidNotIn(List<String> values) {
            addCriterion("STU_STUDENTID not in", values, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidBetween(String value1, String value2) {
            addCriterion("STU_STUDENTID between", value1, value2, "stuStudentid");
            return (Criteria) this;
        }

        public Criteria andStuStudentidNotBetween(String value1, String value2) {
            addCriterion("STU_STUDENTID not between", value1, value2, "stuStudentid");
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