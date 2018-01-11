package tk.mybatis.springboot.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DAppointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DAppointmentExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
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

        public Criteria andApptimeIsNull() {
            addCriterion("apptime is null");
            return (Criteria) this;
        }

        public Criteria andApptimeIsNotNull() {
            addCriterion("apptime is not null");
            return (Criteria) this;
        }

        public Criteria andApptimeEqualTo(String value) {
            addCriterion("apptime =", value, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeNotEqualTo(String value) {
            addCriterion("apptime <>", value, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeGreaterThan(String value) {
            addCriterion("apptime >", value, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeGreaterThanOrEqualTo(String value) {
            addCriterion("apptime >=", value, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeLessThan(String value) {
            addCriterion("apptime <", value, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeLessThanOrEqualTo(String value) {
            addCriterion("apptime <=", value, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeLike(String value) {
            addCriterion("apptime like", value, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeNotLike(String value) {
            addCriterion("apptime not like", value, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeIn(List<String> values) {
            addCriterion("apptime in", values, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeNotIn(List<String> values) {
            addCriterion("apptime not in", values, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeBetween(String value1, String value2) {
            addCriterion("apptime between", value1, value2, "apptime");
            return (Criteria) this;
        }

        public Criteria andApptimeNotBetween(String value1, String value2) {
            addCriterion("apptime not between", value1, value2, "apptime");
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

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andBacktypeIsNull() {
            addCriterion("backtype is null");
            return (Criteria) this;
        }

        public Criteria andBacktypeIsNotNull() {
            addCriterion("backtype is not null");
            return (Criteria) this;
        }

        public Criteria andBacktypeEqualTo(Integer value) {
            addCriterion("backtype =", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeNotEqualTo(Integer value) {
            addCriterion("backtype <>", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeGreaterThan(Integer value) {
            addCriterion("backtype >", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("backtype >=", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeLessThan(Integer value) {
            addCriterion("backtype <", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeLessThanOrEqualTo(Integer value) {
            addCriterion("backtype <=", value, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeIn(List<Integer> values) {
            addCriterion("backtype in", values, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeNotIn(List<Integer> values) {
            addCriterion("backtype not in", values, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeBetween(Integer value1, Integer value2) {
            addCriterion("backtype between", value1, value2, "backtype");
            return (Criteria) this;
        }

        public Criteria andBacktypeNotBetween(Integer value1, Integer value2) {
            addCriterion("backtype not between", value1, value2, "backtype");
            return (Criteria) this;
        }

        public Criteria andBackcommentIsNull() {
            addCriterion("backcomment is null");
            return (Criteria) this;
        }

        public Criteria andBackcommentIsNotNull() {
            addCriterion("backcomment is not null");
            return (Criteria) this;
        }

        public Criteria andBackcommentEqualTo(String value) {
            addCriterion("backcomment =", value, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentNotEqualTo(String value) {
            addCriterion("backcomment <>", value, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentGreaterThan(String value) {
            addCriterion("backcomment >", value, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentGreaterThanOrEqualTo(String value) {
            addCriterion("backcomment >=", value, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentLessThan(String value) {
            addCriterion("backcomment <", value, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentLessThanOrEqualTo(String value) {
            addCriterion("backcomment <=", value, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentLike(String value) {
            addCriterion("backcomment like", value, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentNotLike(String value) {
            addCriterion("backcomment not like", value, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentIn(List<String> values) {
            addCriterion("backcomment in", values, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentNotIn(List<String> values) {
            addCriterion("backcomment not in", values, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentBetween(String value1, String value2) {
            addCriterion("backcomment between", value1, value2, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackcommentNotBetween(String value1, String value2) {
            addCriterion("backcomment not between", value1, value2, "backcomment");
            return (Criteria) this;
        }

        public Criteria andBackresultIsNull() {
            addCriterion("backresult is null");
            return (Criteria) this;
        }

        public Criteria andBackresultIsNotNull() {
            addCriterion("backresult is not null");
            return (Criteria) this;
        }

        public Criteria andBackresultEqualTo(String value) {
            addCriterion("backresult =", value, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultNotEqualTo(String value) {
            addCriterion("backresult <>", value, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultGreaterThan(String value) {
            addCriterion("backresult >", value, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultGreaterThanOrEqualTo(String value) {
            addCriterion("backresult >=", value, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultLessThan(String value) {
            addCriterion("backresult <", value, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultLessThanOrEqualTo(String value) {
            addCriterion("backresult <=", value, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultLike(String value) {
            addCriterion("backresult like", value, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultNotLike(String value) {
            addCriterion("backresult not like", value, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultIn(List<String> values) {
            addCriterion("backresult in", values, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultNotIn(List<String> values) {
            addCriterion("backresult not in", values, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultBetween(String value1, String value2) {
            addCriterion("backresult between", value1, value2, "backresult");
            return (Criteria) this;
        }

        public Criteria andBackresultNotBetween(String value1, String value2) {
            addCriterion("backresult not between", value1, value2, "backresult");
            return (Criteria) this;
        }

        public Criteria andBacktimeIsNull() {
            addCriterion("backtime is null");
            return (Criteria) this;
        }

        public Criteria andBacktimeIsNotNull() {
            addCriterion("backtime is not null");
            return (Criteria) this;
        }

        public Criteria andBacktimeEqualTo(String value) {
            addCriterion("backtime =", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotEqualTo(String value) {
            addCriterion("backtime <>", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThan(String value) {
            addCriterion("backtime >", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeGreaterThanOrEqualTo(String value) {
            addCriterion("backtime >=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThan(String value) {
            addCriterion("backtime <", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLessThanOrEqualTo(String value) {
            addCriterion("backtime <=", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeLike(String value) {
            addCriterion("backtime like", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotLike(String value) {
            addCriterion("backtime not like", value, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeIn(List<String> values) {
            addCriterion("backtime in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotIn(List<String> values) {
            addCriterion("backtime not in", values, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeBetween(String value1, String value2) {
            addCriterion("backtime between", value1, value2, "backtime");
            return (Criteria) this;
        }

        public Criteria andBacktimeNotBetween(String value1, String value2) {
            addCriterion("backtime not between", value1, value2, "backtime");
            return (Criteria) this;
        }

        public Criteria andUpstatusIsNull() {
            addCriterion("upstatus is null");
            return (Criteria) this;
        }

        public Criteria andUpstatusIsNotNull() {
            addCriterion("upstatus is not null");
            return (Criteria) this;
        }

        public Criteria andUpstatusEqualTo(Integer value) {
            addCriterion("upstatus =", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusNotEqualTo(Integer value) {
            addCriterion("upstatus <>", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusGreaterThan(Integer value) {
            addCriterion("upstatus >", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("upstatus >=", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusLessThan(Integer value) {
            addCriterion("upstatus <", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusLessThanOrEqualTo(Integer value) {
            addCriterion("upstatus <=", value, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusIn(List<Integer> values) {
            addCriterion("upstatus in", values, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusNotIn(List<Integer> values) {
            addCriterion("upstatus not in", values, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusBetween(Integer value1, Integer value2) {
            addCriterion("upstatus between", value1, value2, "upstatus");
            return (Criteria) this;
        }

        public Criteria andUpstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("upstatus not between", value1, value2, "upstatus");
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

        public Criteria andGetmoneyIsNull() {
            addCriterion("getmoney is null");
            return (Criteria) this;
        }

        public Criteria andGetmoneyIsNotNull() {
            addCriterion("getmoney is not null");
            return (Criteria) this;
        }

        public Criteria andGetmoneyEqualTo(BigDecimal value) {
            addCriterion("getmoney =", value, "getmoney");
            return (Criteria) this;
        }

        public Criteria andGetmoneyNotEqualTo(BigDecimal value) {
            addCriterion("getmoney <>", value, "getmoney");
            return (Criteria) this;
        }

        public Criteria andGetmoneyGreaterThan(BigDecimal value) {
            addCriterion("getmoney >", value, "getmoney");
            return (Criteria) this;
        }

        public Criteria andGetmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("getmoney >=", value, "getmoney");
            return (Criteria) this;
        }

        public Criteria andGetmoneyLessThan(BigDecimal value) {
            addCriterion("getmoney <", value, "getmoney");
            return (Criteria) this;
        }

        public Criteria andGetmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("getmoney <=", value, "getmoney");
            return (Criteria) this;
        }

        public Criteria andGetmoneyIn(List<BigDecimal> values) {
            addCriterion("getmoney in", values, "getmoney");
            return (Criteria) this;
        }

        public Criteria andGetmoneyNotIn(List<BigDecimal> values) {
            addCriterion("getmoney not in", values, "getmoney");
            return (Criteria) this;
        }

        public Criteria andGetmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("getmoney between", value1, value2, "getmoney");
            return (Criteria) this;
        }

        public Criteria andGetmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("getmoney not between", value1, value2, "getmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyIsNull() {
            addCriterion("putmoney is null");
            return (Criteria) this;
        }

        public Criteria andPutmoneyIsNotNull() {
            addCriterion("putmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPutmoneyEqualTo(BigDecimal value) {
            addCriterion("putmoney =", value, "putmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyNotEqualTo(BigDecimal value) {
            addCriterion("putmoney <>", value, "putmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyGreaterThan(BigDecimal value) {
            addCriterion("putmoney >", value, "putmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("putmoney >=", value, "putmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyLessThan(BigDecimal value) {
            addCriterion("putmoney <", value, "putmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("putmoney <=", value, "putmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyIn(List<BigDecimal> values) {
            addCriterion("putmoney in", values, "putmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyNotIn(List<BigDecimal> values) {
            addCriterion("putmoney not in", values, "putmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("putmoney between", value1, value2, "putmoney");
            return (Criteria) this;
        }

        public Criteria andPutmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("putmoney not between", value1, value2, "putmoney");
            return (Criteria) this;
        }

        public Criteria andGettimeIsNull() {
            addCriterion("gettime is null");
            return (Criteria) this;
        }

        public Criteria andGettimeIsNotNull() {
            addCriterion("gettime is not null");
            return (Criteria) this;
        }

        public Criteria andGettimeEqualTo(String value) {
            addCriterion("gettime =", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotEqualTo(String value) {
            addCriterion("gettime <>", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeGreaterThan(String value) {
            addCriterion("gettime >", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeGreaterThanOrEqualTo(String value) {
            addCriterion("gettime >=", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeLessThan(String value) {
            addCriterion("gettime <", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeLessThanOrEqualTo(String value) {
            addCriterion("gettime <=", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeLike(String value) {
            addCriterion("gettime like", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotLike(String value) {
            addCriterion("gettime not like", value, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeIn(List<String> values) {
            addCriterion("gettime in", values, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotIn(List<String> values) {
            addCriterion("gettime not in", values, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeBetween(String value1, String value2) {
            addCriterion("gettime between", value1, value2, "gettime");
            return (Criteria) this;
        }

        public Criteria andGettimeNotBetween(String value1, String value2) {
            addCriterion("gettime not between", value1, value2, "gettime");
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

        public Criteria andUptimeEqualTo(String value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(String value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(String value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(String value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(String value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLike(String value) {
            addCriterion("uptime like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotLike(String value) {
            addCriterion("uptime not like", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<String> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<String> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(String value1, String value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(String value1, String value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
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