package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReleasediscussionquestionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleasediscussionquestionsExample() {
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

        public Criteria andTagIdIsNull() {
            addCriterion("TAG_ID is null");
            return (Criteria) this;
        }

        public Criteria andTagIdIsNotNull() {
            addCriterion("TAG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTagIdEqualTo(Integer value) {
            addCriterion("TAG_ID =", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotEqualTo(Integer value) {
            addCriterion("TAG_ID <>", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThan(Integer value) {
            addCriterion("TAG_ID >", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TAG_ID >=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThan(Integer value) {
            addCriterion("TAG_ID <", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdLessThanOrEqualTo(Integer value) {
            addCriterion("TAG_ID <=", value, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdIn(List<Integer> values) {
            addCriterion("TAG_ID in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotIn(List<Integer> values) {
            addCriterion("TAG_ID not in", values, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdBetween(Integer value1, Integer value2) {
            addCriterion("TAG_ID between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andTagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TAG_ID not between", value1, value2, "tagId");
            return (Criteria) this;
        }

        public Criteria andRdqThemeIsNull() {
            addCriterion("RDQ_THEME is null");
            return (Criteria) this;
        }

        public Criteria andRdqThemeIsNotNull() {
            addCriterion("RDQ_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andRdqThemeEqualTo(String value) {
            addCriterion("RDQ_THEME =", value, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeNotEqualTo(String value) {
            addCriterion("RDQ_THEME <>", value, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeGreaterThan(String value) {
            addCriterion("RDQ_THEME >", value, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeGreaterThanOrEqualTo(String value) {
            addCriterion("RDQ_THEME >=", value, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeLessThan(String value) {
            addCriterion("RDQ_THEME <", value, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeLessThanOrEqualTo(String value) {
            addCriterion("RDQ_THEME <=", value, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeLike(String value) {
            addCriterion("RDQ_THEME like", value, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeNotLike(String value) {
            addCriterion("RDQ_THEME not like", value, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeIn(List<String> values) {
            addCriterion("RDQ_THEME in", values, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeNotIn(List<String> values) {
            addCriterion("RDQ_THEME not in", values, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeBetween(String value1, String value2) {
            addCriterion("RDQ_THEME between", value1, value2, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqThemeNotBetween(String value1, String value2) {
            addCriterion("RDQ_THEME not between", value1, value2, "rdqTheme");
            return (Criteria) this;
        }

        public Criteria andRdqClassIsNull() {
            addCriterion("RDQ_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andRdqClassIsNotNull() {
            addCriterion("RDQ_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andRdqClassEqualTo(String value) {
            addCriterion("RDQ_CLASS =", value, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassNotEqualTo(String value) {
            addCriterion("RDQ_CLASS <>", value, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassGreaterThan(String value) {
            addCriterion("RDQ_CLASS >", value, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassGreaterThanOrEqualTo(String value) {
            addCriterion("RDQ_CLASS >=", value, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassLessThan(String value) {
            addCriterion("RDQ_CLASS <", value, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassLessThanOrEqualTo(String value) {
            addCriterion("RDQ_CLASS <=", value, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassLike(String value) {
            addCriterion("RDQ_CLASS like", value, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassNotLike(String value) {
            addCriterion("RDQ_CLASS not like", value, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassIn(List<String> values) {
            addCriterion("RDQ_CLASS in", values, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassNotIn(List<String> values) {
            addCriterion("RDQ_CLASS not in", values, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassBetween(String value1, String value2) {
            addCriterion("RDQ_CLASS between", value1, value2, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqClassNotBetween(String value1, String value2) {
            addCriterion("RDQ_CLASS not between", value1, value2, "rdqClass");
            return (Criteria) this;
        }

        public Criteria andRdqTextIsNull() {
            addCriterion("RDQ_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andRdqTextIsNotNull() {
            addCriterion("RDQ_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andRdqTextEqualTo(String value) {
            addCriterion("RDQ_TEXT =", value, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextNotEqualTo(String value) {
            addCriterion("RDQ_TEXT <>", value, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextGreaterThan(String value) {
            addCriterion("RDQ_TEXT >", value, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextGreaterThanOrEqualTo(String value) {
            addCriterion("RDQ_TEXT >=", value, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextLessThan(String value) {
            addCriterion("RDQ_TEXT <", value, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextLessThanOrEqualTo(String value) {
            addCriterion("RDQ_TEXT <=", value, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextLike(String value) {
            addCriterion("RDQ_TEXT like", value, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextNotLike(String value) {
            addCriterion("RDQ_TEXT not like", value, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextIn(List<String> values) {
            addCriterion("RDQ_TEXT in", values, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextNotIn(List<String> values) {
            addCriterion("RDQ_TEXT not in", values, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextBetween(String value1, String value2) {
            addCriterion("RDQ_TEXT between", value1, value2, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTextNotBetween(String value1, String value2) {
            addCriterion("RDQ_TEXT not between", value1, value2, "rdqText");
            return (Criteria) this;
        }

        public Criteria andRdqTimeIsNull() {
            addCriterion("RDQ_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRdqTimeIsNotNull() {
            addCriterion("RDQ_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRdqTimeEqualTo(Date value) {
            addCriterionForJDBCTime("RDQ_TIME =", value, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("RDQ_TIME <>", value, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("RDQ_TIME >", value, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("RDQ_TIME >=", value, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqTimeLessThan(Date value) {
            addCriterionForJDBCTime("RDQ_TIME <", value, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("RDQ_TIME <=", value, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqTimeIn(List<Date> values) {
            addCriterionForJDBCTime("RDQ_TIME in", values, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("RDQ_TIME not in", values, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("RDQ_TIME between", value1, value2, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("RDQ_TIME not between", value1, value2, "rdqTime");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileIsNull() {
            addCriterion("RDQ_UPLOADFILE is null");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileIsNotNull() {
            addCriterion("RDQ_UPLOADFILE is not null");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileEqualTo(String value) {
            addCriterion("RDQ_UPLOADFILE =", value, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileNotEqualTo(String value) {
            addCriterion("RDQ_UPLOADFILE <>", value, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileGreaterThan(String value) {
            addCriterion("RDQ_UPLOADFILE >", value, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileGreaterThanOrEqualTo(String value) {
            addCriterion("RDQ_UPLOADFILE >=", value, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileLessThan(String value) {
            addCriterion("RDQ_UPLOADFILE <", value, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileLessThanOrEqualTo(String value) {
            addCriterion("RDQ_UPLOADFILE <=", value, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileLike(String value) {
            addCriterion("RDQ_UPLOADFILE like", value, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileNotLike(String value) {
            addCriterion("RDQ_UPLOADFILE not like", value, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileIn(List<String> values) {
            addCriterion("RDQ_UPLOADFILE in", values, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileNotIn(List<String> values) {
            addCriterion("RDQ_UPLOADFILE not in", values, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileBetween(String value1, String value2) {
            addCriterion("RDQ_UPLOADFILE between", value1, value2, "rdqUploadfile");
            return (Criteria) this;
        }

        public Criteria andRdqUploadfileNotBetween(String value1, String value2) {
            addCriterion("RDQ_UPLOADFILE not between", value1, value2, "rdqUploadfile");
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