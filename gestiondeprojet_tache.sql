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
-- Table structure for table `tache`
--

DROP TABLE IF EXISTS `tache`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tache` (
  `id_Tache` int(11) NOT NULL AUTO_INCREMENT,
  `Collaborateur` varchar(45) DEFAULT NULL,
  `Tache` varchar(45) DEFAULT NULL,
  `DateDebutTache` varchar(45) DEFAULT NULL,
  `DateFinTache` varchar(45) DEFAULT NULL,
  `EtatAvancement` int(11) DEFAULT NULL,
  `id_Collaborateur` int(11) DEFAULT NULL,
  `id_Projet` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_Tache`),
  KEY `id_Collaborateur_idx` (`id_Collaborateur`),
  KEY `id_Projet_idx` (`id_Projet`),
  CONSTRAINT `id_Collaborateur` FOREIGN KEY (`id_Collaborateur`) REFERENCES `collaborateur` (`id_Collaborateur`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_Projet` FOREIGN KEY (`id_Projet`) REFERENCES `agenda` (`id_Agenda`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tache`
--

LOCK TABLES `tache` WRITE;
/*!40000 ALTER TABLE `tache` DISABLE KEYS */;
INSERT INTO `tache` VALUES (2,'Kassoumi Mehdi','Conception','26-01-2011','05-02-2011',100,1,59),(4,'Kassoumi Mehdi','Realisation','15-02-2011','28-02-2011',59,1,59);
/*!40000 ALTER TABLE `tache` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-25 11:23:00
