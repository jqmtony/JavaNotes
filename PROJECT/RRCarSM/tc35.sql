/*
Navicat MySQL Data Transfer

Source Server         : TC35
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : tc35

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2018-11-27 11:36:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for car
-- ----------------------------
DROP TABLE IF EXISTS `car`;
CREATE TABLE `car` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `car_number` varchar(10) NOT NULL,
  `brand_id` int(11) NOT NULL,
  `model` varchar(40) NOT NULL,
  `color` varchar(20) NOT NULL,
  `category_id` int(11) NOT NULL,
  `t_comments` varchar(100) NOT NULL,
  `price` double(11,2) NOT NULL,
  `rent` double(9,2) NOT NULL,
  `status` int(1) unsigned zerofill NOT NULL,
  `useable` int(1) unsigned zerofill NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `car_number_identification` (`car_number`),
  KEY `FK_BRAND` (`brand_id`),
  KEY `FK_CATEGORY` (`category_id`),
  CONSTRAINT `FK_BRAND` FOREIGN KEY (`brand_id`) REFERENCES `car_brand` (`id`),
  CONSTRAINT `FK_CATEGORY` FOREIGN KEY (`category_id`) REFERENCES `car_category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car
-- ----------------------------
INSERT INTO `car` VALUES ('1', '沪BXC002', '2', 'B型', '黑色', '3', '1.7T', '165000.00', '888.00', '0', '1');
INSERT INTO `car` VALUES ('2', '沪AJR001', '1', 'A型', '白色', '4', '1.6T', '102330.00', '777.00', '1', '0');
INSERT INTO `car` VALUES ('3', '沪CHW003', '3', 'A型', '红色', '2', '1.4T', '310000.00', '570.00', '0', '0');
INSERT INTO `car` VALUES ('4', '沪DXA004', '4', 'B型', '白色', '1', '1.5T', '270000.00', '510.00', '0', '1');
INSERT INTO `car` VALUES ('5', '沪ECO005', '5', 'A型', '黑色', '4', '1.6T', '600000.00', '690.00', '1', '0');
INSERT INTO `car` VALUES ('6', '沪FIE006', '6', 'B型', '红色', '3', '1.7T', '430000.00', '580.00', '0', '1');
INSERT INTO `car` VALUES ('7', '沪XAY4422', '1', 'T型', '黄色', '2', '1.5T', '268990.00', '468.00', '0', '0');
INSERT INTO `car` VALUES ('8', '沪LHB4444', '2', 'T型', '黄色', '3', '1.3T', '268990.00', '468.00', '0', '0');
INSERT INTO `car` VALUES ('9', '沪CWR9347', '3', 'T型', '灰色', '4', '1.5T', '498900.00', '765.00', '0', '0');
INSERT INTO `car` VALUES ('10', '京POE1932', '1', 'S型', '蓝色', '2', '1.5T', '268990.00', '455.00', '0', '1');
INSERT INTO `car` VALUES ('11', '京AAC3141', '1', 'S型', '蓝色', '1', '1.5T', '268990.00', '555.00', '1', '1');
INSERT INTO `car` VALUES ('14', '京NV3242', '2', 'S型', '灰色', '2', '1.5T', '2268990.00', '378.00', '0', '0');
INSERT INTO `car` VALUES ('15', '苏AAA1111', '1', 'T型', '红色', '2', '2.0L', '300000.00', '700.00', '0', '0');
INSERT INTO `car` VALUES ('16', '1', '1', '1', '1', '1', '1', '1.00', '1.00', '1', '1');

-- ----------------------------
-- Table structure for car_brand
-- ----------------------------
DROP TABLE IF EXISTS `car_brand`;
CREATE TABLE `car_brand` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `car_name` (`brand_name`),
  CONSTRAINT `FK_BR_NAME` FOREIGN KEY (`id`) REFERENCES `car` (`brand_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_brand
-- ----------------------------
INSERT INTO `car_brand` VALUES ('2', '丰田（2）');
INSERT INTO `car_brand` VALUES ('1', '大众（1）');
INSERT INTO `car_brand` VALUES ('6', '奔驰（6）');
INSERT INTO `car_brand` VALUES ('3', '奥迪（3）');
INSERT INTO `car_brand` VALUES ('4', '宝马（4）');
INSERT INTO `car_brand` VALUES ('5', '现代（5）');

-- ----------------------------
-- Table structure for car_category
-- ----------------------------
DROP TABLE IF EXISTS `car_category`;
CREATE TABLE `car_category` (
  `id` int(11) NOT NULL,
  `category_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `car_category_name` (`category_name`),
  CONSTRAINT `FK_CAT_ID` FOREIGN KEY (`id`) REFERENCES `car` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_category
-- ----------------------------
INSERT INTO `car_category` VALUES ('4', 'SUV型（4）');
INSERT INTO `car_category` VALUES ('1', '精英型（1）');
INSERT INTO `car_category` VALUES ('3', '紧凑型（3）');
INSERT INTO `car_category` VALUES ('2', '舒适型（2）');

-- ----------------------------
-- Table structure for car_record
-- ----------------------------
DROP TABLE IF EXISTS `car_record`;
CREATE TABLE `car_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `car_id` int(11) NOT NULL,
  `start_date` datetime DEFAULT NULL,
  `return_date` datetime DEFAULT NULL,
  `payment` double(9,2) DEFAULT NULL,
  PRIMARY KEY (`record_id`),
  KEY `FK_CAR_ID` (`car_id`),
  KEY `FK_USER_ID` (`user_id`),
  CONSTRAINT `FK_USER_ID` FOREIGN KEY (`user_id`) REFERENCES `user` (`userid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of car_record
-- ----------------------------
INSERT INTO `car_record` VALUES ('63', '1', '1', '2018-11-26 13:38:45', '2018-11-27 10:14:56', '888.00');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) NOT NULL,
  `passWord` varchar(20) NOT NULL,
  `sex` varchar(20) NOT NULL,
  `userIdNumber` varchar(20) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `addr` varchar(30) NOT NULL,
  `type` int(11) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin123', 'admin123', 'female', 'user1', '123456', '上海', '1');
INSERT INTO `user` VALUES ('12', 'REGISTER1', 'REGISTER1', 'MALE', '1', '12345678910', '12345678910', '0');

-- ----------------------------
-- View structure for sa
-- ----------------------------
DROP VIEW IF EXISTS `sa`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `sa` AS select `student`.`s_id` AS `s_id`,`student`.`s_name` AS `s_name`,`student`.`s_birth` AS `s_birth`,`student`.`s_sex` AS `s_sex` from `student` ;
