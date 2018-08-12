-- MySQL dump 10.13  Distrib 5.1.73, for Win64 (unknown)
--
-- Host: localhost    Database: college
-- ------------------------------------------------------
-- Server version	5.1.73-community

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
-- Table structure for table `blog`
--

DROP TABLE IF EXISTS `blog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blog` (
  `BLOG_ID` int(11) NOT NULL AUTO_INCREMENT,
  `BLOG_TITLE` varchar(500) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `UPVOTE` int(11) DEFAULT NULL,
  `CLUB_ID` int(11) DEFAULT NULL,
  `BLOG_DESC` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`BLOG_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blog`
--

LOCK TABLES `blog` WRITE;
/*!40000 ALTER TABLE `blog` DISABLE KEYS */;
INSERT INTO `blog` VALUES (7,'Disapointment with the online treasure hunt event',2,0,1,'I was really irritated with system as most of my answers did not get registered.'),(8,'Introducing OPW barcamp(Outreach Program for women)',2,0,5,'We will be holding OPW barcamp from 13th March to 15th March including the Linux installation fest on 13th. Girls! Cancel all you dates and get ready to be in your tech shoes and learn and code this weekend! :D');
/*!40000 ALTER TABLE `blog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `club`
--

DROP TABLE IF EXISTS `club`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `club` (
  `CLUB_ID` int(10) NOT NULL AUTO_INCREMENT,
  `CLUB_NAME` varchar(30) DEFAULT NULL,
  `INSTITUTE_NAME` varchar(30) DEFAULT NULL,
  `ADMIN_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`CLUB_ID`),
  KEY `ADMIN_ID` (`ADMIN_ID`),
  CONSTRAINT `club_ibfk_1` FOREIGN KEY (`ADMIN_ID`) REFERENCES `user` (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `club`
--

LOCK TABLES `club` WRITE;
/*!40000 ALTER TABLE `club` DISABLE KEYS */;
INSERT INTO `club` VALUES (1,'glug','nitdgp',1),(2,'cca','nitdgp',1),(3,'interact','nitdgp',1),(4,'literary club','nitdgp',1),(5,'women in tech','nit durgapur',2);
/*!40000 ALTER TABLE `club` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `event` (
  `EVENT_ID` int(11) NOT NULL AUTO_INCREMENT,
  `EVENT_NAME` varchar(30) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `FEST_ID` int(11) DEFAULT NULL,
  `START_DATE` date DEFAULT NULL,
  `END_DATE` date DEFAULT NULL,
  `INSTITUTE_NAME` varchar(30) DEFAULT NULL,
  `UPVOTE` int(11) DEFAULT NULL,
  PRIMARY KEY (`EVENT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `query`
--

DROP TABLE IF EXISTS `query`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `query` (
  `QUESTION_ID` int(11) NOT NULL AUTO_INCREMENT,
  `question_title` varchar(200) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `CLUB_ID` int(11) DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `QUESTION_DESC` varchar(400) DEFAULT NULL,
  PRIMARY KEY (`QUESTION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `query`
--

LOCK TABLES `query` WRITE;
/*!40000 ALTER TABLE `query` DISABLE KEYS */;
INSERT INTO `query` VALUES (1,'How to contact the speakers?',5,1,'2015-03-01','I would be really glad if you could share the contact details of Mr Amod Malviya. His speech and sessions were impressive, thus CCA wants to invite him for Arohan 2k16'),(3,'How did GSOC end up?',2,1,NULL,'I want to know the details of the google summer of code barcamp conducted recently.'),(4,'Help regarding programming competitions',2,5,NULL,'I am a dedicated fun-loving coder. Can someone help me with participation in programming competitions as a beginner...'),(6,'HAck me',2,1,NULL,'Timings of Hack me session');
/*!40000 ALTER TABLE `query` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register_club`
--

DROP TABLE IF EXISTS `register_club`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `register_club` (
  `USER_ID` int(11) DEFAULT NULL,
  `CLUB_ID` int(11) DEFAULT NULL,
  KEY `USER_ID` (`USER_ID`),
  KEY `CLUB_ID` (`CLUB_ID`),
  CONSTRAINT `register_club_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`USER_ID`),
  CONSTRAINT `register_club_ibfk_2` FOREIGN KEY (`CLUB_ID`) REFERENCES `club` (`CLUB_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register_club`
--

LOCK TABLES `register_club` WRITE;
/*!40000 ALTER TABLE `register_club` DISABLE KEYS */;
INSERT INTO `register_club` VALUES (5,2),(3,4),(2,1),(2,5);
/*!40000 ALTER TABLE `register_club` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resolution`
--

DROP TABLE IF EXISTS `resolution`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resolution` (
  `ANSWER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ANSWER` varchar(500) DEFAULT NULL,
  `USER_ID` int(11) DEFAULT NULL,
  `DATE` date DEFAULT NULL,
  `UPVOTE` int(11) DEFAULT NULL,
  `QUESTION_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ANSWER_ID`),
  KEY `QUESTION_ID` (`QUESTION_ID`),
  CONSTRAINT `resolution_ibfk_1` FOREIGN KEY (`QUESTION_ID`) REFERENCES `query` (`QUESTION_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resolution`
--

LOCK TABLES `resolution` WRITE;
/*!40000 ALTER TABLE `resolution` DISABLE KEYS */;
INSERT INTO `resolution` VALUES (1,'Amod Malviya- Contact No-987654533  Email-amod@yahoo.com',2,NULL,0,1);
/*!40000 ALTER TABLE `resolution` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `USER_ID` int(10) NOT NULL AUTO_INCREMENT,
  `USER_NAME` varchar(30) DEFAULT NULL,
  `FIRST_NAME` varchar(30) DEFAULT NULL,
  `LAST_NAME` varchar(30) DEFAULT NULL,
  `EMAIL_ID` varchar(30) DEFAULT NULL,
  `PASSWORD` varchar(30) DEFAULT NULL,
  `INSTITUTE_NAME` varchar(30) DEFAULT NULL,
  `CITY` varchar(30) DEFAULT NULL,
  `PLACE_OF_WORK` varchar(30) DEFAULT NULL,
  `YEAR` varchar(30) DEFAULT '2015',
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'SUN','SUNANDINI','SANYAL','S@GMAIL.COM','12345','NIT Durgapur','DGP',NULL,'2015'),(2,'Hima','hima','dangi','hd@gmail.com','12345','NIT Durgapur','dgp','dgp','2015'),(3,'meg','megha','dangi','m@gmail.com','12345','NIT Durgapur','dgp','dgp','2015'),(4,'Sunny','Sumit','Mitra','sumit@yahoo.com','12345','NIT Durgapur','Durgapur','Durgapur','2015'),(5,'priya','Priya','Sharma','prig@yahoo.com','12345','NIT Durgapur','Durgapur','Durgapur','2015'),(8,'avinav','Avinav','Prakash','avi@gmail.com','12345','NIT Durgapur','Durgapur','Durgapur','2015'),(9,'pritha','Pritha','Ganguly','prats@gmail.com','pritha123','NIT Durgapur','Durgapur','Durgapur','2015');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-03-08 17:13:11
