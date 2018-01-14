/*
Navicat MySQL Data Transfer

Source Server         : learningsystemdatabase
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : learningsystemdatabase

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-01-14 20:50:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for class
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `C_ID` int(6) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `C_CLASSID` int(6) DEFAULT NULL COMMENT '班级标识',
  `T_TEACHER` varchar(30) DEFAULT NULL COMMENT '授课老师',
  `C_NAME` varchar(30) DEFAULT NULL COMMENT '班级名称',
  `C_COLLEGE` varchar(255) DEFAULT NULL COMMENT '所属学院',
  `C_MAJOR` varchar(30) DEFAULT NULL COMMENT '专业名称',
  `C_GRADE` varchar(30) DEFAULT NULL COMMENT '年级',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('1', '1', '1', '15软件7班', '计算机工程技术学院', '软件技术', '大三');

-- ----------------------------
-- Table structure for classwork
-- ----------------------------
DROP TABLE IF EXISTS `classwork`;
CREATE TABLE `classwork` (
  `CK_ID` int(6) NOT NULL COMMENT '表ID',
  `CK_CALSS` varchar(30) DEFAULT NULL COMMENT '班级',
  `G_IDENTIFYING` int(6) DEFAULT NULL COMMENT '分组标识',
  `CK_WEEK` int(6) DEFAULT NULL COMMENT '每周数',
  `CK_FILE` varchar(255) DEFAULT NULL COMMENT '作业上传',
  PRIMARY KEY (`CK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classwork
-- ----------------------------

-- ----------------------------
-- Table structure for grouping
-- ----------------------------
DROP TABLE IF EXISTS `grouping`;
CREATE TABLE `grouping` (
  `G_ID` int(6) NOT NULL COMMENT '表ID',
  `G_IDENTIFYING` int(6) DEFAULT NULL COMMENT '分组标识',
  `G_NAME` varchar(30) DEFAULT NULL COMMENT '学生姓名',
  `G_STUDENTID` varchar(20) DEFAULT NULL COMMENT '学生学号',
  `G_SPEAKNUM` int(6) DEFAULT NULL COMMENT '学生发言数',
  `G_DUTY` varchar(255) DEFAULT NULL COMMENT '组内职务',
  PRIMARY KEY (`G_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grouping
-- ----------------------------
INSERT INTO `grouping` VALUES ('1', '1', '超级舰队', '0104150701', null, '组长');
INSERT INTO `grouping` VALUES ('2', '1', '超级舰队', '0104150702', null, '组员');
INSERT INTO `grouping` VALUES ('3', '1', '超级舰队', '0104150717', null, '组员');
INSERT INTO `grouping` VALUES ('4', '1', '超级舰队', '0104150718', null, '组员');

-- ----------------------------
-- Table structure for lesson
-- ----------------------------
DROP TABLE IF EXISTS `lesson`;
CREATE TABLE `lesson` (
  `L_ID` int(6) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `L_NAME` varchar(35) DEFAULT NULL COMMENT '课程名称',
  `L_NUMBER` varchar(20) DEFAULT NULL COMMENT '课程编号',
  `C_CLASSID` int(6) DEFAULT NULL COMMENT '班级标识',
  `T_TEACHER` int(6) DEFAULT NULL COMMENT '老师标识',
  `STU_STUDENTID` varchar(20) DEFAULT NULL COMMENT '学生标识',
  PRIMARY KEY (`L_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lesson
-- ----------------------------
INSERT INTO `lesson` VALUES ('1', 'JAVA实战', 'ABSC253-562', '1', '1', '1');

-- ----------------------------
-- Table structure for releaseapplicationcase
-- ----------------------------
DROP TABLE IF EXISTS `releaseapplicationcase`;
CREATE TABLE `releaseapplicationcase` (
  `RAC_ID` int(6) NOT NULL COMMENT '表ID',
  `T_TEACHER` int(6) DEFAULT NULL COMMENT '老师标识',
  `RAC_CLASS` varchar(200) DEFAULT NULL COMMENT '对应班级',
  `RAC_CASEDESCRIPTION` varchar(255) DEFAULT NULL COMMENT '案列描述',
  `RAC_CASEIMG` varchar(255) DEFAULT NULL COMMENT '案列图片',
  `RAC_UPLOADACCESSORY` varchar(255) DEFAULT NULL COMMENT '附件上传',
  `RAC_CONDITION` int(6) DEFAULT NULL COMMENT '此条案例状态/完成/废弃....',
  `RAC_TIME` time(6) DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`RAC_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of releaseapplicationcase
-- ----------------------------

-- ----------------------------
-- Table structure for releasediscussionquestions
-- ----------------------------
DROP TABLE IF EXISTS `releasediscussionquestions`;
CREATE TABLE `releasediscussionquestions` (
  `RDQ_ID` int(6) NOT NULL COMMENT '表ID',
  `L_NUMBER` varchar(255) DEFAULT NULL COMMENT '课程编号',
  `G_STUDENTID` varchar(20) DEFAULT NULL COMMENT '学生学号',
  `T_TEACHER` int(6) DEFAULT NULL COMMENT '老师标识',
  `TAG_ID` int(6) DEFAULT NULL COMMENT '标签ID',
  `RDQ_THEME` varchar(255) DEFAULT NULL COMMENT '讨论主题',
  `RDQ_CLASS` varchar(255) DEFAULT NULL COMMENT '对应班级',
  `RDQ_TEXT` varchar(255) DEFAULT NULL COMMENT '讨论内容',
  `RDQ_TIME` varchar(255) DEFAULT NULL COMMENT '发布时间',
  `RDQ_UPLOADFILE` varchar(255) DEFAULT NULL COMMENT '文件上传',
  `WB_CONTENT_NUM` int(6) DEFAULT NULL COMMENT '回复次数',
  PRIMARY KEY (`RDQ_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of releasediscussionquestions
-- ----------------------------
INSERT INTO `releasediscussionquestions` VALUES ('1', 'ABSC253-562', '0104150701', null, '1', '探讨机器学习', '15软件7班', '机器学习需要掌握哪些技术，对数据算法要求一定很高吧', '2017-01-04', null, null);
INSERT INTO `releasediscussionquestions` VALUES ('2', 'ABSC253-562', '0104150701', null, '1', 'JAVA进阶应该学习啥？', '15软件7班', '深入研究数据结构以及框架源码', '2017-01-05', null, null);

-- ----------------------------
-- Table structure for releaseexercise
-- ----------------------------
DROP TABLE IF EXISTS `releaseexercise`;
CREATE TABLE `releaseexercise` (
  `RE_ID` int(6) NOT NULL COMMENT '表ID',
  `RE_TITLE` varchar(20) DEFAULT NULL COMMENT '习题标题',
  `T_TEACHER` int(6) DEFAULT NULL COMMENT '老师标识',
  `RE_CLASS` varchar(30) DEFAULT NULL COMMENT '对应班级',
  `RE_TEXT` varchar(255) DEFAULT NULL COMMENT '习题内容',
  `RE_FILE` varchar(255) DEFAULT NULL COMMENT '习题文件',
  PRIMARY KEY (`RE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of releaseexercise
-- ----------------------------

-- ----------------------------
-- Table structure for releaselearningcontent
-- ----------------------------
DROP TABLE IF EXISTS `releaselearningcontent`;
CREATE TABLE `releaselearningcontent` (
  `RLC_ID` int(6) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `RLC_CLASS` varchar(200) DEFAULT NULL COMMENT '对应班级',
  `RLC_LEARNINGGOALS` varchar(200) DEFAULT NULL COMMENT '学习目的',
  `RLC_LEARNINGREQUIRE` varchar(255) DEFAULT NULL COMMENT '学习要求',
  `RLC_UPLOADACCESSORY` varchar(255) DEFAULT NULL COMMENT '附件上传',
  `RLC_CONDITION` int(6) DEFAULT NULL COMMENT '此条记录状态/完成/废弃....',
  `RLC_TIME` time(6) DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`RLC_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of releaselearningcontent
-- ----------------------------

-- ----------------------------
-- Table structure for rleaseonlinetesting
-- ----------------------------
DROP TABLE IF EXISTS `rleaseonlinetesting`;
CREATE TABLE `rleaseonlinetesting` (
  `ROT_ID` int(6) NOT NULL COMMENT '表ID',
  `ROT_IDENTIFYING` int(6) DEFAULT NULL COMMENT '习题在线测试标识',
  `T_TEACHER` int(6) DEFAULT NULL COMMENT '老师标识',
  `ROT_CLASS` varchar(30) DEFAULT NULL COMMENT '对应班级',
  `ROT_CHOICEQUESTION` varchar(255) DEFAULT NULL COMMENT '选择题',
  `CHOICEQUESTION_RESULT` varchar(255) DEFAULT NULL COMMENT '选择题答案',
  `ROT_COMPLETION` varchar(255) DEFAULT NULL COMMENT '填空题',
  `COMPLETION_RESULT` varchar(255) DEFAULT NULL COMMENT '填空题答案',
  `ROT_TEXTTOPIC` varchar(255) DEFAULT NULL COMMENT '文字题',
  `TEXTTOPIC_RESULT` varchar(255) DEFAULT NULL COMMENT '文字题答案',
  `ROT_TRUEORFALSE` varchar(255) DEFAULT NULL COMMENT '判断题',
  `TRUEORFALSE_RESULT` int(2) DEFAULT NULL COMMENT '判断题答案',
  `STU_STUDENTID` varchar(20) DEFAULT NULL COMMENT '学生学号',
  PRIMARY KEY (`ROT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rleaseonlinetesting
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `STU_ID` int(6) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `TG_OPENID` varchar(255) DEFAULT NULL COMMENT '微信登录绑定ID',
  `C_CLASSID` int(6) DEFAULT NULL COMMENT '班级标识',
  `TG_IDENTIFYING` int(6) DEFAULT NULL COMMENT '成绩表绑定学生',
  `STU_STUDENTID` varchar(20) DEFAULT NULL COMMENT '学生学号',
  `STU_PASSWORD` varchar(255) DEFAULT NULL COMMENT '学生密码（以防万一要用）',
  `STU_NAME` varchar(20) DEFAULT NULL COMMENT '学生姓名',
  `STU_GENDER` varchar(10) DEFAULT NULL COMMENT '学生性别',
  `G_IDENTIFYING` int(6) DEFAULT NULL COMMENT '分组标识',
  `STU_EMAIL` varchar(255) DEFAULT NULL COMMENT '学生邮箱',
  `STU_PHONER` char(11) DEFAULT NULL COMMENT '学生手机',
  `STU_QQ` varchar(13) DEFAULT NULL COMMENT '学生QQ',
  `STU_WECHAT` varchar(35) DEFAULT NULL COMMENT '学生微信',
  PRIMARY KEY (`STU_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1', '1', '1', '0104150701', '123456', '杨广', '男', '1', '627756022@qq.com', '1319220725', '627756022', 'y_627756022');
INSERT INTO `student` VALUES ('2', null, '1', '1', '0104150702', null, '刘梓彦', null, '1', null, null, null, null);
INSERT INTO `student` VALUES ('3', null, '1', '1', '0104150717', null, '胡剑锋', null, '1', null, null, null, null);
INSERT INTO `student` VALUES ('4', null, '1', '1', '0104150718', null, '余枫', null, '1', null, null, null, null);

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `TAG_ID` int(6) NOT NULL COMMENT '标签ID',
  `TAG_CONTEN` varchar(30) DEFAULT NULL COMMENT '标签内容',
  PRIMARY KEY (`TAG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tag
-- ----------------------------
INSERT INTO `tag` VALUES ('1', 'Java');
INSERT INTO `tag` VALUES ('2', 'JavaScript');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `T_ID` int(6) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `T_NAME` varchar(35) DEFAULT NULL COMMENT '老师姓名',
  `T_TEACHER` int(6) DEFAULT NULL COMMENT '老师标识',
  `C_CLASS` varchar(255) DEFAULT NULL COMMENT '班级标识',
  `T_GRNDER` varchar(2) DEFAULT NULL COMMENT '老师性别',
  `T_PHONE` char(11) DEFAULT NULL COMMENT '老师电话',
  `T_QQ` int(11) DEFAULT NULL COMMENT '老师QQ',
  `T_WECHAT` varchar(35) DEFAULT NULL COMMENT '老师微信',
  PRIMARY KEY (`T_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '张爱清', '1', '15软件7班', null, null, null, null);

-- ----------------------------
-- Table structure for testgrade
-- ----------------------------
DROP TABLE IF EXISTS `testgrade`;
CREATE TABLE `testgrade` (
  `TG_ID` int(6) NOT NULL COMMENT '表ID',
  `TG_IDENTIFYING` int(6) DEFAULT NULL COMMENT '单元标识',
  `TG_GRADE` int(6) DEFAULT NULL COMMENT '测试成绩',
  PRIMARY KEY (`TG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of testgrade
-- ----------------------------

-- ----------------------------
-- Table structure for writeback
-- ----------------------------
DROP TABLE IF EXISTS `writeback`;
CREATE TABLE `writeback` (
  `WB_ID` int(6) NOT NULL AUTO_INCREMENT COMMENT '表ID',
  `RDQ_ID` int(11) DEFAULT NULL COMMENT '问题讨论表ID',
  `WB_CONTENT` varchar(255) DEFAULT NULL COMMENT '回复内容',
  `WB_UPLOADFILE` varchar(255) DEFAULT NULL COMMENT '回复文件',
  `STU_STUDENTID` varchar(20) DEFAULT NULL COMMENT '学生学号',
  `WB_CONTENT_NUM` int(6) DEFAULT NULL COMMENT '统计回复数',
  `WB_TIME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`WB_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of writeback
-- ----------------------------
INSERT INTO `writeback` VALUES ('1', '1', '个人认为学好数据结构也很重要', null, '0104150701', '6', '2018-01-02');
INSERT INTO `writeback` VALUES ('2', '1', '赞同楼上说法', null, '0104150702', '6', '2018-01-02');
INSERT INTO `writeback` VALUES ('4', '2', '赞同楼上说法', null, '0104150702', '2', '2018-01-01');
INSERT INTO `writeback` VALUES ('5', '3', '顶帖支持一下楼主', null, '0104150701', '1', '2018-01-02');
INSERT INTO `writeback` VALUES ('6', '1', '大家都很厉害的样子', null, '0104150701', '6', '2018-01-03');
INSERT INTO `writeback` VALUES ('7', '1', '想知道怎么自学才比较有效率', null, '0104150702', '6', '2018-01-04');
INSERT INTO `writeback` VALUES ('8', '2', '赞同楼上说法', null, '0104150702', '2', '2018-01-02');
INSERT INTO `writeback` VALUES ('9', '1', '你很棒', null, '0104150701', '6', '2018-01-10');
INSERT INTO `writeback` VALUES ('12', '1', '上次这个楼主发的内容我也觉得很有趣，附上截图一张', 'upload\\image\\20180114\\1515931121125_349.jpg', '0104150701', '6', '2018-01-14');
