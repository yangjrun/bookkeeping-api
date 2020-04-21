-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: bookkeeping
-- ------------------------------------------------------
-- Server version	5.7.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book_keeping`
--

DROP TABLE IF EXISTS `book_keeping`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book_keeping` (
  `id` varchar(50) NOT NULL COMMENT '主键\n',
  `time` date NOT NULL COMMENT '支付时间\n',
  `value` decimal(10,0) NOT NULL COMMENT '支付金额',
  `payment_type_id` varchar(50) NOT NULL COMMENT '支付类型',
  `payment_channel_id` varchar(50) NOT NULL COMMENT '支付渠道\n',
  `payment_use_id` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='记账表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_keeping`
--

LOCK TABLES `book_keeping` WRITE;
/*!40000 ALTER TABLE `book_keeping` DISABLE KEYS */;
INSERT INTO `book_keeping` VALUES ('6101c0e0-6411-11ea-92bf-98fa9bab85f3','2020-03-12',23,'6a5e11cb-5ec1-11ea-ab89-98fa9bab85f3','53662166-6411-11ea-92bf-98fa9bab85f3',''),('a90cfb86-64c8-11ea-b661-98fa9bab85f3','2020-03-13',29,'6a5e11cb-5ec1-11ea-ab89-98fa9bab85f3','53662166-6411-11ea-92bf-98fa9bab85f3','');
/*!40000 ALTER TABLE `book_keeping` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_channel`
--

DROP TABLE IF EXISTS `payment_channel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment_channel` (
  `id` varchar(50) NOT NULL COMMENT '主键',
  `value` varchar(30) NOT NULL COMMENT '渠道描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付渠道';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_channel`
--

LOCK TABLES `payment_channel` WRITE;
/*!40000 ALTER TABLE `payment_channel` DISABLE KEYS */;
INSERT INTO `payment_channel` VALUES ('53662166-6411-11ea-92bf-98fa9bab85f3','建设银行储蓄卡'),('8cc4ddd6-5ebf-11ea-ab89-98fa9bab85f3','支付宝'),('cacd06ae-5ebf-11ea-ab89-98fa9bab85f3','微信');
/*!40000 ALTER TABLE `payment_channel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_type`
--

DROP TABLE IF EXISTS `payment_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment_type` (
  `id` varchar(50) NOT NULL COMMENT '主键',
  `value` varchar(30) NOT NULL COMMENT '类型描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_type`
--

LOCK TABLES `payment_type` WRITE;
/*!40000 ALTER TABLE `payment_type` DISABLE KEYS */;
INSERT INTO `payment_type` VALUES ('6a5e11cb-5ec1-11ea-ab89-98fa9bab85f3','支出'),('6a6649d3-5ec1-11ea-ab89-98fa9bab85f3','收入');
/*!40000 ALTER TABLE `payment_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_use`
--

DROP TABLE IF EXISTS `payment_use`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment_use` (
  `id` varchar(50) NOT NULL,
  `value` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_use`
--

LOCK TABLES `payment_use` WRITE;
/*!40000 ALTER TABLE `payment_use` DISABLE KEYS */;
INSERT INTO `payment_use` VALUES ('4d7a2390-64ca-11ea-b661-98fa9bab85f3','早餐'),('4d822517-64ca-11ea-b661-98fa9bab85f3','午餐'),('4d831386-64ca-11ea-b661-98fa9bab85f3','晚餐');
/*!40000 ALTER TABLE `payment_use` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-21 10:12:51
