package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStuIdIsNull() {
            addCriterion("STU_ID is null");
            return (Criteria) this;
        }

        public Criteria andStuIdIsNotNull() {
            addCriterion("STU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStuIdEqualTo(Integer value) {
            addCriterion("STU_ID =", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotEqualTo(Integer value) {
            addCriterion("STU_ID <>", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThan(Integer value) {
            addCriterion("STU_ID >", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_ID >=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThan(Integer value) {
            addCriterion("STU_ID <", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdLessThanOrEqualTo(Integer value) {
            addCriterion("STU_ID <=", value, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdIn(List<Integer> values) {
            addCriterion("STU_ID in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotIn(List<Integer> values) {
            addCriterion("STU_ID not in", values, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdBetween(Integer value1, Integer value2) {
            addCriterion("STU_ID between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andStuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_ID not between", value1, value2, "stuId");
            return (Criteria) this;
        }

        public Criteria andTgOpenidIsNull() {
            addCriterion("TG_OPENID is null");
            return (Criteria) this;
        }

        public Criteria andTgOpenidIsNotNull() {
            addCriterion("TG_OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andTgOpenidEqualTo(String value) {
            addCriterion("TG_OPENID =", value, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidNotEqualTo(String value) {
            addCriterion("TG_OPENID <>", value, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidGreaterThan(String value) {
            addCriterion("TG_OPENID >", value, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("TG_OPENID >=", value, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidLessThan(String value) {
            addCriterion("TG_OPENID <", value, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidLessThanOrEqualTo(String value) {
            addCriterion("TG_OPENID <=", value, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidLike(String value) {
            addCriterion("TG_OPENID like", value, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidNotLike(String value) {
            addCriterion("TG_OPENID not like", value, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidIn(List<String> values) {
            addCriterion("TG_OPENID in", values, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidNotIn(List<String> values) {
            addCriterion("TG_OPENID not in", values, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidBetween(String value1, String value2) {
            addCriterion("TG_OPENID between", value1, value2, "tgOpenid");
            return (Criteria) this;
        }

        public Criteria andTgOpenidNotBetween(String value1, String value2) {
            addCriterion("TG_OPENID not between", value1, value2, "tgOpenid");
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

        public Criteria andStuPasswordIsNull() {
            addCriterion("STU_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIsNotNull() {
            addCriterion("STU_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andStuPasswordEqualTo(String value) {
            addCriterion("STU_PASSWORD =", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotEqualTo(String value) {
            addCriterion("STU_PASSWORD <>", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThan(String value) {
            addCriterion("STU_PASSWORD >", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("STU_PASSWORD >=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThan(String value) {
            addCriterion("STU_PASSWORD <", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLessThanOrEqualTo(String value) {
            addCriterion("STU_PASSWORD <=", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordLike(String value) {
            addCriterion("STU_PASSWORD like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotLike(String value) {
            addCriterion("STU_PASSWORD not like", value, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordIn(List<String> values) {
            addCriterion("STU_PASSWORD in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotIn(List<String> values) {
            addCriterion("STU_PASSWORD not in", values, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordBetween(String value1, String value2) {
            addCriterion("STU_PASSWORD between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuPasswordNotBetween(String value1, String value2) {
            addCriterion("STU_PASSWORD not between", value1, value2, "stuPassword");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNull() {
            addCriterion("STU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStuNameIsNotNull() {
            addCriterion("STU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStuNameEqualTo(String value) {
            addCriterion("STU_NAME =", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotEqualTo(String value) {
            addCriterion("STU_NAME <>", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThan(String value) {
            addCriterion("STU_NAME >", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameGreaterThanOrEqualTo(String value) {
            addCriterion("STU_NAME >=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThan(String value) {
            addCriterion("STU_NAME <", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLessThanOrEqualTo(String value) {
            addCriterion("STU_NAME <=", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameLike(String value) {
            addCriterion("STU_NAME like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotLike(String value) {
            addCriterion("STU_NAME not like", value, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameIn(List<String> values) {
            addCriterion("STU_NAME in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotIn(List<String> values) {
            addCriterion("STU_NAME not in", values, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameBetween(String value1, String value2) {
            addCriterion("STU_NAME between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuNameNotBetween(String value1, String value2) {
            addCriterion("STU_NAME not between", value1, value2, "stuName");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNull() {
            addCriterion("STU_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andStuGradeIsNotNull() {
            addCriterion("STU_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andStuGradeEqualTo(String value) {
            addCriterion("STU_GRADE =", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotEqualTo(String value) {
            addCriterion("STU_GRADE <>", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThan(String value) {
            addCriterion("STU_GRADE >", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeGreaterThanOrEqualTo(String value) {
            addCriterion("STU_GRADE >=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThan(String value) {
            addCriterion("STU_GRADE <", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLessThanOrEqualTo(String value) {
            addCriterion("STU_GRADE <=", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeLike(String value) {
            addCriterion("STU_GRADE like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotLike(String value) {
            addCriterion("STU_GRADE not like", value, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeIn(List<String> values) {
            addCriterion("STU_GRADE in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotIn(List<String> values) {
            addCriterion("STU_GRADE not in", values, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeBetween(String value1, String value2) {
            addCriterion("STU_GRADE between", value1, value2, "stuGrade");
            return (Criteria) this;
        }

        public Criteria andStuGradeNotBetween(String value1, String value2) {
            addCriterion("STU_GRADE not between", value1, value2, "stuGrade");
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

        public Criteria andStuEmailIsNull() {
            addCriterion("STU_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andStuEmailIsNotNull() {
            addCriterion("STU_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andStuEmailEqualTo(String value) {
            addCriterion("STU_EMAIL =", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotEqualTo(String value) {
            addCriterion("STU_EMAIL <>", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThan(String value) {
            addCriterion("STU_EMAIL >", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailGreaterThanOrEqualTo(String value) {
            addCriterion("STU_EMAIL >=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThan(String value) {
            addCriterion("STU_EMAIL <", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLessThanOrEqualTo(String value) {
            addCriterion("STU_EMAIL <=", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailLike(String value) {
            addCriterion("STU_EMAIL like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotLike(String value) {
            addCriterion("STU_EMAIL not like", value, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailIn(List<String> values) {
            addCriterion("STU_EMAIL in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotIn(List<String> values) {
            addCriterion("STU_EMAIL not in", values, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailBetween(String value1, String value2) {
            addCriterion("STU_EMAIL between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuEmailNotBetween(String value1, String value2) {
            addCriterion("STU_EMAIL not between", value1, value2, "stuEmail");
            return (Criteria) this;
        }

        public Criteria andStuPhonerIsNull() {
            addCriterion("STU_PHONER is null");
            return (Criteria) this;
        }

        public Criteria andStuPhonerIsNotNull() {
            addCriterion("STU_PHONER is not null");
            return (Criteria) this;
        }

        public Criteria andStuPhonerEqualTo(Integer value) {
            addCriterion("STU_PHONER =", value, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuPhonerNotEqualTo(Integer value) {
            addCriterion("STU_PHONER <>", value, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuPhonerGreaterThan(Integer value) {
            addCriterion("STU_PHONER >", value, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuPhonerGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_PHONER >=", value, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuPhonerLessThan(Integer value) {
            addCriterion("STU_PHONER <", value, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuPhonerLessThanOrEqualTo(Integer value) {
            addCriterion("STU_PHONER <=", value, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuPhonerIn(List<Integer> values) {
            addCriterion("STU_PHONER in", values, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuPhonerNotIn(List<Integer> values) {
            addCriterion("STU_PHONER not in", values, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuPhonerBetween(Integer value1, Integer value2) {
            addCriterion("STU_PHONER between", value1, value2, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuPhonerNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_PHONER not between", value1, value2, "stuPhoner");
            return (Criteria) this;
        }

        public Criteria andStuQqIsNull() {
            addCriterion("STU_QQ is null");
            return (Criteria) this;
        }

        public Criteria andStuQqIsNotNull() {
            addCriterion("STU_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andStuQqEqualTo(Integer value) {
            addCriterion("STU_QQ =", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotEqualTo(Integer value) {
            addCriterion("STU_QQ <>", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqGreaterThan(Integer value) {
            addCriterion("STU_QQ >", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqGreaterThanOrEqualTo(Integer value) {
            addCriterion("STU_QQ >=", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqLessThan(Integer value) {
            addCriterion("STU_QQ <", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqLessThanOrEqualTo(Integer value) {
            addCriterion("STU_QQ <=", value, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqIn(List<Integer> values) {
            addCriterion("STU_QQ in", values, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotIn(List<Integer> values) {
            addCriterion("STU_QQ not in", values, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqBetween(Integer value1, Integer value2) {
            addCriterion("STU_QQ between", value1, value2, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuQqNotBetween(Integer value1, Integer value2) {
            addCriterion("STU_QQ not between", value1, value2, "stuQq");
            return (Criteria) this;
        }

        public Criteria andStuWechatIsNull() {
            addCriterion("STU_WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andStuWechatIsNotNull() {
            addCriterion("STU_WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andStuWechatEqualTo(String value) {
            addCriterion("STU_WECHAT =", value, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatNotEqualTo(String value) {
            addCriterion("STU_WECHAT <>", value, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatGreaterThan(String value) {
            addCriterion("STU_WECHAT >", value, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatGreaterThanOrEqualTo(String value) {
            addCriterion("STU_WECHAT >=", value, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatLessThan(String value) {
            addCriterion("STU_WECHAT <", value, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatLessThanOrEqualTo(String value) {
            addCriterion("STU_WECHAT <=", value, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatLike(String value) {
            addCriterion("STU_WECHAT like", value, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatNotLike(String value) {
            addCriterion("STU_WECHAT not like", value, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatIn(List<String> values) {
            addCriterion("STU_WECHAT in", values, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatNotIn(List<String> values) {
            addCriterion("STU_WECHAT not in", values, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatBetween(String value1, String value2) {
            addCriterion("STU_WECHAT between", value1, value2, "stuWechat");
            return (Criteria) this;
        }

        public Criteria andStuWechatNotBetween(String value1, String value2) {
            addCriterion("STU_WECHAT not between", value1, value2, "stuWechat");
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