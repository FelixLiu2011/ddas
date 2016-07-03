package com.ddas.sns.userblog.domain;

import java.util.ArrayList;
import java.util.List;

public class UserBlogCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    protected int limitEnd = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public UserBlogCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
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
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
     */
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

        public Criteria andUbIdIsNull() {
            addCriterion("ub_id is null");
            return (Criteria) this;
        }

        public Criteria andUbIdIsNotNull() {
            addCriterion("ub_id is not null");
            return (Criteria) this;
        }

        public Criteria andUbIdEqualTo(String value) {
            addCriterion("ub_id =", value, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdNotEqualTo(String value) {
            addCriterion("ub_id <>", value, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdGreaterThan(String value) {
            addCriterion("ub_id >", value, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdGreaterThanOrEqualTo(String value) {
            addCriterion("ub_id >=", value, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdLessThan(String value) {
            addCriterion("ub_id <", value, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdLessThanOrEqualTo(String value) {
            addCriterion("ub_id <=", value, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdLike(String value) {
            addCriterion("ub_id like", value, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdNotLike(String value) {
            addCriterion("ub_id not like", value, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdIn(List<String> values) {
            addCriterion("ub_id in", values, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdNotIn(List<String> values) {
            addCriterion("ub_id not in", values, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdBetween(String value1, String value2) {
            addCriterion("ub_id between", value1, value2, "ubId");
            return (Criteria) this;
        }

        public Criteria andUbIdNotBetween(String value1, String value2) {
            addCriterion("ub_id not between", value1, value2, "ubId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
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

        public Criteria andBlogContentIsNull() {
            addCriterion("blog_content is null");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNotNull() {
            addCriterion("blog_content is not null");
            return (Criteria) this;
        }

        public Criteria andBlogContentEqualTo(String value) {
            addCriterion("blog_content =", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotEqualTo(String value) {
            addCriterion("blog_content <>", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThan(String value) {
            addCriterion("blog_content >", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_content >=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThan(String value) {
            addCriterion("blog_content <", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThanOrEqualTo(String value) {
            addCriterion("blog_content <=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLike(String value) {
            addCriterion("blog_content like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotLike(String value) {
            addCriterion("blog_content not like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentIn(List<String> values) {
            addCriterion("blog_content in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotIn(List<String> values) {
            addCriterion("blog_content not in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentBetween(String value1, String value2) {
            addCriterion("blog_content between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotBetween(String value1, String value2) {
            addCriterion("blog_content not between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeIsNull() {
            addCriterion("blog_privilege is null");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeIsNotNull() {
            addCriterion("blog_privilege is not null");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeEqualTo(String value) {
            addCriterion("blog_privilege =", value, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeNotEqualTo(String value) {
            addCriterion("blog_privilege <>", value, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeGreaterThan(String value) {
            addCriterion("blog_privilege >", value, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeGreaterThanOrEqualTo(String value) {
            addCriterion("blog_privilege >=", value, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeLessThan(String value) {
            addCriterion("blog_privilege <", value, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeLessThanOrEqualTo(String value) {
            addCriterion("blog_privilege <=", value, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeLike(String value) {
            addCriterion("blog_privilege like", value, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeNotLike(String value) {
            addCriterion("blog_privilege not like", value, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeIn(List<String> values) {
            addCriterion("blog_privilege in", values, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeNotIn(List<String> values) {
            addCriterion("blog_privilege not in", values, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeBetween(String value1, String value2) {
            addCriterion("blog_privilege between", value1, value2, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogPrivilegeNotBetween(String value1, String value2) {
            addCriterion("blog_privilege not between", value1, value2, "blogPrivilege");
            return (Criteria) this;
        }

        public Criteria andBlogTagsIsNull() {
            addCriterion("blog_tags is null");
            return (Criteria) this;
        }

        public Criteria andBlogTagsIsNotNull() {
            addCriterion("blog_tags is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTagsEqualTo(String value) {
            addCriterion("blog_tags =", value, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsNotEqualTo(String value) {
            addCriterion("blog_tags <>", value, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsGreaterThan(String value) {
            addCriterion("blog_tags >", value, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsGreaterThanOrEqualTo(String value) {
            addCriterion("blog_tags >=", value, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsLessThan(String value) {
            addCriterion("blog_tags <", value, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsLessThanOrEqualTo(String value) {
            addCriterion("blog_tags <=", value, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsLike(String value) {
            addCriterion("blog_tags like", value, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsNotLike(String value) {
            addCriterion("blog_tags not like", value, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsIn(List<String> values) {
            addCriterion("blog_tags in", values, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsNotIn(List<String> values) {
            addCriterion("blog_tags not in", values, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsBetween(String value1, String value2) {
            addCriterion("blog_tags between", value1, value2, "blogTags");
            return (Criteria) this;
        }

        public Criteria andBlogTagsNotBetween(String value1, String value2) {
            addCriterion("blog_tags not between", value1, value2, "blogTags");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(String value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(String value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(String value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(String value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(String value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLike(String value) {
            addCriterion("created_time like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotLike(String value) {
            addCriterion("created_time not like", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<String> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<String> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(String value1, String value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(String value1, String value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(String value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(String value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(String value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(String value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(String value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(String value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLike(String value) {
            addCriterion("updated_time like", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotLike(String value) {
            addCriterion("updated_time not like", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<String> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<String> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(String value1, String value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(String value1, String value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_blog
     *
     * @mbggenerated do_not_delete_during_merge Sun Jul 03 12:22:26 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andUbIdLikeInsensitive(String value) {
            addCriterion("upper(ub_id) like", value.toUpperCase(), "ubId");
            return this;
        }

        public Criteria andUserIdLikeInsensitive(String value) {
            addCriterion("upper(user_id) like", value.toUpperCase(), "userId");
            return this;
        }

        public Criteria andGroupIdLikeInsensitive(String value) {
            addCriterion("upper(group_id) like", value.toUpperCase(), "groupId");
            return this;
        }

        public Criteria andBlogTitleLikeInsensitive(String value) {
            addCriterion("upper(blog_title) like", value.toUpperCase(), "blogTitle");
            return this;
        }

        public Criteria andBlogContentLikeInsensitive(String value) {
            addCriterion("upper(blog_content) like", value.toUpperCase(), "blogContent");
            return this;
        }

        public Criteria andBlogPrivilegeLikeInsensitive(String value) {
            addCriterion("upper(blog_privilege) like", value.toUpperCase(), "blogPrivilege");
            return this;
        }

        public Criteria andBlogTagsLikeInsensitive(String value) {
            addCriterion("upper(blog_tags) like", value.toUpperCase(), "blogTags");
            return this;
        }

        public Criteria andCreatedTimeLikeInsensitive(String value) {
            addCriterion("upper(created_time) like", value.toUpperCase(), "createdTime");
            return this;
        }

        public Criteria andUpdatedTimeLikeInsensitive(String value) {
            addCriterion("upper(updated_time) like", value.toUpperCase(), "updatedTime");
            return this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_blog
     *
     * @mbggenerated Sun Jul 03 12:22:26 CST 2016
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