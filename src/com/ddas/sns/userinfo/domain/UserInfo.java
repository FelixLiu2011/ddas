package com.ddas.sns.userinfo.domain;

import java.io.Serializable;

public class UserInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_pwd
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_email
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_height
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userHeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_weight
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userWeight;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_sex
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userSex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_contury
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userContury;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_birth
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userBirth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_religion
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userReligion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_education
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userEducation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_declaration
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userDeclaration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_enroll
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userEnroll;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_marry_status
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userMarryStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_status
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String userStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.created_time
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.updated_time
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private String updatedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_pwd
     *
     * @return the value of user_info.user_pwd
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_pwd
     *
     * @param userPwd the value for user_info.user_pwd
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_email
     *
     * @return the value of user_info.user_email
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_email
     *
     * @param userEmail the value for user_info.user_email
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_height
     *
     * @return the value of user_info.user_height
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserHeight() {
        return userHeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_height
     *
     * @param userHeight the value for user_info.user_height
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserHeight(String userHeight) {
        this.userHeight = userHeight == null ? null : userHeight.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_weight
     *
     * @return the value of user_info.user_weight
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserWeight() {
        return userWeight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_weight
     *
     * @param userWeight the value for user_info.user_weight
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserWeight(String userWeight) {
        this.userWeight = userWeight == null ? null : userWeight.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_sex
     *
     * @return the value of user_info.user_sex
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_sex
     *
     * @param userSex the value for user_info.user_sex
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_contury
     *
     * @return the value of user_info.user_contury
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserContury() {
        return userContury;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_contury
     *
     * @param userContury the value for user_info.user_contury
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserContury(String userContury) {
        this.userContury = userContury == null ? null : userContury.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_birth
     *
     * @return the value of user_info.user_birth
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserBirth() {
        return userBirth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_birth
     *
     * @param userBirth the value for user_info.user_birth
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth == null ? null : userBirth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_religion
     *
     * @return the value of user_info.user_religion
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserReligion() {
        return userReligion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_religion
     *
     * @param userReligion the value for user_info.user_religion
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserReligion(String userReligion) {
        this.userReligion = userReligion == null ? null : userReligion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_education
     *
     * @return the value of user_info.user_education
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserEducation() {
        return userEducation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_education
     *
     * @param userEducation the value for user_info.user_education
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserEducation(String userEducation) {
        this.userEducation = userEducation == null ? null : userEducation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_declaration
     *
     * @return the value of user_info.user_declaration
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserDeclaration() {
        return userDeclaration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_declaration
     *
     * @param userDeclaration the value for user_info.user_declaration
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserDeclaration(String userDeclaration) {
        this.userDeclaration = userDeclaration == null ? null : userDeclaration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_enroll
     *
     * @return the value of user_info.user_enroll
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserEnroll() {
        return userEnroll;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_enroll
     *
     * @param userEnroll the value for user_info.user_enroll
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserEnroll(String userEnroll) {
        this.userEnroll = userEnroll == null ? null : userEnroll.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_marry_status
     *
     * @return the value of user_info.user_marry_status
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserMarryStatus() {
        return userMarryStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_marry_status
     *
     * @param userMarryStatus the value for user_info.user_marry_status
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserMarryStatus(String userMarryStatus) {
        this.userMarryStatus = userMarryStatus == null ? null : userMarryStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_status
     *
     * @return the value of user_info.user_status
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_status
     *
     * @param userStatus the value for user_info.user_status
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.created_time
     *
     * @return the value of user_info.created_time
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.created_time
     *
     * @param createdTime the value for user_info.created_time
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime == null ? null : createdTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.updated_time
     *
     * @return the value of user_info.updated_time
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.updated_time
     *
     * @param updatedTime the value for user_info.updated_time
     *
     * @mbggenerated Sun Jul 03 12:04:02 CST 2016
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime == null ? null : updatedTime.trim();
    }
}