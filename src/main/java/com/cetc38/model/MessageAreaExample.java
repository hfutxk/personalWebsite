package com.cetc38.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageAreaExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageParentIsNull() {
            addCriterion("message_parent is null");
            return (Criteria) this;
        }

        public Criteria andMessageParentIsNotNull() {
            addCriterion("message_parent is not null");
            return (Criteria) this;
        }

        public Criteria andMessageParentEqualTo(Integer value) {
            addCriterion("message_parent =", value, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageParentNotEqualTo(Integer value) {
            addCriterion("message_parent <>", value, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageParentGreaterThan(Integer value) {
            addCriterion("message_parent >", value, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_parent >=", value, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageParentLessThan(Integer value) {
            addCriterion("message_parent <", value, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageParentLessThanOrEqualTo(Integer value) {
            addCriterion("message_parent <=", value, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageParentIn(List<Integer> values) {
            addCriterion("message_parent in", values, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageParentNotIn(List<Integer> values) {
            addCriterion("message_parent not in", values, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageParentBetween(Integer value1, Integer value2) {
            addCriterion("message_parent between", value1, value2, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageParentNotBetween(Integer value1, Integer value2) {
            addCriterion("message_parent not between", value1, value2, "messageParent");
            return (Criteria) this;
        }

        public Criteria andMessageBelongIsNull() {
            addCriterion("message_belong is null");
            return (Criteria) this;
        }

        public Criteria andMessageBelongIsNotNull() {
            addCriterion("message_belong is not null");
            return (Criteria) this;
        }

        public Criteria andMessageBelongEqualTo(Integer value) {
            addCriterion("message_belong =", value, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageBelongNotEqualTo(Integer value) {
            addCriterion("message_belong <>", value, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageBelongGreaterThan(Integer value) {
            addCriterion("message_belong >", value, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageBelongGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_belong >=", value, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageBelongLessThan(Integer value) {
            addCriterion("message_belong <", value, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageBelongLessThanOrEqualTo(Integer value) {
            addCriterion("message_belong <=", value, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageBelongIn(List<Integer> values) {
            addCriterion("message_belong in", values, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageBelongNotIn(List<Integer> values) {
            addCriterion("message_belong not in", values, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageBelongBetween(Integer value1, Integer value2) {
            addCriterion("message_belong between", value1, value2, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageBelongNotBetween(Integer value1, Integer value2) {
            addCriterion("message_belong not between", value1, value2, "messageBelong");
            return (Criteria) this;
        }

        public Criteria andMessageDateIsNull() {
            addCriterion("message_date is null");
            return (Criteria) this;
        }

        public Criteria andMessageDateIsNotNull() {
            addCriterion("message_date is not null");
            return (Criteria) this;
        }

        public Criteria andMessageDateEqualTo(Date value) {
            addCriterion("message_date =", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotEqualTo(Date value) {
            addCriterion("message_date <>", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateGreaterThan(Date value) {
            addCriterion("message_date >", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("message_date >=", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateLessThan(Date value) {
            addCriterion("message_date <", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateLessThanOrEqualTo(Date value) {
            addCriterion("message_date <=", value, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateIn(List<Date> values) {
            addCriterion("message_date in", values, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotIn(List<Date> values) {
            addCriterion("message_date not in", values, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateBetween(Date value1, Date value2) {
            addCriterion("message_date between", value1, value2, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageDateNotBetween(Date value1, Date value2) {
            addCriterion("message_date not between", value1, value2, "messageDate");
            return (Criteria) this;
        }

        public Criteria andMessageEmailIsNull() {
            addCriterion("message_email is null");
            return (Criteria) this;
        }

        public Criteria andMessageEmailIsNotNull() {
            addCriterion("message_email is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEmailEqualTo(String value) {
            addCriterion("message_email =", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailNotEqualTo(String value) {
            addCriterion("message_email <>", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailGreaterThan(String value) {
            addCriterion("message_email >", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailGreaterThanOrEqualTo(String value) {
            addCriterion("message_email >=", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailLessThan(String value) {
            addCriterion("message_email <", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailLessThanOrEqualTo(String value) {
            addCriterion("message_email <=", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailLike(String value) {
            addCriterion("message_email like", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailNotLike(String value) {
            addCriterion("message_email not like", value, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailIn(List<String> values) {
            addCriterion("message_email in", values, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailNotIn(List<String> values) {
            addCriterion("message_email not in", values, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailBetween(String value1, String value2) {
            addCriterion("message_email between", value1, value2, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageEmailNotBetween(String value1, String value2) {
            addCriterion("message_email not between", value1, value2, "messageEmail");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameIsNull() {
            addCriterion("message_username is null");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameIsNotNull() {
            addCriterion("message_username is not null");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameEqualTo(String value) {
            addCriterion("message_username =", value, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameNotEqualTo(String value) {
            addCriterion("message_username <>", value, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameGreaterThan(String value) {
            addCriterion("message_username >", value, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("message_username >=", value, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameLessThan(String value) {
            addCriterion("message_username <", value, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameLessThanOrEqualTo(String value) {
            addCriterion("message_username <=", value, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameLike(String value) {
            addCriterion("message_username like", value, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameNotLike(String value) {
            addCriterion("message_username not like", value, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameIn(List<String> values) {
            addCriterion("message_username in", values, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameNotIn(List<String> values) {
            addCriterion("message_username not in", values, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameBetween(String value1, String value2) {
            addCriterion("message_username between", value1, value2, "messageUsername");
            return (Criteria) this;
        }

        public Criteria andMessageUsernameNotBetween(String value1, String value2) {
            addCriterion("message_username not between", value1, value2, "messageUsername");
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