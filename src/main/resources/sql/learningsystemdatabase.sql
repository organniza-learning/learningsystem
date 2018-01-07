/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.20-log : Database - learningsystemdatabase
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`learningsystemdatabase` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `learningsystemdatabase`;

/*Table structure for table `class` */

DROP TABLE IF EXISTS `class`;

CREATE TABLE `class` (
  `C_ID` int(6) NOT NULL COMMENT '表ID',
  `C_CLASSID` int(6) DEFAULT NULL COMMENT '班级标识',
  `T_TEACHER` varchar(30) DEFAULT NULL COMMENT '授课老师',
  `C_NAME` varchar(30) DEFAULT NULL COMMENT '班级名称',
  `C_COLLEGE` varchar(255) DEFAULT NULL COMMENT '所属学院',
  PRIMARY KEY (`C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `class` */

insert  into `class`(`C_ID`,`C_CLASSID`,`T_TEACHER`,`C_NAME`,`C_COLLEGE`) values (1,1,'1','15软件7班','计算机工程技术学院');

/*Table structure for table `classwork` */

DROP TABLE IF EXISTS `classwork`;

CREATE TABLE `classwork` (
  `CK_ID` int(6) NOT NULL COMMENT '表ID',
  `CK_CALSS` varchar(30) DEFAULT NULL COMMENT '班级',
  `G_IDENTIFYING` int(6) DEFAULT NULL COMMENT '分组标识',
  `CK_WEEK` int(6) DEFAULT NULL COMMENT '每周数',
  `CK_FILE` varchar(255) DEFAULT NULL COMMENT '作业上传',
  PRIMARY KEY (`CK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `classwork` */

/*Table structure for table `grouping` */

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

/*Data for the table `grouping` */

insert  into `grouping`(`G_ID`,`G_IDENTIFYING`,`G_NAME`,`G_STUDENTID`,`G_SPEAKNUM`,`G_DUTY`) values (1,1,'超级舰队','0104150701',NULL,'组长'),(2,1,'超级舰队','0104150702',NULL,'组员'),(3,1,'超级舰队','0104150717',NULL,'组员'),(4,1,'超级舰队','0104150718',NULL,'组员');

/*Table structure for table `releaseapplicationcase` */

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

/*Data for the table `releaseapplicationcase` */

/*Table structure for table `releasediscussionquestions` */

DROP TABLE IF EXISTS `releasediscussionquestions`;

CREATE TABLE `releasediscussionquestions` (
  `RDQ_ID` int(6) NOT NULL COMMENT '表ID',
  `G_STUDENTID` varchar(20) DEFAULT NULL COMMENT '学生学号',
  `T_TEACHER` int(6) DEFAULT NULL COMMENT '老师标识',
  `TAG_ID` int(6) DEFAULT NULL COMMENT '标签ID',
  `RDQ_THEME` varchar(255) DEFAULT NULL COMMENT '讨论主题',
  `RDQ_CLASS` varchar(255) DEFAULT NULL COMMENT '对应班级',
  `RDQ_TEXT` varchar(255) DEFAULT NULL COMMENT '讨论内容',
  `RDQ_TIME` varchar(255) DEFAULT NULL COMMENT '发布时间',
  `RDQ_UPLOADFILE` varchar(255) DEFAULT NULL COMMENT '文件上传',
  PRIMARY KEY (`RDQ_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `releasediscussionquestions` */

insert  into `releasediscussionquestions`(`RDQ_ID`,`G_STUDENTID`,`T_TEACHER`,`TAG_ID`,`RDQ_THEME`,`RDQ_CLASS`,`RDQ_TEXT`,`RDQ_TIME`,`RDQ_UPLOADFILE`) values (1,'0104150701',NULL,1,'探讨机器学习','15软件7班','机器学习需要掌握哪些技术，对数据算法要求一定很高吧','2017-01-04',NULL),(2,'0104150701',NULL,1,'JAVA进阶应该学习啥？','15软件7班','深入研究数据结构以及框架源码','2017-01-05',NULL);

/*Table structure for table `releaseexercise` */

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

/*Data for the table `releaseexercise` */

/*Table structure for table `releaselearningcontent` */

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

/*Data for the table `releaselearningcontent` */

/*Table structure for table `rleaseonlinetesting` */

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

/*Data for the table `rleaseonlinetesting` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `STU_ID` int(6) NOT NULL COMMENT '表ID',
  `TG_OPENID` varchar(255) DEFAULT NULL COMMENT '微信登录绑定ID',
  `C_CLASSID` int(6) DEFAULT NULL COMMENT '班级标识',
  `TG_IDENTIFYING` int(6) DEFAULT NULL COMMENT '成绩表绑定学生',
  `STU_STUDENTID` varchar(20) DEFAULT NULL COMMENT '学生学号',
  `STU_PASSWORD` varchar(255) DEFAULT NULL COMMENT '学生密码（以防万一要用）',
  `STU_NAME` varchar(20) DEFAULT NULL COMMENT '学生姓名',
  `G_SPEAKNUM` int(6) DEFAULT NULL COMMENT '学生发言数',
  `STU_EMAIL` varchar(255) DEFAULT NULL COMMENT '学生邮箱',
  `G_IDENTIFYING` int(6) DEFAULT NULL COMMENT '分组标识',
  PRIMARY KEY (`STU_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`STU_ID`,`TG_OPENID`,`C_CLASSID`,`TG_IDENTIFYING`,`STU_STUDENTID`,`STU_PASSWORD`,`STU_NAME`,`G_SPEAKNUM`,`STU_EMAIL`,`G_IDENTIFYING`) values (1,NULL,1,1,'0104150701',NULL,'杨广',0,'627756022@qq.com',1),(2,NULL,1,1,'0104150702',NULL,'刘梓彦',0,NULL,1),(3,NULL,1,1,'0104150717',NULL,'胡剑锋',NULL,NULL,1),(4,NULL,1,1,'0104150718',NULL,'余枫',NULL,NULL,1);

/*Table structure for table `tag` */

DROP TABLE IF EXISTS `tag`;

CREATE TABLE `tag` (
  `TAG_ID` int(6) NOT NULL COMMENT '标签ID',
  `TAG_CONTEN` varchar(30) DEFAULT NULL COMMENT '标签内容',
  PRIMARY KEY (`TAG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tag` */

insert  into `tag`(`TAG_ID`,`TAG_CONTEN`) values (1,'Java'),(2,'JavaScript');

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `T_ID` int(6) NOT NULL COMMENT '表ID',
  `T_NAME` varchar(35) DEFAULT NULL COMMENT '老师姓名',
  `T_TEACHER` int(6) DEFAULT NULL COMMENT '老师标识',
  `C_CLASS` varchar(255) DEFAULT NULL COMMENT '班级标识',
  PRIMARY KEY (`T_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`T_ID`,`T_NAME`,`T_TEACHER`,`C_CLASS`) values (1,'张爱清',1,'15软件7班');

/*Table structure for table `testgrade` */

DROP TABLE IF EXISTS `testgrade`;

CREATE TABLE `testgrade` (
  `TG_ID` int(6) NOT NULL COMMENT '表ID',
  `TG_IDENTIFYING` int(6) DEFAULT NULL COMMENT '单元标识',
  `TG_GRADE` int(6) DEFAULT NULL COMMENT '测试成绩',
  PRIMARY KEY (`TG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `testgrade` */

/*Table structure for table `writeback` */

DROP TABLE IF EXISTS `writeback`;

CREATE TABLE `writeback` (
  `WB_ID` int(6) NOT NULL COMMENT '表ID',
  `RDQ_ID` int(11) DEFAULT NULL COMMENT '问题讨论表ID',
  `WB_CONTENT` varchar(255) DEFAULT NULL COMMENT '回复内容',
  `WB_UPLOADFILE` varchar(255) DEFAULT NULL COMMENT '回复文件',
  `STU_STUDENTID` varchar(20) DEFAULT NULL COMMENT '学生学号',
  PRIMARY KEY (`WB_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `writeback` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
