package tk.mybatis.springboot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DPatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DPatientExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andKeeperIsNull() {
            addCriterion("keeper is null");
            return (Criteria) this;
        }

        public Criteria andKeeperIsNotNull() {
            addCriterion("keeper is not null");
            return (Criteria) this;
        }

        public Criteria andKeeperEqualTo(String value) {
            addCriterion("keeper =", value, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperNotEqualTo(String value) {
            addCriterion("keeper <>", value, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperGreaterThan(String value) {
            addCriterion("keeper >", value, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperGreaterThanOrEqualTo(String value) {
            addCriterion("keeper >=", value, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperLessThan(String value) {
            addCriterion("keeper <", value, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperLessThanOrEqualTo(String value) {
            addCriterion("keeper <=", value, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperLike(String value) {
            addCriterion("keeper like", value, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperNotLike(String value) {
            addCriterion("keeper not like", value, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperIn(List<String> values) {
            addCriterion("keeper in", values, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperNotIn(List<String> values) {
            addCriterion("keeper not in", values, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperBetween(String value1, String value2) {
            addCriterion("keeper between", value1, value2, "keeper");
            return (Criteria) this;
        }

        public Criteria andKeeperNotBetween(String value1, String value2) {
            addCriterion("keeper not between", value1, value2, "keeper");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andFromwhereIsNull() {
            addCriterion("fromwhere is null");
            return (Criteria) this;
        }

        public Criteria andFromwhereIsNotNull() {
            addCriterion("fromwhere is not null");
            return (Criteria) this;
        }

        public Criteria andFromwhereEqualTo(String value) {
            addCriterion("fromwhere =", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereNotEqualTo(String value) {
            addCriterion("fromwhere <>", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereGreaterThan(String value) {
            addCriterion("fromwhere >", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereGreaterThanOrEqualTo(String value) {
            addCriterion("fromwhere >=", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereLessThan(String value) {
            addCriterion("fromwhere <", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereLessThanOrEqualTo(String value) {
            addCriterion("fromwhere <=", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereLike(String value) {
            addCriterion("fromwhere like", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereNotLike(String value) {
            addCriterion("fromwhere not like", value, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereIn(List<String> values) {
            addCriterion("fromwhere in", values, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereNotIn(List<String> values) {
            addCriterion("fromwhere not in", values, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereBetween(String value1, String value2) {
            addCriterion("fromwhere between", value1, value2, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andFromwhereNotBetween(String value1, String value2) {
            addCriterion("fromwhere not between", value1, value2, "fromwhere");
            return (Criteria) this;
        }

        public Criteria andTipIsNull() {
            addCriterion("tip is null");
            return (Criteria) this;
        }

        public Criteria andTipIsNotNull() {
            addCriterion("tip is not null");
            return (Criteria) this;
        }

        public Criteria andTipEqualTo(String value) {
            addCriterion("tip =", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotEqualTo(String value) {
            addCriterion("tip <>", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipGreaterThan(String value) {
            addCriterion("tip >", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipGreaterThanOrEqualTo(String value) {
            addCriterion("tip >=", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLessThan(String value) {
            addCriterion("tip <", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLessThanOrEqualTo(String value) {
            addCriterion("tip <=", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipLike(String value) {
            addCriterion("tip like", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotLike(String value) {
            addCriterion("tip not like", value, "tip");
            return (Criteria) this;
        }

        public Criteria andTipIn(List<String> values) {
            addCriterion("tip in", values, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotIn(List<String> values) {
            addCriterion("tip not in", values, "tip");
            return (Criteria) this;
        }

        public Criteria andTipBetween(String value1, String value2) {
            addCriterion("tip between", value1, value2, "tip");
            return (Criteria) this;
        }

        public Criteria andTipNotBetween(String value1, String value2) {
            addCriterion("tip not between", value1, value2, "tip");
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

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAllergyIsNull() {
            addCriterion("allergy is null");
            return (Criteria) this;
        }

        public Criteria andAllergyIsNotNull() {
            addCriterion("allergy is not null");
            return (Criteria) this;
        }

        public Criteria andAllergyEqualTo(String value) {
            addCriterion("allergy =", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotEqualTo(String value) {
            addCriterion("allergy <>", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyGreaterThan(String value) {
            addCriterion("allergy >", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyGreaterThanOrEqualTo(String value) {
            addCriterion("allergy >=", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLessThan(String value) {
            addCriterion("allergy <", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLessThanOrEqualTo(String value) {
            addCriterion("allergy <=", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLike(String value) {
            addCriterion("allergy like", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotLike(String value) {
            addCriterion("allergy not like", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyIn(List<String> values) {
            addCriterion("allergy in", values, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotIn(List<String> values) {
            addCriterion("allergy not in", values, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyBetween(String value1, String value2) {
            addCriterion("allergy between", value1, value2, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotBetween(String value1, String value2) {
            addCriterion("allergy not between", value1, value2, "allergy");
            return (Criteria) this;
        }

        public Criteria andHeartIsNull() {
            addCriterion("heart is null");
            return (Criteria) this;
        }

        public Criteria andHeartIsNotNull() {
            addCriterion("heart is not null");
            return (Criteria) this;
        }

        public Criteria andHeartEqualTo(String value) {
            addCriterion("heart =", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotEqualTo(String value) {
            addCriterion("heart <>", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartGreaterThan(String value) {
            addCriterion("heart >", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartGreaterThanOrEqualTo(String value) {
            addCriterion("heart >=", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartLessThan(String value) {
            addCriterion("heart <", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartLessThanOrEqualTo(String value) {
            addCriterion("heart <=", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartLike(String value) {
            addCriterion("heart like", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotLike(String value) {
            addCriterion("heart not like", value, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartIn(List<String> values) {
            addCriterion("heart in", values, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotIn(List<String> values) {
            addCriterion("heart not in", values, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartBetween(String value1, String value2) {
            addCriterion("heart between", value1, value2, "heart");
            return (Criteria) this;
        }

        public Criteria andHeartNotBetween(String value1, String value2) {
            addCriterion("heart not between", value1, value2, "heart");
            return (Criteria) this;
        }

        public Criteria andHypertensionIsNull() {
            addCriterion("hypertension is null");
            return (Criteria) this;
        }

        public Criteria andHypertensionIsNotNull() {
            addCriterion("hypertension is not null");
            return (Criteria) this;
        }

        public Criteria andHypertensionEqualTo(String value) {
            addCriterion("hypertension =", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionNotEqualTo(String value) {
            addCriterion("hypertension <>", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionGreaterThan(String value) {
            addCriterion("hypertension >", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionGreaterThanOrEqualTo(String value) {
            addCriterion("hypertension >=", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionLessThan(String value) {
            addCriterion("hypertension <", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionLessThanOrEqualTo(String value) {
            addCriterion("hypertension <=", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionLike(String value) {
            addCriterion("hypertension like", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionNotLike(String value) {
            addCriterion("hypertension not like", value, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionIn(List<String> values) {
            addCriterion("hypertension in", values, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionNotIn(List<String> values) {
            addCriterion("hypertension not in", values, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionBetween(String value1, String value2) {
            addCriterion("hypertension between", value1, value2, "hypertension");
            return (Criteria) this;
        }

        public Criteria andHypertensionNotBetween(String value1, String value2) {
            addCriterion("hypertension not between", value1, value2, "hypertension");
            return (Criteria) this;
        }

        public Criteria andDiabetesIsNull() {
            addCriterion("diabetes is null");
            return (Criteria) this;
        }

        public Criteria andDiabetesIsNotNull() {
            addCriterion("diabetes is not null");
            return (Criteria) this;
        }

        public Criteria andDiabetesEqualTo(String value) {
            addCriterion("diabetes =", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotEqualTo(String value) {
            addCriterion("diabetes <>", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesGreaterThan(String value) {
            addCriterion("diabetes >", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesGreaterThanOrEqualTo(String value) {
            addCriterion("diabetes >=", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLessThan(String value) {
            addCriterion("diabetes <", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLessThanOrEqualTo(String value) {
            addCriterion("diabetes <=", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesLike(String value) {
            addCriterion("diabetes like", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotLike(String value) {
            addCriterion("diabetes not like", value, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesIn(List<String> values) {
            addCriterion("diabetes in", values, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotIn(List<String> values) {
            addCriterion("diabetes not in", values, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesBetween(String value1, String value2) {
            addCriterion("diabetes between", value1, value2, "diabetes");
            return (Criteria) this;
        }

        public Criteria andDiabetesNotBetween(String value1, String value2) {
            addCriterion("diabetes not between", value1, value2, "diabetes");
            return (Criteria) this;
        }

        public Criteria andKidneyIsNull() {
            addCriterion("kidney is null");
            return (Criteria) this;
        }

        public Criteria andKidneyIsNotNull() {
            addCriterion("kidney is not null");
            return (Criteria) this;
        }

        public Criteria andKidneyEqualTo(String value) {
            addCriterion("kidney =", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyNotEqualTo(String value) {
            addCriterion("kidney <>", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyGreaterThan(String value) {
            addCriterion("kidney >", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyGreaterThanOrEqualTo(String value) {
            addCriterion("kidney >=", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyLessThan(String value) {
            addCriterion("kidney <", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyLessThanOrEqualTo(String value) {
            addCriterion("kidney <=", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyLike(String value) {
            addCriterion("kidney like", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyNotLike(String value) {
            addCriterion("kidney not like", value, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyIn(List<String> values) {
            addCriterion("kidney in", values, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyNotIn(List<String> values) {
            addCriterion("kidney not in", values, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyBetween(String value1, String value2) {
            addCriterion("kidney between", value1, value2, "kidney");
            return (Criteria) this;
        }

        public Criteria andKidneyNotBetween(String value1, String value2) {
            addCriterion("kidney not between", value1, value2, "kidney");
            return (Criteria) this;
        }

        public Criteria andNephropathyIsNull() {
            addCriterion("nephropathy is null");
            return (Criteria) this;
        }

        public Criteria andNephropathyIsNotNull() {
            addCriterion("nephropathy is not null");
            return (Criteria) this;
        }

        public Criteria andNephropathyEqualTo(String value) {
            addCriterion("nephropathy =", value, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyNotEqualTo(String value) {
            addCriterion("nephropathy <>", value, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyGreaterThan(String value) {
            addCriterion("nephropathy >", value, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyGreaterThanOrEqualTo(String value) {
            addCriterion("nephropathy >=", value, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyLessThan(String value) {
            addCriterion("nephropathy <", value, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyLessThanOrEqualTo(String value) {
            addCriterion("nephropathy <=", value, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyLike(String value) {
            addCriterion("nephropathy like", value, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyNotLike(String value) {
            addCriterion("nephropathy not like", value, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyIn(List<String> values) {
            addCriterion("nephropathy in", values, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyNotIn(List<String> values) {
            addCriterion("nephropathy not in", values, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyBetween(String value1, String value2) {
            addCriterion("nephropathy between", value1, value2, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andNephropathyNotBetween(String value1, String value2) {
            addCriterion("nephropathy not between", value1, value2, "nephropathy");
            return (Criteria) this;
        }

        public Criteria andInfectiousIsNull() {
            addCriterion("infectious is null");
            return (Criteria) this;
        }

        public Criteria andInfectiousIsNotNull() {
            addCriterion("infectious is not null");
            return (Criteria) this;
        }

        public Criteria andInfectiousEqualTo(String value) {
            addCriterion("infectious =", value, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousNotEqualTo(String value) {
            addCriterion("infectious <>", value, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousGreaterThan(String value) {
            addCriterion("infectious >", value, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousGreaterThanOrEqualTo(String value) {
            addCriterion("infectious >=", value, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousLessThan(String value) {
            addCriterion("infectious <", value, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousLessThanOrEqualTo(String value) {
            addCriterion("infectious <=", value, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousLike(String value) {
            addCriterion("infectious like", value, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousNotLike(String value) {
            addCriterion("infectious not like", value, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousIn(List<String> values) {
            addCriterion("infectious in", values, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousNotIn(List<String> values) {
            addCriterion("infectious not in", values, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousBetween(String value1, String value2) {
            addCriterion("infectious between", value1, value2, "infectious");
            return (Criteria) this;
        }

        public Criteria andInfectiousNotBetween(String value1, String value2) {
            addCriterion("infectious not between", value1, value2, "infectious");
            return (Criteria) this;
        }

        public Criteria andBloodIsNull() {
            addCriterion("blood is null");
            return (Criteria) this;
        }

        public Criteria andBloodIsNotNull() {
            addCriterion("blood is not null");
            return (Criteria) this;
        }

        public Criteria andBloodEqualTo(String value) {
            addCriterion("blood =", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotEqualTo(String value) {
            addCriterion("blood <>", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThan(String value) {
            addCriterion("blood >", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThanOrEqualTo(String value) {
            addCriterion("blood >=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThan(String value) {
            addCriterion("blood <", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThanOrEqualTo(String value) {
            addCriterion("blood <=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLike(String value) {
            addCriterion("blood like", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotLike(String value) {
            addCriterion("blood not like", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodIn(List<String> values) {
            addCriterion("blood in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotIn(List<String> values) {
            addCriterion("blood not in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodBetween(String value1, String value2) {
            addCriterion("blood between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotBetween(String value1, String value2) {
            addCriterion("blood not between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andSmokeIsNull() {
            addCriterion("smoke is null");
            return (Criteria) this;
        }

        public Criteria andSmokeIsNotNull() {
            addCriterion("smoke is not null");
            return (Criteria) this;
        }

        public Criteria andSmokeEqualTo(String value) {
            addCriterion("smoke =", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeNotEqualTo(String value) {
            addCriterion("smoke <>", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeGreaterThan(String value) {
            addCriterion("smoke >", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeGreaterThanOrEqualTo(String value) {
            addCriterion("smoke >=", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeLessThan(String value) {
            addCriterion("smoke <", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeLessThanOrEqualTo(String value) {
            addCriterion("smoke <=", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeLike(String value) {
            addCriterion("smoke like", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeNotLike(String value) {
            addCriterion("smoke not like", value, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeIn(List<String> values) {
            addCriterion("smoke in", values, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeNotIn(List<String> values) {
            addCriterion("smoke not in", values, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeBetween(String value1, String value2) {
            addCriterion("smoke between", value1, value2, "smoke");
            return (Criteria) this;
        }

        public Criteria andSmokeNotBetween(String value1, String value2) {
            addCriterion("smoke not between", value1, value2, "smoke");
            return (Criteria) this;
        }

        public Criteria andDrinkIsNull() {
            addCriterion("drink is null");
            return (Criteria) this;
        }

        public Criteria andDrinkIsNotNull() {
            addCriterion("drink is not null");
            return (Criteria) this;
        }

        public Criteria andDrinkEqualTo(String value) {
            addCriterion("drink =", value, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkNotEqualTo(String value) {
            addCriterion("drink <>", value, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkGreaterThan(String value) {
            addCriterion("drink >", value, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkGreaterThanOrEqualTo(String value) {
            addCriterion("drink >=", value, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkLessThan(String value) {
            addCriterion("drink <", value, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkLessThanOrEqualTo(String value) {
            addCriterion("drink <=", value, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkLike(String value) {
            addCriterion("drink like", value, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkNotLike(String value) {
            addCriterion("drink not like", value, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkIn(List<String> values) {
            addCriterion("drink in", values, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkNotIn(List<String> values) {
            addCriterion("drink not in", values, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkBetween(String value1, String value2) {
            addCriterion("drink between", value1, value2, "drink");
            return (Criteria) this;
        }

        public Criteria andDrinkNotBetween(String value1, String value2) {
            addCriterion("drink not between", value1, value2, "drink");
            return (Criteria) this;
        }

        public Criteria andAspirinIsNull() {
            addCriterion("aspirin is null");
            return (Criteria) this;
        }

        public Criteria andAspirinIsNotNull() {
            addCriterion("aspirin is not null");
            return (Criteria) this;
        }

        public Criteria andAspirinEqualTo(String value) {
            addCriterion("aspirin =", value, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinNotEqualTo(String value) {
            addCriterion("aspirin <>", value, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinGreaterThan(String value) {
            addCriterion("aspirin >", value, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinGreaterThanOrEqualTo(String value) {
            addCriterion("aspirin >=", value, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinLessThan(String value) {
            addCriterion("aspirin <", value, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinLessThanOrEqualTo(String value) {
            addCriterion("aspirin <=", value, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinLike(String value) {
            addCriterion("aspirin like", value, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinNotLike(String value) {
            addCriterion("aspirin not like", value, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinIn(List<String> values) {
            addCriterion("aspirin in", values, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinNotIn(List<String> values) {
            addCriterion("aspirin not in", values, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinBetween(String value1, String value2) {
            addCriterion("aspirin between", value1, value2, "aspirin");
            return (Criteria) this;
        }

        public Criteria andAspirinNotBetween(String value1, String value2) {
            addCriterion("aspirin not between", value1, value2, "aspirin");
            return (Criteria) this;
        }

        public Criteria andOtherdrugIsNull() {
            addCriterion("otherdrug is null");
            return (Criteria) this;
        }

        public Criteria andOtherdrugIsNotNull() {
            addCriterion("otherdrug is not null");
            return (Criteria) this;
        }

        public Criteria andOtherdrugEqualTo(String value) {
            addCriterion("otherdrug =", value, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugNotEqualTo(String value) {
            addCriterion("otherdrug <>", value, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugGreaterThan(String value) {
            addCriterion("otherdrug >", value, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugGreaterThanOrEqualTo(String value) {
            addCriterion("otherdrug >=", value, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugLessThan(String value) {
            addCriterion("otherdrug <", value, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugLessThanOrEqualTo(String value) {
            addCriterion("otherdrug <=", value, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugLike(String value) {
            addCriterion("otherdrug like", value, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugNotLike(String value) {
            addCriterion("otherdrug not like", value, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugIn(List<String> values) {
            addCriterion("otherdrug in", values, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugNotIn(List<String> values) {
            addCriterion("otherdrug not in", values, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugBetween(String value1, String value2) {
            addCriterion("otherdrug between", value1, value2, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andOtherdrugNotBetween(String value1, String value2) {
            addCriterion("otherdrug not between", value1, value2, "otherdrug");
            return (Criteria) this;
        }

        public Criteria andAnestheticIsNull() {
            addCriterion("anesthetic is null");
            return (Criteria) this;
        }

        public Criteria andAnestheticIsNotNull() {
            addCriterion("anesthetic is not null");
            return (Criteria) this;
        }

        public Criteria andAnestheticEqualTo(String value) {
            addCriterion("anesthetic =", value, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticNotEqualTo(String value) {
            addCriterion("anesthetic <>", value, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticGreaterThan(String value) {
            addCriterion("anesthetic >", value, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticGreaterThanOrEqualTo(String value) {
            addCriterion("anesthetic >=", value, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticLessThan(String value) {
            addCriterion("anesthetic <", value, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticLessThanOrEqualTo(String value) {
            addCriterion("anesthetic <=", value, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticLike(String value) {
            addCriterion("anesthetic like", value, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticNotLike(String value) {
            addCriterion("anesthetic not like", value, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticIn(List<String> values) {
            addCriterion("anesthetic in", values, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticNotIn(List<String> values) {
            addCriterion("anesthetic not in", values, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticBetween(String value1, String value2) {
            addCriterion("anesthetic between", value1, value2, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andAnestheticNotBetween(String value1, String value2) {
            addCriterion("anesthetic not between", value1, value2, "anesthetic");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseIsNull() {
            addCriterion("otherdisease is null");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseIsNotNull() {
            addCriterion("otherdisease is not null");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseEqualTo(String value) {
            addCriterion("otherdisease =", value, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseNotEqualTo(String value) {
            addCriterion("otherdisease <>", value, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseGreaterThan(String value) {
            addCriterion("otherdisease >", value, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("otherdisease >=", value, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseLessThan(String value) {
            addCriterion("otherdisease <", value, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseLessThanOrEqualTo(String value) {
            addCriterion("otherdisease <=", value, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseLike(String value) {
            addCriterion("otherdisease like", value, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseNotLike(String value) {
            addCriterion("otherdisease not like", value, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseIn(List<String> values) {
            addCriterion("otherdisease in", values, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseNotIn(List<String> values) {
            addCriterion("otherdisease not in", values, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseBetween(String value1, String value2) {
            addCriterion("otherdisease between", value1, value2, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andOtherdiseaseNotBetween(String value1, String value2) {
            addCriterion("otherdisease not between", value1, value2, "otherdisease");
            return (Criteria) this;
        }

        public Criteria andFastingIsNull() {
            addCriterion("fasting is null");
            return (Criteria) this;
        }

        public Criteria andFastingIsNotNull() {
            addCriterion("fasting is not null");
            return (Criteria) this;
        }

        public Criteria andFastingEqualTo(String value) {
            addCriterion("fasting =", value, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingNotEqualTo(String value) {
            addCriterion("fasting <>", value, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingGreaterThan(String value) {
            addCriterion("fasting >", value, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingGreaterThanOrEqualTo(String value) {
            addCriterion("fasting >=", value, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingLessThan(String value) {
            addCriterion("fasting <", value, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingLessThanOrEqualTo(String value) {
            addCriterion("fasting <=", value, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingLike(String value) {
            addCriterion("fasting like", value, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingNotLike(String value) {
            addCriterion("fasting not like", value, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingIn(List<String> values) {
            addCriterion("fasting in", values, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingNotIn(List<String> values) {
            addCriterion("fasting not in", values, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingBetween(String value1, String value2) {
            addCriterion("fasting between", value1, value2, "fasting");
            return (Criteria) this;
        }

        public Criteria andFastingNotBetween(String value1, String value2) {
            addCriterion("fasting not between", value1, value2, "fasting");
            return (Criteria) this;
        }

        public Criteria andPregnantIsNull() {
            addCriterion("pregnant is null");
            return (Criteria) this;
        }

        public Criteria andPregnantIsNotNull() {
            addCriterion("pregnant is not null");
            return (Criteria) this;
        }

        public Criteria andPregnantEqualTo(String value) {
            addCriterion("pregnant =", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantNotEqualTo(String value) {
            addCriterion("pregnant <>", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantGreaterThan(String value) {
            addCriterion("pregnant >", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantGreaterThanOrEqualTo(String value) {
            addCriterion("pregnant >=", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantLessThan(String value) {
            addCriterion("pregnant <", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantLessThanOrEqualTo(String value) {
            addCriterion("pregnant <=", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantLike(String value) {
            addCriterion("pregnant like", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantNotLike(String value) {
            addCriterion("pregnant not like", value, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantIn(List<String> values) {
            addCriterion("pregnant in", values, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantNotIn(List<String> values) {
            addCriterion("pregnant not in", values, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantBetween(String value1, String value2) {
            addCriterion("pregnant between", value1, value2, "pregnant");
            return (Criteria) this;
        }

        public Criteria andPregnantNotBetween(String value1, String value2) {
            addCriterion("pregnant not between", value1, value2, "pregnant");
            return (Criteria) this;
        }

        public Criteria andCometimeIsNull() {
            addCriterion("cometime is null");
            return (Criteria) this;
        }

        public Criteria andCometimeIsNotNull() {
            addCriterion("cometime is not null");
            return (Criteria) this;
        }

        public Criteria andCometimeEqualTo(String value) {
            addCriterion("cometime =", value, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeNotEqualTo(String value) {
            addCriterion("cometime <>", value, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeGreaterThan(String value) {
            addCriterion("cometime >", value, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeGreaterThanOrEqualTo(String value) {
            addCriterion("cometime >=", value, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeLessThan(String value) {
            addCriterion("cometime <", value, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeLessThanOrEqualTo(String value) {
            addCriterion("cometime <=", value, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeLike(String value) {
            addCriterion("cometime like", value, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeNotLike(String value) {
            addCriterion("cometime not like", value, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeIn(List<String> values) {
            addCriterion("cometime in", values, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeNotIn(List<String> values) {
            addCriterion("cometime not in", values, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeBetween(String value1, String value2) {
            addCriterion("cometime between", value1, value2, "cometime");
            return (Criteria) this;
        }

        public Criteria andCometimeNotBetween(String value1, String value2) {
            addCriterion("cometime not between", value1, value2, "cometime");
            return (Criteria) this;
        }

        public Criteria andWorkIsNull() {
            addCriterion("work is null");
            return (Criteria) this;
        }

        public Criteria andWorkIsNotNull() {
            addCriterion("work is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEqualTo(String value) {
            addCriterion("work =", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotEqualTo(String value) {
            addCriterion("work <>", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThan(String value) {
            addCriterion("work >", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkGreaterThanOrEqualTo(String value) {
            addCriterion("work >=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThan(String value) {
            addCriterion("work <", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLessThanOrEqualTo(String value) {
            addCriterion("work <=", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkLike(String value) {
            addCriterion("work like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotLike(String value) {
            addCriterion("work not like", value, "work");
            return (Criteria) this;
        }

        public Criteria andWorkIn(List<String> values) {
            addCriterion("work in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotIn(List<String> values) {
            addCriterion("work not in", values, "work");
            return (Criteria) this;
        }

        public Criteria andWorkBetween(String value1, String value2) {
            addCriterion("work between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andWorkNotBetween(String value1, String value2) {
            addCriterion("work not between", value1, value2, "work");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Date value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Date value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Date value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Date value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Date value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Date> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Date> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Date value1, Date value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Date value1, Date value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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