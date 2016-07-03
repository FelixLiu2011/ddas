package com.ddas.sns.usergroup.domain;

import java.io.Serializable;

public class UserGroup implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.group_id
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.user_id
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.group_name
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    private String groupName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.use_property
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    private String useProperty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.cover
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    private String cover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.created_time
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    private String createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_group.updated_time
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    private String updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_group
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.group_id
     *
     * @return the value of user_group.group_id
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.group_id
     *
     * @param groupId the value for user_group.group_id
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.user_id
     *
     * @return the value of user_group.user_id
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.user_id
     *
     * @param userId the value for user_group.user_id
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.group_name
     *
     * @return the value of user_group.group_name
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.group_name
     *
     * @param groupName the value for user_group.group_name
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.use_property
     *
     * @return the value of user_group.use_property
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public String getUseProperty() {
        return useProperty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.use_property
     *
     * @param useProperty the value for user_group.use_property
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public void setUseProperty(String useProperty) {
        this.useProperty = useProperty == null ? null : useProperty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.cover
     *
     * @return the value of user_group.cover
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public String getCover() {
        return cover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.cover
     *
     * @param cover the value for user_group.cover
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.created_time
     *
     * @return the value of user_group.created_time
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.created_time
     *
     * @param createdTime the value for user_group.created_time
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime == null ? null : createdTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_group.updated_time
     *
     * @return the value of user_group.updated_time
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_group.updated_time
     *
     * @param updatedTime the value for user_group.updated_time
     *
     * @mbggenerated Sun Jul 03 12:04:54 CST 2016
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime == null ? null : updatedTime.trim();
    }
}