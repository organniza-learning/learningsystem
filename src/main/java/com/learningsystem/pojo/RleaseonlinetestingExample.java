package com.learningsystem.pojo;

import java.util.ArrayList;
import java.util.List;

public class RleaseonlinetestingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RleaseonlinetestingExample() {
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

        public Criteria andRotIdIsNull() {
            addCriterion("ROT_ID is null");
            return (Criteria) this;
        }

        public Criteria andRotIdIsNotNull() {
            addCriterion("ROT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRotIdEqualTo(Integer value) {
            addCriterion("ROT_ID =", value, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdNotEqualTo(Integer value) {
            addCriterion("ROT_ID <>", value, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdGreaterThan(Integer value) {
            addCriterion("ROT_ID >", value, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROT_ID >=", value, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdLessThan(Integer value) {
            addCriterion("ROT_ID <", value, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdLessThanOrEqualTo(Integer value) {
            addCriterion("ROT_ID <=", value, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdIn(List<Integer> values) {
            addCriterion("ROT_ID in", values, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdNotIn(List<Integer> values) {
            addCriterion("ROT_ID not in", values, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdBetween(Integer value1, Integer value2) {
            addCriterion("ROT_ID between", value1, value2, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ROT_ID not between", value1, value2, "rotId");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingIsNull() {
            addCriterion("ROT_IDENTIFYING is null");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingIsNotNull() {
            addCriterion("ROT_IDENTIFYING is not null");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingEqualTo(Integer value) {
            addCriterion("ROT_IDENTIFYING =", value, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingNotEqualTo(Integer value) {
            addCriterion("ROT_IDENTIFYING <>", value, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingGreaterThan(Integer value) {
            addCriterion("ROT_IDENTIFYING >", value, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROT_IDENTIFYING >=", value, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingLessThan(Integer value) {
            addCriterion("ROT_IDENTIFYING <", value, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingLessThanOrEqualTo(Integer value) {
            addCriterion("ROT_IDENTIFYING <=", value, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingIn(List<Integer> values) {
            addCriterion("ROT_IDENTIFYING in", values, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingNotIn(List<Integer> values) {
            addCriterion("ROT_IDENTIFYING not in", values, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingBetween(Integer value1, Integer value2) {
            addCriterion("ROT_IDENTIFYING between", value1, value2, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotIdentifyingNotBetween(Integer value1, Integer value2) {
            addCriterion("ROT_IDENTIFYING not between", value1, value2, "rotIdentifying");
            return (Criteria) this;
        }

        public Criteria andRotClassIsNull() {
            addCriterion("ROT_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andRotClassIsNotNull() {
            addCriterion("ROT_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andRotClassEqualTo(String value) {
            addCriterion("ROT_CLASS =", value, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassNotEqualTo(String value) {
            addCriterion("ROT_CLASS <>", value, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassGreaterThan(String value) {
            addCriterion("ROT_CLASS >", value, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassGreaterThanOrEqualTo(String value) {
            addCriterion("ROT_CLASS >=", value, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassLessThan(String value) {
            addCriterion("ROT_CLASS <", value, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassLessThanOrEqualTo(String value) {
            addCriterion("ROT_CLASS <=", value, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassLike(String value) {
            addCriterion("ROT_CLASS like", value, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassNotLike(String value) {
            addCriterion("ROT_CLASS not like", value, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassIn(List<String> values) {
            addCriterion("ROT_CLASS in", values, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassNotIn(List<String> values) {
            addCriterion("ROT_CLASS not in", values, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassBetween(String value1, String value2) {
            addCriterion("ROT_CLASS between", value1, value2, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotClassNotBetween(String value1, String value2) {
            addCriterion("ROT_CLASS not between", value1, value2, "rotClass");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionIsNull() {
            addCriterion("ROT_CHOICEQUESTION is null");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionIsNotNull() {
            addCriterion("ROT_CHOICEQUESTION is not null");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionEqualTo(String value) {
            addCriterion("ROT_CHOICEQUESTION =", value, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionNotEqualTo(String value) {
            addCriterion("ROT_CHOICEQUESTION <>", value, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionGreaterThan(String value) {
            addCriterion("ROT_CHOICEQUESTION >", value, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionGreaterThanOrEqualTo(String value) {
            addCriterion("ROT_CHOICEQUESTION >=", value, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionLessThan(String value) {
            addCriterion("ROT_CHOICEQUESTION <", value, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionLessThanOrEqualTo(String value) {
            addCriterion("ROT_CHOICEQUESTION <=", value, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionLike(String value) {
            addCriterion("ROT_CHOICEQUESTION like", value, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionNotLike(String value) {
            addCriterion("ROT_CHOICEQUESTION not like", value, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionIn(List<String> values) {
            addCriterion("ROT_CHOICEQUESTION in", values, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionNotIn(List<String> values) {
            addCriterion("ROT_CHOICEQUESTION not in", values, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionBetween(String value1, String value2) {
            addCriterion("ROT_CHOICEQUESTION between", value1, value2, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andRotChoicequestionNotBetween(String value1, String value2) {
            addCriterion("ROT_CHOICEQUESTION not between", value1, value2, "rotChoicequestion");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultIsNull() {
            addCriterion("CHOICEQUESTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultIsNotNull() {
            addCriterion("CHOICEQUESTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultEqualTo(String value) {
            addCriterion("CHOICEQUESTION_RESULT =", value, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultNotEqualTo(String value) {
            addCriterion("CHOICEQUESTION_RESULT <>", value, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultGreaterThan(String value) {
            addCriterion("CHOICEQUESTION_RESULT >", value, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultGreaterThanOrEqualTo(String value) {
            addCriterion("CHOICEQUESTION_RESULT >=", value, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultLessThan(String value) {
            addCriterion("CHOICEQUESTION_RESULT <", value, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultLessThanOrEqualTo(String value) {
            addCriterion("CHOICEQUESTION_RESULT <=", value, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultLike(String value) {
            addCriterion("CHOICEQUESTION_RESULT like", value, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultNotLike(String value) {
            addCriterion("CHOICEQUESTION_RESULT not like", value, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultIn(List<String> values) {
            addCriterion("CHOICEQUESTION_RESULT in", values, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultNotIn(List<String> values) {
            addCriterion("CHOICEQUESTION_RESULT not in", values, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultBetween(String value1, String value2) {
            addCriterion("CHOICEQUESTION_RESULT between", value1, value2, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andChoicequestionResultNotBetween(String value1, String value2) {
            addCriterion("CHOICEQUESTION_RESULT not between", value1, value2, "choicequestionResult");
            return (Criteria) this;
        }

        public Criteria andRotCompletionIsNull() {
            addCriterion("ROT_COMPLETION is null");
            return (Criteria) this;
        }

        public Criteria andRotCompletionIsNotNull() {
            addCriterion("ROT_COMPLETION is not null");
            return (Criteria) this;
        }

        public Criteria andRotCompletionEqualTo(String value) {
            addCriterion("ROT_COMPLETION =", value, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionNotEqualTo(String value) {
            addCriterion("ROT_COMPLETION <>", value, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionGreaterThan(String value) {
            addCriterion("ROT_COMPLETION >", value, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionGreaterThanOrEqualTo(String value) {
            addCriterion("ROT_COMPLETION >=", value, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionLessThan(String value) {
            addCriterion("ROT_COMPLETION <", value, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionLessThanOrEqualTo(String value) {
            addCriterion("ROT_COMPLETION <=", value, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionLike(String value) {
            addCriterion("ROT_COMPLETION like", value, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionNotLike(String value) {
            addCriterion("ROT_COMPLETION not like", value, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionIn(List<String> values) {
            addCriterion("ROT_COMPLETION in", values, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionNotIn(List<String> values) {
            addCriterion("ROT_COMPLETION not in", values, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionBetween(String value1, String value2) {
            addCriterion("ROT_COMPLETION between", value1, value2, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andRotCompletionNotBetween(String value1, String value2) {
            addCriterion("ROT_COMPLETION not between", value1, value2, "rotCompletion");
            return (Criteria) this;
        }

        public Criteria andCompletionResultIsNull() {
            addCriterion("COMPLETION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andCompletionResultIsNotNull() {
            addCriterion("COMPLETION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCompletionResultEqualTo(String value) {
            addCriterion("COMPLETION_RESULT =", value, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultNotEqualTo(String value) {
            addCriterion("COMPLETION_RESULT <>", value, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultGreaterThan(String value) {
            addCriterion("COMPLETION_RESULT >", value, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLETION_RESULT >=", value, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultLessThan(String value) {
            addCriterion("COMPLETION_RESULT <", value, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultLessThanOrEqualTo(String value) {
            addCriterion("COMPLETION_RESULT <=", value, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultLike(String value) {
            addCriterion("COMPLETION_RESULT like", value, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultNotLike(String value) {
            addCriterion("COMPLETION_RESULT not like", value, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultIn(List<String> values) {
            addCriterion("COMPLETION_RESULT in", values, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultNotIn(List<String> values) {
            addCriterion("COMPLETION_RESULT not in", values, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultBetween(String value1, String value2) {
            addCriterion("COMPLETION_RESULT between", value1, value2, "completionResult");
            return (Criteria) this;
        }

        public Criteria andCompletionResultNotBetween(String value1, String value2) {
            addCriterion("COMPLETION_RESULT not between", value1, value2, "completionResult");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicIsNull() {
            addCriterion("ROT_TEXTTOPIC is null");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicIsNotNull() {
            addCriterion("ROT_TEXTTOPIC is not null");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicEqualTo(String value) {
            addCriterion("ROT_TEXTTOPIC =", value, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicNotEqualTo(String value) {
            addCriterion("ROT_TEXTTOPIC <>", value, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicGreaterThan(String value) {
            addCriterion("ROT_TEXTTOPIC >", value, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicGreaterThanOrEqualTo(String value) {
            addCriterion("ROT_TEXTTOPIC >=", value, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicLessThan(String value) {
            addCriterion("ROT_TEXTTOPIC <", value, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicLessThanOrEqualTo(String value) {
            addCriterion("ROT_TEXTTOPIC <=", value, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicLike(String value) {
            addCriterion("ROT_TEXTTOPIC like", value, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicNotLike(String value) {
            addCriterion("ROT_TEXTTOPIC not like", value, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicIn(List<String> values) {
            addCriterion("ROT_TEXTTOPIC in", values, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicNotIn(List<String> values) {
            addCriterion("ROT_TEXTTOPIC not in", values, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicBetween(String value1, String value2) {
            addCriterion("ROT_TEXTTOPIC between", value1, value2, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andRotTexttopicNotBetween(String value1, String value2) {
            addCriterion("ROT_TEXTTOPIC not between", value1, value2, "rotTexttopic");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultIsNull() {
            addCriterion("TEXTTOPIC_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultIsNotNull() {
            addCriterion("TEXTTOPIC_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultEqualTo(String value) {
            addCriterion("TEXTTOPIC_RESULT =", value, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultNotEqualTo(String value) {
            addCriterion("TEXTTOPIC_RESULT <>", value, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultGreaterThan(String value) {
            addCriterion("TEXTTOPIC_RESULT >", value, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTTOPIC_RESULT >=", value, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultLessThan(String value) {
            addCriterion("TEXTTOPIC_RESULT <", value, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultLessThanOrEqualTo(String value) {
            addCriterion("TEXTTOPIC_RESULT <=", value, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultLike(String value) {
            addCriterion("TEXTTOPIC_RESULT like", value, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultNotLike(String value) {
            addCriterion("TEXTTOPIC_RESULT not like", value, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultIn(List<String> values) {
            addCriterion("TEXTTOPIC_RESULT in", values, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultNotIn(List<String> values) {
            addCriterion("TEXTTOPIC_RESULT not in", values, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultBetween(String value1, String value2) {
            addCriterion("TEXTTOPIC_RESULT between", value1, value2, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andTexttopicResultNotBetween(String value1, String value2) {
            addCriterion("TEXTTOPIC_RESULT not between", value1, value2, "texttopicResult");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseIsNull() {
            addCriterion("ROT_TRUEORFALSE is null");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseIsNotNull() {
            addCriterion("ROT_TRUEORFALSE is not null");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseEqualTo(String value) {
            addCriterion("ROT_TRUEORFALSE =", value, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseNotEqualTo(String value) {
            addCriterion("ROT_TRUEORFALSE <>", value, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseGreaterThan(String value) {
            addCriterion("ROT_TRUEORFALSE >", value, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseGreaterThanOrEqualTo(String value) {
            addCriterion("ROT_TRUEORFALSE >=", value, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseLessThan(String value) {
            addCriterion("ROT_TRUEORFALSE <", value, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseLessThanOrEqualTo(String value) {
            addCriterion("ROT_TRUEORFALSE <=", value, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseLike(String value) {
            addCriterion("ROT_TRUEORFALSE like", value, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseNotLike(String value) {
            addCriterion("ROT_TRUEORFALSE not like", value, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseIn(List<String> values) {
            addCriterion("ROT_TRUEORFALSE in", values, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseNotIn(List<String> values) {
            addCriterion("ROT_TRUEORFALSE not in", values, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseBetween(String value1, String value2) {
            addCriterion("ROT_TRUEORFALSE between", value1, value2, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andRotTrueorfalseNotBetween(String value1, String value2) {
            addCriterion("ROT_TRUEORFALSE not between", value1, value2, "rotTrueorfalse");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultIsNull() {
            addCriterion("TRUEORFALSE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultIsNotNull() {
            addCriterion("TRUEORFALSE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultEqualTo(Integer value) {
            addCriterion("TRUEORFALSE_RESULT =", value, "trueorfalseResult");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultNotEqualTo(Integer value) {
            addCriterion("TRUEORFALSE_RESULT <>", value, "trueorfalseResult");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultGreaterThan(Integer value) {
            addCriterion("TRUEORFALSE_RESULT >", value, "trueorfalseResult");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRUEORFALSE_RESULT >=", value, "trueorfalseResult");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultLessThan(Integer value) {
            addCriterion("TRUEORFALSE_RESULT <", value, "trueorfalseResult");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultLessThanOrEqualTo(Integer value) {
            addCriterion("TRUEORFALSE_RESULT <=", value, "trueorfalseResult");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultIn(List<Integer> values) {
            addCriterion("TRUEORFALSE_RESULT in", values, "trueorfalseResult");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultNotIn(List<Integer> values) {
            addCriterion("TRUEORFALSE_RESULT not in", values, "trueorfalseResult");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultBetween(Integer value1, Integer value2) {
            addCriterion("TRUEORFALSE_RESULT between", value1, value2, "trueorfalseResult");
            return (Criteria) this;
        }

        public Criteria andTrueorfalseResultNotBetween(Integer value1, Integer value2) {
            addCriterion("TRUEORFALSE_RESULT not between", value1, value2, "trueorfalseResult");
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