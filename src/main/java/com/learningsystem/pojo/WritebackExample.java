package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class WritebackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WritebackExample() {
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

        public Criteria andWbIdIsNull() {
            addCriterion("WB_ID is null");
            return (Criteria) this;
        }

        public Criteria andWbIdIsNotNull() {
            addCriterion("WB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWbIdEqualTo(Integer value) {
            addCriterion("WB_ID =", value, "wbId");
            return (Criteria) this;
        }

        public Criteria andWbIdNotEqualTo(Integer value) {
            addCriterion("WB_ID <>", value, "wbId");
            return (Criteria) this;
        }

        public Criteria andWbIdGreaterThan(Integer value) {
            addCriterion("WB_ID >", value, "wbId");
            return (Criteria) this;
        }

        public Criteria andWbIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WB_ID >=", value, "wbId");
            return (Criteria) this;
        }

        public Criteria andWbIdLessThan(Integer value) {
            addCriterion("WB_ID <", value, "wbId");
            return (Criteria) this;
        }

        public Criteria andWbIdLessThanOrEqualTo(Integer value) {
            addCriterion("WB_ID <=", value, "wbId");
            return (Criteria) this;
        }

        public Criteria andWbIdIn(List<Integer> values) {
            addCriterion("WB_ID in", values, "wbId");
            return (Criteria) this;
        }

        public Criteria andWbIdNotIn(List<Integer> values) {
            addCriterion("WB_ID not in", values, "wbId");
            return (Criteria) this;
        }

        public Criteria andWbIdBetween(Integer value1, Integer value2) {
            addCriterion("WB_ID between", value1, value2, "wbId");
            return (Criteria) this;
        }

        public Criteria andWbIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WB_ID not between", value1, value2, "wbId");
            return (Criteria) this;
        }

        public Criteria andRdqIdIsNull() {
            addCriterion("RDQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andRdqIdIsNotNull() {
            addCriterion("RDQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRdqIdEqualTo(Integer value) {
            addCriterion("RDQ_ID =", value, "rdqId");
            return (Criteria) this;
        }

        public Criteria andRdqIdNotEqualTo(Integer value) {
            addCriterion("RDQ_ID <>", value, "rdqId");
            return (Criteria) this;
        }

        public Criteria andRdqIdGreaterThan(Integer value) {
            addCriterion("RDQ_ID >", value, "rdqId");
            return (Criteria) this;
        }

        public Criteria andRdqIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RDQ_ID >=", value, "rdqId");
            return (Criteria) this;
        }

        public Criteria andRdqIdLessThan(Integer value) {
            addCriterion("RDQ_ID <", value, "rdqId");
            return (Criteria) this;
        }

        public Criteria andRdqIdLessThanOrEqualTo(Integer value) {
            addCriterion("RDQ_ID <=", value, "rdqId");
            return (Criteria) this;
        }

        public Criteria andRdqIdIn(List<Integer> values) {
            addCriterion("RDQ_ID in", values, "rdqId");
            return (Criteria) this;
        }

        public Criteria andRdqIdNotIn(List<Integer> values) {
            addCriterion("RDQ_ID not in", values, "rdqId");
            return (Criteria) this;
        }

        public Criteria andRdqIdBetween(Integer value1, Integer value2) {
            addCriterion("RDQ_ID between", value1, value2, "rdqId");
            return (Criteria) this;
        }

        public Criteria andRdqIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RDQ_ID not between", value1, value2, "rdqId");
            return (Criteria) this;
        }

        public Criteria andWbContentIsNull() {
            addCriterion("WB_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andWbContentIsNotNull() {
            addCriterion("WB_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andWbContentEqualTo(String value) {
            addCriterion("WB_CONTENT =", value, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentNotEqualTo(String value) {
            addCriterion("WB_CONTENT <>", value, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentGreaterThan(String value) {
            addCriterion("WB_CONTENT >", value, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentGreaterThanOrEqualTo(String value) {
            addCriterion("WB_CONTENT >=", value, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentLessThan(String value) {
            addCriterion("WB_CONTENT <", value, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentLessThanOrEqualTo(String value) {
            addCriterion("WB_CONTENT <=", value, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentLike(String value) {
            addCriterion("WB_CONTENT like", value, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentNotLike(String value) {
            addCriterion("WB_CONTENT not like", value, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentIn(List<String> values) {
            addCriterion("WB_CONTENT in", values, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentNotIn(List<String> values) {
            addCriterion("WB_CONTENT not in", values, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentBetween(String value1, String value2) {
            addCriterion("WB_CONTENT between", value1, value2, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbContentNotBetween(String value1, String value2) {
            addCriterion("WB_CONTENT not between", value1, value2, "wbContent");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileIsNull() {
            addCriterion("WB_UPLOADFILE is null");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileIsNotNull() {
            addCriterion("WB_UPLOADFILE is not null");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileEqualTo(String value) {
            addCriterion("WB_UPLOADFILE =", value, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileNotEqualTo(String value) {
            addCriterion("WB_UPLOADFILE <>", value, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileGreaterThan(String value) {
            addCriterion("WB_UPLOADFILE >", value, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileGreaterThanOrEqualTo(String value) {
            addCriterion("WB_UPLOADFILE >=", value, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileLessThan(String value) {
            addCriterion("WB_UPLOADFILE <", value, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileLessThanOrEqualTo(String value) {
            addCriterion("WB_UPLOADFILE <=", value, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileLike(String value) {
            addCriterion("WB_UPLOADFILE like", value, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileNotLike(String value) {
            addCriterion("WB_UPLOADFILE not like", value, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileIn(List<String> values) {
            addCriterion("WB_UPLOADFILE in", values, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileNotIn(List<String> values) {
            addCriterion("WB_UPLOADFILE not in", values, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileBetween(String value1, String value2) {
            addCriterion("WB_UPLOADFILE between", value1, value2, "wbUploadfile");
            return (Criteria) this;
        }

        public Criteria andWbUploadfileNotBetween(String value1, String value2) {
            addCriterion("WB_UPLOADFILE not between", value1, value2, "wbUploadfile");
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