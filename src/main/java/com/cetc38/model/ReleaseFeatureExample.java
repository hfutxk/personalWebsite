package com.cetc38.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReleaseFeatureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseFeatureExample() {
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

        public Criteria andReleaseIdIsNull() {
            addCriterion("release_id is null");
            return (Criteria) this;
        }

        public Criteria andReleaseIdIsNotNull() {
            addCriterion("release_id is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseIdEqualTo(Integer value) {
            addCriterion("release_id =", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotEqualTo(Integer value) {
            addCriterion("release_id <>", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdGreaterThan(Integer value) {
            addCriterion("release_id >", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("release_id >=", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdLessThan(Integer value) {
            addCriterion("release_id <", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("release_id <=", value, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdIn(List<Integer> values) {
            addCriterion("release_id in", values, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotIn(List<Integer> values) {
            addCriterion("release_id not in", values, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdBetween(Integer value1, Integer value2) {
            addCriterion("release_id between", value1, value2, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("release_id not between", value1, value2, "releaseId");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorIsNull() {
            addCriterion("release_author is null");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorIsNotNull() {
            addCriterion("release_author is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorEqualTo(String value) {
            addCriterion("release_author =", value, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorNotEqualTo(String value) {
            addCriterion("release_author <>", value, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorGreaterThan(String value) {
            addCriterion("release_author >", value, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("release_author >=", value, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorLessThan(String value) {
            addCriterion("release_author <", value, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorLessThanOrEqualTo(String value) {
            addCriterion("release_author <=", value, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorLike(String value) {
            addCriterion("release_author like", value, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorNotLike(String value) {
            addCriterion("release_author not like", value, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorIn(List<String> values) {
            addCriterion("release_author in", values, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorNotIn(List<String> values) {
            addCriterion("release_author not in", values, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorBetween(String value1, String value2) {
            addCriterion("release_author between", value1, value2, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseAuthorNotBetween(String value1, String value2) {
            addCriterion("release_author not between", value1, value2, "releaseAuthor");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterion("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterion("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterion("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterion("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterion("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterion("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterion("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterion("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterion("release_date not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberIsNull() {
            addCriterion("release_number is null");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberIsNotNull() {
            addCriterion("release_number is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberEqualTo(String value) {
            addCriterion("release_number =", value, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberNotEqualTo(String value) {
            addCriterion("release_number <>", value, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberGreaterThan(String value) {
            addCriterion("release_number >", value, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("release_number >=", value, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberLessThan(String value) {
            addCriterion("release_number <", value, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberLessThanOrEqualTo(String value) {
            addCriterion("release_number <=", value, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberLike(String value) {
            addCriterion("release_number like", value, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberNotLike(String value) {
            addCriterion("release_number not like", value, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberIn(List<String> values) {
            addCriterion("release_number in", values, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberNotIn(List<String> values) {
            addCriterion("release_number not in", values, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberBetween(String value1, String value2) {
            addCriterion("release_number between", value1, value2, "releaseNumber");
            return (Criteria) this;
        }

        public Criteria andReleaseNumberNotBetween(String value1, String value2) {
            addCriterion("release_number not between", value1, value2, "releaseNumber");
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