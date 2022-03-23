-- MySQL dump 10.14  Distrib 5.5.44-MariaDB, for Linux (x86_64)
--
-- Host: localhost    Database: CIQUAL
-- ------------------------------------------------------
-- Server version	5.5.44-MariaDB

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

DROP TABLE IF EXISTS `Genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Genre` (
  `numGenre` varchar(4) NOT NULL,
  `nomAnGenre` varchar(128) NOT NULL,
  `nomFrGenre` varchar(128) NOT NULL,
  PRIMARY KEY (`numGenre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Aliment`
--

DROP TABLE IF EXISTS `Aliment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Aliment` (
  `numAliment` int(11) NOT NULL AUTO_INCREMENT,
  `nomFrAliment` varchar(255) NOT NULL,
  `nomAnAliment` varchar(24) NOT NULL,
  `numGenre` varchar(4) NOT NULL,
  PRIMARY KEY (`numAliment`),
  KEY `numGenre` (`numGenre`),
  CONSTRAINT `Aliment_ibfk_1` FOREIGN KEY (`numGenre`) REFERENCES `Genre` (`numGenre`)
) ENGINE=InnoDB AUTO_INCREMENT=76080 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Constituant`
--



DROP TABLE IF EXISTS `Constituant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Constituant` (
  `numConst` int(11) NOT NULL AUTO_INCREMENT,
  `origineFrConst` varchar(80) DEFAULT NULL,
  `origineAnConst` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`numConst`)
) ENGINE=InnoDB AUTO_INCREMENT=75101 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Genre`
--



--
-- Table structure for table `CompNutri`
--

DROP TABLE IF EXISTS `CompNutri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CompNutri` (
  `numAliment` int(11) NOT NULL,
  `numConst` int(11) NOT NULL,
  `valNutri` varchar(255) DEFAULT NULL,
  `valMinNutri` double DEFAULT NULL,
  `valMaxNutri` double DEFAULT NULL,
  `nbEchantNutri` double DEFAULT NULL,
  `ccEurNutri` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`numAliment`,`numConst`),
  KEY `numConst` (`numConst`),
  CONSTRAINT `CompNutri_ibfk_1` FOREIGN KEY (`numAliment`) REFERENCES `Aliment` (`numAliment`),
  CONSTRAINT `CompNutri_ibfk_2` FOREIGN KEY (`numConst`) REFERENCES `Constituant` (`numConst`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;


