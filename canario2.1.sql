-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 06-12-2012 a las 15:26:14
-- Versión del servidor: 5.5.8
-- Versión de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `canario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `follower`
--

CREATE TABLE IF NOT EXISTS `follower` (
  `id_relation` int(11) NOT NULL AUTO_INCREMENT,
  `id_follower` int(11) NOT NULL,
  `id_followed` int(11) NOT NULL,
  PRIMARY KEY (`id_relation`),
  KEY `FK11FD201E5865FDB4` (`id_follower`),
  KEY `FK11FD201E5865FDA6` (`id_followed`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `follower`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `follower_notification`
--

CREATE TABLE IF NOT EXISTS `follower_notification` (
  `id_notification` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_follower` int(11) NOT NULL,
  PRIMARY KEY (`id_notification`),
  KEY `FK2D45DD0B250ABB61a86e736c` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `follower_notification`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `location`
--

CREATE TABLE IF NOT EXISTS `location` (
  `id_location` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_location`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `location`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `message`
--

CREATE TABLE IF NOT EXISTS `message` (
  `id_message` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `id_user_creator` int(11) NOT NULL,
  `location` int(11) NOT NULL,
  `topic` int(11) NOT NULL,
  `body` varchar(200) NOT NULL,
  PRIMARY KEY (`id_message`),
  KEY `id_user_creator_idx` (`id_user_creator`),
  KEY `location_idx` (`location`),
  KEY `topic_idx` (`topic`),
  KEY `FK38EB00075F5C9311` (`location`),
  KEY `FK38EB0007F305034E` (`id_user_creator`),
  KEY `FK38EB000794C64017` (`topic`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `message`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `message_notification`
--

CREATE TABLE IF NOT EXISTS `message_notification` (
  `id_notification` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_message` int(11) NOT NULL,
  PRIMARY KEY (`id_notification`),
  KEY `FKB01F76231F468463` (`id_message`),
  KEY `FK2D45DD0B250ABB61b01f7623` (`id_user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `message_notification`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reference`
--

CREATE TABLE IF NOT EXISTS `reference` (
  `id_reference` int(11) NOT NULL AUTO_INCREMENT,
  `id_user_reffer` int(11) NOT NULL,
  `id_message` int(11) NOT NULL,
  PRIMARY KEY (`id_reference`),
  KEY `FKC8DB3F4B1F468463` (`id_message`),
  KEY `FKC8DB3F4B6119B2E2` (`id_user_reffer`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `reference`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `topic`
--

CREATE TABLE IF NOT EXISTS `topic` (
  `id_topic` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `counter` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_topic`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `topic`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(45) NOT NULL,
  `passwords` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `id_location` int(11) NOT NULL,
  `biography` varchar(100) DEFAULT NULL,
  `path_photo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idUser`),
  KEY `id_location_idx` (`id_location`),
  KEY `FK36EBCBE33F45B5` (`id_location`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Volcar la base de datos para la tabla `user`
--


--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `follower`
--
ALTER TABLE `follower`
  ADD CONSTRAINT `FK11FD201E5865FDA6` FOREIGN KEY (`id_followed`) REFERENCES `user` (`idUser`),
  ADD CONSTRAINT `FK11FD201E5865FDB4` FOREIGN KEY (`id_follower`) REFERENCES `user` (`idUser`);

--
-- Filtros para la tabla `follower_notification`
--
ALTER TABLE `follower_notification`
  ADD CONSTRAINT `FK2D45DD0B250ABB61a86e736c` FOREIGN KEY (`id_user`) REFERENCES `user` (`idUser`);

--
-- Filtros para la tabla `message`
--
ALTER TABLE `message`
  ADD CONSTRAINT `FK38EB000794C64017` FOREIGN KEY (`topic`) REFERENCES `topic` (`id_topic`),
  ADD CONSTRAINT `FK38EB00075F5C9311` FOREIGN KEY (`location`) REFERENCES `location` (`id_location`),
  ADD CONSTRAINT `FK38EB0007F305034E` FOREIGN KEY (`id_user_creator`) REFERENCES `user` (`idUser`),
  ADD CONSTRAINT `id_user_creator` FOREIGN KEY (`id_user_creator`) REFERENCES `user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `location` FOREIGN KEY (`location`) REFERENCES `location` (`id_location`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `topic` FOREIGN KEY (`topic`) REFERENCES `topic` (`id_topic`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `message_notification`
--
ALTER TABLE `message_notification`
  ADD CONSTRAINT `FK2D45DD0B250ABB61b01f7623` FOREIGN KEY (`id_user`) REFERENCES `user` (`idUser`),
  ADD CONSTRAINT `FKB01F76231F468463` FOREIGN KEY (`id_message`) REFERENCES `message` (`id_message`);

--
-- Filtros para la tabla `reference`
--
ALTER TABLE `reference`
  ADD CONSTRAINT `FKC8DB3F4B6119B2E2` FOREIGN KEY (`id_user_reffer`) REFERENCES `user` (`idUser`),
  ADD CONSTRAINT `FKC8DB3F4B1F468463` FOREIGN KEY (`id_message`) REFERENCES `message` (`id_message`);

--
-- Filtros para la tabla `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK36EBCBE33F45B5` FOREIGN KEY (`id_location`) REFERENCES `location` (`id_location`),
  ADD CONSTRAINT `localtion` FOREIGN KEY (`id_location`) REFERENCES `location` (`id_location`) ON DELETE NO ACTION ON UPDATE CASCADE;
