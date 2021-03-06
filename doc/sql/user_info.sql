DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` varchar(32) NOT NULL COMMENT '用户id--主键',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `user_pwd` varchar(50) DEFAULT NULL COMMENT '用户密码',
  `user_email` varchar(50) DEFAULT NULL COMMENT '用户邮箱',
  `user_height` varchar(50) DEFAULT NULL COMMENT '用户身高',
  `user_weight` varchar(50) DEFAULT NULL COMMENT '用户体重',
  `user_sex` varchar(10) DEFAULT NULL COMMENT '用户性别(只存储数据字典值)',
  `user_contury` varchar(50) DEFAULT NULL COMMENT '所属国家',
  `user_birth` varchar(50) DEFAULT NULL COMMENT '出生日期',
  `user_religion` varchar(50) DEFAULT NULL COMMENT '宗教信仰',
  `user_education` varchar(50) DEFAULT NULL COMMENT '教育',
  `user_declaration` varchar(50) DEFAULT NULL COMMENT '交友誓言',
  `user_enroll` varchar(50) DEFAULT NULL COMMENT '年收入(只存储数据字典值)',
  `user_marry_status` varchar(50) DEFAULT NULL COMMENT '婚姻状态(只存储数据字典值)',
  `user_status` varchar(50) DEFAULT NULL COMMENT '用户状态(可以对用户进行相应的限制)',
  `created_time` varchar(16) DEFAULT NULL COMMENT '创建时间',
  `updated_time` varchar(16) DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

-- ----------------------------
-- Records of user_info
-- ----------------------------
