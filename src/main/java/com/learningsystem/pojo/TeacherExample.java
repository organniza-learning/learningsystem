package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTIdIsNull() {
            addCriterion("T_ID is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("T_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("T_ID =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("T_ID <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("T_ID >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_ID >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("T_ID <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("T_ID <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("T_ID in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("T_ID not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("T_ID between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("T_ID not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("T_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("T_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("T_NAME =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("T_NAME <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("T_NAME >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_NAME >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("T_NAME <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("T_NAME <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("T_NAME like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("T_NAME not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("T_NAME in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("T_NAME not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("T_NAME between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("T_NAME not between", value1, value2, "tName");
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

        public Criteria andCClassIsNull() {
            addCriterion("C_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andCClassIsNotNull() {
            addCriterion("C_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andCClassEqualTo(String value) {
            addCriterion("C_CLASS =", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassNotEqualTo(String value) {
            addCriterion("C_CLASS <>", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassGreaterThan(String value) {
            addCriterion("C_CLASS >", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassGreaterThanOrEqualTo(String value) {
            addCriterion("C_CLASS >=", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassLessThan(String value) {
            addCriterion("C_CLASS <", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassLessThanOrEqualTo(String value) {
            addCriterion("C_CLASS <=", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassLike(String value) {
            addCriterion("C_CLASS like", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassNotLike(String value) {
            addCriterion("C_CLASS not like", value, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassIn(List<String> values) {
            addCriterion("C_CLASS in", values, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassNotIn(List<String> values) {
            addCriterion("C_CLASS not in", values, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassBetween(String value1, String value2) {
            addCriterion("C_CLASS between", value1, value2, "cClass");
            return (Criteria) this;
        }

        public Criteria andCClassNotBetween(String value1, String value2) {
            addCriterion("C_CLASS not between", value1, value2, "cClass");
            return (Criteria) this;
        }

        public Criteria andTGrnderIsNull() {
            addCriterion("T_GRNDER is null");
            return (Criteria) this;
        }

        public Criteria andTGrnderIsNotNull() {
            addCriterion("T_GRNDER is not null");
            return (Criteria) this;
        }

        public Criteria andTGrnderEqualTo(String value) {
            addCriterion("T_GRNDER =", value, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderNotEqualTo(String value) {
            addCriterion("T_GRNDER <>", value, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderGreaterThan(String value) {
            addCriterion("T_GRNDER >", value, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderGreaterThanOrEqualTo(String value) {
            addCriterion("T_GRNDER >=", value, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderLessThan(String value) {
            addCriterion("T_GRNDER <", value, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderLessThanOrEqualTo(String value) {
            addCriterion("T_GRNDER <=", value, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderLike(String value) {
            addCriterion("T_GRNDER like", value, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderNotLike(String value) {
            addCriterion("T_GRNDER not like", value, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderIn(List<String> values) {
            addCriterion("T_GRNDER in", values, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderNotIn(List<String> values) {
            addCriterion("T_GRNDER not in", values, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderBetween(String value1, String value2) {
            addCriterion("T_GRNDER between", value1, value2, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTGrnderNotBetween(String value1, String value2) {
            addCriterion("T_GRNDER not between", value1, value2, "tGrnder");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNull() {
            addCriterion("T_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNotNull() {
            addCriterion("T_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTPhoneEqualTo(String value) {
            addCriterion("T_PHONE =", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotEqualTo(String value) {
            addCriterion("T_PHONE <>", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThan(String value) {
            addCriterion("T_PHONE >", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("T_PHONE >=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThan(String value) {
            addCriterion("T_PHONE <", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThanOrEqualTo(String value) {
            addCriterion("T_PHONE <=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLike(String value) {
            addCriterion("T_PHONE like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotLike(String value) {
            addCriterion("T_PHONE not like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneIn(List<String> values) {
            addCriterion("T_PHONE in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotIn(List<String> values) {
            addCriterion("T_PHONE not in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneBetween(String value1, String value2) {
            addCriterion("T_PHONE between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotBetween(String value1, String value2) {
            addCriterion("T_PHONE not between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTQqIsNull() {
            addCriterion("T_QQ is null");
            return (Criteria) this;
        }

        public Criteria andTQqIsNotNull() {
            addCriterion("T_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andTQqEqualTo(Integer value) {
            addCriterion("T_QQ =", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqNotEqualTo(Integer value) {
            addCriterion("T_QQ <>", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqGreaterThan(Integer value) {
            addCriterion("T_QQ >", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqGreaterThanOrEqualTo(Integer value) {
            addCriterion("T_QQ >=", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqLessThan(Integer value) {
            addCriterion("T_QQ <", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqLessThanOrEqualTo(Integer value) {
            addCriterion("T_QQ <=", value, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqIn(List<Integer> values) {
            addCriterion("T_QQ in", values, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqNotIn(List<Integer> values) {
            addCriterion("T_QQ not in", values, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqBetween(Integer value1, Integer value2) {
            addCriterion("T_QQ between", value1, value2, "tQq");
            return (Criteria) this;
        }

        public Criteria andTQqNotBetween(Integer value1, Integer value2) {
            addCriterion("T_QQ not between", value1, value2, "tQq");
            return (Criteria) this;
        }

        public Criteria andTWechatIsNull() {
            addCriterion("T_WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andTWechatIsNotNull() {
            addCriterion("T_WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andTWechatEqualTo(String value) {
            addCriterion("T_WECHAT =", value, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatNotEqualTo(String value) {
            addCriterion("T_WECHAT <>", value, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatGreaterThan(String value) {
            addCriterion("T_WECHAT >", value, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatGreaterThanOrEqualTo(String value) {
            addCriterion("T_WECHAT >=", value, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatLessThan(String value) {
            addCriterion("T_WECHAT <", value, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatLessThanOrEqualTo(String value) {
            addCriterion("T_WECHAT <=", value, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatLike(String value) {
            addCriterion("T_WECHAT like", value, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatNotLike(String value) {
            addCriterion("T_WECHAT not like", value, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatIn(List<String> values) {
            addCriterion("T_WECHAT in", values, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatNotIn(List<String> values) {
            addCriterion("T_WECHAT not in", values, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatBetween(String value1, String value2) {
            addCriterion("T_WECHAT between", value1, value2, "tWechat");
            return (Criteria) this;
        }

        public Criteria andTWechatNotBetween(String value1, String value2) {
            addCriterion("T_WECHAT not between", value1, value2, "tWechat");
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