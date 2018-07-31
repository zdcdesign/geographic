package com.geographic.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbLayerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLayerExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andLayernameIsNull() {
            addCriterion("layername is null");
            return (Criteria) this;
        }

        public Criteria andLayernameIsNotNull() {
            addCriterion("layername is not null");
            return (Criteria) this;
        }

        public Criteria andLayernameEqualTo(String value) {
            addCriterion("layername =", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotEqualTo(String value) {
            addCriterion("layername <>", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameGreaterThan(String value) {
            addCriterion("layername >", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameGreaterThanOrEqualTo(String value) {
            addCriterion("layername >=", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameLessThan(String value) {
            addCriterion("layername <", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameLessThanOrEqualTo(String value) {
            addCriterion("layername <=", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameLike(String value) {
            addCriterion("layername like", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotLike(String value) {
            addCriterion("layername not like", value, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameIn(List<String> values) {
            addCriterion("layername in", values, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotIn(List<String> values) {
            addCriterion("layername not in", values, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameBetween(String value1, String value2) {
            addCriterion("layername between", value1, value2, "layername");
            return (Criteria) this;
        }

        public Criteria andLayernameNotBetween(String value1, String value2) {
            addCriterion("layername not between", value1, value2, "layername");
            return (Criteria) this;
        }

        public Criteria andSimplenameIsNull() {
            addCriterion("simplename is null");
            return (Criteria) this;
        }

        public Criteria andSimplenameIsNotNull() {
            addCriterion("simplename is not null");
            return (Criteria) this;
        }

        public Criteria andSimplenameEqualTo(String value) {
            addCriterion("simplename =", value, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameNotEqualTo(String value) {
            addCriterion("simplename <>", value, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameGreaterThan(String value) {
            addCriterion("simplename >", value, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameGreaterThanOrEqualTo(String value) {
            addCriterion("simplename >=", value, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameLessThan(String value) {
            addCriterion("simplename <", value, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameLessThanOrEqualTo(String value) {
            addCriterion("simplename <=", value, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameLike(String value) {
            addCriterion("simplename like", value, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameNotLike(String value) {
            addCriterion("simplename not like", value, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameIn(List<String> values) {
            addCriterion("simplename in", values, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameNotIn(List<String> values) {
            addCriterion("simplename not in", values, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameBetween(String value1, String value2) {
            addCriterion("simplename between", value1, value2, "simplename");
            return (Criteria) this;
        }

        public Criteria andSimplenameNotBetween(String value1, String value2) {
            addCriterion("simplename not between", value1, value2, "simplename");
            return (Criteria) this;
        }

        public Criteria andBelongYearIsNull() {
            addCriterion("belong_year is null");
            return (Criteria) this;
        }

        public Criteria andBelongYearIsNotNull() {
            addCriterion("belong_year is not null");
            return (Criteria) this;
        }

        public Criteria andBelongYearEqualTo(Date value) {
            addCriterionForJDBCDate("belong_year =", value, "belongYear");
            return (Criteria) this;
        }

        public Criteria andBelongYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("belong_year <>", value, "belongYear");
            return (Criteria) this;
        }

        public Criteria andBelongYearGreaterThan(Date value) {
            addCriterionForJDBCDate("belong_year >", value, "belongYear");
            return (Criteria) this;
        }

        public Criteria andBelongYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("belong_year >=", value, "belongYear");
            return (Criteria) this;
        }

        public Criteria andBelongYearLessThan(Date value) {
            addCriterionForJDBCDate("belong_year <", value, "belongYear");
            return (Criteria) this;
        }

        public Criteria andBelongYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("belong_year <=", value, "belongYear");
            return (Criteria) this;
        }

        public Criteria andBelongYearIn(List<Date> values) {
            addCriterionForJDBCDate("belong_year in", values, "belongYear");
            return (Criteria) this;
        }

        public Criteria andBelongYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("belong_year not in", values, "belongYear");
            return (Criteria) this;
        }

        public Criteria andBelongYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("belong_year between", value1, value2, "belongYear");
            return (Criteria) this;
        }

        public Criteria andBelongYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("belong_year not between", value1, value2, "belongYear");
            return (Criteria) this;
        }

        public Criteria andServiceUrlIsNull() {
            addCriterion("service_url is null");
            return (Criteria) this;
        }

        public Criteria andServiceUrlIsNotNull() {
            addCriterion("service_url is not null");
            return (Criteria) this;
        }

        public Criteria andServiceUrlEqualTo(String value) {
            addCriterion("service_url =", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlNotEqualTo(String value) {
            addCriterion("service_url <>", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlGreaterThan(String value) {
            addCriterion("service_url >", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("service_url >=", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlLessThan(String value) {
            addCriterion("service_url <", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlLessThanOrEqualTo(String value) {
            addCriterion("service_url <=", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlLike(String value) {
            addCriterion("service_url like", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlNotLike(String value) {
            addCriterion("service_url not like", value, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlIn(List<String> values) {
            addCriterion("service_url in", values, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlNotIn(List<String> values) {
            addCriterion("service_url not in", values, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlBetween(String value1, String value2) {
            addCriterion("service_url between", value1, value2, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceUrlNotBetween(String value1, String value2) {
            addCriterion("service_url not between", value1, value2, "serviceUrl");
            return (Criteria) this;
        }

        public Criteria andServiceTopicIsNull() {
            addCriterion("service_topic is null");
            return (Criteria) this;
        }

        public Criteria andServiceTopicIsNotNull() {
            addCriterion("service_topic is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTopicEqualTo(Long value) {
            addCriterion("service_topic =", value, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andServiceTopicNotEqualTo(Long value) {
            addCriterion("service_topic <>", value, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andServiceTopicGreaterThan(Long value) {
            addCriterion("service_topic >", value, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andServiceTopicGreaterThanOrEqualTo(Long value) {
            addCriterion("service_topic >=", value, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andServiceTopicLessThan(Long value) {
            addCriterion("service_topic <", value, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andServiceTopicLessThanOrEqualTo(Long value) {
            addCriterion("service_topic <=", value, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andServiceTopicIn(List<Long> values) {
            addCriterion("service_topic in", values, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andServiceTopicNotIn(List<Long> values) {
            addCriterion("service_topic not in", values, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andServiceTopicBetween(Long value1, Long value2) {
            addCriterion("service_topic between", value1, value2, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andServiceTopicNotBetween(Long value1, Long value2) {
            addCriterion("service_topic not between", value1, value2, "serviceTopic");
            return (Criteria) this;
        }

        public Criteria andLayerSerialIsNull() {
            addCriterion("layer_serial is null");
            return (Criteria) this;
        }

        public Criteria andLayerSerialIsNotNull() {
            addCriterion("layer_serial is not null");
            return (Criteria) this;
        }

        public Criteria andLayerSerialEqualTo(Integer value) {
            addCriterion("layer_serial =", value, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andLayerSerialNotEqualTo(Integer value) {
            addCriterion("layer_serial <>", value, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andLayerSerialGreaterThan(Integer value) {
            addCriterion("layer_serial >", value, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andLayerSerialGreaterThanOrEqualTo(Integer value) {
            addCriterion("layer_serial >=", value, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andLayerSerialLessThan(Integer value) {
            addCriterion("layer_serial <", value, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andLayerSerialLessThanOrEqualTo(Integer value) {
            addCriterion("layer_serial <=", value, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andLayerSerialIn(List<Integer> values) {
            addCriterion("layer_serial in", values, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andLayerSerialNotIn(List<Integer> values) {
            addCriterion("layer_serial not in", values, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andLayerSerialBetween(Integer value1, Integer value2) {
            addCriterion("layer_serial between", value1, value2, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andLayerSerialNotBetween(Integer value1, Integer value2) {
            addCriterion("layer_serial not between", value1, value2, "layerSerial");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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

        public Criteria andShowFlagIsNull() {
            addCriterion("show_flag is null");
            return (Criteria) this;
        }

        public Criteria andShowFlagIsNotNull() {
            addCriterion("show_flag is not null");
            return (Criteria) this;
        }

        public Criteria andShowFlagEqualTo(Boolean value) {
            addCriterion("show_flag =", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagNotEqualTo(Boolean value) {
            addCriterion("show_flag <>", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagGreaterThan(Boolean value) {
            addCriterion("show_flag >", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show_flag >=", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagLessThan(Boolean value) {
            addCriterion("show_flag <", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("show_flag <=", value, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagIn(List<Boolean> values) {
            addCriterion("show_flag in", values, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagNotIn(List<Boolean> values) {
            addCriterion("show_flag not in", values, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("show_flag between", value1, value2, "showFlag");
            return (Criteria) this;
        }

        public Criteria andShowFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show_flag not between", value1, value2, "showFlag");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueIsNull() {
            addCriterion("permissions_value is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueIsNotNull() {
            addCriterion("permissions_value is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueEqualTo(Integer value) {
            addCriterion("permissions_value =", value, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueNotEqualTo(Integer value) {
            addCriterion("permissions_value <>", value, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueGreaterThan(Integer value) {
            addCriterion("permissions_value >", value, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("permissions_value >=", value, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueLessThan(Integer value) {
            addCriterion("permissions_value <", value, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueLessThanOrEqualTo(Integer value) {
            addCriterion("permissions_value <=", value, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueIn(List<Integer> values) {
            addCriterion("permissions_value in", values, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueNotIn(List<Integer> values) {
            addCriterion("permissions_value not in", values, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueBetween(Integer value1, Integer value2) {
            addCriterion("permissions_value between", value1, value2, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsValueNotBetween(Integer value1, Integer value2) {
            addCriterion("permissions_value not between", value1, value2, "permissionsValue");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeIsNull() {
            addCriterion("permissions_code is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeIsNotNull() {
            addCriterion("permissions_code is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeEqualTo(String value) {
            addCriterion("permissions_code =", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeNotEqualTo(String value) {
            addCriterion("permissions_code <>", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeGreaterThan(String value) {
            addCriterion("permissions_code >", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("permissions_code >=", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeLessThan(String value) {
            addCriterion("permissions_code <", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeLessThanOrEqualTo(String value) {
            addCriterion("permissions_code <=", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeLike(String value) {
            addCriterion("permissions_code like", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeNotLike(String value) {
            addCriterion("permissions_code not like", value, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeIn(List<String> values) {
            addCriterion("permissions_code in", values, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeNotIn(List<String> values) {
            addCriterion("permissions_code not in", values, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeBetween(String value1, String value2) {
            addCriterion("permissions_code between", value1, value2, "permissionsCode");
            return (Criteria) this;
        }

        public Criteria andPermissionsCodeNotBetween(String value1, String value2) {
            addCriterion("permissions_code not between", value1, value2, "permissionsCode");
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