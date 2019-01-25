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
-- Table structure for table `chefdeprojet`
--

DROP TABLE IF EXISTS `chefdeprojet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chefdeprojet` (
  `id_ChefDeProjet` int(11) NOT NULL AUTO_INCREMENT,
  `NomPrenomChef` varchar(45) DEFAULT NULL,
  `EmailChef` varchar(100) DEFAULT NULL,
  `MotDePasseChef` varchar(100) DEFAULT NULL,
  `DisponibiliteChef` varchar(45) DEFAULT NULL,
  `DateNaissanceChef` varchar(45) DEFAULT NULL,
  `DiplomeChef` varchar(100) DEFAULT NULL,
  `AnneeObtentionChef` varchar(45) DEFAULT NULL,
  `EtablissementChef` varchar(100) DEFAULT NULL,
  `CompetencesChef` varchar(200) DEFAULT NULL,
  `TelephoneChef` varchar(45) DEFAULT NULL,
  `FonctionChef` varchar(45) DEFAULT NULL,
  `AdresseChef` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_ChefDeProjet`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chefdeprojet`
--

LOCK TABLES `chefdeprojet` WRITE;
/*!40000 ALTER TABLE `chefdeprojet` DISABLE KEYS */;
INSERT INTO `chefdeprojet` VALUES (2,'Boumehdi Amina','amina@gmail.com','123456','Disponible','05-06-1974','Ingenieur distribution logistique','1997','ENSA','Assiduite, Recherche, Dynamique','0617963258','Chef De Projet','Hay Narjiss Moulay Abdellah, jadida Maroc'),(4,'Rachid chaima','rachid@gmail.com','rachida','Disponible','02-07-1992','Ingénieur d\'état en Informatique','20014','Ecole Nationale Supérieure d\'Informatique et d\'Analyse Systèmes','Assiduité, Recherche, Dynamique','0645897256','Chef De Projet','Bloc N Hay nahda Casablanca');
/*!40000 ALTER TABLE `chefdeprojet` ENABLE KEYS */;
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
