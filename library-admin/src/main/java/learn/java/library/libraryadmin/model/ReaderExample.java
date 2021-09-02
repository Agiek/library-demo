package learn.java.library.libraryadmin.model;

import java.util.ArrayList;
import java.util.List;

public class ReaderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public ReaderExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andReaderIdIsNull() {
            addCriterion("reader_id is null");
            return (Criteria) this;
        }

        public Criteria andReaderIdIsNotNull() {
            addCriterion("reader_id is not null");
            return (Criteria) this;
        }

        public Criteria andReaderIdEqualTo(Integer value) {
            addCriterion("reader_id =", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotEqualTo(Integer value) {
            addCriterion("reader_id <>", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdGreaterThan(Integer value) {
            addCriterion("reader_id >", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reader_id >=", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdLessThan(Integer value) {
            addCriterion("reader_id <", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdLessThanOrEqualTo(Integer value) {
            addCriterion("reader_id <=", value, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdIn(List<Integer> values) {
            addCriterion("reader_id in", values, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotIn(List<Integer> values) {
            addCriterion("reader_id not in", values, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdBetween(Integer value1, Integer value2) {
            addCriterion("reader_id between", value1, value2, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reader_id not between", value1, value2, "readerId");
            return (Criteria) this;
        }

        public Criteria andReaderNameIsNull() {
            addCriterion("reader_name is null");
            return (Criteria) this;
        }

        public Criteria andReaderNameIsNotNull() {
            addCriterion("reader_name is not null");
            return (Criteria) this;
        }

        public Criteria andReaderNameEqualTo(String value) {
            addCriterion("reader_name =", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameNotEqualTo(String value) {
            addCriterion("reader_name <>", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameGreaterThan(String value) {
            addCriterion("reader_name >", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("reader_name >=", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameLessThan(String value) {
            addCriterion("reader_name <", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameLessThanOrEqualTo(String value) {
            addCriterion("reader_name <=", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameLike(String value) {
            addCriterion("reader_name like", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameNotLike(String value) {
            addCriterion("reader_name not like", value, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameIn(List<String> values) {
            addCriterion("reader_name in", values, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameNotIn(List<String> values) {
            addCriterion("reader_name not in", values, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameBetween(String value1, String value2) {
            addCriterion("reader_name between", value1, value2, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderNameNotBetween(String value1, String value2) {
            addCriterion("reader_name not between", value1, value2, "readerName");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordIsNull() {
            addCriterion("reader_password is null");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordIsNotNull() {
            addCriterion("reader_password is not null");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordEqualTo(String value) {
            addCriterion("reader_password =", value, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordNotEqualTo(String value) {
            addCriterion("reader_password <>", value, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordGreaterThan(String value) {
            addCriterion("reader_password >", value, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("reader_password >=", value, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordLessThan(String value) {
            addCriterion("reader_password <", value, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordLessThanOrEqualTo(String value) {
            addCriterion("reader_password <=", value, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordLike(String value) {
            addCriterion("reader_password like", value, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordNotLike(String value) {
            addCriterion("reader_password not like", value, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordIn(List<String> values) {
            addCriterion("reader_password in", values, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordNotIn(List<String> values) {
            addCriterion("reader_password not in", values, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordBetween(String value1, String value2) {
            addCriterion("reader_password between", value1, value2, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderPasswordNotBetween(String value1, String value2) {
            addCriterion("reader_password not between", value1, value2, "readerPassword");
            return (Criteria) this;
        }

        public Criteria andReaderEmailIsNull() {
            addCriterion("reader_email is null");
            return (Criteria) this;
        }

        public Criteria andReaderEmailIsNotNull() {
            addCriterion("reader_email is not null");
            return (Criteria) this;
        }

        public Criteria andReaderEmailEqualTo(String value) {
            addCriterion("reader_email =", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailNotEqualTo(String value) {
            addCriterion("reader_email <>", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailGreaterThan(String value) {
            addCriterion("reader_email >", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailGreaterThanOrEqualTo(String value) {
            addCriterion("reader_email >=", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailLessThan(String value) {
            addCriterion("reader_email <", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailLessThanOrEqualTo(String value) {
            addCriterion("reader_email <=", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailLike(String value) {
            addCriterion("reader_email like", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailNotLike(String value) {
            addCriterion("reader_email not like", value, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailIn(List<String> values) {
            addCriterion("reader_email in", values, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailNotIn(List<String> values) {
            addCriterion("reader_email not in", values, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailBetween(String value1, String value2) {
            addCriterion("reader_email between", value1, value2, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andReaderEmailNotBetween(String value1, String value2) {
            addCriterion("reader_email not between", value1, value2, "readerEmail");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table reader
     *
     * @mbg.generated do_not_delete_during_merge Thu Sep 02 08:52:06 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table reader
     *
     * @mbg.generated Thu Sep 02 08:52:06 CST 2021
     */
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