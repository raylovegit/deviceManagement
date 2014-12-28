/*
Navicat MySQL Data Transfer

Source Server         : javaWork
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : devicemanagement

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2014-09-20 20:57:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for device
-- ----------------------------
DROP TABLE IF EXISTS `device`;
CREATE TABLE `device` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `deviceId` varchar(255) DEFAULT NULL,
  `deviceName` varchar(255) DEFAULT NULL,
  `deviceState` varchar(255) DEFAULT NULL,
  `devicePrice` varchar(255) DEFAULT NULL,
  `useOfYear` varchar(255) DEFAULT NULL,
  `stockDate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of device
-- ----------------------------
INSERT INTO `device` VALUES ('1', '10002', '机器二', '坏了', '1001', '6', '2020-7-2');
INSERT INTO `device` VALUES ('2', '111', '果果', '朵朵', '22', '5', '456346');
INSERT INTO `device` VALUES ('4', '10000', '机器三', '良好', '1999', '9', '2010-9.9');
INSERT INTO `device` VALUES ('5', '10000', '机器三', '良好', '1999', '9', '2010-9.9');
INSERT INTO `device` VALUES ('7', '3', '3', '3', '3', '333', 't568568');
INSERT INTO `device` VALUES ('8', '9', '9', '99', '9', '99', '9');
INSERT INTO `device` VALUES ('9', '0', '0', '00', '00', '0', '00');
INSERT INTO `device` VALUES ('10', '10000', '11', '1', '1', '111', '1');
INSERT INTO `device` VALUES ('11', '2', '2', '22', '2', '2', '2010-9.9');
INSERT INTO `device` VALUES ('12', '8', '88', '8', '88', '8', '8');
INSERT INTO `device` VALUES ('13', '6', '66', '6', '6', '6', '6');
INSERT INTO `device` VALUES ('14', '3', '3', '3', '3', '3', '3');
INSERT INTO `device` VALUES ('17', 'A10001', '机器六', '良好', '19999', '8', '2020-9-1');
INSERT INTO `device` VALUES ('18', 'B1004', '机器十一', '良好', '1299', '3', '2017-8-8');
INSERT INTO `device` VALUES ('19', 'C1348', '机器八', '优秀', '29999', '10', '2020-8-9');

-- ----------------------------
-- Table structure for repair
-- ----------------------------
DROP TABLE IF EXISTS `repair`;
CREATE TABLE `repair` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `deviceId` varchar(255) DEFAULT NULL,
  `repairPeople` varchar(255) DEFAULT NULL,
  `repairDate` varchar(255) DEFAULT NULL,
  `repairPrice` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repair
-- ----------------------------
INSERT INTO `repair` VALUES ('1', '123', '肖雷', '2014-7-9', '199');
INSERT INTO `repair` VALUES ('2', '7548', '小雷', '3333', '3333');
INSERT INTO `repair` VALUES ('3', '9', '9', '9', '9');
INSERT INTO `repair` VALUES ('4', '444', '4', '4', '44');
INSERT INTO `repair` VALUES ('5', '7', '7', '77', '7');
INSERT INTO `repair` VALUES ('6', '2', '2', '2', '22');
INSERT INTO `repair` VALUES ('7', 'p', 'p', 'p', 'p');
INSERT INTO `repair` VALUES ('8', 'm', 'm', 'm', 'm');
INSERT INTO `repair` VALUES ('9', 'n', 'n', 'n', 'n');
INSERT INTO `repair` VALUES ('10', 'b', 'b', 'b', 'b');
INSERT INTO `repair` VALUES ('12', 'm', 'm', 'm', 'm');
INSERT INTO `repair` VALUES ('13', '78', '87', '78', '787');
INSERT INTO `repair` VALUES ('14', 'k', 'k', 'k', 'k');
INSERT INTO `repair` VALUES ('15', 'mmm', 'm', 'm', 'm');
INSERT INTO `repair` VALUES ('16', 'A1001', '肖雷', '2014-9-1', '199');
INSERT INTO `repair` VALUES ('17', 'B2004', '小雷', '2013-12-8', '200');
INSERT INTO `repair` VALUES ('18', '测试', '测试', '测试', '测试');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_type` char(255) NOT NULL COMMENT '用户类别，管理员，用户',
  `user_class` varchar(30) DEFAULT NULL COMMENT '是属于哪个系别',
  `user_name` varchar(30) NOT NULL COMMENT '用户名',
  `user_password` varchar(30) NOT NULL COMMENT ' 密码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('10', '0', '软件学院', 'admin', 'admin');
INSERT INTO `user` VALUES ('11', '1', '', '肖雷', '123');
INSERT INTO `user` VALUES ('12', '1', '', 'ss', '123');
