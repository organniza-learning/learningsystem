/*
 Navicat Premium Data Transfer

 Source Server         : ygblog
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : learningsystemdatabase

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 15/03/2018 21:59:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
BEGIN;
INSERT INTO `class` VALUES (1, 1, '1', '15软件7班', '计算机工程技术学院', '软件技术', '大三');
COMMIT;

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
BEGIN;
INSERT INTO `grouping` VALUES (1, 1, '超级舰队', '0104150701', NULL, '组长');
INSERT INTO `grouping` VALUES (2, 1, '超级舰队', '0104150702', NULL, '组员');
INSERT INTO `grouping` VALUES (3, 1, '超级舰队', '0104150717', NULL, '组员');
INSERT INTO `grouping` VALUES (4, 1, '超级舰队', '0104150718', NULL, '组员');
COMMIT;

-- ----------------------------
-- Table structure for issues
-- ----------------------------
DROP TABLE IF EXISTS `issues`;
CREATE TABLE `issues` (
  `is_id` int(100) NOT NULL AUTO_INCREMENT COMMENT '反馈单号',
  `tg_openid` varchar(1000) DEFAULT NULL COMMENT '用户标识',
  `state` varchar(1000) DEFAULT NULL COMMENT '处理状态',
  `body` varchar(1000) DEFAULT NULL COMMENT '反馈内容',
  `title` varchar(1000) DEFAULT NULL COMMENT '反馈标题',
  `avatar_url` varchar(1000) DEFAULT NULL COMMENT '回复者头像',
  `replyer` varchar(1000) DEFAULT NULL COMMENT '回复者名称',
  `endtime` varchar(1000) DEFAULT NULL COMMENT '反馈处理时间',
  `starttime` varchar(1000) DEFAULT NULL COMMENT '反馈建立时间',
  `replybody` varchar(1000) DEFAULT NULL COMMENT '回复内容',
  `img_url` varchar(1000) DEFAULT NULL COMMENT '反馈图片集',
  `label` varchar(1000) DEFAULT NULL COMMENT '反馈标签',
  `details` varchar(1000) DEFAULT NULL COMMENT '反馈详情',
  PRIMARY KEY (`is_id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of issues
-- ----------------------------
BEGIN;
INSERT INTO `issues` VALUES (5, 'a', 'closed', '反馈3', '反馈3', '11', '11', NULL, '2018-01-24 23:05:36', '已经处理，请等待下次更新', 'http://ouayrx93b.bkt.clouddn.com/null 2018-01-24zgth0, http://ouayrx93b.bkt.clouddn.com/null 2018-01-24zgth1', NULL, '用户名：陌路（余枫-0104150718）\n手机型号：iPhone 6\n操作系统：iOS 10.0.1（devtools - 375x667）\n微信版本号：6.5.6\n小程序版本号：v0.1.0\n基础库版本：1.5.2\n网络类型：wifi');
INSERT INTO `issues` VALUES (6, 'a', 'open', '反馈3', '反馈3', NULL, NULL, NULL, '2018-01-24 23:15:50', NULL, 'http://ouayrx93b.bkt.clouddn.com/null 2018-01-24zgth0, http://ouayrx93b.bkt.clouddn.com/null 2018-01-24zgth1', NULL, '用户名：陌路（余枫-0104150718）\n手机型号：iPhone 6\n操作系统：iOS 10.0.1（devtools - 375x667）\n微信版本号：6.5.6\n小程序版本号：v0.1.0\n基础库版本：1.5.2\n网络类型：wifi');
INSERT INTO `issues` VALUES (7, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '123', NULL, NULL, NULL, '2018-01-30 21:37:52', NULL, '', NULL, '');
INSERT INTO `issues` VALUES (8, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '123', NULL, NULL, NULL, '2018-01-30 21:38:43', NULL, '', NULL, '');
INSERT INTO `issues` VALUES (9, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '', '', NULL, NULL, NULL, '2018-01-30 22:41:28', NULL, '', NULL, '');
INSERT INTO `issues` VALUES (10, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '', '', NULL, NULL, NULL, '2018-01-30 22:41:45', NULL, '', NULL, '');
INSERT INTO `issues` VALUES (11, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '', '', NULL, NULL, NULL, '2018-01-30 22:42:21', NULL, '', NULL, '');
INSERT INTO `issues` VALUES (12, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '', '', NULL, NULL, NULL, '2018-01-30 22:43:38', NULL, '', NULL, '');
INSERT INTO `issues` VALUES (13, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '123', NULL, NULL, NULL, '2018-02-01 20:43:03', NULL, '', NULL, '');
INSERT INTO `issues` VALUES (14, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '123', NULL, NULL, NULL, '2018-02-27 20:38:48', NULL, '', NULL, '');
INSERT INTO `issues` VALUES (15, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '123', NULL, NULL, NULL, '2018-03-04 18:02:35', NULL, 'http://p328nzenm.bkt.clouddn.com/FsE5PmZ9ZKddTkDoeJdyCM8o11u6', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (16, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '123', NULL, NULL, NULL, '2018-03-04 18:04:01', NULL, 'http://p328nzenm.bkt.clouddn.com/FsE5PmZ9ZKddTkDoeJdyCM8o11u6', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (17, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '123', NULL, NULL, NULL, '2018-03-04 18:04:42', NULL, 'http://p328nzenm.bkt.clouddn.com/FsE5PmZ9ZKddTkDoeJdyCM8o11u6', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (18, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '123', NULL, NULL, NULL, '2018-03-04 18:05:38', NULL, 'http://p328nzenm.bkt.clouddn.com/FsE5PmZ9ZKddTkDoeJdyCM8o11u6', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (19, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '54', '2424', NULL, NULL, NULL, '2018-03-04 18:06:12', NULL, 'http://p328nzenm.bkt.clouddn.com/Fm76XP5gGPCq6LZWvBmyB1xHmh67', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (20, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '测试一下', '反馈测试', NULL, NULL, NULL, '2018-03-11 17:30:29', NULL, 'http://p328nzenm.bkt.clouddn.com/FsE5PmZ9ZKddTkDoeJdyCM8o11u6', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (21, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '提交测试1', '测试', NULL, NULL, NULL, '2018-03-11 17:34:12', NULL, 'http://p328nzenm.bkt.clouddn.com/FgqwVAGfCtAW1_1dW6qqeIiie-mi', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (22, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '测试测试', '来测试', NULL, NULL, NULL, '2018-03-11 17:35:05', NULL, 'http://p328nzenm.bkt.clouddn.com/FsE5PmZ9ZKddTkDoeJdyCM8o11u6', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (23, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123的', '阿斯蒂芬', NULL, NULL, NULL, '2018-03-11 17:35:52', NULL, 'http://p328nzenm.bkt.clouddn.com/FsE5PmZ9ZKddTkDoeJdyCM8o11u6', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (24, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', 'sdf123123', '123', NULL, NULL, NULL, '2018-03-11 17:37:43', NULL, 'http://p328nzenm.bkt.clouddn.com/FsE5PmZ9ZKddTkDoeJdyCM8o11u6', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (25, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', 'gfdfs', '123', NULL, NULL, NULL, '2018-03-11 17:38:02', NULL, '', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (26, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '3', NULL, NULL, NULL, '2018-03-11 17:38:55', NULL, '', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (27, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '123', NULL, NULL, NULL, '2018-03-11 17:39:44', NULL, '', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (28, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '对对对', '啊啊啊', NULL, NULL, NULL, '2018-03-11 17:44:22', NULL, '', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：STF-AL10（android - 360x568）\r\n微信版本号：6.6.5\r\n小程序版本号：v0.0.1\r\n基础库版本：1.9.91\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (29, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '啊啊', '反馈test', NULL, NULL, NULL, '2018-03-11 17:46:08', NULL, '', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：STF-AL10（android - 360x568）\r\n微信版本号：6.6.5\r\n小程序版本号：v0.0.1\r\n基础库版本：1.9.91\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (30, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '我', '的', NULL, NULL, NULL, '2018-03-11 17:49:47', NULL, '', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：STF-AL10（android - 360x568）\r\n微信版本号：6.6.5\r\n小程序版本号：v0.0.1\r\n基础库版本：1.9.91\r\n网络类型：wifi');
INSERT INTO `issues` VALUES (31, 'oJkz50D-wTOvgqcInR9l13TEVctE', 'open', '123', '阿斯蒂芬', NULL, NULL, NULL, '2018-03-11 17:53:30', NULL, '', NULL, '---\r\n**用户信息**\r\n用户名：。。。（-杨广-0104150701）\r\n手机型号：iPhone 5（devtools - 320x504）\r\n微信版本号：6.6.3\r\n小程序版本号：v0.0.1\r\n基础库版本：1.7.1\r\n网络类型：wifi');
COMMIT;

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of lesson
-- ----------------------------
BEGIN;
INSERT INTO `lesson` VALUES (1, 'JAVA实战', 'ABSC253-562', 1, 1, '1');
INSERT INTO `lesson` VALUES (2, 'PHP实战', 'ABSC253-563', 1, 1, NULL);
INSERT INTO `lesson` VALUES (3, 'JavaScript', 'ABSC253-564', 1, 1, NULL);
INSERT INTO `lesson` VALUES (4, 'Photoshop', 'ABSC253-565', 1, 1, NULL);
COMMIT;

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
BEGIN;
INSERT INTO `releasediscussionquestions` VALUES (1, 'ABSC253-562', '0104150701', NULL, 1, '探讨机器学习', '15软件7班', '机器学习需要掌握哪些技术，对数据算法要求一定很高吧', '2017-01-04', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (2, 'ABSC253-562', '0104150701', NULL, 1, 'JAVA进阶应该学习啥？', '15软件7班', '深入研究数据结构以及框架源码', '2017-01-05', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (3, 'ABSC253-563', '0104150701', NULL, 1, 'PHP大法好', '15软件7班', '大家认为那种语言就好，我觉得是PHP', '2018-03-12', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (4, 'ABSC253-564', '0104150701', NULL, 1, '听说编程回来过？', '15软件7班', '我爱编程，编程爱我', '2018-03-11', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (5, 'ABSC253-563', '0104150702', NULL, 1, '谁有PHP的学习视频', '15软件7班', '共同来进步共同发财', '2018-03-10', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (6, 'ABSC253-563', '0104150702', NULL, 1, '谁有PHP的学习视频', '15软件7班', '共同来进步共同发财', '2018-03-10', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (7, 'ABSC253-563', '0104150702', NULL, 1, '谁有PHP的学习视频', '15软件7班', '共同来进步共同发财', '2018-03-10', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (8, 'ABSC253-563', '0104150702', NULL, 1, '听说编程回来过？', '15软件7班', '我爱编程，编程爱我', '2018-03-10', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (9, 'ABSC253-563', '0104150702', NULL, 1, 'JAVA进阶应该学习啥？', '15软件7班', '共同来进步共同发财', '2018-03-10', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (10, 'ABSC253-564', '0104150702', NULL, 1, 'JAVA进阶应该学习啥？', '15软件7班', '共同来进步共同发财', '2018-03-10', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (11, 'ABSC253-562', '0104150702', NULL, 1, 'JAVA进阶应该学习啥？', '15软件7班', '共同来进步共同发财', '2018-03-10', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (12, 'ABSC253-562', '0104150702', NULL, 1, 'JAVA进阶应该学习啥？', '15软件7班', '共同来进步共同发财', '2018-03-11', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (13, 'ABSC253-562', '0104150702', NULL, 1, '听说编程回来过？', '15软件7班', '我爱编程，编程爱我', '2018-03-11', NULL, NULL);
INSERT INTO `releasediscussionquestions` VALUES (14, 'ABSC253-564', '0104150702', NULL, 1, '探讨机器学习', '15软件7班', '深入研究数据结构以及框架源码', '2018-03-12', NULL, NULL);
COMMIT;

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
BEGIN;
INSERT INTO `student` VALUES (1, 'oJkz50BT-KSw69awi9iIDJQ0w7Kc', 1, 1, '0104150701', '123456', '杨广', '男', 1, '3213', '124', '44', 'dj222');
INSERT INTO `student` VALUES (2, 'a', 1, 1, '0104150702', '123456', '刘梓彦', NULL, 1, '123131', '1231', '1231', '123');
INSERT INTO `student` VALUES (3, NULL, 1, 1, '0104150717', NULL, '胡剑锋', NULL, 1, NULL, NULL, NULL, NULL);
INSERT INTO `student` VALUES (4, NULL, 1, 1, '0104150718', NULL, '余枫', NULL, 1, NULL, NULL, NULL, NULL);
COMMIT;

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
BEGIN;
INSERT INTO `tag` VALUES (1, 'Java');
INSERT INTO `tag` VALUES (2, 'JavaScript');
COMMIT;

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
BEGIN;
INSERT INTO `teacher` VALUES (1, '张爱清', 1, '15软件7班', NULL, NULL, NULL, NULL);
COMMIT;

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
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of writeback
-- ----------------------------
BEGIN;
INSERT INTO `writeback` VALUES (1, 1, '个人认为学好数据结构也很重要', NULL, '0104150701', 6, '2018-01-02');
INSERT INTO `writeback` VALUES (2, 1, '赞同楼上说法', NULL, '0104150702', 6, '2018-01-02');
INSERT INTO `writeback` VALUES (4, 2, '赞同楼上说法', NULL, '0104150702', 2, '2018-01-01');
INSERT INTO `writeback` VALUES (5, 3, '顶帖支持一下楼主', NULL, '0104150701', 1, '2018-01-02');
INSERT INTO `writeback` VALUES (6, 1, '大家都很厉害的样子', NULL, '0104150701', 6, '2018-01-03');
INSERT INTO `writeback` VALUES (7, 1, '想知道怎么自学才比较有效率', NULL, '0104150702', 6, '2018-01-04');
INSERT INTO `writeback` VALUES (8, 2, '赞同楼上说法', NULL, '0104150702', 2, '2018-01-02');
INSERT INTO `writeback` VALUES (9, 1, '你很棒', NULL, '0104150701', 6, '2018-01-10');
INSERT INTO `writeback` VALUES (12, 1, '上次这个楼主发的内容我也觉得很有趣，附上截图一张', 'upload\\image\\20180114\\1515931121125_349.jpg', '0104150701', 6, '2018-01-14');
INSERT INTO `writeback` VALUES (13, 4, '你很棒', NULL, '0104150701', 0, '2018-01-14');
INSERT INTO `writeback` VALUES (14, 5, '你很棒', NULL, '0104150701', 0, '2018-01-15');
INSERT INTO `writeback` VALUES (15, 6, '你很棒', NULL, '0104150701', 0, '2018-01-16');
INSERT INTO `writeback` VALUES (16, 7, '你很棒', NULL, '0104150701', 0, '2018-01-17');
INSERT INTO `writeback` VALUES (17, 8, '你很棒', NULL, '0104150701', 0, '2018-01-18');
INSERT INTO `writeback` VALUES (18, 9, '你很棒', NULL, '0104150701', 0, '2018-01-19');
INSERT INTO `writeback` VALUES (19, 10, '你很棒', NULL, '0104150701', 0, '2018-01-20');
INSERT INTO `writeback` VALUES (20, 11, '你很棒', NULL, '0104150701', 0, '2018-01-21');
INSERT INTO `writeback` VALUES (26, 12, '上次这个楼主发的内容我也觉得很有趣，附上截图一张', NULL, '0104150701', 0, '2018-01-21');
INSERT INTO `writeback` VALUES (27, 13, '上次这个楼主发的内容我也觉得很有趣，附上截图一张', NULL, '0104150701', 0, '2018-01-22');
INSERT INTO `writeback` VALUES (28, 14, '赞同楼上说法', NULL, '0104150701', 0, '2018-01-23');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
