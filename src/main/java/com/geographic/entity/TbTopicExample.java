package com.geographic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTopicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTopicExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTopicnameIsNull() {
            addCriterion("topicname is null");
            return (Criteria) this;
        }

        public Criteria andTopicnameIsNotNull() {
            addCriterion("topicname is not null");
            return (Criteria) this;
        }

        public Criteria andTopicnameEqualTo(String value) {
            addCriterion("topicname =", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotEqualTo(String value) {
            addCriterion("topicname <>", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameGreaterThan(String value) {
            addCriterion("topicname >", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameGreaterThanOrEqualTo(String value) {
            addCriterion("topicname >=", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLessThan(String value) {
            addCriterion("topicname <", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLessThanOrEqualTo(String value) {
            addCriterion("topicname <=", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLike(String value) {
            addCriterion("topicname like", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotLike(String value) {
            addCriterion("topicname not like", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameIn(List<String> values) {
            addCriterion("topicname in", values, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotIn(List<String> values) {
            addCriterion("topicname not in", values, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameBetween(String value1, String value2) {
            addCriterion("topicname between", value1, value2, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotBetween(String value1, String value2) {
            addCriterion("topicname not between", value1, value2, "topicname");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(Date value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(Date value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(Date value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(Date value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(Date value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<Date> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<Date> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(Date value1, Date value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(Date value1, Date value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andPowervalueIsNull() {
            addCriterion("powervalue is null");
            return (Criteria) this;
        }

        public Criteria andPowervalueIsNotNull() {
            addCriterion("powervalue is not null");
            return (Criteria) this;
        }

        public Criteria andPowervalueEqualTo(Integer value) {
            addCriterion("powervalue =", value, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowervalueNotEqualTo(Integer value) {
            addCriterion("powervalue <>", value, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowervalueGreaterThan(Integer value) {
            addCriterion("powervalue >", value, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowervalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("powervalue >=", value, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowervalueLessThan(Integer value) {
            addCriterion("powervalue <", value, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowervalueLessThanOrEqualTo(Integer value) {
            addCriterion("powervalue <=", value, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowervalueIn(List<Integer> values) {
            addCriterion("powervalue in", values, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowervalueNotIn(List<Integer> values) {
            addCriterion("powervalue not in", values, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowervalueBetween(Integer value1, Integer value2) {
            addCriterion("powervalue between", value1, value2, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowervalueNotBetween(Integer value1, Integer value2) {
            addCriterion("powervalue not between", value1, value2, "powervalue");
            return (Criteria) this;
        }

        public Criteria andPowercodeIsNull() {
            addCriterion("powercode is null");
            return (Criteria) this;
        }

        public Criteria andPowercodeIsNotNull() {
            addCriterion("powercode is not null");
            return (Criteria) this;
        }

        public Criteria andPowercodeEqualTo(String value) {
            addCriterion("powercode =", value, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeNotEqualTo(String value) {
            addCriterion("powercode <>", value, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeGreaterThan(String value) {
            addCriterion("powercode >", value, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeGreaterThanOrEqualTo(String value) {
            addCriterion("powercode >=", value, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeLessThan(String value) {
            addCriterion("powercode <", value, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeLessThanOrEqualTo(String value) {
            addCriterion("powercode <=", value, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeLike(String value) {
            addCriterion("powercode like", value, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeNotLike(String value) {
            addCriterion("powercode not like", value, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeIn(List<String> values) {
            addCriterion("powercode in", values, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeNotIn(List<String> values) {
            addCriterion("powercode not in", values, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeBetween(String value1, String value2) {
            addCriterion("powercode between", value1, value2, "powercode");
            return (Criteria) this;
        }

        public Criteria andPowercodeNotBetween(String value1, String value2) {
            addCriterion("powercode not between", value1, value2, "powercode");
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