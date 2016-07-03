package com.ddas.sns.userphoto.mapper;

import com.ddas.sns.userphoto.domain.UserPhoto;
import com.ddas.sns.userphoto.domain.UserPhotoCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPhotoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbggenerated Sun Jul 03 12:15:21 CST 2016
     */
    int countByExample(UserPhotoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbggenerated Sun Jul 03 12:15:21 CST 2016
     */
    int deleteByExample(UserPhotoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbggenerated Sun Jul 03 12:15:21 CST 2016
     */
    int insert(UserPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbggenerated Sun Jul 03 12:15:21 CST 2016
     */
    int insertSelective(UserPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbggenerated Sun Jul 03 12:15:21 CST 2016
     */
    List<UserPhoto> selectByExample(UserPhotoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbggenerated Sun Jul 03 12:15:21 CST 2016
     */
    int updateByExampleSelective(@Param("record") UserPhoto record, @Param("example") UserPhotoCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbggenerated Sun Jul 03 12:15:21 CST 2016
     */
    int updateByExample(@Param("record") UserPhoto record, @Param("example") UserPhotoCriteria example);
}