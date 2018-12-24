package com.cetc38.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodeLibraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodeLibraryExample() {
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

        public Criteria andCodeIdIsNull() {
            addCriterion("code_id is null");
            return (Criteria) this;
        }

        public Criteria andCodeIdIsNotNull() {
            addCriterion("code_id is not null");
            return (Criteria) this;
        }

        public Criteria andCodeIdEqualTo(Integer value) {
            addCriterion("code_id =", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotEqualTo(Integer value) {
            addCriterion("code_id <>", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThan(Integer value) {
            addCriterion("code_id >", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_id >=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThan(Integer value) {
            addCriterion("code_id <", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdLessThanOrEqualTo(Integer value) {
            addCriterion("code_id <=", value, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdIn(List<Integer> values) {
            addCriterion("code_id in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotIn(List<Integer> values) {
            addCriterion("code_id not in", values, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdBetween(Integer value1, Integer value2) {
            addCriterion("code_id between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("code_id not between", value1, value2, "codeId");
            return (Criteria) this;
        }

        public Criteria andCodeTitleIsNull() {
            addCriterion("code_title is null");
            return (Criteria) this;
        }

        public Criteria andCodeTitleIsNotNull() {
            addCriterion("code_title is not null");
            return (Criteria) this;
        }

        public Criteria andCodeTitleEqualTo(String value) {
            addCriterion("code_title =", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleNotEqualTo(String value) {
            addCriterion("code_title <>", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleGreaterThan(String value) {
            addCriterion("code_title >", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("code_title >=", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleLessThan(String value) {
            addCriterion("code_title <", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleLessThanOrEqualTo(String value) {
            addCriterion("code_title <=", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleLike(String value) {
            addCriterion("code_title like", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleNotLike(String value) {
            addCriterion("code_title not like", value, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleIn(List<String> values) {
            addCriterion("code_title in", values, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleNotIn(List<String> values) {
            addCriterion("code_title not in", values, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleBetween(String value1, String value2) {
            addCriterion("code_title between", value1, value2, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeTitleNotBetween(String value1, String value2) {
            addCriterion("code_title not between", value1, value2, "codeTitle");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorIsNull() {
            addCriterion("code_author is null");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorIsNotNull() {
            addCriterion("code_author is not null");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorEqualTo(String value) {
            addCriterion("code_author =", value, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorNotEqualTo(String value) {
            addCriterion("code_author <>", value, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorGreaterThan(String value) {
            addCriterion("code_author >", value, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("code_author >=", value, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorLessThan(String value) {
            addCriterion("code_author <", value, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorLessThanOrEqualTo(String value) {
            addCriterion("code_author <=", value, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorLike(String value) {
            addCriterion("code_author like", value, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorNotLike(String value) {
            addCriterion("code_author not like", value, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorIn(List<String> values) {
            addCriterion("code_author in", values, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorNotIn(List<String> values) {
            addCriterion("code_author not in", values, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorBetween(String value1, String value2) {
            addCriterion("code_author between", value1, value2, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeAuthorNotBetween(String value1, String value2) {
            addCriterion("code_author not between", value1, value2, "codeAuthor");
            return (Criteria) this;
        }

        public Criteria andCodeDateIsNull() {
            addCriterion("code_date is null");
            return (Criteria) this;
        }

        public Criteria andCodeDateIsNotNull() {
            addCriterion("code_date is not null");
            return (Criteria) this;
        }

        public Criteria andCodeDateEqualTo(Date value) {
            addCriterion("code_date =", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateNotEqualTo(Date value) {
            addCriterion("code_date <>", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateGreaterThan(Date value) {
            addCriterion("code_date >", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("code_date >=", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateLessThan(Date value) {
            addCriterion("code_date <", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateLessThanOrEqualTo(Date value) {
            addCriterion("code_date <=", value, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateIn(List<Date> values) {
            addCriterion("code_date in", values, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateNotIn(List<Date> values) {
            addCriterion("code_date not in", values, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateBetween(Date value1, Date value2) {
            addCriterion("code_date between", value1, value2, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeDateNotBetween(Date value1, Date value2) {
            addCriterion("code_date not between", value1, value2, "codeDate");
            return (Criteria) this;
        }

        public Criteria andCodeReadIsNull() {
            addCriterion("code_read is null");
            return (Criteria) this;
        }

        public Criteria andCodeReadIsNotNull() {
            addCriterion("code_read is not null");
            return (Criteria) this;
        }

        public Criteria andCodeReadEqualTo(Integer value) {
            addCriterion("code_read =", value, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeReadNotEqualTo(Integer value) {
            addCriterion("code_read <>", value, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeReadGreaterThan(Integer value) {
            addCriterion("code_read >", value, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_read >=", value, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeReadLessThan(Integer value) {
            addCriterion("code_read <", value, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeReadLessThanOrEqualTo(Integer value) {
            addCriterion("code_read <=", value, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeReadIn(List<Integer> values) {
            addCriterion("code_read in", values, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeReadNotIn(List<Integer> values) {
            addCriterion("code_read not in", values, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeReadBetween(Integer value1, Integer value2) {
            addCriterion("code_read between", value1, value2, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeReadNotBetween(Integer value1, Integer value2) {
            addCriterion("code_read not between", value1, value2, "codeRead");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryIsNull() {
            addCriterion("code_summary is null");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryIsNotNull() {
            addCriterion("code_summary is not null");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryEqualTo(String value) {
            addCriterion("code_summary =", value, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryNotEqualTo(String value) {
            addCriterion("code_summary <>", value, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryGreaterThan(String value) {
            addCriterion("code_summary >", value, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("code_summary >=", value, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryLessThan(String value) {
            addCriterion("code_summary <", value, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryLessThanOrEqualTo(String value) {
            addCriterion("code_summary <=", value, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryLike(String value) {
            addCriterion("code_summary like", value, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryNotLike(String value) {
            addCriterion("code_summary not like", value, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryIn(List<String> values) {
            addCriterion("code_summary in", values, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryNotIn(List<String> values) {
            addCriterion("code_summary not in", values, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryBetween(String value1, String value2) {
            addCriterion("code_summary between", value1, value2, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeSummaryNotBetween(String value1, String value2) {
            addCriterion("code_summary not between", value1, value2, "codeSummary");
            return (Criteria) this;
        }

        public Criteria andCodeLabelIsNull() {
            addCriterion("code_label is null");
            return (Criteria) this;
        }

        public Criteria andCodeLabelIsNotNull() {
            addCriterion("code_label is not null");
            return (Criteria) this;
        }

        public Criteria andCodeLabelEqualTo(String value) {
            addCriterion("code_label =", value, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelNotEqualTo(String value) {
            addCriterion("code_label <>", value, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelGreaterThan(String value) {
            addCriterion("code_label >", value, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelGreaterThanOrEqualTo(String value) {
            addCriterion("code_label >=", value, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelLessThan(String value) {
            addCriterion("code_label <", value, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelLessThanOrEqualTo(String value) {
            addCriterion("code_label <=", value, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelLike(String value) {
            addCriterion("code_label like", value, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelNotLike(String value) {
            addCriterion("code_label not like", value, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelIn(List<String> values) {
            addCriterion("code_label in", values, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelNotIn(List<String> values) {
            addCriterion("code_label not in", values, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelBetween(String value1, String value2) {
            addCriterion("code_label between", value1, value2, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeLabelNotBetween(String value1, String value2) {
            addCriterion("code_label not between", value1, value2, "codeLabel");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteIsNull() {
            addCriterion("code_delete is null");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteIsNotNull() {
            addCriterion("code_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteEqualTo(Integer value) {
            addCriterion("code_delete =", value, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteNotEqualTo(Integer value) {
            addCriterion("code_delete <>", value, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteGreaterThan(Integer value) {
            addCriterion("code_delete >", value, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_delete >=", value, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteLessThan(Integer value) {
            addCriterion("code_delete <", value, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("code_delete <=", value, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteIn(List<Integer> values) {
            addCriterion("code_delete in", values, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteNotIn(List<Integer> values) {
            addCriterion("code_delete not in", values, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteBetween(Integer value1, Integer value2) {
            addCriterion("code_delete between", value1, value2, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("code_delete not between", value1, value2, "codeDelete");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryIsNull() {
            addCriterion("code_category is null");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryIsNotNull() {
            addCriterion("code_category is not null");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryEqualTo(Integer value) {
            addCriterion("code_category =", value, "codeCategory");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryNotEqualTo(Integer value) {
            addCriterion("code_category <>", value, "codeCategory");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryGreaterThan(Integer value) {
            addCriterion("code_category >", value, "codeCategory");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_category >=", value, "codeCategory");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryLessThan(Integer value) {
            addCriterion("code_category <", value, "codeCategory");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("code_category <=", value, "codeCategory");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryIn(List<Integer> values) {
            addCriterion("code_category in", values, "codeCategory");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryNotIn(List<Integer> values) {
            addCriterion("code_category not in", values, "codeCategory");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryBetween(Integer value1, Integer value2) {
            addCriterion("code_category between", value1, value2, "codeCategory");
            return (Criteria) this;
        }

        public Criteria andCodeCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("code_category not between", value1, value2, "codeCategory");
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