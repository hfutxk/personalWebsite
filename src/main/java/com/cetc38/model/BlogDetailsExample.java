package com.cetc38.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogDetailsExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNull() {
            addCriterion("blog_author is null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNotNull() {
            addCriterion("blog_author is not null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorEqualTo(String value) {
            addCriterion("blog_author =", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotEqualTo(String value) {
            addCriterion("blog_author <>", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThan(String value) {
            addCriterion("blog_author >", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_author >=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThan(String value) {
            addCriterion("blog_author <", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThanOrEqualTo(String value) {
            addCriterion("blog_author <=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLike(String value) {
            addCriterion("blog_author like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotLike(String value) {
            addCriterion("blog_author not like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIn(List<String> values) {
            addCriterion("blog_author in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotIn(List<String> values) {
            addCriterion("blog_author not in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorBetween(String value1, String value2) {
            addCriterion("blog_author between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotBetween(String value1, String value2) {
            addCriterion("blog_author not between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogDateIsNull() {
            addCriterion("blog_date is null");
            return (Criteria) this;
        }

        public Criteria andBlogDateIsNotNull() {
            addCriterion("blog_date is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDateEqualTo(Date value) {
            addCriterion("blog_date =", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotEqualTo(Date value) {
            addCriterion("blog_date <>", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateGreaterThan(Date value) {
            addCriterion("blog_date >", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_date >=", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateLessThan(Date value) {
            addCriterion("blog_date <", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateLessThanOrEqualTo(Date value) {
            addCriterion("blog_date <=", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateIn(List<Date> values) {
            addCriterion("blog_date in", values, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotIn(List<Date> values) {
            addCriterion("blog_date not in", values, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateBetween(Date value1, Date value2) {
            addCriterion("blog_date between", value1, value2, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotBetween(Date value1, Date value2) {
            addCriterion("blog_date not between", value1, value2, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogReadIsNull() {
            addCriterion("blog_read is null");
            return (Criteria) this;
        }

        public Criteria andBlogReadIsNotNull() {
            addCriterion("blog_read is not null");
            return (Criteria) this;
        }

        public Criteria andBlogReadEqualTo(Integer value) {
            addCriterion("blog_read =", value, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogReadNotEqualTo(Integer value) {
            addCriterion("blog_read <>", value, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogReadGreaterThan(Integer value) {
            addCriterion("blog_read >", value, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_read >=", value, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogReadLessThan(Integer value) {
            addCriterion("blog_read <", value, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogReadLessThanOrEqualTo(Integer value) {
            addCriterion("blog_read <=", value, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogReadIn(List<Integer> values) {
            addCriterion("blog_read in", values, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogReadNotIn(List<Integer> values) {
            addCriterion("blog_read not in", values, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogReadBetween(Integer value1, Integer value2) {
            addCriterion("blog_read between", value1, value2, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogReadNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_read not between", value1, value2, "blogRead");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryIsNull() {
            addCriterion("blog_summary is null");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryIsNotNull() {
            addCriterion("blog_summary is not null");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryEqualTo(String value) {
            addCriterion("blog_summary =", value, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryNotEqualTo(String value) {
            addCriterion("blog_summary <>", value, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryGreaterThan(String value) {
            addCriterion("blog_summary >", value, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("blog_summary >=", value, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryLessThan(String value) {
            addCriterion("blog_summary <", value, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryLessThanOrEqualTo(String value) {
            addCriterion("blog_summary <=", value, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryLike(String value) {
            addCriterion("blog_summary like", value, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryNotLike(String value) {
            addCriterion("blog_summary not like", value, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryIn(List<String> values) {
            addCriterion("blog_summary in", values, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryNotIn(List<String> values) {
            addCriterion("blog_summary not in", values, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryBetween(String value1, String value2) {
            addCriterion("blog_summary between", value1, value2, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogSummaryNotBetween(String value1, String value2) {
            addCriterion("blog_summary not between", value1, value2, "blogSummary");
            return (Criteria) this;
        }

        public Criteria andBlogLabelIsNull() {
            addCriterion("blog_label is null");
            return (Criteria) this;
        }

        public Criteria andBlogLabelIsNotNull() {
            addCriterion("blog_label is not null");
            return (Criteria) this;
        }

        public Criteria andBlogLabelEqualTo(String value) {
            addCriterion("blog_label =", value, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelNotEqualTo(String value) {
            addCriterion("blog_label <>", value, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelGreaterThan(String value) {
            addCriterion("blog_label >", value, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelGreaterThanOrEqualTo(String value) {
            addCriterion("blog_label >=", value, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelLessThan(String value) {
            addCriterion("blog_label <", value, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelLessThanOrEqualTo(String value) {
            addCriterion("blog_label <=", value, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelLike(String value) {
            addCriterion("blog_label like", value, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelNotLike(String value) {
            addCriterion("blog_label not like", value, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelIn(List<String> values) {
            addCriterion("blog_label in", values, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelNotIn(List<String> values) {
            addCriterion("blog_label not in", values, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelBetween(String value1, String value2) {
            addCriterion("blog_label between", value1, value2, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogLabelNotBetween(String value1, String value2) {
            addCriterion("blog_label not between", value1, value2, "blogLabel");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteIsNull() {
            addCriterion("blog_delete is null");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteIsNotNull() {
            addCriterion("blog_delete is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteEqualTo(Integer value) {
            addCriterion("blog_delete =", value, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteNotEqualTo(Integer value) {
            addCriterion("blog_delete <>", value, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteGreaterThan(Integer value) {
            addCriterion("blog_delete >", value, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_delete >=", value, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteLessThan(Integer value) {
            addCriterion("blog_delete <", value, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("blog_delete <=", value, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteIn(List<Integer> values) {
            addCriterion("blog_delete in", values, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteNotIn(List<Integer> values) {
            addCriterion("blog_delete not in", values, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteBetween(Integer value1, Integer value2) {
            addCriterion("blog_delete between", value1, value2, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_delete not between", value1, value2, "blogDelete");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIsNull() {
            addCriterion("blog_category is null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIsNotNull() {
            addCriterion("blog_category is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryEqualTo(Integer value) {
            addCriterion("blog_category =", value, "blogCategory");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNotEqualTo(Integer value) {
            addCriterion("blog_category <>", value, "blogCategory");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryGreaterThan(Integer value) {
            addCriterion("blog_category >", value, "blogCategory");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_category >=", value, "blogCategory");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryLessThan(Integer value) {
            addCriterion("blog_category <", value, "blogCategory");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("blog_category <=", value, "blogCategory");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryIn(List<Integer> values) {
            addCriterion("blog_category in", values, "blogCategory");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNotIn(List<Integer> values) {
            addCriterion("blog_category not in", values, "blogCategory");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryBetween(Integer value1, Integer value2) {
            addCriterion("blog_category between", value1, value2, "blogCategory");
            return (Criteria) this;
        }

        public Criteria andBlogCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_category not between", value1, value2, "blogCategory");
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