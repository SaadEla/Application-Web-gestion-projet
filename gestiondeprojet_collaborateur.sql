-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: gestiondeprojet
-- ------------------------------------------------------
-- Server version	5.7.14

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
-- Table structure for table `collaborateur`
--

DROP TABLE IF EXISTS `collaborateur`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collaborateur` (
  `id_Collaborateur` int(11) NOT NULL AUTO_INCREMENT,
  `NomPrenom` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `MotDePasse` varchar(45) DEFAULT NULL,
  `Disponibilite` varchar(45) DEFAULT NULL,
  `Telephone` varchar(45) DEFAULT NULL,
  `DateNaissance` varchar(45) DEFAULT NULL,
  `Diplome` varchar(100) DEFAULT NULL,
  `AnneeObtention` varchar(45) DEFAULT NULL,
  `Etablissement` varchar(100) DEFAULT NULL,
  `Competences` varchar(100) DEFAULT NULL,
  `Adresse` varchar(100) DEFAULT NULL,
  `Fonction` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_Collaborateur`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collaborateur`
--

LOCK TABLES `collaborateur` WRITE;
/*!40000 ALTER TABLE `collaborateur` DISABLE KEYS */;
INSERT INTO `collaborateur` VALUES (1,'Kassoumi Mehdi','mehdi@gmail.fr','motdepass','Occupee','0645893654','09-11-1993','Technicien','2011','ENSA Casablanca','Assiduite, Organisation, ','Residence Chifa Bloc A Rue Mokawama Fes','Collaborateur');
/*!40000 ALTER TABLE `collaborateur` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-25 11:22:59
